package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class h9 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.s3 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f155441a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 f155442b;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1) {
        this.f155442b = activityC11450xd4511c1;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155442b;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("fields", "name,picture.type(large)");
        try {
            java.lang.String f17 = activityC11450xd4511c1.f154993d.f("me", bundle, "GET");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "result json %s", f17);
            this.f155441a = new org.json.JSONObject(f17);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FacebookLoginUI", e17, "get name and picture error!", new java.lang.Object[0]);
            db5.e1.s(activityC11450xd4511c1, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.s3
    public boolean b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1 = this.f155442b;
        if (this.f155441a == null) {
            return true;
        }
        try {
            android.content.Intent intent = new android.content.Intent(activityC11450xd4511c1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11461x47892174.class);
            intent.putExtra("third_app_token", activityC11450xd4511c1.f154993d.f290746a.toString());
            intent.putExtra("register_title", activityC11450xd4511c1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkx));
            intent.putExtra("register_nick_name", this.f155441a.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d));
            intent.putExtra("register_avatar", ((org.json.JSONObject) this.f155441a.get("picture")).getJSONObject(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306).getString("url"));
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c12 = this.f155442b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC11450xd4511c12, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11450xd4511c12.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC11450xd4511c12, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$2", "onPostExecute", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 c6968xc4cd5a52 = activityC11450xd4511c1.f154999m;
            c6968xc4cd5a52.f142767d = 1L;
            c6968xc4cd5a52.f142768e = 4L;
            c6968xc4cd5a52.k();
            activityC11450xd4511c1.finish();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FacebookLoginUI", e17, "parse json error!", new java.lang.Object[0]);
            db5.e1.s(activityC11450xd4511c1, "Retrieve Failed, Error Format!", "");
            return true;
        }
    }
}
