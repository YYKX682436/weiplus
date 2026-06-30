package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public class x7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 f171866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 f171867e;

    public x7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1) {
        this.f171866d = c11565x2acac113;
        this.f171867e = c11816x5915d2c1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b c11818x81f6960b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUI", "handleDeclarePrompt: onCancel");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = this.f171866d;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12682xb69bcd08.IPCDeclarePromptCallbackParam(c11565x2acac113.f156519d, true, c11565x2acac113.f156520e), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12682xb69bcd08.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w7(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 c11816x5915d2c1 = this.f171867e;
        if (c11816x5915d2c1 == null || !c11816x5915d2c1.c() || (c11818x81f6960b = c11816x5915d2c1.S) == null) {
            return;
        }
        c11818x81f6960b.a();
    }
}
