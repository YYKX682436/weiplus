package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes.dex */
public final class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f264307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f264308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f264309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f264310g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f264311h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264312i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.d0 f264313m;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, int i17, java.lang.String str, android.content.Intent intent, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var) {
        this.f264307d = f0Var;
        this.f264308e = h0Var;
        this.f264309f = h0Var2;
        this.f264310g = f0Var2;
        this.f264311h = intent;
        this.f264312i = context;
        this.f264313m = d0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        java.util.Map t17 = kz5.c1.t(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19280x3de5f1a6) obj).f264260d);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f264307d;
        boolean a17 = tg0.r2.a(f0Var.f391649d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f264308e;
        if (a17) {
            str = (java.lang.String) h0Var.f391656d;
        } else {
            str = (java.lang.String) h0Var.f391656d;
            try {
                str = fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            } catch (java.lang.Throwable unused) {
            }
            if (str == null) {
                str = "";
            }
        }
        t17.put("query", str);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int i17 = f0Var.f391649d;
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        t17.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        boolean a18 = tg0.r2.a(f0Var.f391649d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f264309f;
        java.lang.String a19 = a18 ? (java.lang.String) h0Var2.f391656d : fp.s0.a((java.lang.String) h0Var2.f391656d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a19);
        t17.put("thirdExtParam", a19);
        t17.put("isHalfScreen", "1");
        boolean z17 = this.f264310g.f391649d == 0;
        if (!z17) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("hideNavBar", bool), new jz5.l("hideSearchBar", bool))));
            if (!tg0.r2.a(f0Var.f391649d)) {
                valueOf = fp.s0.a(valueOf);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            t17.put("extParams", valueOf);
        }
        java.lang.String h17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.a0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).Zi()).h(su4.t0.MP, f0Var.f391649d, 0, f17, f17, (java.lang.String) h0Var.f391656d, null, "");
        if (h17 != null) {
            t17.put("pRequestId", h17);
        }
        java.lang.String str2 = (java.lang.String) h0Var.f391656d;
        android.content.Intent intent = this.f264311h;
        intent.putExtra("ftsQuery", str2);
        intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, f17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        intent.putExtra("rawUrl", su4.r2.e(t17, 0));
        intent.putExtra("ftsbizscene", f0Var.f391649d);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        boolean z18 = !z17;
        intent.putExtra("hideSearchCancel", z18);
        intent.putExtra("hideSearchInput", z18);
        if (!z17) {
            intent.putExtra("key_back_btn_type", 2);
            intent.putExtra("hideSearchTitle", true);
        }
        ((yg0.c4) ((zg0.f3) i95.n0.c(zg0.f3.class))).Ai(new zg0.s3(this.f264312i, intent, false, this.f264313m.f391647d, true, null, null, false, 224, null));
    }
}
