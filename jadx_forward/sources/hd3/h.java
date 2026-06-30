package hd3;

/* loaded from: classes.dex */
public final class h implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd3.i f362090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362091b;

    public h(hd3.i iVar, java.lang.String str) {
        this.f362090a = iVar;
        this.f362091b = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        hd3.g gVar = new hd3.g((java.lang.String) obj, this.f362090a, this.f362091b);
        java.lang.String str = "DumpCpuProfile_" + this.f362090a.e().f425864a;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.t(gVar, 2000L, str);
    }
}
