package qq3;

/* loaded from: classes12.dex */
public final class h extends qq3.i implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: h, reason: collision with root package name */
    public k70.b0 f447488h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f447489i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f447490m;

    /* renamed from: n, reason: collision with root package name */
    public long f447491n;

    /* renamed from: o, reason: collision with root package name */
    public final qq3.g f447492o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(sq3.a msgDbItem) {
        super(msgDbItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgDbItem, "msgDbItem");
        this.f447489i = jz5.h.b(new qq3.f(msgDbItem));
        this.f447490m = "";
        this.f447492o = new qq3.g(this, msgDbItem);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "c2c mid image pre download onProgress, msgId:" + this.f447493e.m125327x74d37ac6() + ", msgSvrId:" + this.f447494f + ", offset:" + j17 + ", totalLen:" + j18);
        this.f447495g = j17;
        f();
    }

    @Override // qq3.a
    public void a(int i17) {
        if (this.f447488h != null) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            java.lang.Object obj = this.f447488h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
            d17.d((com.p314xaae8f345.mm.p944x882e457a.m1) obj);
            qq3.i.e(this, i17, 0, 2, null);
            gm0.j1.d().q(109, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "c2c pre download mid image task cancel: msgSvrId:" + this.f447494f + ", msgId:" + this.f447493e.m125327x74d37ac6());
        }
    }

    @Override // qq3.a
    public void c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        sq3.a aVar = this.f447493e;
        java.lang.String w07 = aVar.w0();
        long j17 = this.f447494f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = cj6.o2(w07, j17);
        if (o27.m124847x74d37ac6() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "msg delete, msgId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 b27 = m11.b1.Di().b2(o27.Q0(), o27.I0());
        if (b27.f404166a <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "img delete, msgId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        if (((m11.j) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Di()).h(b27.f404166a, tg3.l1.a(o27), b27.f404173h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "already in downloading, msgId:" + j17);
            qq3.i.e(this, 7, 0, 2, null);
            return;
        }
        if (b27.f404184s == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CImageMsgTask", "Not In DownloadImgService Queue, Already Downloaded, Force Cancel curMsgId:" + o27.m124847x74d37ac6());
            qq3.i.e(this, 5, 0, 2, null);
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19952x246f37c9()) == 1) {
            j15.d dVar = new j15.d();
            java.lang.String j18 = o27.j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "getContent(...)");
            dVar.m126728xdc93280d(j18);
            j15.a o17 = dVar.o();
            dn.m mVar = new dn.m();
            mVar.f69601xaca5bdda = "adownimg_preload_" + aVar.A0();
            mVar.f323318d = "task_NetSceneGetMsgImg_1";
            mVar.f69616xe9780272 = new int[]{1, 2};
            mVar.f69595x6d25b0d9 = (java.lang.String) ((jz5.n) this.f447489i).mo141623x754a37bb();
            mVar.f69592xf1ebe47b = 2;
            mVar.f69620xeb1a61d6 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17.J()) ? o17.C() : o17.m140204x23255ddc();
            mVar.f69624xed1c3543 = (int) o17.s();
            mVar.f69575xf11df5f5 = o17.m140203x10626226();
            mVar.f69591xf9dbbe9c = o17.k();
            mVar.f69609xd84b8349 = 2;
            mVar.f69586x737ec037 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(o27.Q0()) ? 1 : 0;
            mVar.f323323i = aVar.v0() == 1 ? 1 : 2;
            mVar.f69583xfebd470e = true;
            mVar.f69593x419c9c3d = o17.m140205xb5885648();
            java.lang.String m140205xb5885648 = o17.m140205xb5885648();
            if (m140205xb5885648 == null) {
                m140205xb5885648 = "";
            }
            this.f447490m = m140205xb5885648;
            int i17 = mVar.f69624xed1c3543;
            this.f447491n = i17 > 0 ? i17 : mVar.f69620xeb1a61d6;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17.J())) {
                mVar.f69592xf1ebe47b = 19;
                mVar.f69582x4e093552 = o17.y();
                mVar.f323344z = o17.J();
                mVar.f69591xf9dbbe9c = "";
            }
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(this.f447492o));
        } else {
            k70.y yVar = (k70.y) i95.n0.c(k70.y.class);
            long j19 = b27.f404166a;
            long m124847x74d37ac6 = o27.m124847x74d37ac6();
            java.lang.String Q0 = o27.Q0();
            ((j70.e) yVar).getClass();
            m11.t0 t0Var = new m11.t0(j19, m124847x74d37ac6, Q0, 0, this);
            this.f447488h = t0Var;
            if (aVar.v0() == 1) {
                t0Var.C = 1;
            } else {
                t0Var.C = 2;
            }
            gm0.j1.d().a(109, this);
            gm0.j1.d().g(t0Var);
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j27 = this.f447494f;
        java.lang.String w08 = aVar.w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w08, "getFromUser(...)");
        ((kq3.e) sVar).Di(1L, j27, w08, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 109 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f447488h)) {
            gm0.j1.d().q(109, this);
            if (i17 != 0 || i18 != 0) {
                d(2, i18);
                return;
            }
            qq3.i.e(this, 1, 0, 2, null);
            bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
            long j17 = this.f447494f;
            sq3.a aVar = this.f447493e;
            java.lang.String w07 = aVar.w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getFromUser(...)");
            ((kq3.e) sVar).Bi(1L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
        }
    }
}
