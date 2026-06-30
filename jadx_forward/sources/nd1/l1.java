package nd1;

/* loaded from: classes7.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f417868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f417869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nd1.m1 f417870g;

    public l1(nd1.m1 m1Var, org.json.JSONObject jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f417870g = m1Var;
        this.f417867d = jSONObject;
        this.f417868e = e9Var;
        this.f417869f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String optString = this.f417867d.optString("color", "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f417868e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a = e9Var.t3().x0().m52174xaf156f4a();
        nd1.m1 m1Var = this.f417870g;
        int i17 = this.f417869f;
        if (m52174xaf156f4a == null) {
            e9Var.a(i17, m1Var.o("fail:page don't exist"));
            return;
        }
        if (optString.equals("white") || optString.equals("black")) {
            m52174xaf156f4a.f3(optString);
        }
        e9Var.a(i17, m1Var.o("ok"));
    }
}
