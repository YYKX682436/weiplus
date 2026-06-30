package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic;

/* loaded from: classes11.dex */
public final class j0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f256295d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f256296e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.api.C4990x83627a9 f256297f;

    /* renamed from: g, reason: collision with root package name */
    public qk.ea f256298g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f256299h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a f256300i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f256301m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f256302n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f256295d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.i0.f256294d);
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0 j0Var, com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9, qk.ea eaVar, yz5.l lVar) {
        j0Var.f256297f = c4990x83627a9;
        j0Var.f256298g = eaVar;
        int ordinal = eaVar.f445627a.ordinal();
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f enumC25194xb2d6bf0f = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45191x24a738 : com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45188x760d227a : com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45190x20cf1e : com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45192xbb80ca22;
        long ordinal2 = enumC25194xb2d6bf0f.ordinal();
        bw5.u80 u80Var = eaVar.f445630d;
        byte[] mo14344x5f01b1f6 = u80Var != null ? u80Var.mo14344x5f01b1f6() : null;
        bw5.r70 r70Var = eaVar.f445629c;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a c25193xb056b73a = new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25193xb056b73a(ordinal2, mo14344x5f01b1f6, r70Var != null ? r70Var.mo14344x5f01b1f6() : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMembershipSubscribeResult isSubscribe: ");
        bw5.u80 u80Var2 = eaVar.f445630d;
        sb6.append(u80Var2 != null ? java.lang.Boolean.valueOf(u80Var2.f115333g) : null);
        sb6.append(", status: ");
        sb6.append(enumC25194xb2d6bf0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipUIC", sb6.toString());
        boolean z17 = eaVar.f445631e;
        qk.ga gaVar = eaVar.f445627a;
        if (z17) {
            if (gaVar == qk.ga.f445668e) {
                j0Var.f256301m = true;
                j0Var.f256300i = c25193xb056b73a;
                j0Var.f256299h = lVar;
                return;
            } else {
                if (lVar != null) {
                    lVar.mo146xb9724478(c25193xb056b73a);
                }
                j0Var.Q6();
                return;
            }
        }
        if (gaVar == qk.ga.f445668e) {
            if (c4990x83627a9 != null && c4990x83627a9.f134746f) {
                gl4.z zVar = (gl4.z) ((jz5.n) j0Var.f256295d).mo141623x754a37bb();
                android.app.Activity context = j0Var.m80379x76847179();
                bw5.r70 r70Var2 = eaVar.f445629c;
                zVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (r70Var2 != null) {
                    android.widget.ImageView imageView = new android.widget.ImageView(context);
                    imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78834xa20f9397);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                    marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
                    marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                    imageView.setLayoutParams(marginLayoutParams);
                    gl4.z.c(zVar, context, r70Var2, null, imageView, null, 0, gl4.l.f354400d, gl4.m.f354401d, gl4.n.f354402d, null, 560, null);
                }
            }
        }
        j0Var.P6(c4990x83627a9, eaVar);
        if (lVar != null) {
            lVar.mo146xb9724478(c25193xb056b73a);
        }
        j0Var.Q6();
    }

    public final void P6(com.p314xaae8f345.mm.api.C4990x83627a9 request, qk.ea eaVar) {
        qk.da daVar;
        if (request != null && request.f134748h == 2100) {
            eaVar.getClass();
            if (!(eaVar.f445627a == qk.ga.f445668e) || (daVar = eaVar.f445628b) == null) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("buy_vip_session", request.f134747g);
            hashMap.put("open_type", java.lang.Integer.valueOf(daVar.f445619d));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_open_vip_succ", null, hashMap, 5, false);
        }
    }

    public final void Q6() {
        this.f256297f = null;
        this.f256298g = null;
        this.f256301m = false;
        this.f256296e = false;
        this.f256299h = null;
        this.f256300i = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipUIC", "handleOnDestroy");
        Q6();
        this.f256302n = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipUIC", "handleOnResume needCheckMembershipStatus: " + this.f256301m + ", hasCheckMembershipStatus: " + this.f256296e);
        if (this.f256301m && !this.f256296e) {
            this.f256296e = true;
            gl4.z zVar = (gl4.z) ((jz5.n) this.f256295d).mo141623x754a37bb();
            android.app.Activity context = m80379x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.f0(this);
            zVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f354432a).mo141623x754a37bb();
            if (c2Var != null) {
                gl4.c cVar = new gl4.c(true, false, zVar, context, f0Var);
                jm4.x1 x1Var = new jm4.x1();
                x1Var.f381979i = cVar;
                p3380x6a61f93.p3381xf512d0a5.C30485x21b88584.m169273x21b17dfc(((jm4.d2) c2Var).m105978x2737f10(), true, x1Var);
            }
        }
    }
}
