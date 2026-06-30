package ps3;

/* loaded from: classes11.dex */
public final class m implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final ps3.c f439635d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f439636e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f439637f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f439638g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.p1976x633fb29.C16944x423a007d f439639h;

    /* renamed from: i, reason: collision with root package name */
    public final ps3.g f439640i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f439641m;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1] */
    public m(ps3.c delegate, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f439635d = delegate;
        this.f439636e = context;
        this.f439637f = new java.util.LinkedList();
        this.f439638g = new java.util.HashMap();
        this.f439639h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5866x1e83a4bf>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.radar.model.RadarAddContact$onFMsgInfoNotify$1
            {
                this.f39173x3fe91575 = -2067027249;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5866x1e83a4bf c5866x1e83a4bf) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5866x1e83a4bf event = c5866x1e83a4bf;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136174g.f88500a;
                com.p314xaae8f345.mm.p2621x8fb0427b.e9 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.e9.f(str);
                ps3.m mVar = ps3.m.this;
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 a17 = ps3.m.a(mVar, f17);
                mVar.f(a17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                java.util.HashMap hashMap = mVar.f439638g;
                hashMap.put(a17.d1(), str);
                hashMap.put(a17.J0(), str);
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(a17.J0())) {
                    Bi.l0(a17);
                }
                mVar.f439641m.mo50293x3498a0(new ps3.j(mVar, a17));
                return false;
            }
        };
        this.f439640i = new ps3.g(this);
        this.f439641m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
    }

    public static final com.p314xaae8f345.mm.p2621x8fb0427b.z3 a(ps3.m mVar, com.p314xaae8f345.mm.p2621x8fb0427b.e9 e9Var) {
        mVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        if (e9Var != null) {
            z3Var.X1(e9Var.f275392a);
            z3Var.K1(e9Var.f275415x);
            z3Var.k1(e9Var.f275393b);
            z3Var.M1(e9Var.f275394c);
            z3Var.R1(e9Var.f275396e);
            z3Var.S1(e9Var.f275395d);
            z3Var.g3(e9Var.f275406o);
            z3Var.h3(e9Var.f275407p);
            z3Var.b3(e9Var.d());
            z3Var.L2(e9Var.a());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RadarAddContact", "verify is null! must be parsed error before!");
        }
        return z3Var;
    }

    public static final void b(ps3.m mVar, java.lang.String str, int i17) {
        mVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5413xfb78e98c c5413xfb78e98c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5413xfb78e98c();
        am.h9 h9Var = c5413xfb78e98c.f135758g;
        h9Var.getClass();
        h9Var.f88360b = str;
        h9Var.f88359a = i17;
        c5413xfb78e98c.e();
    }

    public final long c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ps3.b bVar = new ps3.b(this, new ps3.f(this, username, currentTimeMillis));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(48);
        iz5.a.g(null, username.length() > 0);
        gm0.j1.d().a(30, bVar);
        bVar.f439606f = linkedList;
        bVar.f439607g = username;
        java.util.LinkedList linkedList2 = bVar.f439605e;
        linkedList2.add(username);
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).getClass();
        new r35.e4(this.f439636e, null).g(linkedList2, linkedList);
        return currentTimeMillis;
    }

    public final ps3.e d(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        java.util.LinkedList linkedList = this.f439637f;
        return (n17 == null || ((int) n17.E2) == 0) ? linkedList.contains(username) ? ps3.e.f439610e : ps3.e.f439609d : n17.r2() ? ps3.e.f439611f : this.f439638g.containsKey(username) ? ps3.e.f439612g : linkedList.contains(username) ? ps3.e.f439610e : ps3.e.f439609d;
    }

    public final void e(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        f(z3Var);
        java.util.HashMap hashMap = this.f439638g;
        hashMap.remove(z3Var.d1());
        hashMap.remove(z3Var.J0());
        this.f439641m.mo50293x3498a0(new ps3.i(this, z3Var));
    }

    public final void f(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        java.util.LinkedList linkedList = this.f439637f;
        if (linkedList.contains(z3Var.d1())) {
            linkedList.remove(z3Var.d1());
        }
        if (linkedList.contains(z3Var.J0())) {
            linkedList.remove(z3Var.J0());
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 stg, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stg, "stg");
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RadarAddContact", "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), stg, obj);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) obj, true);
        if (n17 == null || !n17.r2()) {
            return;
        }
        e(n17);
    }
}
