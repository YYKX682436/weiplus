package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class q2 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f163538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f163539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 f163540f;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f163540f = e3Var;
        this.f163538d = lVar;
        this.f163539e = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 == 145) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission sys perm denied for choose image");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f163538d.mo48798x74292566()).f167246f = false;
                this.f163538d.a(this.f163539e, this.f163540f.o("fail:system permission denied"));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestExternalStoragePermission permission is grant for choose image");
                android.content.Context mo50352x76847179 = this.f163538d.mo50352x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var = this.f163540f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(mo50352x76847179, e3Var.f163315h, e3Var.f163316i);
            }
            si1.e1.c(this.f163538d.mo48798x74292566());
            this.f163540f.f163314g = false;
            return;
        }
        if (i17 == 113) {
            if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "requestCameraPermission sys perm denied for choose image");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f163538d.mo48798x74292566()).f167246f = false;
                this.f163538d.a(this.f163539e, this.f163540f.o("fail:system permission denied"));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "requestCameraPermission permission is grant for choose image");
                android.content.Context mo50352x768471792 = this.f163538d.mo50352x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e3 e3Var2 = this.f163540f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.b(mo50352x768471792, e3Var2.f163315h, e3Var2.f163316i);
            }
            si1.e1.c(this.f163538d.mo48798x74292566());
            this.f163540f.f163314g = false;
        }
    }
}
