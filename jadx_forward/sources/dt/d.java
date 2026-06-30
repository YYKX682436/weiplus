package dt;

/* loaded from: classes15.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5153xf106bd2d c5153xf106bd2d = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5153xf106bd2d) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.i iVar = c5153xf106bd2d.f135502g;
        android.content.Context context = iVar.f88420c;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "add card to wx event, context is null");
            return false;
        }
        java.lang.String[] strArr = iVar.f88418a;
        java.lang.String str5 = null;
        if (strArr == null || strArr.length <= 0) {
            str = null;
            str2 = null;
        } else {
            str = strArr[0];
            str2 = kk.k.g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = c5153xf106bd2d.f135502g.f88419b;
        if (strArr2 == null || strArr2.length <= 1) {
            str3 = null;
            str4 = null;
        } else {
            str3 = strArr2[0];
            str4 = strArr2[1];
        }
        if (strArr2 != null && strArr2.length > 2) {
            str5 = strArr2[2];
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "carlist = %s, appid = %s, transcation = %s", str4, str3, str5);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
        intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
        intent.putExtra("key_in_card_list", str4);
        intent.putExtra("key_package_name", str);
        intent.putExtra("key_sign", str2);
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_command_id", 9);
        intent.putExtra("key_app_id", str3);
        intent.putExtra("key_transaction", str5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent, context);
        return true;
    }
}
