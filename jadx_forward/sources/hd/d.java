package hd;

/* loaded from: classes9.dex */
public final class d implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f361905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p369x4932dde1.C3694x43fbda74 f361906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hd.e f361907c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f361908d;

    public d(android.content.Context context, com.p314xaae8f345.p362xadfe2b3.p363x208df1fe.p364x10b44e6c.p369x4932dde1.C3694x43fbda74 c3694x43fbda74, hd.e eVar, yz5.p pVar) {
        this.f361905a = context;
        this.f361906b = c3694x43fbda74;
        this.f361907c = eVar;
        this.f361908d = pVar;
    }

    @Override // q80.x
    /* renamed from: onActivityResult */
    public final void mo55562x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.YunShanFuPayService", "onActivityResult: " + i17 + ", " + i18);
        if (i17 == 10) {
            java.lang.Object obj = this.f361905a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.feature.lite.api.ILiteAppFeatureService.ISetOnActivityResult");
            java.lang.String str = null;
            ((q80.z) obj).R1(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            ((p012xc85e97e9.p093xedfae76a.y) obj).mo273xed6858b4().c(this.f361906b);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("ret_scene", 0);
            this.f361907c.f361909a = true;
            yz5.p pVar = this.f361908d;
            if (intent == null) {
                jSONObject.putOpt("ret", 2);
                pVar.mo149xb9724478(dd.d.f310404a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
                return;
            }
            android.os.Bundle extras = intent.getExtras();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(extras);
            java.lang.String string = extras.getString("pay_result");
            if (string != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                str = string.toLowerCase(locale);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toLowerCase(...)");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeixinPayService.YunShanFuPayService", "pay result: " + str);
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1867169789) {
                    if (hashCode != -1367724422) {
                        if (hashCode == 3135262 && str.equals("fail")) {
                            jSONObject.putOpt("ret", 1);
                        }
                    } else if (str.equals("cancel")) {
                        jSONObject.putOpt("ret", 2);
                    }
                } else if (str.equals(ya.b.f77504xbb80cbe3)) {
                    jSONObject.putOpt("ret", 0);
                }
                pVar.mo149xb9724478(dd.d.f310404a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
            }
            jSONObject.putOpt("ret", 2);
            pVar.mo149xb9724478(dd.d.f310404a.i(jSONObject, "ok"), java.lang.Boolean.FALSE);
        }
    }
}
