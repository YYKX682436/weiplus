package vc3;

/* loaded from: classes7.dex */
public final class i implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f516799a;

    public i(cl.j1 j1Var) {
        this.f516799a = j1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        cl.j1 j1Var = this.f516799a;
        if (j1Var != null) {
            j1Var.a(str, new cl.k1());
        }
    }
}
