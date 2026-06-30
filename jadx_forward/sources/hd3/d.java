package hd3;

/* loaded from: classes.dex */
public final class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd3.e f362083a;

    public d(hd3.e eVar) {
        this.f362083a = eVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiStartCpuProfile", "hy: already start profiling. token is " + str);
        ((ku5.t0) ku5.t0.f394148d).B(new hd3.c(this.f362083a));
        this.f362083a.s().mo146xb9724478(this.f362083a.l(kz5.c1.i(new jz5.l("token", str))));
    }
}
