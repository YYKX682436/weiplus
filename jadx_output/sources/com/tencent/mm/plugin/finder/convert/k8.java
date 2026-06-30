package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class k8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.l8 f103810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.c1 f103811b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103812c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.o3 f103813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103814e;

    public k8(com.tencent.mm.plugin.finder.convert.l8 l8Var, so2.c1 c1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.assist.o3 o3Var, int i17) {
        this.f103810a = l8Var;
        this.f103811b = c1Var;
        this.f103812c = s0Var;
        this.f103813d = o3Var;
        this.f103814e = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        this.f103810a.getClass();
        so2.c1 c1Var = this.f103811b;
        r45.so2 so2Var = c1Var.f410288d.f385438s;
        java.lang.String str3 = "";
        if (so2Var == null || (str2 = so2Var.getString(3)) == null) {
            str2 = "";
        }
        in5.s0 s0Var = this.f103812c;
        kotlin.jvm.internal.o.f(s0Var.f293121e, "getContext(...)");
        r45.s21 s21Var = c1Var.f410288d;
        com.tencent.mm.plugin.finder.assist.l2 l2Var = s21Var.f385433n == 1 ? com.tencent.mm.plugin.finder.assist.l2.f102343f : s21Var.f385430h == 1 ? com.tencent.mm.plugin.finder.assist.l2.f102344g : com.tencent.mm.plugin.finder.assist.l2.f102342e;
        r45.so2 so2Var2 = s21Var.f385438s;
        if (so2Var2 != null && (string = so2Var2.getString(0)) != null) {
            str3 = string;
        }
        com.tencent.mm.plugin.finder.assist.l2 l2Var2 = str3.length() > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102348n : s21Var.f385434o > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102345h : s21Var.f385435p > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102346i : kotlin.jvm.internal.o.b(s21Var.f385429g, c01.z1.r()) ? com.tencent.mm.plugin.finder.assist.l2.f102347m : com.tencent.mm.plugin.finder.assist.l2.f102342e;
        jz5.l[] lVarArr = new jz5.l[11];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("finder_context_id", e17 != null ? e17.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
        lVarArr[1] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
        lVarArr[3] = new jz5.l("like_panel", 2);
        lVarArr[4] = new jz5.l("relationship", java.lang.Integer.valueOf(l2Var2.f102350d));
        lVarArr[5] = new jz5.l("feedid", c1Var.f410289e);
        lVarArr[6] = new jz5.l("click_on_location", java.lang.Integer.valueOf(this.f103813d.f102426d));
        lVarArr[7] = new jz5.l("like_tabulation_clk_position", java.lang.Integer.valueOf(this.f103814e));
        lVarArr[8] = new jz5.l("thank_status", java.lang.Integer.valueOf(s21Var.f385436q == 1 ? 1 : 0));
        lVarArr[9] = new jz5.l("icon_type", java.lang.Integer.valueOf(l2Var.f102350d));
        lVarArr[10] = new jz5.l("poiid", str2);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (!kotlin.jvm.internal.o.b(s21Var.f385429g, c01.z1.r())) {
            java.lang.Integer a17 = ju2.r.a();
            int intValue = a17 != null ? a17.intValue() : s21Var.f385437r;
            l17.put("thank_style", java.lang.Integer.valueOf(intValue != 1 ? intValue != 2 ? intValue != 3 ? 2 : 5 : 4 : 3));
        }
        java.util.LinkedList interaction_label_list = s21Var.f385439t;
        kotlin.jvm.internal.o.f(interaction_label_list, "interaction_label_list");
        java.util.Iterator it = interaction_label_list.iterator();
        while (it.hasNext()) {
            java.lang.Object c17 = new com.google.gson.i().c(((r45.zb1) it.next()).getString(2), java.util.Map.class);
            kotlin.jvm.internal.o.f(c17, "fromJson(...)");
            l17.putAll((java.util.Map) c17);
        }
        return l17;
    }
}
