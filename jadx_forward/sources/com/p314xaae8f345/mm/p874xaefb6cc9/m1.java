package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes12.dex */
public class m1 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.m1 f150642c = new com.p314xaae8f345.mm.p874xaefb6cc9.m1();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f150643d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f150644a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f150645b = new java.util.ArrayList();

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: getLogger */
    public com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 mo46974x23af1886(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.f150644a;
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = (com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).get(str);
        if (interfaceC25508x87fce1b0 != null) {
            return interfaceC25508x87fce1b0;
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.l1 l1Var = new com.p314xaae8f345.mm.p874xaefb6cc9.l1(this, str);
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b02 = (com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0) ((java.util.concurrent.ConcurrentHashMap) concurrentMap).putIfAbsent(str, l1Var);
        return interfaceC25508x87fce1b02 == null ? l1Var : interfaceC25508x87fce1b02;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: getNativeLogFunc */
    public long mo46975x98af045b() {
        return com.p314xaae8f345.mm.p874xaefb6cc9.C10916xb8be82ec.m46903x98af045b();
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25498xa2251f91
    /* renamed from: init */
    public void mo46976x316510(boolean z17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f150643d;
        if (!atomicBoolean.get() && z17) {
            fp.d0.o("wechatxlog");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c c4611x87cbdd8c = new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4611x87cbdd8c(true);
            c4611x87cbdd8c.mo40547x6cf51c31(2, 0, com.p314xaae8f345.mm.p2621x8fb0427b.x3.f277857a, lp0.b.g0(), "WVA_SANDBOX", 3);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.j(c4611x87cbdd8c);
        }
        atomicBoolean.set(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 m40533xfb80ca96 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96();
        synchronized (this.f150645b) {
            java.util.Iterator it = this.f150645b.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p874xaefb6cc9.k1 k1Var = (com.p314xaae8f345.mm.p874xaefb6cc9.k1) it.next();
                java.lang.Throwable th6 = k1Var.f150627d;
                java.lang.String format = th6 == null ? k1Var.f150626c : java.lang.String.format(k1Var.f150626c, th6);
                if (format == null) {
                    format = "";
                }
                java.lang.String str = format;
                int i17 = k1Var.f150624a;
                if (i17 == 1) {
                    m40533xfb80ca96.mo40553x32c581(0L, k1Var.f150625b, "", "", 0, k1Var.f150628e, k1Var.f150629f, k1Var.f150630g, str);
                } else if (i17 == 2) {
                    m40533xfb80ca96.mo40557x32c593(0L, k1Var.f150625b, "", "", 0, k1Var.f150628e, k1Var.f150629f, k1Var.f150630g, str);
                } else if (i17 == 3) {
                    m40533xfb80ca96.mo40555x32c585(0L, k1Var.f150625b, "", "", 0, k1Var.f150628e, k1Var.f150629f, k1Var.f150630g, str);
                } else if (i17 == 4) {
                    m40533xfb80ca96.mo40552x32c580(0L, k1Var.f150625b, "", "", 0, k1Var.f150628e, k1Var.f150629f, k1Var.f150630g, str);
                } else if (i17 == 5) {
                    m40533xfb80ca96.mo40556x32c592(0L, k1Var.f150625b, "", "", 0, k1Var.f150628e, k1Var.f150629f, k1Var.f150630g, str);
                }
            }
            this.f150645b.clear();
        }
    }
}
