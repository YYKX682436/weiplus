package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f259660a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f259661b = null;

    public d(android.content.Context context) {
        this.f259660a = null;
        this.f259660a = context;
    }

    public void a(r45.ce4 ce4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.c cVar) {
        if (ce4Var == null || this.f259660a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LqtDialogHelper", "dialog or context is null");
            return;
        }
        int i17 = ce4Var.f453034e;
        if (i17 == 1) {
            if (ce4Var.f453035f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LqtDialogHelper", "dialog center_btn is null");
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f259661b;
            if (j0Var != null && j0Var.isShowing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDialogHelper", "old dialog is exits");
                return;
            }
            android.content.Context context = this.f259660a;
            java.lang.String str = ce4Var.f453033d;
            r45.de4 de4Var = ce4Var.f453035f;
            this.f259661b = db5.e1.E(context, str, "", de4Var.f453882d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b(this, context, de4Var, cVar));
            return;
        }
        if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LqtDialogHelper", "unknown dialog type");
            return;
        }
        if (ce4Var.f453037h == null || ce4Var.f453036g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LqtDialogHelper", "dialog right_btn or left_btn is null");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = this.f259661b;
        if (j0Var2 != null && j0Var2.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtDialogHelper", "old dialog is exits");
            return;
        }
        android.content.Context context2 = this.f259660a;
        java.lang.String str2 = ce4Var.f453033d;
        r45.de4 de4Var2 = ce4Var.f453037h;
        java.lang.String str3 = de4Var2.f453882d;
        r45.de4 de4Var3 = ce4Var.f453036g;
        this.f259661b = db5.e1.C(context2, str2, "", str3, de4Var3.f453882d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b(this, context2, de4Var2, cVar), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.b(this, context2, de4Var3, cVar));
    }
}
