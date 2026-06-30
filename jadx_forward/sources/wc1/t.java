package wc1;

/* loaded from: classes7.dex */
public class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.h0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.HashSet f526028d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f526029e;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f526029e = false;
        boolean y17 = d0Var.x() != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(d0Var.x().qe("supportListenTaskStateChange"), false) : false;
        this.f526029e = y17;
        if (y17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadSubPackageTaskCallbackFilter", "JsApiOnLoadSubPackageTaskStateChange support listen task state change");
        }
    }
}
