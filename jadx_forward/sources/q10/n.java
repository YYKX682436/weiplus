package q10;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f441057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.d5 f441058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f441059f;

    public n(java.util.Map map, bw5.d5 d5Var, int i17) {
        this.f441057d = map;
        this.f441058e = d5Var;
        this.f441059f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.Map map = this.f441057d;
        if (map != null) {
            java.lang.String jSONObject = new org.json.JSONObject(map).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            str = r26.i0.t(jSONObject, ";", ",", false);
        } else {
            str = "";
        }
        y02.v0 a17 = y02.x0.f540167d.a();
        if (a17 != null) {
            a17.p1(this.f441058e, this.f441059f, str);
        }
    }
}
