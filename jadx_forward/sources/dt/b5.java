package dt;

/* loaded from: classes15.dex */
public class b5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5954x3b8af975 c5954x3b8af975 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5954x3b8af975) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.js jsVar = c5954x3b8af975.f136253g;
        android.content.Context context = jsVar.f88612c;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
        } else {
            java.lang.String[] strArr = jsVar.f88610a;
            if (strArr == null || strArr.length <= 0) {
                str = null;
                str2 = null;
            } else {
                str = strArr[0];
                str2 = kk.k.g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false)[0].toByteArray());
            }
            java.lang.String[] strArr2 = c5954x3b8af975.f136253g.f88611b;
            if (strArr2 != null && strArr2.length >= 6) {
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
                intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
                intent.putExtra("key_way", 4);
                intent.putExtra("appId", strArr2[0]);
                intent.putExtra("timeStamp", strArr2[1]);
                intent.putExtra("nonceStr", strArr2[2]);
                intent.putExtra("packageExt", strArr2[5]);
                intent.putExtra("signtype", strArr2[3]);
                intent.putExtra("paySignature", strArr2[4]);
                intent.putExtra("key_wxapi_package_name", str);
                intent.putExtra("key_wxapi_sign", str2);
                intent.putExtra("key_command_id", 13);
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent, context);
            }
        }
        return false;
    }
}
