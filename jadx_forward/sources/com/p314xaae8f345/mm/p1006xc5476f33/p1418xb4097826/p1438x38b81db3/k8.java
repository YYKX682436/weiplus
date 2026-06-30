package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class k8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l8 f185343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.c1 f185344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 f185346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f185347e;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.l8 l8Var, so2.c1 c1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o3 o3Var, int i17) {
        this.f185343a = l8Var;
        this.f185344b = c1Var;
        this.f185345c = s0Var;
        this.f185346d = o3Var;
        this.f185347e = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        this.f185343a.getClass();
        so2.c1 c1Var = this.f185344b;
        r45.so2 so2Var = c1Var.f491821d.f466971s;
        java.lang.String str3 = "";
        if (so2Var == null || (str2 = so2Var.m75945x2fec8307(3)) == null) {
            str2 = "";
        }
        in5.s0 s0Var = this.f185345c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s0Var.f374654e, "getContext(...)");
        r45.s21 s21Var = c1Var.f491821d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2 l2Var = s21Var.f466966n == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183876f : s21Var.f466963h == 1 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183877g : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183875e;
        r45.so2 so2Var2 = s21Var.f466971s;
        if (so2Var2 != null && (m75945x2fec8307 = so2Var2.m75945x2fec8307(0)) != null) {
            str3 = m75945x2fec8307;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2 l2Var2 = str3.length() > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183881n : s21Var.f466967o > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183878h : s21Var.f466968p > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183879i : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s21Var.f466962g, c01.z1.r()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183880m : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l2.f183875e;
        jz5.l[] lVarArr = new jz5.l[11];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
        lVarArr[0] = new jz5.l("finder_context_id", e17 != null ? e17.f216915p : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
        lVarArr[1] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f216919r : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
        lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f216913n) : null);
        lVarArr[3] = new jz5.l("like_panel", 2);
        lVarArr[4] = new jz5.l("relationship", java.lang.Integer.valueOf(l2Var2.f183883d));
        lVarArr[5] = new jz5.l("feedid", c1Var.f491822e);
        lVarArr[6] = new jz5.l("click_on_location", java.lang.Integer.valueOf(this.f185346d.f183959d));
        lVarArr[7] = new jz5.l("like_tabulation_clk_position", java.lang.Integer.valueOf(this.f185347e));
        lVarArr[8] = new jz5.l("thank_status", java.lang.Integer.valueOf(s21Var.f466969q == 1 ? 1 : 0));
        lVarArr[9] = new jz5.l("icon_type", java.lang.Integer.valueOf(l2Var.f183883d));
        lVarArr[10] = new jz5.l("poiid", str2);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s21Var.f466962g, c01.z1.r())) {
            java.lang.Integer a17 = ju2.r.a();
            int intValue = a17 != null ? a17.intValue() : s21Var.f466970r;
            l17.put("thank_style", java.lang.Integer.valueOf(intValue != 1 ? intValue != 2 ? intValue != 3 ? 2 : 5 : 4 : 3));
        }
        java.util.LinkedList interaction_label_list = s21Var.f466972t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(interaction_label_list, "interaction_label_list");
        java.util.Iterator it = interaction_label_list.iterator();
        while (it.hasNext()) {
            java.lang.Object c17 = new com.p176xb6135e39.p280x308fcb.i().c(((r45.zb1) it.next()).m75945x2fec8307(2), java.util.Map.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "fromJson(...)");
            l17.putAll((java.util.Map) c17);
        }
        return l17;
    }
}
