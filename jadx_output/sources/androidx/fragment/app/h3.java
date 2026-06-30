package androidx.fragment.app;

/* loaded from: classes14.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.i3 f11336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.n3 f11337e;

    public h3(androidx.fragment.app.n3 n3Var, androidx.fragment.app.i3 i3Var) {
        this.f11337e = n3Var;
        this.f11336d = i3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.n3 n3Var = this.f11337e;
        java.util.ArrayList arrayList = n3Var.f11421b;
        androidx.fragment.app.i3 i3Var = this.f11336d;
        arrayList.remove(i3Var);
        n3Var.f11422c.remove(i3Var);
    }
}
