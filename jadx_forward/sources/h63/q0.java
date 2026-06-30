package h63;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.v0 f360803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f360804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f360805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h63.k1 f360808i;

    public q0(h63.v0 v0Var, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str, int i17, h63.k1 k1Var) {
        this.f360803d = v0Var;
        this.f360804e = context;
        this.f360805f = jSONObject;
        this.f360806g = str;
        this.f360807h = i17;
        this.f360808i = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h63.v0 v0Var = this.f360803d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = v0Var.f360823i;
        if (aVar == null) {
            v0Var.f360823i = new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a(this.f360804e, this.f360805f, this.f360806g, this.f360807h, this.f360808i);
        } else if (aVar != null) {
            aVar.f223607c = this.f360805f;
            aVar.f223619o = this.f360808i;
            aVar.a(this.f360806g, this.f360807h);
            aVar.b();
        }
    }
}
