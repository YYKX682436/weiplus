package ks2;

/* loaded from: classes8.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 {
    public final android.content.Context E;
    public final ks2.b F;
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 G;
    public android.view.View H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f393144J;
    public final ks2.m K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(android.content.Context context, java.lang.String username) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.E = context;
        ks2.b bVar = new ks2.b(this);
        this.F = bVar;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dh7, (android.view.ViewGroup) null);
        inflate.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, (int) ((i65.a.k(context) + com.p314xaae8f345.mm.ui.bk.p(context)) * kx2.a.f394811a.a(context))));
        this.f213508y.addView(inflate, 0);
        if (inflate instanceof android.view.ViewGroup) {
            this.G = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) inflate.findViewById(com.p314xaae8f345.mm.R.id.qd6);
            this.H = inflate.findViewById(com.p314xaae8f345.mm.R.id.ilp);
            this.I = inflate.findViewById(com.p314xaae8f345.mm.R.id.jsw);
            this.f393144J = inflate.findViewById(com.p314xaae8f345.mm.R.id.m2h);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.G;
            if (c1163xf1deaba4 != null) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.G;
            if (c1163xf1deaba42 != null) {
                c1163xf1deaba42.mo7960x6cab2c8d(bVar);
            }
            a();
            this.f213498o = true;
            k();
            android.view.View view = this.f393144J;
            if (view != null) {
                view.setOnClickListener(new ks2.i(this));
            }
        }
        ks2.m mVar = new ks2.m(username);
        this.K = mVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = mVar.f393148b;
        if (j0Var != null) {
            j0Var.mo7806x9d92d11c((p012xc85e97e9.p093xedfae76a.y) context, new ks2.a(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3
    public void i() {
        j();
        super.i();
    }

    public final void j() {
        ks2.m mVar = this.K;
        if (mVar == null || mVar.f393150d || mVar.f393149c) {
            return;
        }
        mVar.f393150d = true;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ks2.k kVar = new ks2.k(mVar);
        ks2.l lVar = new ks2.l(mVar);
        java.lang.String finderUsername = mVar.f393147a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        pm0.v.T(new bq.y0(finderUsername, 2).l(), new cq.a1(kVar, lVar));
    }

    public final void k() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.G;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.setVisibility(8);
        }
        android.view.View view = this.H;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.I;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f393144J;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/moreInfo/ProfileMoreInfoVMDrawer", "setLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
