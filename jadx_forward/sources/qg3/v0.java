package qg3;

/* loaded from: classes2.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f444411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f444412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f444413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f444414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444415i;

    public v0(int i17, byte[] bArr, byte[] bArr2, int i18, int i19, yz5.l lVar) {
        this.f444410d = i17;
        this.f444411e = bArr;
        this.f444412f = bArr2;
        this.f444413g = i18;
        this.f444414h = i19;
        this.f444415i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.vx0 vx0Var;
        byte[] finderObjectBytes = this.f444411e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObjectBytes, "finderObjectBytes");
        byte[] lastBuffer = this.f444412f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        yz5.l callback = this.f444415i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchTopicList start topicType:");
        int i17 = this.f444410d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(this.f444414h));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.mo11468x92b714fd(finderObjectBytes);
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        r45.na1 na1Var = new r45.na1();
        na1Var.set(7, java.lang.Long.valueOf(m76784x5db1b11));
        na1Var.set(3, java.lang.Integer.valueOf(i17));
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        na1Var.set(13, java.lang.Long.valueOf((m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? 0L : vx0Var.m75942xfb822ef2(0)));
        na1Var.set(18, java.lang.Integer.valueOf(this.f444413g));
        na1Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(lastBuffer, 0, lastBuffer.length));
        na1Var.set(1, db2.t4.f309704a.b(817, qt2Var));
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        na1Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        na1Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = na1Var;
        lVar.f152200d = 817;
        lVar.f152198b = new r45.oa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergettopiclist";
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new qg3.w0(callback), false);
    }
}
