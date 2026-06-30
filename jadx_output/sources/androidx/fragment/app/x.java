package androidx.fragment.app;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.n3 f11510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11511e;

    public x(androidx.fragment.app.Fragment fragment, androidx.fragment.app.n3 n3Var) {
        this.f11511e = fragment;
        this.f11510d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11510d.c();
    }
}
