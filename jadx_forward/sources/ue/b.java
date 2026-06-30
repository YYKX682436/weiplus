package ue;

/* loaded from: classes7.dex */
public final class b implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f508296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f508297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f508298c;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.ArrayList arrayList, cl.j1 j1Var) {
        this.f508296a = f0Var;
        this.f508297b = arrayList;
        this.f508298c = j1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        cl.j1 j1Var;
        java.lang.String str = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f508296a;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        if (i17 != this.f508297b.size() || (j1Var = this.f508298c) == null) {
            return;
        }
        j1Var.a(str, new cl.k1());
    }
}
