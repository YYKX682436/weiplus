package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class ug implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f281601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f281602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f281603f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f281604g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg f281605h;

    public ug(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg ygVar, int i17, int i18, boolean z17, boolean z18) {
        this.f281605h = ygVar;
        this.f281601d = i17;
        this.f281602e = i18;
        this.f281603f = z17;
        this.f281604g = z18;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.yg ygVar = this.f281605h;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) ygVar.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        java.util.Map n07 = ygVar.n0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f281601d;
        sb6.append(i17 + 1);
        sb6.append("#");
        int i18 = c19666xfd6e2f33.m75435xc09a09d9().f271463f;
        int i19 = this.f281602e;
        sb6.append((i19 / i18) + 1);
        sb6.append("#");
        sb6.append((i19 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1);
        sb6.append("#1");
        java.util.HashMap hashMap = (java.util.HashMap) n07;
        hashMap.put("attachment_item_index", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_send_poi", "view_exp", n07, 36465);
        if (this.f281603f) {
            g4Var.f(1, ygVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggx));
            g4Var.f(2, ygVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggy));
            hashMap.put("attachment_item_index", (i17 + 1) + "#" + ((i19 / c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#" + ((i19 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#2");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_share_poi", "view_exp", n07, 36465);
            return;
        }
        if (!((ygVar.f280113d.u().k2() || com.p314xaae8f345.mm.p2621x8fb0427b.z3.y4(ygVar.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.G4(ygVar.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.s4(ygVar.f280113d.x()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(ygVar.f280113d.x()) || ygVar.f280113d.x().equals(c01.z1.r())) ? false : true) || this.f281604g) {
            g4Var.f(1, ygVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggx));
            return;
        }
        g4Var.f(1, ygVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggx));
        hashMap.put("attachment_item_index", (i17 + 1) + "#" + ((i19 / c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#" + ((i19 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#2");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("chat_actionsheet_share_poi", "view_exp", n07, 36465);
        g4Var.f(2, ygVar.f280113d.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggy));
    }
}
