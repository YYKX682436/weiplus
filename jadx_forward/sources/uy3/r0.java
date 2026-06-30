package uy3;

/* loaded from: classes8.dex */
public final class r0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: e, reason: collision with root package name */
    public static android.os.Bundle f513524e;

    /* renamed from: f, reason: collision with root package name */
    public static uy3.o0 f513525f;

    /* renamed from: d, reason: collision with root package name */
    public static final uy3.r0 f513523d = new uy3.r0();

    /* renamed from: g, reason: collision with root package name */
    public static final uy3.p0 f513526g = new uy3.p0();

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        boolean e17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String string2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data == null: ");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxShareHelper", sb6.toString());
        if (i17 == 1) {
            java.lang.String str6 = "";
            if (i18 != -1) {
                if (i18 != 0) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult cancel");
                android.os.Bundle bundle = f513524e;
                if (bundle == null || (str4 = bundle.getString("enter_session")) == null) {
                    str4 = "";
                }
                if (bundle == null || (str5 = bundle.getString("tab_session")) == null) {
                    str5 = "";
                }
                if (bundle != null && (string2 = bundle.getString("scan_session")) != null) {
                    str6 = string2;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21537, str5, str6, 3, str4);
                return;
            }
            uy3.o0 o0Var = f513525f;
            if (o0Var == null || o0Var.f513519a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult shareInfo invalid");
                return;
            }
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult fail, toUser is null");
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            uy3.o0 o0Var2 = f513525f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var2);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = o0Var2.f513519a;
            uy3.o0 o0Var3 = f513525f;
            java.lang.String str7 = o0Var3 != null ? o0Var3.f513520b : null;
            if (c11286x34a5504 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage appMsg is null");
                e17 = false;
            } else {
                android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str7);
                if (Bi != null && !Bi.isRecycled()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanSendAppMsgHelper", "doSendAppMessage thumbImage is not null");
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                    c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject iMediaObject = c11286x34a5504.f33122xe4128443;
                if (iMediaObject instanceof com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(iMediaObject, "null cannot be cast to non-null type com.tencent.mm.opensdk.modelmsg.WXWebpageObject");
                    str = ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1) iMediaObject).f33249xa1713a8c;
                } else {
                    str = "";
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
                am.jt jtVar = c5987xfe669c12.f136282g;
                jtVar.f88613a = c11286x34a5504;
                jtVar.f88614b = null;
                jtVar.f88615c = "";
                jtVar.f88616d = stringExtra;
                jtVar.f88617e = 2;
                jtVar.f88618f = null;
                jtVar.f88619g = null;
                jtVar.f88621i = str;
                jtVar.f88622j = str;
                jtVar.f88623k = null;
                e17 = c5987xfe669c12.e();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                    am.mt mtVar = c5990xd50ae361.f136285g;
                    mtVar.f88895a = stringExtra;
                    mtVar.f88896b = stringExtra2;
                    mtVar.f88897c = c01.e2.C(stringExtra);
                    mtVar.f88898d = 0;
                    c5990xd50ae361.e();
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanBoxShareHelper", "onShareToFriendResult sendOk: %b", java.lang.Boolean.valueOf(e17));
            if (e17) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                uy3.q0 q0Var = uy3.q0.f513522d;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(q0Var, 200L, false);
            }
            boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(stringExtra);
            android.os.Bundle bundle2 = f513524e;
            if (e17) {
                if (bundle2 == null || (str2 = bundle2.getString("enter_session")) == null) {
                    str2 = "";
                }
                if (bundle2 == null || (str3 = bundle2.getString("tab_session")) == null) {
                    str3 = "";
                }
                if (bundle2 != null && (string = bundle2.getString("scan_session")) != null) {
                    str6 = string;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21537, str3, str6, java.lang.Integer.valueOf(R4 ? 1 : 2), str2);
            }
        }
    }
}
