package r33;

/* loaded from: classes8.dex */
public class c implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m53.t3 f450500b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m33.h1 f450501c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r33.f f450502d;

    public c(r33.f fVar, java.lang.String str, m53.t3 t3Var, m33.h1 h1Var) {
        this.f450502d = fVar;
        this.f450499a = str;
        this.f450500b = t3Var;
        this.f450501c = h1Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CgiGetLaunchGameInfo", "openLiteApp fail " + this.f450499a);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("error", "openLiteApp fail");
        this.f450501c.b(hashMap);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiGetLaunchGameInfo", "openLiteApp success " + this.f450499a);
        this.f450502d.a(3, this.f450500b, this.f450501c);
    }
}
