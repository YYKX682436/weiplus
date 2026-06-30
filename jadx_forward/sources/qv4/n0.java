package qv4;

/* loaded from: classes12.dex */
public final class n0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qv4.r0 f448533a;

    public n0(qv4.r0 r0Var) {
        this.f448533a = r0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public final boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTS.GlobalTeachViewAdapter", "actionName:" + str + " data:" + obj);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "onPageSettingSwitchChange")) {
            if (obj instanceof org.json.JSONObject) {
                jSONObject = (org.json.JSONObject) obj;
            } else {
                if (obj instanceof java.lang.String) {
                    try {
                        jSONObject = new org.json.JSONObject((java.lang.String) obj);
                    } catch (org.json.JSONException unused) {
                    }
                }
                jSONObject = null;
            }
            if (jSONObject != null) {
                int optInt = jSONObject.optInt("settingType", 0);
                boolean optBoolean = jSONObject.optBoolean("isSwitchOn", false);
                qv4.r0 r0Var = this.f448533a;
                switch (optInt) {
                    case 1:
                        r0Var.n(optBoolean);
                        break;
                    case 2:
                        r0Var.o(jSONObject.optInt("businessType"), optBoolean);
                        break;
                    case 3:
                        r0Var.l(optBoolean);
                        break;
                    case 4:
                        qv4.r0.d(r0Var, optBoolean);
                        break;
                    case 5:
                        qv4.r0.e(r0Var, optBoolean);
                        break;
                    case 6:
                        r0Var.m(optBoolean);
                        break;
                }
            }
        }
        return false;
    }
}
