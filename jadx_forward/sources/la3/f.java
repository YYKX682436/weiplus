package la3;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f399059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f399062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f399063h;

    public f(la3.h hVar, zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f399059d = v2Var;
        this.f399060e = str;
        this.f399061f = str2;
        this.f399062g = bundle;
        this.f399063h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            zg0.v2 v2Var = this.f399059d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f399060e, this.f399061f, nw4.a.a(this.f399062g), this.f399063h);
            }
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
    }
}
