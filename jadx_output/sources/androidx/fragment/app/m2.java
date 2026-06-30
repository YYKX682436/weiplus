package androidx.fragment.app;

/* loaded from: classes14.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b3 f11393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f11394f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.Fragment f11395g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11396h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11397i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11398m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f11399n;

    public m2(java.lang.Object obj, androidx.fragment.app.b3 b3Var, android.view.View view, androidx.fragment.app.Fragment fragment, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.lang.Object obj2) {
        this.f11392d = obj;
        this.f11393e = b3Var;
        this.f11394f = view;
        this.f11395g = fragment;
        this.f11396h = arrayList;
        this.f11397i = arrayList2;
        this.f11398m = arrayList3;
        this.f11399n = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.b3 b3Var = this.f11393e;
        android.view.View view = this.f11394f;
        java.lang.Object obj = this.f11392d;
        if (obj != null) {
            b3Var.n(obj, view);
            this.f11397i.addAll(androidx.fragment.app.r2.g(b3Var, obj, this.f11395g, this.f11396h, view));
        }
        java.util.ArrayList arrayList = this.f11398m;
        if (arrayList != null) {
            java.lang.Object obj2 = this.f11399n;
            if (obj2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                b3Var.o(obj2, arrayList, arrayList2);
            }
            arrayList.clear();
            arrayList.add(view);
        }
    }
}
