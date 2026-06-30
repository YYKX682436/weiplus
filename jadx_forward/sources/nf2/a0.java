package nf2;

/* loaded from: classes10.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d0 f418185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f418186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f418187f;

    public a0(nf2.d0 d0Var, boolean z17, android.view.View view) {
        this.f418185d = d0Var;
        this.f418186e = z17;
        this.f418187f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nf2.d0 d0Var = this.f418185d;
        boolean z17 = d0Var.f418201c.f418254c;
        nf2.e1 e1Var = d0Var.f418199a;
        if (z17) {
            android.view.View c17 = d0Var.c();
            if (c17 != null) {
                c17.setOnTouchListener(new nf2.c0(d0Var));
            }
            android.view.View view = ((nf2.d1) e1Var).f418229q;
            if (view != null) {
                view.setOnTouchListener(new nf2.b0(d0Var));
            }
        } else {
            android.view.View c18 = d0Var.c();
            if (c18 != null) {
                c18.setOnTouchListener(null);
            }
            android.view.View c19 = d0Var.c();
            if (c19 != null) {
                c19.setClickable(false);
            }
            android.view.View view2 = ((nf2.d1) e1Var).f418229q;
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveLyricsGestureHelper", "setupTouchListener: drag disabled");
        }
        if (this.f418186e) {
            this.f418187f.post(new nf2.z(d0Var));
        }
    }
}
