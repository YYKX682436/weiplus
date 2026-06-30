package of1;

/* loaded from: classes8.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f426432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426433e;

    public c2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f426433e = m2Var;
        this.f426432d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        of1.m2 m2Var = this.f426433e;
        if (m2Var.f426508e != null) {
            m2Var.f426508e.X(this.f426432d.getString("webview_network_type"));
        }
    }
}
