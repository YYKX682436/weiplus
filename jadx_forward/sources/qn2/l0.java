package qn2;

/* loaded from: classes3.dex */
public final class l0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f446622a;

    /* renamed from: b, reason: collision with root package name */
    public final st2.h2 f446623b;

    public l0(qn2.i0 plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f446622a = new java.lang.ref.WeakReference(plugin);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0 = plugin.Y0();
        this.f446623b = Y0 != null ? new st2.h2(Y0, "") : null;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "navigate back with value ".concat(value));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(value);
            boolean z17 = true;
            if (jSONObject.optInt("is_claim_prize", 0) == 1) {
                if (jSONObject.optInt("accept") != 1) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VisitorLotteryCardDoneWidget", "accepted");
                    qn2.i0 i0Var = (qn2.i0) this.f446622a.get();
                    if (i0Var != null) {
                        i0Var.u1(new qn2.k0(i0Var));
                    }
                }
            } else {
                st2.h2 h2Var = this.f446623b;
                if (h2Var != null) {
                    h2Var.onReceiveValue(value);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VisitorLotteryCardDoneWidget", e17, "parse back value failed", new java.lang.Object[0]);
        }
    }
}
