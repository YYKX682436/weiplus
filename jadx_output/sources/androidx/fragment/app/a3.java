package androidx.fragment.app;

/* loaded from: classes13.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f11256e;

    public a3(androidx.fragment.app.b3 b3Var, java.util.ArrayList arrayList, java.util.Map map) {
        this.f11255d = arrayList;
        this.f11256e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f11255d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.view.View view = (android.view.View) arrayList.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.v(view, (java.lang.String) this.f11256e.get(n3.a1.k(view)));
        }
    }
}
