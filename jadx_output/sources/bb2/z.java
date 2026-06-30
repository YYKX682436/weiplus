package bb2;

/* loaded from: classes10.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f19079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f19080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f19081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f19082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f19083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f19084i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f19085m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f19086n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f19087o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f19088p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.a f19089q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19090r;

    public z(android.view.View view, so2.u1 u1Var, r45.oo ooVar, android.widget.PopupWindow.OnDismissListener onDismissListener, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, in5.s0 s0Var, r45.qt2 qt2Var, bb2.w1 w1Var, boolean z17, boolean z18, yz5.a aVar, int i17) {
        this.f19079d = view;
        this.f19080e = u1Var;
        this.f19081f = ooVar;
        this.f19082g = onDismissListener;
        this.f19083h = mMFragmentActivity;
        this.f19084i = s0Var;
        this.f19085m = qt2Var;
        this.f19086n = w1Var;
        this.f19087o = z17;
        this.f19088p = z18;
        this.f19089q = aVar;
        this.f19090r = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.view.View view = this.f19079d;
        int i18 = 0;
        if (itemId != 1) {
            r45.oo ooVar = this.f19081f;
            android.widget.PopupWindow.OnDismissListener onDismissListener = this.f19082g;
            so2.u1 u1Var = this.f19080e;
            if (itemId == 2) {
                bb2.l0.f18910c = false;
                bd2.b bVar = bd2.b.f19244a;
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                bVar.f(context, u1Var.getItemId(), u1Var.w(), ooVar.getLong(0));
                onDismissListener.onDismiss();
                i18 = 6;
            } else if (itemId == 3) {
                bb2.l0.f18910c = true;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, true);
                android.view.View inflate = com.tencent.mm.ui.id.b(view.getContext()).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(view.getContext().getResources().getString(com.tencent.mm.R.string.cmh));
                k0Var.s(inflate, false);
                k0Var.f211872n = new bb2.v(view);
                r45.oo ooVar2 = this.f19081f;
                so2.u1 u1Var2 = this.f19080e;
                android.widget.PopupWindow.OnDismissListener onDismissListener2 = this.f19082g;
                k0Var.f211881s = new bb2.x(ooVar2, u1Var2, onDismissListener2, this.f19083h, this.f19085m, this.f19087o);
                k0Var.f211854d = new bb2.y(onDismissListener2);
                k0Var.v();
                i18 = 7;
            } else if (itemId != 4) {
                com.tencent.mm.ui.MMFragmentActivity activity = this.f19083h;
                if (itemId == 12) {
                    kotlin.jvm.internal.o.g(activity, "activity");
                    androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.Q6((com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) a17, this.f19084i, false, false, false, 8, null);
                    onDismissListener.onDismiss();
                    i18 = 8;
                } else if (itemId == 13) {
                    java.lang.String string = ooVar.getString(2);
                    if (string == null) {
                        string = "";
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                        com.tencent.mm.sdk.platformtools.b0.e(string);
                        db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490361st));
                    }
                    onDismissListener.onDismiss();
                    i18 = 5;
                }
            } else {
                bb2.l0.f18910c = false;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y.f280114e.n(ooVar.getLong(0), u1Var.getFeedObject().getId(), u1Var.getFeedObject().getObjectNonceId(), false, new bb2.u(this.f19083h, this.f19085m, this.f19087o, this.f19081f, this.f19080e));
                onDismissListener.onDismiss();
                i18 = 14;
            }
        } else {
            bb2.l0.f18910c = true;
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(view.getContext(), 1, true);
            k0Var2.s(com.tencent.mm.ui.id.b(view.getContext()).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null), false);
            android.view.View view2 = this.f19079d;
            k0Var2.f211872n = new bb2.q(view2);
            r45.qt2 qt2Var = this.f19085m;
            so2.u1 u1Var3 = this.f19080e;
            r45.oo ooVar3 = this.f19081f;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f19083h;
            android.widget.PopupWindow.OnDismissListener onDismissListener3 = this.f19082g;
            k0Var2.f211881s = new bb2.s(qt2Var, u1Var3, ooVar3, mMFragmentActivity, onDismissListener3, view2, this.f19089q, this.f19087o, this.f19090r);
            k0Var2.f211854d = new bb2.t(onDismissListener3);
            k0Var2.v();
            i18 = 10;
        }
        bb2.l0.a(bb2.l0.f18908a, "finder_barrage_comments_more_options", this.f19085m, this.f19081f, this.f19080e, "view_clk", i18 != 0 ? java.lang.String.valueOf(i18) : "", this.f19086n, this.f19087o, this.f19088p, true);
    }
}
