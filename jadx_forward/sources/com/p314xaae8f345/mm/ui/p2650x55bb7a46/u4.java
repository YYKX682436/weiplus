package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class u4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f284263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f284264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284265f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f284266g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 f284267h;

    public u4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var, java.util.Map map, int i17, int i18, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f284267h = s4Var;
        this.f284263d = map;
        this.f284264e = i17;
        this.f284265f = i18;
        this.f284266g = c19666xfd6e2f33;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.s4 s4Var = this.f284267h;
        int i18 = this.f284264e;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f284266g;
        int i19 = this.f284265f;
        java.util.Map map = this.f284263d;
        if (itemId == 1) {
            map.put("attachment_item_index", (i18 + 1) + "#" + ((i19 / c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#" + ((i19 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#2");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_voice", "view_clk", map, 36465);
            s4Var.f284192b.F();
            return;
        }
        if (itemId != 2) {
            return;
        }
        map.put("attachment_item_index", (i18 + 1) + "#" + ((i19 / c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#" + ((i19 % c19666xfd6e2f33.m75435xc09a09d9().f271463f) + 1) + "#1");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voip_chat_actionsheet_video", "view_clk", map, 36465);
        s4Var.f284192b.G();
    }
}
