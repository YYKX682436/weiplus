package qg3;

/* loaded from: classes2.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f444382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f444385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f444386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f444387i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f444388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444389n;

    public q0(byte[] bArr, int i17, java.lang.String str, int i18, byte[] bArr2, byte[] bArr3, int i19, yz5.l lVar) {
        this.f444382d = bArr;
        this.f444383e = i17;
        this.f444384f = str;
        this.f444385g = i18;
        this.f444386h = bArr2;
        this.f444387i = bArr3;
        this.f444388m = i19;
        this.f444389n = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] finderObjectBytes = this.f444382d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObjectBytes, "finderObjectBytes");
        java.lang.String fromSessionId = this.f444384f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromSessionId, "fromSessionId");
        byte[] lastBuffer = this.f444386h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastBuffer, "lastBuffer");
        byte[] longVideoPlayerContextBytes = this.f444387i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longVideoPlayerContextBytes, "longVideoPlayerContextBytes");
        yz5.l callback = this.f444389n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchRelatedList start pullType:");
        int i17 = this.f444385g;
        sb6.append(i17);
        sb6.append(", commentScene:");
        int i18 = this.f444388m;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", sb6.toString());
        r45.qt2 qt2Var = new r45.qt2();
        qt2Var.set(5, java.lang.Integer.valueOf(i18));
        qt2Var.set(0, fromSessionId);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        c19792x256d2725.mo11468x92b714fd(finderObjectBytes);
        long m76784x5db1b11 = c19792x256d2725.m76784x5db1b11();
        r45.z91 z91Var = new r45.z91();
        z91Var.set(3, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
        java.lang.String m76803x6c285d75 = c19792x256d2725.m76803x6c285d75();
        if (m76803x6c285d75 == null) {
            m76803x6c285d75 = "";
        }
        z91Var.set(7, m76803x6c285d75);
        z91Var.set(4, 301);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        z91Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        z91Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        z91Var.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(lastBuffer, 0, lastBuffer.length));
        db2.t4 t4Var = db2.t4.f309704a;
        z91Var.set(1, t4Var.b(3688, qt2Var));
        int i19 = this.f444383e;
        z91Var.set(9, java.lang.Integer.valueOf(i19));
        z91Var.set(17, null);
        z91Var.set(18, fromSessionId);
        z91Var.set(28, java.lang.Integer.valueOf(i17));
        r45.kv0 kv0Var = (r45.kv0) z91Var.m75936x14adae67(1);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i19);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(m76784x5db1b11);
        r45.dm2 m76806xdef68064 = c19792x256d2725.m76806xdef68064();
        t4Var.h(kv0Var, null, kz5.b0.c(new jz5.o(valueOf, valueOf2, m76806xdef68064 != null ? m76806xdef68064.m75945x2fec8307(62) : null)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = z91Var;
        lVar.f152198b = new bw5.qg();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        lVar.f152200d = 3688;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new qg3.r0(i17, callback), false);
    }
}
