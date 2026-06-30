package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class i9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34360x366c91de = 1565;

    /* renamed from: NAME */
    public static final java.lang.String f34361x24728b = "openCameraForImageSearch";

    /* renamed from: g, reason: collision with root package name */
    public boolean f162842g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e f162843h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u f162844i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l service, org.json.JSONObject data, int i17) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (service.mo48798x74292566() == null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid appid" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1005);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            service.a(i17, u(str2, jSONObject));
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(service.mo48798x74292566()).f167246f) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            service.a(i17, u(str2, jSONObject2));
            return;
        }
        android.content.Context mo50352x76847179 = service.mo50352x76847179();
        if (mo50352x76847179 == null || !(mo50352x76847179 instanceof android.app.Activity)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            service.a(i17, u(str2, jSONObject3));
            return;
        }
        boolean z18 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.a(service.mo48798x74292566()).f167246f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(service.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.g9(service));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e();
        this.f162843h = c11927x8987708e;
        c11927x8987708e.r(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e2 = this.f162843h;
        if (c11927x8987708e2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        c11927x8987708e2.m(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e3 = this.f162843h;
        if (c11927x8987708e3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        c11927x8987708e3.n(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e4 = this.f162843h;
        if (c11927x8987708e4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        c11927x8987708e4.o(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e5 = this.f162843h;
        if (c11927x8987708e5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        c11927x8987708e5.i(service.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e6 = this.f162843h;
        if (c11927x8987708e6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        c11927x8987708e6.q(data.toString());
        this.f162844i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h9(service, i17, this);
        if (!this.f162842g) {
            si1.e1.a(service.mo48798x74292566(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f9(service, this, i17));
            this.f162842g = true;
        }
        android.content.Context mo50352x768471792 = service.mo50352x76847179();
        if (mo50352x768471792 == null || !(mo50352x768471792 instanceof android.app.Activity)) {
            java.lang.String str6 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str6 != null ? str6 : "";
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            service.a(i17, u(str2, jSONObject4));
            z17 = false;
        } else {
            z17 = nf.t.a((android.app.Activity) mo50352x768471792, service, "android.permission.CAMERA", 113, "", "");
        }
        if (z17) {
            si1.e1.c(service.mo48798x74292566());
            this.f162842g = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission fail, abort");
            z18 = false;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCameraForImageSearch", "requestCameraPermission fail, abort");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11927x8987708e c11927x8987708e7 = this.f162843h;
        if (c11927x8987708e7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRequest");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar = this.f162844i;
        if (uVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultReceiver");
            throw null;
        }
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c11927x8987708e7, uVar, null);
    }
}
