package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class rf extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1 implements android.view.View.OnClickListener {
    public final android.view.View A;
    public final android.view.View B;
    public final android.view.View C;
    public final android.view.View D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;
    public final android.widget.TextView G;
    public final android.widget.TextView H;
    public final android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public final android.widget.TextView f201168J;
    public final android.widget.TextView K;
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.TextView N;
    public final android.widget.TextView P;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 Q;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 R;
    public final android.widget.ImageView S;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 T;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 U;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 V;
    public int W;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f201169z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dit, (android.view.ViewGroup) this, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f201169z = inflate;
        android.view.View findViewById = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qld);
        this.A = findViewById;
        android.view.View findViewById2 = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qlf);
        this.B = findViewById2;
        android.view.View findViewById3 = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.drg);
        this.C = findViewById3;
        android.view.View findViewById4 = mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.dre);
        this.D = findViewById4;
        this.E = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.dri);
        this.F = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.ds6);
        android.widget.TextView joinBtn = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f566980hp5);
        this.G = joinBtn;
        android.widget.TextView textView = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.dqw);
        textView.setTextSize(1, 17.0f);
        this.H = textView;
        android.widget.TextView textView2 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qir);
        textView2.setTextSize(1, 32.0f);
        this.I = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qil);
        textView3.setTextSize(1, 17.0f);
        this.f201168J = textView3;
        android.widget.TextView textView4 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qis);
        textView4.setTextSize(1, 12.0f);
        this.K = textView4;
        android.widget.TextView textView5 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f568715qq3);
        textView5.setTextSize(1, 17.0f);
        this.L = textView5;
        android.widget.TextView textView6 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qq7);
        textView6.setTextSize(1, 32.0f);
        this.M = textView6;
        android.widget.TextView textView7 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qpy);
        textView7.setTextSize(1, 17.0f);
        this.N = textView7;
        android.widget.TextView textView8 = (android.widget.TextView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qq8);
        textView8.setTextSize(1, 12.0f);
        this.P = textView8;
        this.Q = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qq6);
        this.R = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qiq);
        this.S = (android.widget.ImageView) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f568713qq1);
        this.T = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qim);
        this.U = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.qin);
        this.V = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo58053xfb84e958().findViewById(com.p314xaae8f345.mm.R.id.f568714qq2);
        findViewById3.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        joinBtn.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(joinBtn, "joinBtn");
        m58110x3ab833d4(joinBtn);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    public void c() {
        yg2.b bVar;
        if (this.W == 1) {
            d();
            gk2.e m58045xd7793f26 = m58045xd7793f26();
            if (m58045xd7793f26 == null || (bVar = m58045xd7793f26.f354008i) == null) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qf(this, null), 3, null);
            return;
        }
        if (!m58052x24f779db()) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f200025i, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d1(this, null), 3, null);
            return;
        }
        d();
        yz5.l m58051xf236f49c = m58051xf236f49c();
        if (m58051xf236f49c != null) {
            m58051xf236f49c.mo146xb9724478(m58049x38bbc4c());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    public void e(gk2.e business, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0 fromScene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromScene, "fromScene");
        this.f200031r = business;
        this.f200032s = z17;
        this.f200033t = fromScene == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh0.f193950g;
        this.f200034u = fromScene;
        h(business, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io ioVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.io(getContext());
        zl2.r4.f555483a.Q2(mo58053xfb84e958());
        ioVar.k(mo58053xfb84e958());
        ioVar.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8l);
        ioVar.s();
        this.f200026m = ioVar;
        f(0);
    }

    public final void f(int i17) {
        this.W = i17;
        android.widget.TextView superFansNameTv = this.L;
        android.widget.TextView fansClubPrivilegeTv = this.K;
        android.widget.TextView fansClubDurationTv = this.f201168J;
        android.widget.TextView fansClubPriceTv = this.I;
        android.widget.TextView fansClubNameTv = this.H;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.V;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.U;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.T;
        android.widget.ImageView imageView = this.S;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.R;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.Q;
        android.view.View view = this.A;
        android.view.View view2 = this.B;
        if (i17 == 0) {
            view.setSelected(true);
            view2.setSelected(false);
            c22699x3dcdb3525.m82040x7541828(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            c22699x3dcdb3524.m82040x7541828(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79339xd71a5738);
            c22699x3dcdb3523.m82040x7541828(android.graphics.Color.parseColor("#FFC300"));
            c22699x3dcdb3522.m82040x7541828(android.graphics.Color.parseColor("#0D7A7A7A"));
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#0D000000"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubNameTv, "fansClubNameTv");
            i(fansClubNameTv, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubPriceTv, "fansClubPriceTv");
            i(fansClubPriceTv, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubDurationTv, "fansClubDurationTv");
            i(fansClubDurationTv, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubPrivilegeTv, "fansClubPrivilegeTv");
            i(fansClubPrivilegeTv, true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansNameTv, "superFansNameTv");
            j(superFansNameTv, false);
            android.widget.TextView superFansPriceTv = this.M;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansPriceTv, "superFansPriceTv");
            j(superFansPriceTv, false);
            android.widget.TextView superFansDurationTv = this.N;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansDurationTv, "superFansDurationTv");
            j(superFansDurationTv, false);
            android.widget.TextView superFansPrivilegeTv = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansPrivilegeTv, "superFansPrivilegeTv");
            j(superFansPrivilegeTv, false);
        } else {
            view2.setSelected(true);
            view.setSelected(false);
            c22699x3dcdb3525.m82040x7541828(android.graphics.Color.parseColor("#E4D18E"));
            c22699x3dcdb3524.m82040x7541828(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79338xf25de29f);
            c22699x3dcdb3523.m82040x7541828(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
            c22699x3dcdb3522.m82040x7541828(android.graphics.Color.parseColor("#0D000000"));
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#0D8E7036"));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubNameTv, "fansClubNameTv");
            i(fansClubNameTv, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubPriceTv, "fansClubPriceTv");
            i(fansClubPriceTv, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubDurationTv, "fansClubDurationTv");
            i(fansClubDurationTv, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fansClubPrivilegeTv, "fansClubPrivilegeTv");
            i(fansClubPrivilegeTv, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansNameTv, "superFansNameTv");
            j(superFansNameTv, true);
            android.widget.TextView superFansPriceTv2 = this.M;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansPriceTv2, "superFansPriceTv");
            j(superFansPriceTv2, true);
            android.widget.TextView superFansDurationTv2 = this.N;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansDurationTv2, "superFansDurationTv");
            j(superFansDurationTv2, true);
            android.widget.TextView superFansPrivilegeTv2 = this.P;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(superFansPrivilegeTv2, "superFansPrivilegeTv");
            j(superFansPrivilegeTv2, true);
        }
        g();
    }

    public final void g() {
        boolean m58047x19745ea7 = m58047x19745ea7();
        android.widget.TextView textView = this.G;
        if (!m58047x19745ea7) {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.del));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409147g, null, m58049x38bbc4c(), 2, null);
            return;
        }
        if (this.W != 0) {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lvf));
            return;
        }
        if (m58052x24f779db()) {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dem));
        } else {
            textView.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573064lu4));
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409149i, java.lang.Boolean.valueOf(m58052x24f779db()), m58049x38bbc4c());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h1
    /* renamed from: getRoot */
    public android.view.View mo58053xfb84e958() {
        return this.f201169z;
    }

    /* renamed from: getSelectedMode */
    public final int m58137xf85c6d54() {
        return this.W;
    }

    public void h(gk2.e business, boolean z17) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(business, "business");
        ya2.b2 b17 = ya2.h.f542017a.b(((mm2.c1) business.a(mm2.c1.class)).f410385o);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = mo58053xfb84e958().getContext();
        android.content.Context context2 = mo58053xfb84e958().getContext();
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = "";
        objArr[0] = b17 != null ? b17.w0() : "";
        r45.eq1 eq1Var = ((mm2.n2) business.a(mm2.n2.class)).f410812g;
        if (eq1Var != null && (m75945x2fec8307 = eq1Var.m75945x2fec8307(0)) != null) {
            str = m75945x2fec8307;
        }
        objArr[1] = str;
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddy, objArr);
        android.widget.TextView textView = this.E;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize));
        android.content.Context context3 = mo58053xfb84e958().getContext();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        r45.eq1 eq1Var2 = ((mm2.n2) business.a(mm2.n2.class)).f410812g;
        objArr2[0] = java.lang.Integer.valueOf(eq1Var2 != null ? eq1Var2.m75939xb282bd08(2) : 0);
        this.F.setText(context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573061de4, objArr2));
        m58059xca992b3(zl2.r4.f555483a.q1(business));
        g();
        android.widget.TextView textView2 = this.f201168J;
        android.widget.TextView textView3 = this.I;
        if (z17) {
            textView3.setText("1");
            textView2.setVisibility(0);
        } else {
            textView3.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lui));
            textView2.setVisibility(8);
        }
    }

    public final void i(android.widget.TextView textView, boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a, textView, new java.util.LinkedList(kz5.c0.i("#FFFFFF", "#DCDCDC")), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197248d, null, 4, null);
        } else {
            textView.getPaint().setShader(null);
        }
    }

    public final void j(android.widget.TextView textView, boolean z17) {
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a, textView, new java.util.LinkedList(kz5.c0.i("#FFF1C1", "#E4D18E")), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197248d, null, 4, null);
        } else {
            textView.getPaint().setShader(null);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.drg) {
            d();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dre) {
            yz5.a m58050x527e5fe5 = m58050x527e5fe5();
            if (m58050x527e5fe5 != null) {
                m58050x527e5fe5.mo152xb9724478();
            }
        } else {
            boolean z17 = false;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f566980hp5) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (currentTimeMillis - qd2.h.f443300a < 500) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                    z17 = true;
                }
                qd2.h.f443300a = currentTimeMillis;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (m58047x19745ea7()) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409150m, java.lang.Boolean.valueOf(m58052x24f779db()), m58049x38bbc4c());
                    c();
                } else {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Kj(ml2.j4.f409148h, java.lang.Boolean.valueOf(m58052x24f779db()), m58049x38bbc4c());
                    b();
                }
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.qld) {
                f(0);
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.qlf) {
                f(1);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubOptionWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setSelectedMode */
    public final void m58138x2ea56860(int i17) {
        this.W = i17;
    }
}
