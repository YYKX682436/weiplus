package tg4;

/* loaded from: classes7.dex */
public abstract class c extends tg4.f {
    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetId", "");
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            fq0.x Ai = ((fq0.z) rVar).Ai(optString);
            if (Ai != null) {
                c10867x3e50a04d = Ai.f347021l;
            }
        }
        if (c10867x3e50a04d != null) {
            pm0.v.X(new tg4.b(c10867x3e50a04d, this, data));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBBaseOperateCoverViewJsApi", "invoke JsApi failed, rootView is null");
            v("rootView is null");
        }
    }

    public final void v(java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        new lc3.a0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(errMsg)) {
            s().mo146xb9724478(k());
        } else {
            s().mo146xb9724478(h(1, errMsg));
        }
    }

    public void w(org.json.JSONObject data, com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d rootView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        throw new java.lang.IllegalStateException("invokeImpl must be impl." + this);
    }
}
