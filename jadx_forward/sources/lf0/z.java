package lf0;

/* loaded from: classes8.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f399776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f399778f;

    public z(lf0.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f399776d = d0Var;
        this.f399777e = str;
        this.f399778f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf0.d0.wi(this.f399776d, this.f399777e, this.f399778f);
    }
}
