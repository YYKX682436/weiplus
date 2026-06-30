package lf0;

/* loaded from: classes8.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f399773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f399775f;

    public y(lf0.d0 d0Var, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f399773d = d0Var;
        this.f399774e = str;
        this.f399775f = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lf0.d0.wi(this.f399773d, this.f399774e, this.f399775f);
    }
}
