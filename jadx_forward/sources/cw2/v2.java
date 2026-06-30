package cw2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f305590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.w2 f305591e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f305592f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cw2.f8 f305593g;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, cw2.w2 w2Var, in5.s0 s0Var, cw2.f8 f8Var) {
        this.f305590d = abstractC14490x69736cb5;
        this.f305591e = w2Var;
        this.f305592f = s0Var;
        this.f305593g = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.qt2 d17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f305590d != null) {
            cw2.w2 w2Var = this.f305591e;
            if (!w2Var.f305615g) {
                android.content.Context context = w2Var.f305609a;
                if (context == null || (d17 = xy2.c.d(context)) == null) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                p012xc85e97e9.p093xedfae76a.y a17 = tm3.a.a(this.f305591e.f305609a);
                if (a17 == null) {
                    a17 = com.p314xaae8f345.mm.app.a0.f134821d;
                }
                this.f305591e.f305612d = ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).R6(hc2.o0.s(this.f305590d), d17.m75939xb282bd08(5), this.f305590d.w());
                p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f305591e.f305612d;
                if ((j0Var != null ? (r45.nm2) j0Var.mo3195x754a37bb() : null) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFullSeekBarLayoutListenVideo", "initListenVideoBtn: listenInfo already exists, enter directly");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a.M(this.f305591e.f305609a, this.f305592f, this.f305590d, this.f305593g);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2137, 3);
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                cw2.w2 w2Var2 = this.f305591e;
                w2Var2.f305615g = true;
                w2Var2.f305610b = az2.c.a(az2.f.f97658d, w2Var2.f305609a, null, 0L, null, 14, null);
                az2.f fVar = this.f305591e.f305610b;
                if (fVar != null) {
                    fVar.a();
                }
                cw2.w2 w2Var3 = this.f305591e;
                w2Var3.f305614f = false;
                cw2.t2 t2Var = new cw2.t2(w2Var3, this.f305592f, this.f305590d, this.f305593g);
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = w2Var3.f305612d;
                if (j0Var2 != null) {
                    j0Var2.mo7806x9d92d11c(a17, t2Var);
                }
                w2Var3.f305611c = t2Var;
                cw2.w2 w2Var4 = this.f305591e;
                ku5.u0 u0Var = ku5.t0.f394148d;
                cw2.u2 u2Var = new cw2.u2(this.f305591e);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                w2Var4.f305613e = t0Var.z(u2Var, 3000L, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayoutListenVideo$initButtonClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
