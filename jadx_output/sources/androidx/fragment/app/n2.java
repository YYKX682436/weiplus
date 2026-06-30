package androidx.fragment.app;

/* loaded from: classes14.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.b f11416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b3 f11418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f11419m;

    public n2(androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z17, x.b bVar, android.view.View view, androidx.fragment.app.b3 b3Var, android.graphics.Rect rect) {
        this.f11413d = fragment;
        this.f11414e = fragment2;
        this.f11415f = z17;
        this.f11416g = bVar;
        this.f11417h = view;
        this.f11418i = b3Var;
        this.f11419m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.r2.c(this.f11413d, this.f11414e, this.f11415f, this.f11416g, false);
        android.view.View view = this.f11417h;
        if (view != null) {
            this.f11418i.i(view, this.f11419m);
        }
    }
}
