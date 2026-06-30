package ze5;

/* loaded from: classes9.dex */
public class ia extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: n, reason: collision with root package name */
    public static final android.util.SparseArray f553540n = new android.util.SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f553541o = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba f553542b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f553543c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f553544d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f553545e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f553546f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f553547g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f553548h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f553549i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.LinearLayout f553550j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f553551k;

    /* renamed from: l, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f553552l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f553553m;

    public static boolean b() {
        return ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj();
    }

    public static z01.j0 c(z01.j0 j0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, android.content.Context context) {
        android.graphics.Bitmap b37;
        int i17;
        int i18;
        float f17;
        int i19;
        ot0.m1 m1Var;
        boolean z17 = f9Var.A0() != 1;
        j0Var.f550599g = f9Var.P0() == 5;
        j0Var.f550598f = f9Var.A0() == 1;
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            h17 = new t21.v2();
        }
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
        ot0.m1 m1Var2 = null;
        if (f9Var.M2()) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String b17 = tv.a.b(v17.f430267z);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b37 = m11.b1.Di().b3(b17, i65.a.g(context), context, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt);
            if (b37 == null) {
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
                n11.a b18 = n11.a.b();
                java.lang.String str = v17.f430267z;
                o11.f fVar = new o11.f();
                fVar.f423615f = b17;
                fVar.f423611b = true;
                b18.d(str, fVar.a(), new ze5.fa(weakReference));
            }
            ot0.f fVar2 = (ot0.f) v17.y(ot0.f.class);
            if (fVar2 != null && (m1Var = fVar2.f429998l) != null) {
                h17.f496548m = m1Var.f454877i;
                m1Var2 = m1Var;
            }
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b37 = m11.b1.Di().b3(tj6, i65.a.g(context), context, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt);
        }
        if (b37 == null) {
            int b19 = i65.a.b(context, 85);
            int h18 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561126a3);
            if (f9Var.M2() && m1Var2 != null && (i17 = m1Var2.f454878m) > 0 && (i18 = m1Var2.f454879n) > 0) {
                if (i17 >= i18) {
                    b19 = i65.a.b(context, 150);
                    f17 = m1Var2.f454879n;
                    i19 = m1Var2.f454878m;
                } else {
                    b19 = i65.a.b(context, 150);
                    f17 = m1Var2.f454878m;
                    i19 = m1Var2.f454879n;
                }
                h18 = (int) ((f17 / i19) * b19);
            }
            j0Var.f550596d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560752t7), b19, h18), com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, b19, h18);
        } else {
            j0Var.f550596d = b37;
        }
        j0Var.f550601i = h17.f496541f;
        j0Var.f550602m = h17.f496548m;
        j0Var.f550600h = h17.f496544i;
        j0Var.f550603n = h17.k();
        if (!z17) {
            j0Var.f550608s = ai3.a.a(h17.f496549n);
            j0Var.f550610u = t21.d3.n(h17);
            j0Var.f550609t = t21.d3.v(f9Var.z0());
            if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2551x5025ce89.C20551x1009539b()) == 1 ? ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(h17.d()) : false) {
                j0Var.f550611v = true;
                com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(f9Var.m124847x74d37ac6(), f9Var.Q0());
                float cj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).cj(c16564xb55e1d5);
                c16564xb55e1d5.m66995x9616526c();
                j0Var.f550612w = cj6;
            }
        } else if (b()) {
            fk4.k a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(f9Var.m124847x74d37ac6());
            if (a17 != null ? a17.i() : false) {
                z01.i0 i0Var = j0Var.f550607r;
                i0Var.f550587d = true;
                i0Var.f550590g = z01.h0.f550581e;
                int m17 = t21.d3.m(h17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoItemHolder", "refresh origin video progress : " + m17);
                j0Var.f550607r.f550591h = m17;
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p pVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282787a;
                fk4.k kVar = (fk4.k) com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p.f282788b.get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                if (kVar != null ? kVar.i() : false) {
                    z01.i0 i0Var2 = j0Var.f550607r;
                    i0Var2.f550587d = true;
                    i0Var2.f550590g = z01.h0.f550582f;
                    int g17 = t21.d3.g(h17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoItemHolder", "refresh video progress : " + g17);
                    j0Var.f550607r.f550591h = g17;
                } else {
                    j0Var.f550607r.f550587d = false;
                }
            }
        } else {
            j0Var.f550604o = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.l.f282696a.a(f9Var.m124847x74d37ac6()) != null;
        }
        return j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 r24, ze5.ia r25, rd5.d r26, boolean r27, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q r28, yb5.d r29, int r30, android.view.View.OnLongClickListener r31) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.ia.d(com.tencent.mm.ui.chatting.viewitems.a0, ze5.ia, rd5.d, boolean, com.tencent.mm.ui.chatting.adapter.q, yb5.d, int, android.view.View$OnLongClickListener):void");
    }

    public static void e(yb5.d dVar, ze5.ia iaVar, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.i0 i0Var = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v2) ((sb5.e) dVar.f542241c.a(sb5.e.class))).f281644m;
        if (i0Var == null || !i0Var.f272403e) {
            iaVar.f553548h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562775o8);
            iaVar.f553546f.setTextColor(i65.a.d(dVar.g(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        } else {
            iaVar.f553548h.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562776o9);
            iaVar.f553546f.setTextColor(i65.a.d(dVar.g(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c));
        }
        iaVar.f553548h.getViewTreeObserver().addOnPreDrawListener(new ze5.ha(iaVar, z17));
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 a(android.view.View view, boolean z17) {
        super.mo80050xaf65a0fc(view);
        this.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        this.f39502xce2b2f8d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brc);
        this.f553543c = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bkq);
        this.f553544d = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565228br0);
        this.f553545e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.bku);
        this.f553546f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.brj);
        this.f553547g = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.bri);
        this.f553548h = view.findViewById(com.p314xaae8f345.mm.R.id.brh);
        this.f553549i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.oy_);
        this.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
        this.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
        this.f553550j = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f565212sr2);
        this.f553551k = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565214sr4);
        this.f553552l = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f565213sr3);
        this.f553542b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22093x7ffc29ba) view.findViewById(com.p314xaae8f345.mm.R.id.srv);
        this.f553553m = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567531ui2);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.otv);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        viewGroup.addView(a17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        a17.setLayoutParams(layoutParams);
        if (z17) {
            layoutParams.gravity = 3;
        } else {
            layoutParams.gravity = 5;
        }
        lf5.g.a(a17, true, z17);
        m80057x35d80ff(T6);
        return this;
    }
}
