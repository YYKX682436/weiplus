package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f93053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93054e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93055f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93056g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f93057h;

    public y2(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4) {
        this.f93053d = i17;
        this.f93054e = arrayList;
        this.f93055f = arrayList2;
        this.f93056g = arrayList3;
        this.f93057h = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i17 = 0; i17 < this.f93053d; i17++) {
            android.view.View view = (android.view.View) this.f93054e.get(i17);
            java.lang.String str = (java.lang.String) this.f93055f.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.v(view, str);
            n3.a1.v((android.view.View) this.f93056g.get(i17), (java.lang.String) this.f93057h.get(i17));
        }
    }
}
