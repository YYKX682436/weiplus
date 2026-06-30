package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class f9 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 f162418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162419f;

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var, int i17) {
        this.f162417d = lVar;
        this.f162418e = i9Var;
        this.f162419f = i17;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 == 113) {
            if (grantResults.length <= 0 || grantResults[0] != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission sys perm denied for choose image");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(this.f162417d.mo48798x74292566()).f167246f = false;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162417d;
                int i18 = this.f162419f;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var = this.f162418e;
                i9Var.getClass();
                java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:system permission denied" : null;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("errno", 3);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                lVar.a(i18, i9Var.u(str, jSONObject));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission permission is grant for choose image");
                android.content.Context mo50352x76847179 = this.f162417d.mo50352x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i9 i9Var2 = this.f162418e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e = i9Var2.f162843h;
                if (c11927x8987708e == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar = i9Var2.f162844i;
                if (uVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultReceiver");
                    throw null;
                }
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c11927x8987708e, uVar, null);
            }
            si1.e1.c(this.f162417d.mo48798x74292566());
            this.f162418e.f162842g = false;
        }
    }
}
