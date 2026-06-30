package z63;

/* loaded from: classes14.dex */
public class m implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f551957d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f551958e;

    /* renamed from: f, reason: collision with root package name */
    public int f551959f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f551960g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d f551961h;

    /* renamed from: i, reason: collision with root package name */
    public z63.l f551962i;

    public m(android.content.Context context) {
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bis, null);
        this.f551958e = inflate;
        this.f551961h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22704xf0a3bc4d) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqo);
        ((android.widget.Button) this.f551958e.findViewById(com.p314xaae8f345.mm.R.id.khs)).setOnClickListener(new z63.h(this));
        ((android.widget.Button) this.f551958e.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(new z63.i(this));
        y9.i iVar = new y9.i(context, 0);
        this.f551957d = iVar;
        iVar.setContentView(this.f551958e);
        this.f551957d.setOnCancelListener(new z63.j(this));
        this.f551957d.setOnDismissListener(new z63.k(this));
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f551958e.getLayoutParams();
        layoutParams.height = i65.a.b(context, qf1.f.f76475x366c91de);
        this.f551958e.setLayoutParams(layoutParams);
        this.f551959f = i65.a.b(context, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50633xede5713a);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f551958e.getParent());
        this.f551960g = A;
        if (A != null) {
            A.C(this.f551959f);
            this.f551960g.f125976p = false;
        }
    }

    public static void a(z63.m mVar, boolean z17, int i17, int i18, int i19) {
        z63.l lVar = mVar.f551962i;
        if (lVar != null) {
            z63.o0 o0Var = (z63.o0) lVar;
            if (z17) {
                java.util.Locale locale = java.util.Locale.US;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.GroupSolitatireEditUI", "group solitaire time :%s", java.lang.String.format(locale, "%04d-%02d-%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                z63.p0 p0Var = o0Var.f551968a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab activityC16081x2d23fdab = p0Var.f551970d;
                java.lang.String format = java.lang.String.format(locale, "%04d/%02d/%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1771x98169f7.ui.ActivityC16081x2d23fdab.U;
                activityC16081x2d23fdab.U6(format);
                p0Var.f551970d.Y6(1);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
