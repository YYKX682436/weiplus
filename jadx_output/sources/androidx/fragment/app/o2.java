package androidx.fragment.app;

/* loaded from: classes14.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b3 f11436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x.b f11437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.q2 f11439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11441i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11443n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f11444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11445p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f11447r;

    public o2(androidx.fragment.app.b3 b3Var, x.b bVar, java.lang.Object obj, androidx.fragment.app.q2 q2Var, java.util.ArrayList arrayList, android.view.View view, androidx.fragment.app.Fragment fragment, androidx.fragment.app.Fragment fragment2, boolean z17, java.util.ArrayList arrayList2, java.lang.Object obj2, android.graphics.Rect rect) {
        this.f11436d = b3Var;
        this.f11437e = bVar;
        this.f11438f = obj;
        this.f11439g = q2Var;
        this.f11440h = arrayList;
        this.f11441i = view;
        this.f11442m = fragment;
        this.f11443n = fragment2;
        this.f11444o = z17;
        this.f11445p = arrayList2;
        this.f11446q = obj2;
        this.f11447r = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.b3 b3Var = this.f11436d;
        x.b bVar = this.f11437e;
        java.lang.Object obj = this.f11438f;
        androidx.fragment.app.q2 q2Var = this.f11439g;
        x.b d17 = androidx.fragment.app.r2.d(b3Var, bVar, obj, q2Var);
        java.util.ArrayList arrayList = this.f11440h;
        if (d17 != null) {
            arrayList.addAll(d17.values());
            arrayList.add(this.f11441i);
        }
        androidx.fragment.app.Fragment fragment = this.f11443n;
        androidx.fragment.app.Fragment fragment2 = this.f11442m;
        boolean z17 = this.f11444o;
        androidx.fragment.app.r2.c(fragment2, fragment, z17, d17, false);
        if (obj != null) {
            b3Var.w(obj, this.f11445p, arrayList);
            android.view.View h17 = androidx.fragment.app.r2.h(d17, q2Var, this.f11446q, z17);
            if (h17 != null) {
                b3Var.i(h17, this.f11447r);
            }
        }
    }
}
