package xi1;

/* loaded from: classes7.dex */
public abstract class b implements xi1.m {

    /* renamed from: b, reason: collision with root package name */
    public final xi1.g f536221b;

    /* renamed from: c, reason: collision with root package name */
    public final xi1.k f536222c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f536223d;

    /* renamed from: e, reason: collision with root package name */
    public android.webkit.WebChromeClient.CustomViewCallback f536224e;

    /* renamed from: f, reason: collision with root package name */
    public int f536225f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f536226g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f536227h;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f536229j;

    /* renamed from: a, reason: collision with root package name */
    public final xi1.k f536220a = new xi1.a(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Set f536228i = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: k, reason: collision with root package name */
    public boolean f536230k = false;

    public b(xi1.g gVar, xi1.k kVar) {
        this.f536222c = kVar;
        this.f536221b = gVar;
    }

    @Override // xi1.m
    public void b(android.webkit.WebChromeClient.CustomViewCallback customViewCallback) {
        this.f536224e = customViewCallback;
    }

    @Override // xi1.m
    public final boolean c() {
        return this.f536230k;
    }

    @Override // xi1.m
    public void d(xi1.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f536228i.add(cVar);
    }

    @Override // xi1.m
    public void e(android.view.View view, int i17) {
        this.f536230k = true;
        xi1.k kVar = this.f536222c;
        if (kVar == null) {
            kVar = this.f536220a;
        }
        android.view.View view2 = this.f536223d;
        this.f536229j = view2;
        this.f536223d = view;
        if (view2 == null) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                this.f536227h = viewGroup;
                this.f536225f = viewGroup.indexOfChild(view);
                this.f536226g = view.getLayoutParams();
                this.f536227h.removeView(view);
            } else {
                this.f536225f = 0;
                this.f536227h = null;
                this.f536226g = null;
            }
            android.view.ViewGroup a17 = kVar.a(view);
            a17.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
            a17.bringChildToFront(view);
            android.view.ViewParent parent = a17.getParent();
            if (parent != null) {
                parent.bringChildToFront(a17);
            }
            view.setX(0.0f);
            view.setY(0.0f);
        }
    }

    @Override // xi1.m
    public void f(xi1.c cVar) {
        if (cVar == null) {
            return;
        }
        this.f536228i.remove(cVar);
    }

    @Override // xi1.m
    public boolean g() {
        if (this.f536223d == null) {
            return false;
        }
        android.webkit.WebChromeClient.CustomViewCallback customViewCallback = this.f536224e;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        if (this.f536223d.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) this.f536223d.getParent()).removeView(this.f536223d);
        }
        android.view.ViewGroup viewGroup = this.f536227h;
        if (viewGroup != null) {
            viewGroup.addView(this.f536223d, this.f536225f, this.f536226g);
        }
        this.f536223d = null;
        this.f536224e = null;
        this.f536230k = false;
        return true;
    }

    public void i() {
        java.util.Iterator it = this.f536228i.iterator();
        while (it.hasNext()) {
            ((xi1.c) it.next()).p();
        }
    }

    @Override // xi1.m
    /* renamed from: release */
    public void mo53823x41012807() {
        g();
        this.f536228i.clear();
        this.f536224e = null;
    }
}
