package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.kh f103753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.f1 f103754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103755c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.o3 f103756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103757e;

    public jh(com.tencent.mm.plugin.finder.convert.kh khVar, so2.f1 f1Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.assist.o3 o3Var, int i17) {
        this.f103753a = khVar;
        this.f103754b = f1Var;
        this.f103755c = s0Var;
        this.f103756d = o3Var;
        this.f103757e = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String string;
        com.tencent.mm.plugin.finder.convert.kh khVar = this.f103753a;
        khVar.getClass();
        so2.f1 f1Var = this.f103754b;
        r45.so2 so2Var = (r45.so2) f1Var.f410336d.getCustom(17);
        java.lang.String str3 = "";
        if (so2Var == null || (str2 = so2Var.getString(3)) == null) {
            str2 = "";
        }
        r45.md1 md1Var = f1Var.f410336d;
        com.tencent.mm.plugin.finder.assist.l2 l2Var = md1Var.getInteger(12) == 1 ? com.tencent.mm.plugin.finder.assist.l2.f102343f : md1Var.getInteger(9) == 1 ? com.tencent.mm.plugin.finder.assist.l2.f102344g : com.tencent.mm.plugin.finder.assist.l2.f102342e;
        r45.so2 so2Var2 = (r45.so2) md1Var.getCustom(17);
        if (so2Var2 != null && (string = so2Var2.getString(0)) != null) {
            str3 = string;
        }
        com.tencent.mm.plugin.finder.assist.l2 l2Var2 = str3.length() > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102348n : md1Var.getInteger(13) > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102345h : md1Var.getInteger(14) > 0 ? com.tencent.mm.plugin.finder.assist.l2.f102346i : khVar.n(f1Var) ? com.tencent.mm.plugin.finder.assist.l2.f102347m : com.tencent.mm.plugin.finder.assist.l2.f102342e;
        jz5.l[] lVarArr = new jz5.l[11];
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        in5.s0 s0Var = this.f103755c;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("finder_context_id", e17 != null ? e17.f135382p : null);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context2);
        lVarArr[1] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context2);
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f135380n) : null);
        lVarArr[3] = new jz5.l("like_panel", 1);
        lVarArr[4] = new jz5.l("relationship", java.lang.Integer.valueOf(l2Var2.f102350d));
        lVarArr[5] = new jz5.l("feedid", f1Var.f410337e);
        lVarArr[6] = new jz5.l("click_on_location", java.lang.Integer.valueOf(this.f103756d.f102426d));
        lVarArr[7] = new jz5.l("like_tabulation_clk_position", java.lang.Integer.valueOf(this.f103757e));
        lVarArr[8] = new jz5.l("thank_status", java.lang.Integer.valueOf(md1Var.getInteger(15) == 1 ? 1 : 0));
        lVarArr[9] = new jz5.l("icon_type", java.lang.Integer.valueOf(l2Var.f102350d));
        lVarArr[10] = new jz5.l("poiid", str2);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (!khVar.n(f1Var)) {
            java.lang.Integer a17 = ju2.r.a();
            int intValue = a17 != null ? a17.intValue() : md1Var.getInteger(16);
            l17.put("thank_style", java.lang.Integer.valueOf(intValue != 1 ? intValue != 2 ? intValue != 3 ? 2 : 5 : 4 : 3));
        }
        java.util.LinkedList list = md1Var.getList(18);
        kotlin.jvm.internal.o.f(list, "getInteraction_label_list(...)");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object c17 = new com.google.gson.i().c(((r45.zb1) it.next()).getString(2), java.util.Map.class);
            kotlin.jvm.internal.o.f(c17, "fromJson(...)");
            l17.putAll((java.util.Map) c17);
        }
        return l17;
    }
}
