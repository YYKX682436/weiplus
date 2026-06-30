package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class c6 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y {

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f283683u = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f283684s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f283685t;

    public c6(android.content.Context context) {
        super(context);
        this.f283684s = new java.util.HashSet();
        this.f283685t = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 p(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.c6 c6Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var) {
        final ot0.q v17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 n6Var;
        c6Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f430199i;
        c6Var.mo79812xfb85f7b0();
        if (!c6Var.f283684s.contains(java.lang.Integer.valueOf(i17))) {
            return null;
        }
        java.lang.String j18 = c6Var.j(f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(c6Var.f284075e), false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = v17.f430223o;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        o25.y.a(str);
        java.lang.String v18 = o72.x1.v(c6Var.f284074d, v17.f430255w);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(v17.f430255w, true);
        if (n18 == null || !n18.d1().equals(v17.f430255w)) {
            ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.presenter.c6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ((c01.k7) c01.n8.a()).b(ot0.q.this.f430255w, 14, null);
                }
            });
        } else {
            v18 = n18.g2();
        }
        java.lang.String str2 = v18;
        int i18 = v17.f430199i;
        if ((i18 == 119 || i18 == 120) && v17.y(zy2.g.class) != null) {
            r45.ev2 ev2Var = ((zy2.g) v17.y(zy2.g.class)).f558916b;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 n6Var2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6(c6Var, f9Var.mo78012x3fdd41df(), v17.f430199i, ev2Var.m75945x2fec8307(1), f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), z07, null);
            n6Var2.f283907l = ev2Var.m75945x2fec8307(3);
            n6Var2.f283906k = c6Var.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.clc);
            n6Var2.f283905j = v17.f430179d;
            return n6Var2;
        }
        boolean z17 = true;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 n6Var3 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6(c6Var, f9Var.mo78012x3fdd41df(), v17.f430199i, v17.f430187f, f9Var.m124847x74d37ac6(), n17.d1(), n17.f2(), n17.w0(), z07, null);
        if (v17.f430199i == 5) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o6 o6Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o6(c6Var);
            ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
            if (fVar == null || fVar.f429993g != 1 || fVar.f429988b != 5) {
                z17 = false;
            }
            o6Var.f283945a = z17;
            n6Var = n6Var3;
            n6Var.f283908m = o6Var;
        } else {
            n6Var = n6Var3;
        }
        n6Var.f283906k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) ? v17.f430191g : str2;
        n6Var.f283905j = v17.f430179d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.z0())) {
            n6Var.f283907l = v17.f430267z;
        } else {
            n6Var.f283907l = f9Var.z0();
        }
        return n6Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f284076f.P(z17);
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.e6(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571523hq);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p6(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571128d34, viewGroup, false));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.j0
    public void f(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e0 e0Var, int i17, int i18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p6 p6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.p6) e0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6 n6Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n6) h(i17);
        n6Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n6Var.f283906k)) {
            p6Var.f283956m.setVisibility(8);
        } else {
            p6Var.f283956m.setVisibility(0);
            p6Var.f283956m.setText("");
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        java.lang.String str = n6Var.f283907l;
        android.content.Context context = this.f284074d;
        android.graphics.Bitmap m07 = Di.m0(null, str, i65.a.g(context), false);
        if (m07 == null || m07.isRecycled()) {
            int i19 = n6Var.f279942b;
            if (i19 == 119 || i19 == 120) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l.f542035a.h(n6Var.f283907l, p6Var.f283955i, mn2.f1.B);
            } else {
                android.graphics.Bitmap Di2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(n6Var.f283905j, 1, i65.a.g(context));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.o6 o6Var = n6Var.f283908m;
                boolean z17 = o6Var != null && o6Var.f283945a;
                java.lang.String b17 = qk.c.b(n6Var.f283907l, 4, z17);
                if (Di2 == null || Di2.isRecycled()) {
                    int i27 = z17 ? 4 : 0;
                    o11.f fVar = new o11.f();
                    fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
                    fVar.f423612c = true;
                    fVar.f423615f = tv.a.b(b17);
                    int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
                    int b19 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
                    fVar.f423619j = b18;
                    fVar.f423620k = b19;
                    fVar.A = new r35.n0(i27);
                    fVar.B = new r35.w(i27);
                    fVar.f423610a = true;
                    n11.a.b().h(b17, p6Var.f283955i, fVar.a());
                } else {
                    p6Var.f283955i.setImageBitmap(Di2);
                }
            }
        } else {
            p6Var.f283955i.setImageBitmap(m07);
        }
        android.widget.TextView textView = p6Var.f283957n;
        java.lang.String str2 = n6Var.f283906k;
        textView.setText(str2 != null ? str2 : "");
        p6Var.i(p6Var.f283957n, this.f284077g.f279966e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f284074d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571523hq);
    }

    @Override // zb5.h
    /* renamed from: getType */
    public int mo79812xfb85f7b0() {
        java.util.HashSet hashSet = this.f283684s;
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(27);
        hashSet.add(26);
        hashSet.add(97);
        hashSet.add(15);
        hashSet.add(4);
        hashSet.add(68);
        hashSet.add(119);
        hashSet.add(120);
        return -1;
    }

    @Override // zb5.h
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 i() {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.l6(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y
    public int k() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.y, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z
    /* renamed from: onDetach */
    public void mo79813x3f5eee52() {
        this.f283685t.set(true);
        super.mo79813x3f5eee52();
    }
}
