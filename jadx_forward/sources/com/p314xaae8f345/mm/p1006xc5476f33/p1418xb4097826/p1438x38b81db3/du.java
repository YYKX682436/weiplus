package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class du implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms2.b f184731b;

    public du(in5.s0 s0Var, ms2.b bVar) {
        this.f184730a = s0Var;
        this.f184731b = bVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        in5.s0 s0Var = this.f184730a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[6];
        java.lang.String str3 = "";
        if (V6 == null || (str2 = V6.m75945x2fec8307(2)) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str2);
        if (V6 != null && (m75945x2fec8307 = V6.m75945x2fec8307(1)) != null) {
            str3 = m75945x2fec8307;
        }
        lVarArr[1] = new jz5.l("finder_context_id", str3);
        android.content.Context context2 = s0Var.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) context2 : null;
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(activityC14075x761bf857 != null ? activityC14075x761bf857.getD() : V6 != null ? V6.m75939xb282bd08(5) : 0));
        lVarArr[3] = new jz5.l("audio_collection_id", pm0.v.u(this.f184731b.f412501d.m75942xfb822ef2(0)));
        lVarArr[4] = new jz5.l("profile_tab_name", s0Var.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0d));
        lVarArr[5] = new jz5.l("profile_tab_type", 3);
        return kz5.c1.k(lVarArr);
    }
}
