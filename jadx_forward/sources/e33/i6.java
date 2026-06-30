package e33;

/* loaded from: classes10.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f328822d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328823e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328824f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f328825g;

    public i6(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, e33.g6 g6Var) {
        this.f328823e = new java.lang.ref.WeakReference(c1163xf1deaba4);
        this.f328824f = new java.lang.ref.WeakReference(g6Var);
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.WeakReference weakReference;
        e33.g6 g6Var;
        java.lang.ref.WeakReference weakReference2 = this.f328823e;
        if (weakReference2 == null || (weakReference = this.f328824f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SmartGalleryUI", "update search ui, ref is null, return.");
            return;
        }
        java.util.List list = this.f328822d;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SmartGalleryUI", "update search ui, data is null.");
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) weakReference2.get();
        if (c1163xf1deaba4 == null || (g6Var = (e33.g6) weakReference.get()) == null) {
            return;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(g6Var);
        g6Var.f328773g = this.f328825g;
        java.util.ArrayList arrayList = (java.util.ArrayList) g6Var.f328771e;
        arrayList.clear();
        arrayList.addAll(list);
        g6Var.m8146xced61ae5();
    }
}
