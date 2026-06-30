package z43;

/* loaded from: classes.dex */
public class c0 implements vz.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z43.d0 f551642a;

    public c0(z43.d0 d0Var) {
        this.f551642a = d0Var;
    }

    @Override // vz.z1
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        z43.d0 d0Var = this.f551642a;
        if (!K0) {
            d0Var.f224976f.a(str);
        } else if (jSONObject != null) {
            d0Var.f224976f.c(jSONObject, false);
        } else {
            d0Var.f224976f.d(false);
        }
    }
}
