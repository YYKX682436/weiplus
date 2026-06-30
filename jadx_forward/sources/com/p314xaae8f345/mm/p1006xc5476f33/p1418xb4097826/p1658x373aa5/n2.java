package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 f214223d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var) {
        this.f214223d = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s2 s2Var = this.f214223d;
        android.content.Context context = s2Var.f214527b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        kz5.p0 p0Var = kz5.p0.f395529d;
        long j17 = s2Var.f214528c;
        java.lang.String str = s2Var.f214529d;
        int i17 = s2Var.f214531f;
        java.lang.String str2 = s2Var.f214532g;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = s2Var.f214533h;
        gm0.j1.d().g(new db2.j5(1, p0Var, j17, str, i17, str3, str4 == null ? "" : str4, s2Var.f214534i, V6));
        android.content.Context context2 = s2Var.f214527b;
        db5.t7.h(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572834cp3));
        s2Var.f214535j = 1;
        s2Var.dismiss();
    }
}
