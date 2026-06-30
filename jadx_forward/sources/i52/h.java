package i52;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final b52.d f370013a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f370014b;

    /* renamed from: c, reason: collision with root package name */
    public final i52.d f370015c;

    /* renamed from: d, reason: collision with root package name */
    public int f370016d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f370018f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f370020h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f370019g = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final yj0.d f370017e = new i52.g(this);

    public h(b52.d dVar) {
        java.lang.Class<?> cls;
        this.f370013a = dVar;
        try {
            try {
                cls = java.lang.Class.forName("com.tencent.mm.ui.LauncherUI");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentLauncherUIMonitor", e17, "FragmentLauncherUIMonitor", new java.lang.Object[0]);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        this.f370014b = cls;
        this.f370015c = new i52.d(dVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onPageSelected", "(I)V"));
        arrayList.add(android.util.Pair.create("onPageScrollStateChanged", "(I)V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("androidx/viewpager/widget/ViewPager$OnPageChangeListener", arrayList);
        this.f370019g.put("com/tencent/mm/ui/MainTabUI$TabsAdapter", hashMap);
    }
}
