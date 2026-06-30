package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes12.dex */
public class k3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f283416g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283417h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283418i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f283420n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f283421o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283422p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f283423q;

    public k3(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, t21.v2 v2Var, java.lang.String str6, int i19) {
        this.f283413d = str;
        this.f283414e = str2;
        this.f283415f = i17;
        this.f283416g = i18;
        this.f283417h = str3;
        this.f283418i = str4;
        this.f283419m = str5;
        this.f283420n = f9Var;
        this.f283421o = v2Var;
        this.f283422p = str6;
        this.f283423q = i19;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar != null) {
            boolean z18 = hVar.f69521xc9ff4d81;
            java.lang.String str2 = this.f283422p;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f283420n;
            java.lang.String str3 = this.f283417h;
            if (z18) {
                java.lang.String str4 = this.f283413d;
                hVar.f69522xf9dbbe9c = str4;
                java.lang.String str5 = this.f283414e;
                hVar.f69502xf11df5f5 = str5;
                int i18 = this.f283415f;
                hVar.f69562x366b1958 = i18;
                int i19 = this.f283416g;
                hVar.f69523x17c343e7 = i19;
                hVar.f69563x1209e7cb = str3;
                hVar.f69526x419c9c3d = this.f283418i;
                hVar.f69543x16680d46 = this.f283419m;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeLogic", "support second!! sceneResult: %s", hVar);
                kk.l lVar = t21.w2.f496589c;
                java.lang.String a17 = t21.c3.a(str3);
                com.p314xaae8f345.mm.vfs.w6.c(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a17, true));
                java.lang.String str6 = ((("<msg><videomsg aeskey=\"" + str5 + "\" cdnthumbaeskey=\"" + str5 + "\" cdnvideourl=\"" + str4 + "\" ") + "cdnthumburl=\"" + str4 + "\" ") + "length=\"" + i19 + "\" ") + "cdnthumblength=\"" + i18 + "\"/></msg>";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeLogic", "cdn callback new build cdnInfo:%s", str6);
                r15.d dVar = new r15.d();
                t21.v2 v2Var = this.f283421o;
                dVar.m126728xdc93280d(v2Var.g());
                int m161292x7444f759 = dVar.m161292x7444f759();
                y15.d dVar2 = new y15.d();
                dVar2.m126728xdc93280d(str6);
                r15.b j17 = dVar2.j();
                if (j17 == null) {
                    j17 = new r15.b();
                }
                r15.d j18 = j17.j();
                if (j18 == null) {
                    j18 = new r15.d();
                }
                j18.k(str2);
                j18.j(m161292x7444f759);
                j18.l(1);
                j17.o(j18);
                dVar2.o(j17);
                t21.d3.r(a17, this.f283423q, this.f283417h, dVar2.m126747x696739c(), 43, tg3.l1.a(f9Var), v2Var.Q, v2Var.R, this.f283416g);
                m11.m1 i27 = m11.m1.i();
                i27.f523674p = a17;
                i27.f404285q = 0;
                i27.f404286r = hVar;
                i27.f404287s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.j3(this, a17);
                i27.f523667i = 4;
                i27.a().a();
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.c(str3, f9Var, str2);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
