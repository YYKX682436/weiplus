package dt;

/* loaded from: classes15.dex */
public class z3 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public z3() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5635xe89baa58 c5635xe89baa58 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5635xe89baa58) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.fh fhVar = c5635xe89baa58.f135963g;
        android.content.Context context = fhVar.f88210c;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "context is null");
            return false;
        }
        java.lang.String[] strArr = fhVar.f88208a;
        java.lang.String str4 = null;
        if (strArr == null || strArr.length <= 0) {
            str = null;
            str2 = null;
        } else {
            str = strArr[0];
            str2 = kk.k.g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = c5635xe89baa58.f135963g.f88209b;
        if (strArr2 == null || strArr2.length < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "args is null");
            return false;
        }
        if (strArr2.length > 1) {
            str4 = strArr2[0];
            str3 = strArr2[1];
        } else {
            str3 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "handleScanResult, appid = %s, scanResult = %s", str4, str3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        java.lang.String format = java.lang.String.format("weixin://dl/handleScanResult?appid=%s&result=%s", str4, str3);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
        intent.setData(android.net.Uri.parse(format));
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_command_id", 17);
        intent.putExtra("key_package_name", str);
        intent.putExtra("translate_link_scene", 1);
        intent.putExtra("key_package_signature", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent, context);
        return true;
    }
}
