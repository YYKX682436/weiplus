package bb2;

/* loaded from: classes10.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f100612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f100613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.oo f100614f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.PopupWindow.OnDismissListener f100615g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f100616h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f100617i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f100618m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100619n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f100620o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f100621p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.a f100622q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f100623r;

    public z(android.view.View view, so2.u1 u1Var, r45.oo ooVar, android.widget.PopupWindow.OnDismissListener onDismissListener, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, in5.s0 s0Var, r45.qt2 qt2Var, bb2.w1 w1Var, boolean z17, boolean z18, yz5.a aVar, int i17) {
        this.f100612d = view;
        this.f100613e = u1Var;
        this.f100614f = ooVar;
        this.f100615g = onDismissListener;
        this.f100616h = activityC21401x6ce6f73f;
        this.f100617i = s0Var;
        this.f100618m = qt2Var;
        this.f100619n = w1Var;
        this.f100620o = z17;
        this.f100621p = z18;
        this.f100622q = aVar;
        this.f100623r = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.view.View view = this.f100612d;
        int i18 = 0;
        if (itemId != 1) {
            r45.oo ooVar = this.f100614f;
            android.widget.PopupWindow.OnDismissListener onDismissListener = this.f100615g;
            so2.u1 u1Var = this.f100613e;
            if (itemId == 2) {
                bb2.l0.f100443c = false;
                bd2.b bVar = bd2.b.f100777a;
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                bVar.f(context, u1Var.mo2128x1ed62e84(), u1Var.w(), ooVar.m75942xfb822ef2(0));
                onDismissListener.onDismiss();
                i18 = 6;
            } else if (itemId == 3) {
                bb2.l0.f100443c = true;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view.getContext(), 1, true);
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmh));
                k0Var.s(inflate, false);
                k0Var.f293405n = new bb2.v(view);
                r45.oo ooVar2 = this.f100614f;
                so2.u1 u1Var2 = this.f100613e;
                android.widget.PopupWindow.OnDismissListener onDismissListener2 = this.f100615g;
                k0Var.f293414s = new bb2.x(ooVar2, u1Var2, onDismissListener2, this.f100616h, this.f100618m, this.f100620o);
                k0Var.f293387d = new bb2.y(onDismissListener2);
                k0Var.v();
                i18 = 7;
            } else if (itemId != 4) {
                com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f100616h;
                if (itemId == 12) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.Q6((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) a17, this.f100617i, false, false, false, 8, null);
                    onDismissListener.onDismiss();
                    i18 = 8;
                } else if (itemId == 13) {
                    java.lang.String m75945x2fec8307 = ooVar.m75945x2fec8307(2);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(m75945x2fec8307);
                        db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                    }
                    onDismissListener.onDismiss();
                    i18 = 5;
                }
            } else {
                bb2.l0.f100443c = false;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hb2.y.f361647e.n(ooVar.m75942xfb822ef2(0), u1Var.getFeedObject().m59251x5db1b11(), u1Var.getFeedObject().m59276x6c285d75(), false, new bb2.u(this.f100616h, this.f100618m, this.f100620o, this.f100614f, this.f100613e));
                onDismissListener.onDismiss();
                i18 = 14;
            }
        } else {
            bb2.l0.f100443c = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view.getContext(), 1, true);
            k0Var2.s(com.p314xaae8f345.mm.ui.id.b(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null), false);
            android.view.View view2 = this.f100612d;
            k0Var2.f293405n = new bb2.q(view2);
            r45.qt2 qt2Var = this.f100618m;
            so2.u1 u1Var3 = this.f100613e;
            r45.oo ooVar3 = this.f100614f;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f100616h;
            android.widget.PopupWindow.OnDismissListener onDismissListener3 = this.f100615g;
            k0Var2.f293414s = new bb2.s(qt2Var, u1Var3, ooVar3, activityC21401x6ce6f73f, onDismissListener3, view2, this.f100622q, this.f100620o, this.f100623r);
            k0Var2.f293387d = new bb2.t(onDismissListener3);
            k0Var2.v();
            i18 = 10;
        }
        bb2.l0.a(bb2.l0.f100441a, "finder_barrage_comments_more_options", this.f100618m, this.f100614f, this.f100613e, "view_clk", i18 != 0 ? java.lang.String.valueOf(i18) : "", this.f100619n, this.f100620o, this.f100621p, true);
    }
}
