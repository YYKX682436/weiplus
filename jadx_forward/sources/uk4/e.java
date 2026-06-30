package uk4;

/* loaded from: classes10.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f510063d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f510064e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f510065f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f510066g;

    /* renamed from: h, reason: collision with root package name */
    public int f510067h;

    /* renamed from: i, reason: collision with root package name */
    public int f510068i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f510069m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewTreeObserver f510070n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f510071o;

    /* renamed from: p, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f510072p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f510073q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f510074r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f510075s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.ViewGroup f510076t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f510077u = new java.util.LinkedList();

    public e(android.content.Context context) {
        this.f510066g = false;
        this.f510071o = false;
        this.f510064e = context;
        this.f510071o = false;
        if (context instanceof android.app.Activity) {
            this.f510069m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f510063d = new y9.i(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0z, null);
        this.f510065f = inflate;
        this.f510075s = (android.view.ViewGroup) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564977av5);
        this.f510076t = (android.view.ViewGroup) this.f510065f.findViewById(com.p314xaae8f345.mm.R.id.avd);
        this.f510073q = (android.widget.LinearLayout) this.f510065f.findViewById(com.p314xaae8f345.mm.R.id.f564974av3);
        this.f510074r = this.f510065f.findViewById(com.p314xaae8f345.mm.R.id.b5t);
        this.f510073q.setOnClickListener(new uk4.a(this));
        this.f510066g = a();
        this.f510063d.requestWindowFeature(1);
        this.f510063d.setContentView(this.f510065f);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f510065f.getParent());
        this.f510072p = A;
        if (A != null) {
            A.D(3);
        }
        this.f510063d.setOnDismissListener(new uk4.b(this));
    }

    public final boolean a() {
        return this.f510064e.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f510063d;
        if (dialog != null) {
            android.content.Context context = this.f510064e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f510063d.dismiss();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f510072p;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f510063d;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f510069m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f510063d;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f510066g == a()) {
                    int i17 = this.f510067h;
                    android.content.Context context = this.f510064e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        if (this.f510068i != this.f510075s.getHeight()) {
                            this.f510068i = this.f510075s.getHeight();
                            int width = this.f510075s.getWidth();
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f510076t.getLayoutParams();
                            layoutParams.height = this.f510068i;
                            layoutParams.width = width;
                            layoutParams.gravity = 85;
                            this.f510076t.setLayoutParams(layoutParams);
                            return;
                        }
                        return;
                    }
                }
                b();
            }
        }
    }
}
