package com.tencent.mm.accessibility.uitl;

@kotlin.Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001a\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "", "Landroidx/lifecycle/y;", "owner", "Ljz5/f0;", "addObserver", "", "key", "", "time", "", "isSinceLastTrue", "", "Lkotlin/Function0;", "callback", "pendingExcu", "Landroid/view/View;", "view", "type", "intervalTime", "J", "getIntervalTime", "()J", "", "lastTimeCache", "Ljava/util/Map;", "com/tencent/mm/accessibility/uitl/TimeBlocker$handle$1", "handle", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$handle$1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "ownerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(J)V", "Companion", "CallbackEvent", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TimeBlocker {
    private static final java.lang.String TAG = "MicroMsg.Acc.TimeBlocker";
    private final long intervalTime;
    public static final int $stable = 8;
    private final java.util.Map<java.lang.Integer, java.lang.Long> lastTimeCache = new java.util.LinkedHashMap();
    private final com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1 handle = new a75.b() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1
        @Override // a75.b
        public void handleEvent(java.util.List<com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent> eventList) {
            kotlin.jvm.internal.o.g(eventList, "eventList");
            java.util.Iterator<T> it = eventList.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent) it.next()).getCallback().invoke();
            }
        }
    };
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.sdk.event.pending.UIPendingEventNotifier<com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent>> ownerMap = new java.util.concurrent.ConcurrentHashMap<>();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "La75/a;", "", "getKey", "newEvent", "mergeEvent", "_key", "Ljava/lang/String;", "get_key", "()Ljava/lang/String;", "Lkotlin/Function0;", "Ljz5/f0;", "callback", "Lyz5/a;", "getCallback", "()Lyz5/a;", "<init>", "(Ljava/lang/String;Lyz5/a;)V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class CallbackEvent implements a75.a {
        public static final int $stable = 0;
        private final java.lang.String _key;
        private final yz5.a callback;

        public CallbackEvent(java.lang.String _key, yz5.a callback) {
            kotlin.jvm.internal.o.g(_key, "_key");
            kotlin.jvm.internal.o.g(callback, "callback");
            this._key = _key;
            this.callback = callback;
        }

        public final yz5.a getCallback() {
            return this.callback;
        }

        @Override // a75.a
        /* renamed from: getKey, reason: from getter */
        public java.lang.String get_key() {
            return this._key;
        }

        public final java.lang.String get_key() {
            return this._key;
        }

        @Override // a75.a
        public a75.a mergeEvent(a75.a newEvent) {
            kotlin.jvm.internal.o.g(newEvent, "newEvent");
            return newEvent;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1] */
    public TimeBlocker(long j17) {
        this.intervalTime = j17;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$observer$1] */
    private final void addObserver(final androidx.lifecycle.y yVar) {
        com.tencent.mars.xlog.Log.i(TAG, "wait synchronized " + yVar);
        synchronized (this) {
            if (this.ownerMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
                return;
            }
            com.tencent.mars.xlog.Log.i(TAG, "addObserver init " + yVar);
            final ?? r07 = new androidx.lifecycle.x() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$observer$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                    concurrentHashMap = com.tencent.mm.accessibility.uitl.TimeBlocker.this.ownerMap;
                    concurrentHashMap.remove(java.lang.Integer.valueOf(yVar.hashCode()));
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.TimeBlocker", "removeObserver onDestroy: " + yVar);
                }
            };
            ((ku5.t0) ku5.t0.f312615d).D(new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront:" + androidx.lifecycle.y.this + ' ' + androidx.lifecycle.y.this.mo133getLifecycle().b().name());
                    androidx.lifecycle.o mo133getLifecycle = androidx.lifecycle.y.this.mo133getLifecycle();
                    com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$observer$1 timeBlocker$addObserver$1$observer$1 = r07;
                    androidx.lifecycle.y yVar2 = androidx.lifecycle.y.this;
                    com.tencent.mm.accessibility.uitl.TimeBlocker timeBlocker = this;
                    if (mo133getLifecycle.b() != androidx.lifecycle.n.DESTROYED) {
                        mo133getLifecycle.a(timeBlocker$addObserver$1$observer$1);
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront but destroy " + yVar2);
                    concurrentHashMap = timeBlocker.ownerMap;
                    concurrentHashMap.remove(java.lang.Integer.valueOf(yVar2.hashCode()));
                }
            });
        }
    }

    public final long getIntervalTime() {
        return this.intervalTime;
    }

    public final boolean isSinceLastTrue(int key, long time) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map<java.lang.Integer, java.lang.Long> map = this.lastTimeCache;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(key);
        java.lang.Long l17 = map.get(valueOf);
        if (l17 == null) {
            l17 = 0L;
            map.put(valueOf, l17);
        }
        long longValue = currentTimeMillis - l17.longValue();
        if (longValue <= time && longValue >= 0) {
            return false;
        }
        this.lastTimeCache.put(java.lang.Integer.valueOf(key), java.lang.Long.valueOf(currentTimeMillis));
        return true;
    }

    public final void pendingExcu(androidx.lifecycle.y owner, java.lang.String key, yz5.a callback) {
        com.tencent.mm.sdk.event.pending.UIPendingEventNotifier<com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent> putIfAbsent;
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!this.ownerMap.containsKey(java.lang.Integer.valueOf(owner.hashCode()))) {
            addObserver(owner);
        }
        if (owner.mo133getLifecycle().b() == androidx.lifecycle.n.DESTROYED) {
            com.tencent.mars.xlog.Log.i(TAG, "skip getOrPut because of " + owner + " DESTROYED");
            return;
        }
        if (owner.mo133getLifecycle().b() == androidx.lifecycle.n.INITIALIZED) {
            com.tencent.mars.xlog.Log.i(TAG, "skip getOrPut because of " + owner + " INITIALIZED");
            return;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.mm.sdk.event.pending.UIPendingEventNotifier<com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent>> concurrentHashMap = this.ownerMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(owner.hashCode());
        com.tencent.mm.sdk.event.pending.UIPendingEventNotifier<com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent> uIPendingEventNotifier = concurrentHashMap.get(valueOf);
        if (uIPendingEventNotifier == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (uIPendingEventNotifier = new com.tencent.mm.sdk.event.pending.UIPendingEventNotifier<>(this.intervalTime, this.handle, owner)))) != null) {
            uIPendingEventNotifier = putIfAbsent;
        }
        uIPendingEventNotifier.a(new com.tencent.mm.accessibility.uitl.TimeBlocker.CallbackEvent(key, callback), true);
    }

    public final void pendingExcu(android.view.View view, java.lang.String type, yz5.a callback) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.Object context = view.getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar == null) {
            return;
        }
        pendingExcu(yVar, view.hashCode() + type, callback);
    }
}
