package vj5;

/* loaded from: classes14.dex */
public class n {

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f519251k;

    /* renamed from: l, reason: collision with root package name */
    public static vj5.m f519252l;

    /* renamed from: m, reason: collision with root package name */
    public static final vj5.n f519253m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.WeakHashMap f519254n;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f519255a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f519257c;

    /* renamed from: h, reason: collision with root package name */
    public e3.d f519262h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.WindowInsets f519263i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.ref.WeakReference f519264j;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f519256b = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public boolean f519258d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f519259e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f519260f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f519261g = 0;

    static {
        boolean z17 = false;
        try {
            z17 = ((java.lang.Boolean) java.lang.Class.forName("android.os.Build").getMethod("hasSmartBar", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Exception unused) {
            java.lang.String str = android.os.Build.DEVICE;
            if (str.equals("mx2")) {
                z17 = true;
            } else if (!str.equals("mx")) {
                str.equals("m9");
            }
        }
        f519251k = true ^ z17;
        f519253m = new vj5.j(null);
        f519254n = new java.util.WeakHashMap();
    }

    public n(android.app.Activity activity) {
        vj5.m mVar;
        boolean z17 = false;
        this.f519255a = new java.lang.ref.WeakReference(activity);
        if (activity != null && (mVar = f519252l) != null) {
            ((com.p314xaae8f345.mm.ui.C21402x11bed842) mVar).getClass();
            java.lang.String str = com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39353x639dcc24;
            if (com.p314xaae8f345.mm.ui.fj.b(activity) || com.p314xaae8f345.mm.ui.bk.z(activity.getTaskId())) {
                z17 = true;
            }
        }
        this.f519257c = z17;
    }

    public static vj5.n b(android.app.Activity activity) {
        if (!f519251k || activity == null) {
            return f519253m;
        }
        java.util.WeakHashMap weakHashMap = f519254n;
        vj5.n nVar = (vj5.n) weakHashMap.get(activity);
        if (nVar != null) {
            return nVar;
        }
        vj5.n nVar2 = new vj5.n(activity);
        weakHashMap.put(activity, nVar2);
        return nVar2;
    }

    public static vj5.n c(android.app.Activity activity) {
        return (!f519251k || activity == null) ? f519253m : (vj5.n) f519254n.get(activity);
    }

    public void a() {
        java.lang.ref.WeakReference weakReference = this.f519264j;
        android.view.View view = weakReference == null ? null : (android.view.View) weakReference.get();
        if (view != null) {
            view.setOnApplyWindowInsetsListener(null);
        }
    }

    public void d(vj5.k kVar) {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusBarHeightWatcher", "register");
        if (!this.f519258d) {
            this.f519258d = true;
            android.app.Activity activity = (android.app.Activity) this.f519255a.get();
            if (activity != null && activity.getWindow() != null) {
                vj5.n c17 = c(activity);
                if (c17 != null) {
                    c17.a();
                }
                try {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity.getWindow().getDecorView();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= viewGroup.getChildCount()) {
                            view = null;
                            break;
                        }
                        view = viewGroup.getChildAt(i17);
                        if (!"android:status:background".equals(view.getTransitionName()) && !"android:navigation:background".equals(view.getTransitionName())) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (view == null) {
                        view = viewGroup;
                    }
                    view.setOnApplyWindowInsetsListener(new vj5.i(this, viewGroup));
                    view.requestApplyInsets();
                    this.f519264j = new java.lang.ref.WeakReference(view);
                } catch (java.lang.Exception e17) {
                    this.f519258d = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusBarHeightWatcher", "setOnApplyWindowInsetsListener e=%s", e17);
                }
            }
        }
        if (kVar != null) {
            ((java.util.HashSet) this.f519256b).add(new java.lang.ref.WeakReference(kVar));
            if (kVar instanceof vj5.l) {
                ((vj5.l) kVar).f4(this.f519259e, this.f519260f, this.f519261g, this.f519262h, this.f519263i);
                return;
            }
            int i18 = this.f519259e;
            if (i18 > 0) {
                kVar.n6(i18);
            }
        }
    }

    public void e() {
        java.lang.ref.WeakReference weakReference = this.f519264j;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((android.view.View) this.f519264j.get()).requestApplyInsets();
    }

    public void f(vj5.k kVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusBarHeightWatcher", "unregister");
        if (kVar != null) {
            java.util.Set set = this.f519256b;
            java.util.Iterator it = new java.util.LinkedList(set).iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                if (kVar == weakReference.get() || weakReference.get() == null) {
                    ((java.util.HashSet) set).remove(weakReference);
                }
            }
        }
    }
}
