package com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001a\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ$\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker;", "", "Landroidx/lifecycle/y;", "owner", "Ljz5/f0;", "addObserver", "", "key", "", "time", "", "isSinceLastTrue", "", "Lkotlin/Function0;", "callback", "pendingExcu", "Landroid/view/View;", "view", "type", "intervalTime", "J", "getIntervalTime", "()J", "", "lastTimeCache", "Ljava/util/Map;", "com/tencent/mm/accessibility/uitl/TimeBlocker$handle$1", "handle", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$handle$1;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/mm/sdk/event/pending/UIPendingEventNotifier;", "Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "ownerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(J)V", "Companion", "CallbackEvent", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker */
/* loaded from: classes11.dex */
public final class C4969x8c157e4d {
    private static final java.lang.String TAG = "MicroMsg.Acc.TimeBlocker";
    private final long intervalTime;

    /* renamed from: $stable */
    public static final int f21372x3b2de05f = 8;
    private final java.util.Map<java.lang.Integer, java.lang.Long> lastTimeCache = new java.util.LinkedHashMap();
    private final com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4972xb50e6d2c handle = new a75.b() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1
        @Override // a75.b
        /* renamed from: handleEvent */
        public void mo788x5797ad52(java.util.List<com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent> eventList) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
            java.util.Iterator<T> it = eventList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent) it.next()).getCallback().mo152xb9724478();
            }
        }
    };
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd<com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent>> ownerMap = new java.util.concurrent.ConcurrentHashMap<>();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/TimeBlocker$CallbackEvent;", "La75/a;", "", "getKey", "newEvent", "mergeEvent", "_key", "Ljava/lang/String;", "get_key", "()Ljava/lang/String;", "Lkotlin/Function0;", "Ljz5/f0;", "callback", "Lyz5/a;", "getCallback", "()Lyz5/a;", "<init>", "(Ljava/lang/String;Lyz5/a;)V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.accessibility.uitl.TimeBlocker$CallbackEvent */
    /* loaded from: classes11.dex */
    public static final class CallbackEvent implements a75.a {

        /* renamed from: $stable */
        public static final int f21378x3b2de05f = 0;
        private final java.lang.String _key;
        private final yz5.a callback;

        public CallbackEvent(java.lang.String _key, yz5.a callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(_key, "_key");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
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

        /* renamed from: get_key */
        public final java.lang.String m42869xfb8ac1f6() {
            return this._key;
        }

        @Override // a75.a
        /* renamed from: mergeEvent */
        public a75.a mo787xbd89c142(a75.a newEvent) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newEvent, "newEvent");
            return newEvent;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.accessibility.uitl.TimeBlocker$handle$1] */
    public C4969x8c157e4d(long j17) {
        this.intervalTime = j17;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$observer$1] */
    /* renamed from: addObserver */
    private final void m42863xdab4fe97(final p012xc85e97e9.p093xedfae76a.y yVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "wait synchronized " + yVar);
        synchronized (this) {
            if (this.ownerMap.containsKey(java.lang.Integer.valueOf(yVar.hashCode()))) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "addObserver init " + yVar);
            final ?? r07 = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$observer$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroy */
                public final void m42870xac79a11b() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                    concurrentHashMap = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.this.ownerMap;
                    concurrentHashMap.remove(java.lang.Integer.valueOf(yVar.hashCode()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.TimeBlocker", "removeObserver onDestroy: " + yVar);
                }
            };
            ((ku5.t0) ku5.t0.f394148d).D(new java.lang.Runnable() { // from class: com.tencent.mm.accessibility.uitl.TimeBlocker$addObserver$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront:" + p012xc85e97e9.p093xedfae76a.y.this + ' ' + p012xc85e97e9.p093xedfae76a.y.this.mo273xed6858b4().b().name());
                    p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = p012xc85e97e9.p093xedfae76a.y.this.mo273xed6858b4();
                    com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4971x471b739a c4971x471b739a = r07;
                    p012xc85e97e9.p093xedfae76a.y yVar2 = p012xc85e97e9.p093xedfae76a.y.this;
                    com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d c4969x8c157e4d = this;
                    if (mo273xed6858b4.b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
                        mo273xed6858b4.a(c4971x471b739a);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Acc.TimeBlocker", "addObserver in uiAtFront but destroy " + yVar2);
                    concurrentHashMap = c4969x8c157e4d.ownerMap;
                    concurrentHashMap.remove(java.lang.Integer.valueOf(yVar2.hashCode()));
                }
            });
        }
    }

    public final long getIntervalTime() {
        return this.intervalTime;
    }

    /* renamed from: isSinceLastTrue */
    public final boolean m42865x6c811594(int key, long time) {
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

    /* renamed from: pendingExcu */
    public final void m42867x4255129c(p012xc85e97e9.p093xedfae76a.y owner, java.lang.String key, yz5.a callback) {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd<com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent> putIfAbsent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (!this.ownerMap.containsKey(java.lang.Integer.valueOf(owner.hashCode()))) {
            m42863xdab4fe97(owner);
        }
        if (owner.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "skip getOrPut because of " + owner + " DESTROYED");
            return;
        }
        if (owner.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.INITIALIZED) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "skip getOrPut because of " + owner + " INITIALIZED");
            return;
        }
        java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd<com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent>> concurrentHashMap = this.ownerMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(owner.hashCode());
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd<com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent> c20987xdf89b6bd = concurrentHashMap.get(valueOf);
        if (c20987xdf89b6bd == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (c20987xdf89b6bd = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20987xdf89b6bd<>(this.intervalTime, this.handle, owner)))) != null) {
            c20987xdf89b6bd = putIfAbsent;
        }
        c20987xdf89b6bd.a(new com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4969x8c157e4d.CallbackEvent(key, callback), true);
    }

    /* renamed from: pendingExcu */
    public final void m42866x4255129c(android.view.View view, java.lang.String type, yz5.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.Object context = view.getContext();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar == null) {
            return;
        }
        m42867x4255129c(yVar, view.hashCode() + type, callback);
    }
}
