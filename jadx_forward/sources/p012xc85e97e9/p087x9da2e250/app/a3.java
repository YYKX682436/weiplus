package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f92788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f92789e;

    public a3(p012xc85e97e9.p087x9da2e250.app.b3 b3Var, java.util.ArrayList arrayList, java.util.Map map) {
        this.f92788d = arrayList;
        this.f92789e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f92788d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = (android.view.View) arrayList.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.v(view, (java.lang.String) this.f92789e.get(n3.a1.k(view)));
        }
    }
}
