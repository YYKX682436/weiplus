package qq3;

/* loaded from: classes12.dex */
public final class b extends qq3.i implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f447475h;

    /* renamed from: i, reason: collision with root package name */
    public bt3.l0 f447476i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sq3.a msgDbItem) {
        super(msgDbItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgDbItem, "msgDbItem");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        sq3.a aVar = this.f447493e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download onSceneProgressEnd msgSvrId:%s, msgId:%s, totalLen:%s, offset:%s", aVar.A0(), java.lang.Long.valueOf(aVar.m125327x74d37ac6()), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
        this.f447495g = j17;
        f();
    }

    @Override // qq3.a
    public void a(int i17) {
        bt3.l0 l0Var = this.f447476i;
        if (l0Var != null) {
            l0Var.M(null);
            gm0.j1.d().d(this.f447476i);
            qq3.i.e(this, i17, 0, 2, null);
            gm0.j1.d().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "c2c pre download file task cancel: msgSvrId:" + this.f447494f + ", msgId:" + this.f447493e.m125327x74d37ac6());
        }
    }

    @Override // qq3.a
    public void c() {
        com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        sq3.a aVar = this.f447493e;
        java.lang.String w07 = aVar.w0();
        long j17 = this.f447494f;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = cj6.o2(w07, j17);
        if ((o27 == null) || o27.m124847x74d37ac6() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "msg delete, msgId:" + aVar.m125327x74d37ac6() + ", msgSvrId:" + j17);
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        ot0.q v17 = ot0.q.v((com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(o27.Q0()) && o27.A0() == 0) ? c01.w9.u(o27.j()) : o27.j());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "appMsgContent is null");
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        if (!((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).Bi(java.lang.Integer.valueOf(v17.f430199i))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "appMsg type not support pre download");
            qq3.i.e(this, 4, 0, 2, null);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(o27.m124847x74d37ac6(), o27.Q0());
        this.f447475h = J0;
        if (J0 == null) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d();
            this.f447475h = dVar;
            pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
            java.lang.String n17 = v17.n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getTitleCompat(...)");
            java.lang.String fileext = v17.f430223o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fileext, "fileext");
            dVar.f68099xfeae815 = ((ez.e) j0Var).mj(n17, fileext);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar2 = this.f447475h;
            if (dVar2 != null) {
                dVar2.f68094x28d45f97 = v17.f430179d;
            }
            if (dVar2 != null) {
                dVar2.f68110xfc39fee = v17.f430183e;
            }
            if (dVar2 != null) {
                dVar2.f68105x2c1f0acb = v17.f430227p;
            }
            if (dVar2 != null) {
                dVar2.f68113xeb1a61d6 = v17.f430215m;
            }
            if (dVar2 != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                dVar2.f68112x10a0fed7 = 101;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar3 = this.f447475h;
            if (dVar3 != null) {
                dVar3.f68101x13f40970 = false;
            }
            if (dVar3 != null) {
                dVar3.f68096xac3be4e = c01.id.a();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar4 = this.f447475h;
            if (dVar4 != null) {
                dVar4.f68103x4a777c2 = c01.id.e();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar5 = this.f447475h;
            if (dVar5 != null) {
                dVar5.f68106x315a5445 = o27.m124847x74d37ac6();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar6 = this.f447475h;
            if (dVar6 != null) {
                dVar6.f68107xaaaa6883 = o27.Q0();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar7 = this.f447475h;
            if (dVar7 != null) {
                dVar7.f68108x6a1cf14e = 0L;
            }
            if (dVar7 != null) {
                dVar7.f68114x2262335f = v17.f430247u;
            }
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).mo880xb970c2b9(this.f447475h);
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filetype : ");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar8 = this.f447475h;
            sb6.append(dVar8 != null ? java.lang.Long.valueOf(dVar8.f68112x10a0fed7) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", sb6.toString());
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar9 = this.f447475h;
        if (dVar9 != null) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(dVar9.f68099xfeae815);
            if (r6Var.m() && r6Var.C() == dVar9.f68113xeb1a61d6) {
                qq3.i.e(this, 5, 0, 2, null);
                return;
            }
        }
        bt3.l0 l0Var = new bt3.l0(o27.m124847x74d37ac6(), o27.Q0(), v17.f430227p, this);
        this.f447476i = l0Var;
        if (aVar.v0() == 1) {
            l0Var.f105863y = 1;
        } else {
            l0Var.f105863y = 2;
        }
        gm0.j1.d().a(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
        gm0.j1.d().g(l0Var);
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.m134976x2690a4ac();
        sq3.b bVar = nVar.A;
        java.lang.String A0 = aVar.A0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A0, "getMsgItemId(...)");
        bVar.b7(A0, 2);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("c2c file pre download start, msgId:");
        sb7.append(o27.m124847x74d37ac6());
        sb7.append(", msgSvrId:");
        sb7.append(j17);
        sb7.append(", downloadNow:");
        sb7.append(aVar.v0() == 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", sb7.toString());
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j18 = this.f447494f;
        java.lang.String w08 = aVar.w0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w08, "getFromUser(...)");
        ((kq3.e) sVar).Di(4L, j18, w08, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f447476i)) {
            gm0.j1.d().q(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, this);
            sq3.a aVar = this.f447493e;
            if (i17 != 0 || i18 != 0) {
                d(2, i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download failed, msgId:" + aVar.m125327x74d37ac6() + ", msgSvrId_msgType:" + aVar.A0() + ", errType:" + i17 + ", errCode:" + i18);
                return;
            }
            qq3.i.e(this, 1, 0, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CFileMsgTask", "c2c file pre download end, msgId:" + aVar.m125327x74d37ac6() + ", msgSvrId_msgType:" + aVar.A0());
            bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
            long j17 = this.f447494f;
            java.lang.String w07 = aVar.w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "getFromUser(...)");
            ((kq3.e) sVar).Bi(4L, j17, w07, aVar.u0(), aVar.G0(), aVar.v0(), aVar.m125326x3fdd41df());
        }
    }
}
