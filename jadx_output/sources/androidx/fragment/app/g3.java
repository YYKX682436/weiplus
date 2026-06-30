package androidx.fragment.app;

/* loaded from: classes14.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.i3 f11320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.n3 f11321e;

    public g3(androidx.fragment.app.n3 n3Var, androidx.fragment.app.i3 i3Var) {
        this.f11321e = n3Var;
        this.f11320d = i3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f11321e.f11421b;
        androidx.fragment.app.i3 i3Var = this.f11320d;
        if (arrayList.contains(i3Var)) {
            i3Var.f11400a.a(i3Var.f11402c.mView);
        }
    }
}
