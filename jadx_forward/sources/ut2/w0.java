package ut2;

/* loaded from: classes3.dex */
public final class w0 extends st2.h2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f512666d;

    /* renamed from: e, reason: collision with root package name */
    public final cm2.m0 f512667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.ref.WeakReference holderRef, cm2.m0 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, java.lang.String appId) {
        super(k0Var, appId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holderRef, "holderRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f512666d = holderRef;
        this.f512667e = item;
    }

    @Override // st2.h2, android.webkit.ValueCallback
    /* renamed from: a */
    public void onReceiveValue(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.onReceiveValue(data);
        try {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            org.json.JSONObject jSONObject = new org.json.JSONObject(data);
            jSONObject.optString("img_url");
            java.lang.String optString = jSONObject.optString("result");
            java.lang.String optString2 = jSONObject.optString("msg");
            if (optString2.length() == 0) {
                optString2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572973d36);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, ya.b.f77504xbb80cbe3)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "failure")) {
                    db5.t7.g(context, optString2);
                }
            } else {
                ut2.s3 s3Var = (ut2.s3) this.f512666d.get();
                if (s3Var != null) {
                    s3Var.Q(this.f512667e);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f493889a, e17, "parse data " + data + " failed", new java.lang.Object[0]);
        }
    }
}
