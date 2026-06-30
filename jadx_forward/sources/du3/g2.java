package du3;

/* loaded from: classes3.dex */
public final class g2 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325120f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325121g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325122h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325123i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f325124m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f325125n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f325126o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f325127p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f325128q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f325129r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f325130s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f325131t;

    /* renamed from: u, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f325132u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.PopupWindow f325133v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325120f = parent;
        this.f325121g = jz5.h.b(new du3.p1(this));
        this.f325122h = jz5.h.b(new du3.l1(this));
        this.f325123i = jz5.h.b(new du3.k1(this));
        this.f325124m = jz5.h.b(new du3.o1(this));
        this.f325125n = jz5.h.b(new du3.f2(this));
        this.f325126o = jz5.h.b(new du3.m1(this));
        this.f325127p = jz5.h.b(new du3.r1(this));
        this.f325128q = jz5.h.b(new du3.j1(this));
        this.f325129r = jz5.h.b(new du3.n1(this));
        this.f325130s = jz5.h.b(new du3.e2(this));
        this.f325131t = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public static final void z(du3.g2 g2Var) {
        android.widget.PopupWindow popupWindow = g2Var.f325133v;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            g2Var.f325133v = null;
        }
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 A() {
        java.lang.Object mo141623x754a37bb = this.f325128q.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.View B() {
        java.lang.Object mo141623x754a37bb = this.f325121g.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final hk0.u0 C() {
        return (hk0.u0) this.f325130s.mo141623x754a37bb();
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        android.view.View B = B();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(B, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(B, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C().Z6(3, new du3.s1(this));
        C().Z6(5, new du3.t1(this));
        C().Z6(6, new du3.u1(this));
        C().Z6(2, new du3.v1(this));
        C().Z6(4, new du3.w1(this));
        C().Z6(1, new du3.x1(this));
        C().a7(1, new du3.y1(this));
        this.f325132u = p3325xe03a0797.p3326xc267989b.l.d(this.f325131t, null, null, new du3.c2(this, null), 3, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        int id6 = v17.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.pzk) {
            hk0.u0.e7(C(), 1, null, 2, null);
        } else if (id6 == com.p314xaae8f345.mm.R.id.f565517pv0) {
            hk0.u0.e7(C(), 4, null, 2, null);
            nu3.i iVar = nu3.i.f421751a;
            iVar.b(10);
            nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        } else if (id6 == com.p314xaae8f345.mm.R.id.f567519pz0) {
            hk0.u0.e7(C(), 5, null, 2, null);
        } else if (id6 == com.p314xaae8f345.mm.R.id.sbz) {
            hk0.u0.e7(C(), 6, null, 2, null);
        } else if (id6 == com.p314xaae8f345.mm.R.id.d8n) {
            ut3.d dVar = ut3.f.f512709c.f512710a;
            if (dVar != null && (dVar instanceof qt3.m)) {
                hk0.u0 C = C();
                p3325xe03a0797.p3326xc267989b.l.d(C.f363355p, null, null, new hk0.o0(C, null), 3, null);
                C.f363351i = new hk0.z();
            }
            C().d7(10, java.lang.Boolean.TRUE);
            nu3.i.f421751a.b(12);
            nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f325132u;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f325131t, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f325123i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f325126o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb2).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) this.f325127p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb3).setOnClickListener(this);
        java.lang.Object mo141623x754a37bb4 = ((jz5.n) this.f325129r).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb4, "getValue(...)");
        ((android.view.View) mo141623x754a37bb4).setOnClickListener(this);
        if (du3.b0.F.a(configProvider)) {
            A().setOnClickListener(this);
            A().setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 A = A();
            A.getViewTreeObserver().addOnPreDrawListener(new du3.q1(A, this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(A(), "sns_ai_retouch");
            aVar.fk(A(), "sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi());
            aVar.ik(A(), 40, 36244);
        }
        android.view.ViewGroup.LayoutParams layoutParams = B().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        int c17 = com.p314xaae8f345.mm.ui.bl.c(B().getContext());
        layoutParams2.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(B().getContext());
        B().setLayoutParams(layoutParams2);
        C().f363351i.f363394m += c17;
    }
}
