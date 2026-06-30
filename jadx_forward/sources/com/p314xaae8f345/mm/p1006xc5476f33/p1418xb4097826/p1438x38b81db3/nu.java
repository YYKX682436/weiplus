package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nu implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms2.e f185659b;

    public nu(in5.s0 s0Var, ms2.e eVar) {
        this.f185658a = s0Var;
        this.f185659b = eVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        in5.s0 s0Var = this.f185658a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.p2.class);
        if (p2Var == null || (str2 = p2Var.m58743x6c03c64c()) == null) {
            str2 = "";
        }
        jz5.l[] lVarArr = new jz5.l[7];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", c17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        lVarArr[2] = new jz5.l("behaviour_session_id", Ri != null ? Ri : "");
        android.content.Context context2 = s0Var.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 activityC14075x761bf857 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) context2 : null;
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(activityC14075x761bf857 != null ? activityC14075x761bf857.getD() : 32));
        lVarArr[4] = new jz5.l("finder_username", str2);
        lVarArr[5] = new jz5.l("categoryid", this.f185659b.f412506d.f453950d);
        lVarArr[6] = new jz5.l("profile_tab_name", java.lang.String.valueOf(s0Var.f374654e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0h)));
        return kz5.c1.k(lVarArr);
    }
}
