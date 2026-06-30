package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class o3 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f293471a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h f293472b = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h();

    public o3(android.content.Context context) {
        this.f293471a = context;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var;
        android.content.Context context = this.f293471a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h hVar = this.f293472b;
        int i17 = hVar.f293337a;
        if (i17 != 0) {
            z2Var.f293597p = i17;
            z2Var.d();
        }
        int i18 = hVar.f293338b;
        if (i18 != 0) {
            z2Var.f293598q = i18;
            z2Var.e();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a4 a4Var2 = z2Var.f293588d;
        if (a4Var2 != null) {
            a4Var2.setCancelable(hVar.f293339c);
            z2Var.f293588d.f293278h = hVar.f293339c;
        }
        java.lang.CharSequence charSequence = hVar.f293341e;
        if (charSequence != null) {
            z2Var.y(charSequence);
        }
        int i19 = hVar.f293342f;
        if (i19 != 0) {
            z2Var.x(i19);
        }
        java.lang.CharSequence charSequence2 = hVar.f293343g;
        if (charSequence2 != null) {
            z2Var.q(charSequence2);
        }
        int i27 = hVar.f293344h;
        if (i27 != -1) {
            z2Var.r(context, i27);
        }
        int i28 = hVar.f293345i;
        if (i28 != 0) {
            z2Var.i(i28);
        }
        android.view.View view = hVar.f293340d;
        if (view != null) {
            z2Var.j(view);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 q3Var = hVar.f293347k;
        if (q3Var != null) {
            z2Var.l(q3Var);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r3 r3Var = hVar.f293346j;
        if (r3Var != null) {
            z2Var.K = r3Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = z2Var.f293589e;
            if (o3Var != null) {
                o3Var.f293472b.f293346j = r3Var;
            }
        }
        android.content.DialogInterface.OnShowListener onShowListener = hVar.f293348l;
        if (onShowListener != null && (a4Var = z2Var.f293588d) != null) {
            a4Var.setOnShowListener(onShowListener);
        }
        return z2Var;
    }
}
