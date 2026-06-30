package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class sk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd f192073d;

    public sk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd activityC14093x52d98fcd) {
        this.f192073d = activityC14093x52d98fcd;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd activityC14093x52d98fcd = this.f192073d;
        r45.n46 n46Var = activityC14093x52d98fcd.A;
        if (n46Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareData");
            throw null;
        }
        r45.bu5 bu5Var = (r45.bu5) n46Var.m75936x14adae67(1);
        java.lang.String str2 = "";
        if (bu5Var == null || (str = bu5Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        r45.n46 n46Var2 = activityC14093x52d98fcd.A;
        if (n46Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareData");
            throw null;
        }
        r45.bu5 bu5Var2 = (r45.bu5) n46Var2.m75936x14adae67(1);
        if (bu5Var2 != null && (m75945x2fec8307 = bu5Var2.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        activityC14093x52d98fcd.e7(-6, "teenmode", str, str2);
        activityC14093x52d98fcd.finish();
    }
}
