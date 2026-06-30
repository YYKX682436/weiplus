package fm3;

/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: c, reason: collision with root package name */
    public static int f345605c;

    /* renamed from: d, reason: collision with root package name */
    public static int f345606d;

    /* renamed from: a, reason: collision with root package name */
    public static final fm3.g0 f345603a = new fm3.g0();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 f345604b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f345607e = new java.util.LinkedHashMap();

    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2>(a0Var) { // from class: com.tencent.mm.plugin.mv.model.MvCreateReportHelper$finderPostFinishListener$1
            {
                this.f39173x3fe91575 = 1254966226;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c6775xb6999670;
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 event = c5521xb353c3e2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.vc vcVar = event.f135849g;
                if (vcVar != null && vcVar.f89722b && (c6775xb6999670 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670) fm3.g0.f345607e.remove(java.lang.Long.valueOf(vcVar.f89721a))) != null) {
                    r45.kv2 kv2Var = vcVar.f89723c;
                    if (kv2Var == null || (str = kv2Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    c6775xb6999670.f141018n = c6775xb6999670.b("MvObjectId", str, true);
                    c6775xb6999670.k();
                    c6775xb6999670.o();
                }
                return false;
            }
        }.mo48813x58998cd();
    }

    public final void a(int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = c();
        c17.f141015k = 6L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('#');
        sb6.append(i18);
        c17.E = c17.b("MaterialCount", sb6.toString(), true);
        c17.k();
        c17.o();
    }

    public final void b(int i17, fm3.q data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = c();
        c17.f141022r = c17.b("FeedId", data.a(), true);
        c17.f141023s = c17.b("FinderUin", data.b(), true);
        int i18 = f345605c;
        if (i18 != 1 && i18 != 2) {
            c17.f141026v = f345606d;
        }
        c17.f141028x = i17;
        c17.f141029y = i18;
        c17.A = data.d();
        c17.f141015k = 2L;
        c17.H = 1;
        c17.k();
        c17.o();
    }

    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c() {
        return new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670(f345604b.m());
    }
}
