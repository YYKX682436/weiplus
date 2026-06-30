package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class t4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f284231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f284233g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f284234h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 f284235i;

    public t4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var, java.util.Map map, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33, int i17, int i18, boolean z17) {
        this.f284235i = s4Var;
        this.f284230d = map;
        this.f284231e = c19666xfd6e2f33;
        this.f284232f = i17;
        this.f284233g = i18;
        this.f284234h = z17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 2;
        g4Var.b(2, com.p314xaae8f345.mm.R.C30867xcad56011.f571958um, com.p314xaae8f345.mm.R.raw.f79942x9dbaf4ba);
        java.util.Map map = this.f284230d;
        map.put("has_reddot", 0);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f284231e;
        map.put("attachment_exp_sessionid", c19666xfd6e2f33.m75435xc09a09d9().f271462e);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = this.f284235i;
        map.put("chat_name", s4Var.f284192b.f283178j.x());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.h4 h4Var = s4Var.f284192b;
        java.lang.String x17 = h4Var.f283178j.x();
        h4Var.getClass();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(x17)) {
            i17 = 3;
        } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(x17)) {
            i17 = 1;
        }
        if (c01.e2.R(x17)) {
            i17 = 4;
        }
        map.put("chat_type", java.lang.Integer.valueOf(i17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = this.f284232f;
        sb6.append(i18 + 1);
        sb6.append("#");
        int i19 = c19666xfd6e2f33.m75435xc09a09d9().f271463f;
        int i27 = this.f284233g;
        sb6.append((i27 / i19) + 1);
        sb6.append("#");
        sb6.append((i27 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1);
        sb6.append("#1");
        map.put("attachment_item_index", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_video", "view_exp", map, 36465);
        if (this.f284234h) {
            return;
        }
        map.put("attachment_item_index", (i18 + 1) + "#" + ((i27 / c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#" + ((i27 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#2");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_voice", "view_exp", map, 36465);
        g4Var.b(1, com.p314xaae8f345.mm.R.C30867xcad56011.f571960uo, com.p314xaae8f345.mm.R.raw.f79653xc84c6d76);
    }
}
