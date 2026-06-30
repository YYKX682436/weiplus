package gl5;

/* loaded from: classes15.dex */
public class z implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: g, reason: collision with root package name */
    public int f354656g;

    /* renamed from: h, reason: collision with root package name */
    public int f354657h;

    /* renamed from: i, reason: collision with root package name */
    public int f354658i;

    /* renamed from: m, reason: collision with root package name */
    public int f354659m;

    /* renamed from: n, reason: collision with root package name */
    public int f354660n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f354661o;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354663q;

    /* renamed from: d, reason: collision with root package name */
    public final gl5.d0[] f354653d = new gl5.d0[7];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f354654e = new boolean[7];

    /* renamed from: f, reason: collision with root package name */
    public boolean f354655f = true;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f354662p = new int[2];

    public z(gl5.e0 e0Var, gl5.k kVar) {
        this.f354663q = e0Var;
    }

    public void a(gl5.d0 d0Var, boolean z17) {
        if (this.f354660n == 0) {
            c();
            this.f354663q.U.getViewTreeObserver().addOnPreDrawListener(this);
        }
        int i17 = -1;
        int i18 = 0;
        while (true) {
            gl5.d0[] d0VarArr = this.f354653d;
            if (i18 >= 7) {
                d0VarArr[i17] = d0Var;
                this.f354654e[i17] = z17;
                this.f354660n++;
                return;
            } else {
                gl5.d0 d0Var2 = d0VarArr[i18];
                if (d0Var2 == d0Var) {
                    return;
                }
                if (i17 < 0 && d0Var2 == null) {
                    i17 = i18;
                }
                i18++;
            }
        }
    }

    public void b(gl5.d0 d0Var) {
        int i17 = 0;
        while (true) {
            if (i17 >= 7) {
                break;
            }
            gl5.d0[] d0VarArr = this.f354653d;
            if (d0VarArr[i17] == d0Var) {
                d0VarArr[i17] = null;
                this.f354660n--;
                break;
            }
            i17++;
        }
        if (this.f354660n == 0) {
            this.f354663q.U.getViewTreeObserver().removeOnPreDrawListener(this);
        }
    }

    public final void c() {
        gl5.e0 e0Var = this.f354663q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = e0Var.U;
        int[] iArr = this.f354662p;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.getLocationInWindow(iArr);
        int i17 = iArr[0];
        this.f354655f = (i17 == this.f354656g && iArr[1] == this.f354657h) ? false : true;
        this.f354656g = i17;
        this.f354657h = iArr[1];
        e0Var.U.getLocationOnScreen(iArr);
        this.f354658i = iArr[0];
        this.f354659m = iArr[1];
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        gl5.d0 d0Var;
        c();
        for (int i17 = 0; i17 < 7; i17++) {
            boolean z17 = this.f354655f;
            if ((z17 || this.f354661o || this.f354654e[i17]) && (d0Var = this.f354653d[i17]) != null) {
                d0Var.a(this.f354656g, this.f354657h, z17, this.f354661o);
            }
        }
        this.f354661o = false;
        return true;
    }
}
