package dt;

/* loaded from: classes15.dex */
public class j extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public j() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5263xf22d54e8 c5263xf22d54e8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5263xf22d54e8) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.v2 v2Var = c5263xf22d54e8.f135590g;
        android.content.Context context = v2Var.f89699c;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "choose card from wx event, context is null");
            return false;
        }
        java.lang.String[] strArr = v2Var.f89697a;
        if (strArr == null || strArr.length <= 0) {
            str = null;
        } else {
            str = strArr[0];
            kk.k.g(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(context, str, false)[0].toByteArray());
        }
        java.lang.String[] strArr2 = c5263xf22d54e8.f135590g.f89698b;
        if (strArr2 == null || strArr2.length < 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs is null or length is < 10, the length is " + (strArr2 != null ? strArr2.length : 0));
        } else {
            for (java.lang.String str2 : strArr2) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "ChooseCardFromWXEvent selectionArgs:", strArr2.toString());
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.ActivityC12935xbbbe044f.class);
            intent.addFlags(268435456).addFlags(134217728).addFlags(67108864);
            intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, strArr2[0]);
            intent.putExtra("shop_id", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr2[1], 0));
            intent.putExtra("sign_type", strArr2[2]);
            intent.putExtra("card_sign", strArr2[3]);
            intent.putExtra("time_stamp", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr2[4], 0));
            intent.putExtra("nonce_str", strArr2[5]);
            intent.putExtra("card_tp_id", strArr2[6]);
            intent.putExtra("card_type", strArr2[7]);
            intent.putExtra("can_multi_select", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(strArr2[8], 0));
            intent.putExtra("key_from_scene", 8);
            intent.putExtra("key_command_id", 16);
            intent.putExtra("key_app_id", strArr2[0]);
            intent.putExtra("key_package_name", str);
            intent.putExtra("key_transaction", strArr2[9]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.e0.t(intent, context);
        }
        return true;
    }
}
