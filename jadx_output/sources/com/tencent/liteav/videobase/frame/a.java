package com.tencent.liteav.videobase.frame;

/* loaded from: classes14.dex */
public abstract class a<T extends com.tencent.liteav.videobase.frame.i> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f46755a = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<com.tencent.liteav.videobase.frame.a.InterfaceC0011a, java.util.Deque<T>> f46757c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f46758d = false;

    /* renamed from: e, reason: collision with root package name */
    private final com.tencent.liteav.base.b.a f46759e = new com.tencent.liteav.base.b.a(f46755a);

    /* renamed from: f, reason: collision with root package name */
    private final com.tencent.liteav.videobase.frame.g<T> f46760f = new com.tencent.liteav.videobase.frame.g(this) { // from class: com.tencent.liteav.videobase.frame.b

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.liteav.videobase.frame.a f46761a;

        {
            this.f46761a = this;
        }

        @Override // com.tencent.liteav.videobase.frame.g
        public final void a(com.tencent.liteav.videobase.frame.i iVar) {
            com.tencent.liteav.videobase.frame.a.a(this.f46761a, iVar);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f46756b = null;

    /* renamed from: com.tencent.liteav.videobase.frame.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public interface InterfaceC0011a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(com.tencent.liteav.videobase.frame.a aVar, com.tencent.liteav.videobase.frame.i iVar) {
        if (iVar == 0) {
            return;
        }
        synchronized (aVar.f46757c) {
            if (aVar.f46758d) {
                aVar.a((com.tencent.liteav.videobase.frame.a) iVar);
                return;
            }
            java.util.Deque<T> b17 = aVar.b(aVar.b((com.tencent.liteav.videobase.frame.a) iVar));
            iVar.updateLastUsedTimestamp(android.os.SystemClock.elapsedRealtime());
            b17.addFirst(iVar);
            aVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
        T peekLast;
        if (this.f46759e.a()) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this.f46757c) {
                for (java.util.Deque<T> deque : this.f46757c.values()) {
                    while (!deque.isEmpty() && ((peekLast = deque.peekLast()) == null || elapsedRealtime - peekLast.getLastUsedTimestamp() >= f46755a)) {
                        deque.pollLast();
                        arrayList.add(peekLast);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((com.tencent.liteav.videobase.frame.a<T>) it.next());
            }
        }
    }

    public abstract T a(com.tencent.liteav.videobase.frame.g<T> gVar, com.tencent.liteav.videobase.frame.a.InterfaceC0011a interfaceC0011a);

    public abstract void a(T t17);

    public abstract com.tencent.liteav.videobase.frame.a.InterfaceC0011a b(T t17);

    public void b() {
        this.f46758d = true;
        a();
    }

    public void finalize() {
        super.finalize();
        if (this.f46758d) {
            return;
        }
        com.tencent.liteav.base.util.LiteavLog.e("FramePool", "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.f46756b);
    }

    private java.util.Deque<T> b(com.tencent.liteav.videobase.frame.a.InterfaceC0011a interfaceC0011a) {
        java.util.Deque<T> deque = this.f46757c.get(interfaceC0011a);
        if (deque != null) {
            return deque;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f46757c.put(interfaceC0011a, linkedList);
        return linkedList;
    }

    public final T a(com.tencent.liteav.videobase.frame.a.InterfaceC0011a interfaceC0011a) {
        T removeFirst;
        synchronized (this.f46757c) {
            java.util.Deque<T> b17 = b(interfaceC0011a);
            removeFirst = !b17.isEmpty() ? b17.removeFirst() : null;
        }
        c();
        if (removeFirst == null) {
            removeFirst = a(this.f46760f, interfaceC0011a);
        }
        if (removeFirst.retain() != 1) {
            com.tencent.liteav.base.util.LiteavLog.e("FramePool", "invalid reference count for %s", removeFirst);
        }
        return removeFirst;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f46757c) {
            java.util.Iterator<java.util.Deque<T>> it = this.f46757c.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
            this.f46757c.clear();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            a((com.tencent.liteav.videobase.frame.a<T>) it6.next());
        }
    }
}
