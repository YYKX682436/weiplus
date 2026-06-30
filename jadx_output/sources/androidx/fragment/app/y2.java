package androidx.fragment.app;

/* loaded from: classes13.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11522f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11523g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f11524h;

    public y2(androidx.fragment.app.b3 b3Var, int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4) {
        this.f11520d = i17;
        this.f11521e = arrayList;
        this.f11522f = arrayList2;
        this.f11523g = arrayList3;
        this.f11524h = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i17 = 0; i17 < this.f11520d; i17++) {
            android.view.View view = (android.view.View) this.f11521e.get(i17);
            java.lang.String str = (java.lang.String) this.f11522f.get(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.v(view, str);
            n3.a1.v((android.view.View) this.f11523g.get(i17), (java.lang.String) this.f11524h.get(i17));
        }
    }
}
