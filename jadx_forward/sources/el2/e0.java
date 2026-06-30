package el2;

/* loaded from: classes3.dex */
public final class e0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f335314b;

    public e0(el2.i0 i0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar) {
        this.f335313a = i0Var;
        this.f335314b = sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335313a.H, "actionName = " + str);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335313a.H, "actionName = " + str + ", data = " + obj);
            el2.i0 i0Var = this.f335313a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f335314b;
            if (str != null && obj != null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RedEnvelopeCoverSelector/select")) {
                    if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) != null) {
                        java.lang.String optString = ((org.json.JSONObject) obj).optString("url");
                        boolean optBoolean = ((org.json.JSONObject) obj).optBoolean("isPurchase", false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.H, "url:" + optString + ", isPurchase:" + optBoolean);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x3(optString, 4, null, new el2.d0(optString, i0Var, optBoolean, this)));
                        cl0.g gVar = new cl0.g();
                        gVar.h("errMsg", "");
                        gVar.o("errCode", 0);
                        java.lang.String gVar2 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.H, "callback jsonStr:" + gVar2 + " callbackId:" + i17 + " instanceId:" + j17);
                        sVar.c(j17, i17, gVar2);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.H, "invalid action");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f335313a.H, "e = " + e17.getMessage());
        }
        return false;
    }
}
