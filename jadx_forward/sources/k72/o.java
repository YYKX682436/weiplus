package k72;

/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c76;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76 c5925x646e9c762 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5925x646e9c76) abstractC20979x809547d1;
        am.jr jrVar = c5925x646e9c762.f136227g;
        int i17 = jrVar.f88600a;
        java.lang.String str = jrVar.f88601b;
        java.lang.String str2 = jrVar.f88602c;
        java.lang.String str3 = jrVar.f88603d;
        java.lang.String str4 = jrVar.f88604e;
        java.lang.String str5 = jrVar.f88605f;
        java.lang.String str6 = jrVar.f88606g;
        boolean z18 = jrVar.f88608i;
        android.app.Activity activity = jrVar.f88609j;
        int i18 = jrVar.f88607h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionEventListener", "receive face check action event, scene: %s, package: %s, sign: %s, title: %s, otherVerifyTitleFront：%s, faceVerifyTitle:%s, useHttp:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4, str6, java.lang.Boolean.valueOf(z18));
        k72.u uVar = k72.u.B;
        uVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "startFaceCheckAction, scene: %s, packageName: %s, packageSign: %s, otherVerifyTitle: %s, otherVerifyTitleFront:%s, needFrontPage : %s, faceVerifyTitle：%s, requestCode: %s, useHttp: %s", java.lang.Integer.valueOf(i17), str, str2, str3, str4, str5, str6, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
        if (activity == null) {
            c5925x646e9c76 = c5925x646e9c762;
            z17 = false;
        } else {
            uVar.f386282d = new k72.n();
            uVar.f386284f = i17;
            uVar.f386285g = str;
            uVar.f386286h = str2;
            uVar.f386287i = str3;
            uVar.f386288m = str5;
            uVar.f386301z = false;
            z17 = true;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                vz2.c.k("agreementUI", 0);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61.class);
            } else if (uVar.f386288m.equals("true")) {
                vz2.c.k("agreementUI", 0);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61.class);
            } else {
                vz2.c.k("agreementUI", 1);
                intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.class);
            }
            if (wz2.a.f()) {
                vz2.c.k("kindaCross", 1);
            } else {
                vz2.c.k("kindaCross", 0);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
            bundle.putString("package", str);
            bundle.putString("packageSign", str2);
            bundle.putString("otherVerifyTitle", str3);
            bundle.putString("otherVerifyTitleFront", str4);
            bundle.putString("faceVerifyTitle", str6);
            bundle.putBoolean("useHttp", z18);
            intent.putExtras(bundle);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/facedetectaction/model/FaceCheckActionMgr", "startFaceCheckAction", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            uVar.f386295t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("FaceCheckActionMgr_worker");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_paysec_spam_report, false)) {
                k72.v vVar = new k72.v();
                uVar.A = vVar;
                vVar.a();
            }
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new k72.a(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_paysec_client_secscan, 0), null), 3, null);
            c5925x646e9c76 = c5925x646e9c762;
        }
        am.kr krVar = c5925x646e9c76.f136228h;
        krVar.f88710a = z17;
        if (!z17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            krVar.f88711b = bundle2;
            bundle2.putInt("err_code", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4);
            krVar.f88711b.putString("err_msg", "face detect not support");
        }
        return false;
    }
}
