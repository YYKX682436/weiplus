package uw4;

/* loaded from: classes9.dex */
public abstract class y {
    public static final void a(android.content.Context context, java.lang.String appId, java.lang.String toUser, org.json.JSONObject data, java.lang.String appendText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendText, "appendText");
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(data.optString("img_url"));
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1 c11300x89dbd7a1 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11300x89dbd7a1();
        c11300x89dbd7a1.f33249xa1713a8c = data.optString("link");
        c11300x89dbd7a1.f33246xb2206a6f = data.optString("review_data");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11300x89dbd7a1;
        c11286x34a5504.f33130x6942258 = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        c11286x34a5504.f33121x993583fc = data.optString("desc");
        if (Bi != null && !Bi.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMsgUtil", "thumb image is not null");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            Bi.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(appId);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88614b = appId;
        jtVar.f88615c = h17 == null ? "" : h17.f67372x453d1e07;
        jtVar.f88616d = toUser;
        jtVar.f88617e = 2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(data.optString("src_username"))) {
            jtVar.f88620h = null;
        } else {
            jtVar.f88618f = data.optString("src_username");
            jtVar.f88619g = data.optString("src_displayname");
        }
        jtVar.f88621i = data.optString("shareUrl");
        jtVar.f88622j = data.optString("currentUrl");
        jtVar.f88623k = data.optString("preVerifyAppId");
        c5987xfe669c12.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(appendText)) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a17 = com.p314xaae8f345.mm.ui.i1.a(appendText);
            if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(toUser) || a17 == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                am.mt mtVar = c5990xd50ae361.f136285g;
                mtVar.f88895a = toUser;
                mtVar.f88896b = appendText;
                mtVar.f88897c = c01.e2.C(toUser);
                mtVar.f88898d = 0;
                c5990xd50ae361.e();
            } else if (w11.t1.a(toUser)) {
                w11.r1 b17 = w11.s1.b(toUser, null, 2, null);
                b17.e(appendText);
                b17.h(c01.e2.C(toUser));
                b17.f523664f = 1;
                b17.f523666h = a17;
                w11.r1.d(b17, null, 1, null);
            } else {
                w11.r1 b18 = w11.s1.b(toUser, null, 2, null);
                b18.g(toUser);
                b18.e(appendText);
                b18.h(c01.e2.C(toUser));
                b18.f523664f = 1;
                b18.f523666h = a17;
                b18.f523667i = 5;
                b18.a().a();
            }
        }
        if (data.optBoolean("showHasSendTips")) {
            db5.e1.T(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6));
        } else {
            db5.e1.T(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        }
    }
}
