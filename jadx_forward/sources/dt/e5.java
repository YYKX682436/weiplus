package dt;

/* loaded from: classes15.dex */
public class e5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public e5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5955xe62e1bb1 c5955xe62e1bb1 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5955xe62e1bb1) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        java.lang.String[] strArr = c5955xe62e1bb1.f136254g.f88713b;
        if (strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "args is null");
        } else if (strArr.length < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "args must contain appid");
        } else if (gm0.j1.a()) {
            am.ks ksVar = c5955xe62e1bb1.f136254g;
            android.content.Context context = ksVar.f88714c;
            java.lang.String str3 = strArr[0];
            java.lang.String[] strArr2 = ksVar.f88712a;
            if (strArr2 == null || strArr2.length <= 0) {
                str = null;
                str2 = null;
            } else {
                str = strArr2[0];
                str2 = kk.k.g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false)[0].toByteArray());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "sdk open offlinePay, appid = %s, package = %s", str3, str);
            java.lang.String format = java.lang.String.format("weixin://dl/offlinepay/?appid=%s", str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "url format = %s", format);
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
            intent.setData(android.net.Uri.parse(format));
            intent.addFlags(268435456);
            intent.putExtra("key_app_id", str3);
            intent.putExtra("key_package_name", str);
            intent.putExtra("translate_link_scene", 1);
            intent.putExtra("key_package_signature", str2);
            intent.putExtra("key_command_id", 24);
            c01.l2 c17 = c01.n2.d().c("key_data_center_session_id", true);
            c17.i("key_package_name", str);
            c17.i("key_package_signature", str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "sava packagename and signature to data center, package ; %s, sig : %s", str, str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent, context);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "has not login, sdk open offlinePay fail");
        }
        return true;
    }
}
