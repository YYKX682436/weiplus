package tx4;

/* loaded from: classes8.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public tx4.p f504225d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f504226e;

    /* renamed from: f, reason: collision with root package name */
    public tx4.e f504227f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f504228g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 f504229h;

    /* renamed from: i, reason: collision with root package name */
    public tx4.q f504230i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f504231m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f504232n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewTreeObserver f504233o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f504234p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f504235q = false;

    public l(android.content.Context context) {
        this.f504231m = false;
        this.f504226e = context;
        if (context instanceof android.app.Activity) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView();
            if (viewGroup.getChildCount() > 0) {
                this.f504232n = viewGroup.getChildAt(0);
            } else {
                this.f504232n = viewGroup;
            }
        }
        this.f504228g = new db5.g4(context);
        this.f504225d = new tx4.p(context);
        this.f504229h = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6(context);
        tx4.q qVar = new tx4.q(context);
        this.f504230i = qVar;
        this.f504229h.m74481x6cab2c8d(qVar);
        this.f504231m = a();
        this.f504225d.setContentView(this.f504229h);
    }

    public final boolean a() {
        android.util.DisplayMetrics displayMetrics = this.f504226e.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels > displayMetrics.heightPixels;
    }

    public void b() {
        android.view.ViewTreeObserver viewTreeObserver = this.f504233o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f504233o = this.f504232n.getViewTreeObserver();
            }
            this.f504233o.removeGlobalOnLayoutListener(this);
            this.f504233o = null;
        }
        tx4.p pVar = this.f504225d;
        if (pVar != null) {
            pVar.dismiss();
        }
    }

    public void c() {
        this.f504231m = a();
        tx4.e eVar = this.f504227f;
        if (eVar != null) {
            eVar.mo9859xc459429a(this.f504228g);
        }
        if (this.f504225d != null) {
            tx4.q qVar = this.f504230i;
            if (qVar != null) {
                qVar.f504241d = this.f504228g;
                qVar.notifyDataSetChanged();
            }
            this.f504225d.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f504234p) {
                this.f504225d.getWindow().addFlags(1024);
            }
            if (this.f504235q) {
                this.f504225d.getWindow().setFlags(8, 8);
                this.f504225d.getWindow().addFlags(131200);
                this.f504225d.getWindow().getDecorView().setSystemUiVisibility(6);
            } else {
                this.f504225d.getWindow().clearFlags(8);
                this.f504225d.getWindow().clearFlags(131072);
                this.f504225d.getWindow().clearFlags(128);
                this.f504225d.getWindow().getDecorView().setSystemUiVisibility(0);
            }
            android.view.View view = this.f504232n;
            if (view != null) {
                boolean z17 = this.f504233o == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f504233o = viewTreeObserver;
                if (z17) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                }
            }
            this.f504225d.setOnDismissListener(new tx4.j(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.p2425x33155f.C19414xef0feed6 c19414xef0feed6 = this.f504229h;
            if (c19414xef0feed6 != null) {
                c19414xef0feed6.m74482x2051c9c(new tx4.k(this));
            }
            this.f504225d.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        tx4.p pVar = this.f504225d;
        if (pVar != null && pVar.isShowing()) {
            android.view.View view = this.f504232n;
            if (view == null || !view.isShown()) {
                b();
                return;
            }
            tx4.p pVar2 = this.f504225d;
            if (!(pVar2 != null && pVar2.isShowing()) || this.f504231m == a()) {
                return;
            }
            b();
        }
    }
}
