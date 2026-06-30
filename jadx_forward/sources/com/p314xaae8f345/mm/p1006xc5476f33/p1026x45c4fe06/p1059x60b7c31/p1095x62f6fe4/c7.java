package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes15.dex */
public class c7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e7 f163279d;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e7 e7Var) {
        this.f163279d = e7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e7 e7Var = this.f163279d;
        e7Var.f163322d.f163219w.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433 = e7Var.f163322d;
        c12168x62e4d433.f163213q = 1;
        c12168x62e4d433.f163214r = 1;
        c12168x62e4d433.d();
    }
}
