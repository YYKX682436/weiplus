package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

/* loaded from: classes14.dex */
public abstract class a<T extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f128288a = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private final java.util.Map<com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.InterfaceC30881a, java.util.Deque<T>> f128290c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f128291d = false;

    /* renamed from: e, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a f128292e = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.b.a(f128288a);

    /* renamed from: f, reason: collision with root package name */
    private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g<T> f128293f = new com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g(this) { // from class: com.tencent.liteav.videobase.frame.b

        /* renamed from: a, reason: collision with root package name */
        private final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a f128294a;

        {
            this.f128294a = this;
        }

        @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g
        public final void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i iVar) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.a(this.f128294a, iVar);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f128289b = null;

    /* renamed from: com.tencent.liteav.videobase.frame.a$a, reason: collision with other inner class name */
    /* loaded from: classes14.dex */
    public interface InterfaceC30881a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a aVar, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.i iVar) {
        if (iVar == 0) {
            return;
        }
        synchronized (aVar.f128290c) {
            if (aVar.f128291d) {
                aVar.a((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a) iVar);
                return;
            }
            java.util.Deque<T> b17 = aVar.b(aVar.b((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a) iVar));
            iVar.m31133x9eb8d51a(android.os.SystemClock.elapsedRealtime());
            b17.addFirst(iVar);
            aVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
        T peekLast;
        if (this.f128292e.a()) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (this.f128290c) {
                for (java.util.Deque<T> deque : this.f128290c.values()) {
                    while (!deque.isEmpty() && ((peekLast = deque.peekLast()) == null || elapsedRealtime - peekLast.m31132xd527ca2d() >= f128288a)) {
                        deque.pollLast();
                        arrayList.add(peekLast);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a<T>) it.next());
            }
        }
    }

    public abstract T a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.g<T> gVar, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.InterfaceC30881a interfaceC30881a);

    public abstract void a(T t17);

    public abstract com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.InterfaceC30881a b(T t17);

    public void b() {
        this.f128291d = true;
        a();
    }

    /* renamed from: finalize */
    public void m31122xd764dc1e() {
        super.finalize();
        if (this.f128291d) {
            return;
        }
        com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("FramePool", "%s must call destroy() before finalize()!\n%s", getClass().getName(), this.f128289b);
    }

    private java.util.Deque<T> b(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.InterfaceC30881a interfaceC30881a) {
        java.util.Deque<T> deque = this.f128290c.get(interfaceC30881a);
        if (deque != null) {
            return deque;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f128290c.put(interfaceC30881a, linkedList);
        return linkedList;
    }

    public final T a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a.InterfaceC30881a interfaceC30881a) {
        T removeFirst;
        synchronized (this.f128290c) {
            java.util.Deque<T> b17 = b(interfaceC30881a);
            removeFirst = !b17.isEmpty() ? b17.removeFirst() : null;
        }
        c();
        if (removeFirst == null) {
            removeFirst = a(this.f128293f, interfaceC30881a);
        }
        if (removeFirst.mo31090xc84df105() != 1) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.e("FramePool", "invalid reference count for %s", removeFirst);
        }
        return removeFirst;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.f128290c) {
            java.util.Iterator<java.util.Deque<T>> it = this.f128290c.values().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next());
            }
            this.f128290c.clear();
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            a((com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.a<T>) it6.next());
        }
    }
}
