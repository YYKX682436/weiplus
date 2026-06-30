package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class u0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 f198973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f198974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z53 f198975f;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, r45.z53 z53Var) {
        this.f198973d = a1Var;
        this.f198974e = c0Var;
        this.f198975f = z53Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.a1 a1Var = this.f198973d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f198404d, "dialog ok isInstall:" + this.f198974e.f391645d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
        android.app.Activity m80379x76847179 = a1Var.m80379x76847179();
        java.lang.String m75945x2fec8307 = this.f198975f.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        b3Var.c(m80379x76847179, m75945x2fec8307);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184206b == 18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.b(8);
        }
    }
}
