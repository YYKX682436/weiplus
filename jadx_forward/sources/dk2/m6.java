package dk2;

/* loaded from: classes3.dex */
public final class m6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f315290e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f315291f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f315292g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f315293h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f315294i;

    public m6(android.content.Context context, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var, r45.hc1 hc1Var, byte[] bArr) {
        this.f315289d = context;
        this.f315290e = z17;
        this.f315291f = c19792x256d2725;
        this.f315292g = qt2Var;
        this.f315293h = hc1Var;
        this.f315294i = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.o72 o72Var;
        dk2.u6 u6Var = dk2.u6.f315704a;
        android.content.Context context = this.f315289d;
        boolean a17 = u6Var.a(context);
        r45.qt2 qt2Var = this.f315292g;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f315291f;
        if (a17 && !this.f315290e) {
            u6Var.e(context, c19792x256d2725, qt2Var, true);
            return;
        }
        ss5.k0 k0Var = (ss5.k0) i95.n0.c(ss5.k0.class);
        r45.kv0 b17 = db2.t4.f309704a.b(3976, qt2Var);
        java.lang.String e17 = xy2.c.e(context);
        r45.hc1 hc1Var = this.f315293h;
        r45.nw1 nw1Var = (r45.nw1) hc1Var.m75936x14adae67(3);
        long m75942xfb822ef2 = nw1Var != null ? nw1Var.m75942xfb822ef2(0) : -1L;
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        if (m76803x6c285d75 == null) {
            m76803x6c285d75 = "";
        }
        java.lang.String str = m76803x6c285d75;
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        java.lang.String m75945x2fec8307 = m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null;
        ml2.e4 e4Var = ml2.e4.f408909e;
        if (qt2Var == null) {
            qt2Var = new r45.qt2();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.nw1 nw1Var2 = (r45.nw1) hc1Var.m75936x14adae67(3);
        sb6.append(nw1Var2 != null ? nw1Var2.m75942xfb822ef2(0) : -1L);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        android.content.Context context2 = this.f315289d;
        boolean z17 = this.f315290e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f315291f;
        r45.qt2 qt2Var2 = this.f315292g;
        r45.hc1 hc1Var2 = this.f315293h;
        dk2.l6 l6Var = new dk2.l6(context2, z17, c19792x256d27252, qt2Var2, hc1Var2);
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        java.lang.String str2 = w0Var != null ? w0Var.Z : null;
        if (z17) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            r45.nw1 nw1Var3 = (r45.nw1) hc1Var2.m75936x14adae67(3);
            o72Var = r4Var.T(context2, nw1Var3 != null ? nw1Var3.m75942xfb822ef2(0) : -1L, "Finder.FinderLiveFeedFlowReporter");
        } else {
            o72Var = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
        pq5.g l17 = ss5.k0.B4(k0Var, b17, e17, this.f315294i, m75942xfb822ef2, m76784x5db1b11, str, m75945x2fec8307, 9, this.f315290e, 4, null, 2, qt2Var, sb7, l6Var, str2, null, o72Var, true, null, null, 0L, null, 5768192, null).l();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            l17.f(abstractActivityC21394xb3d2c0cf);
        }
    }
}
