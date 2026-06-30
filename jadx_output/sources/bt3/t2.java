package bt3;

/* loaded from: classes9.dex */
public class t2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public pt.n0 f24414f;

    /* renamed from: i, reason: collision with root package name */
    public final int f24417i;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24412d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f24413e = -1;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f24415g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f24416h = new java.util.LinkedList();

    public t2() {
        this.f24417i = 7;
        gm0.j1.n().f273288b.a(632, this);
        gm0.j1.n().f273288b.a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this);
        try {
            this.f24417i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_recordmsg_send_waiting_time, 7);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecordMsgSendService", e17, "RecordMsgSendService init error.", new java.lang.Object[0]);
        }
    }

    public static void a(bt3.t2 t2Var, java.lang.String str) {
        t2Var.getClass();
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).Zi(str, 19, null, null);
    }

    public final void b(zs3.b0 b0Var, boolean z17) {
        pt.n0 n0Var = this.f24414f;
        if (n0Var != null) {
            long j17 = b0Var.field_msgId;
            if (((com.tencent.mm.pluginsdk.model.app.c4) n0Var).f188832g == j17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue currentAppMsgScene same msgId %s", java.lang.Long.valueOf(j17));
                return;
            }
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(b0Var.field_toUser, b0Var.field_msgId);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "[record] update msg content, msg null ? %B, msgId %d recordInfoId %d, recordInfo.localId:%d, afterCdnUpload %s, toUser:%s", java.lang.Boolean.FALSE, java.lang.Long.valueOf(Li.getMsgId()), java.lang.Long.valueOf(b0Var.field_msgId), java.lang.Integer.valueOf(b0Var.field_localId), java.lang.Boolean.valueOf(z17), b0Var.field_toUser);
        long msgId = Li.getMsgId();
        long j18 = b0Var.field_msgId;
        if (msgId == j18) {
            Li.d1(bt3.g2.h(b0Var.field_title, b0Var.field_desc, b0Var.field_dataProto, b0Var.field_favFrom, j18, b0Var.field_toUser));
            Li.r1(1);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(b0Var.field_msgId, Li, true);
        }
        ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(b0Var.field_toUser, b0Var.field_msgId);
        if (y07 != null) {
            y07.field_xml = Li.j();
            ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[]{"msgId"});
        }
        if (c01.e2.O(b0Var.field_toUser) || j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigAppMsgDeleteInfoAfterCgi()) == 0) {
            ((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).y0(b0Var.field_localId);
        }
        this.f24415g.remove(b0Var.field_localId);
        if (Li.getCreateTime() + (this.f24417i * 24 * 3600 * 1000) < c01.id.c()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "doSendContinue, out of wait time, " + Li.getCreateTime());
            Li.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(b0Var.field_msgId, Li, true);
            return;
        }
        if (bt3.g2.I(b0Var.field_toUser, b0Var.field_msgId, true, "")) {
            return;
        }
        zs3.v vVar = (zs3.v) i95.n0.c(zs3.v.class);
        java.lang.String str = b0Var.field_toUser;
        long j19 = b0Var.field_msgId;
        ((bt3.x1) vVar).getClass();
        this.f24414f = com.tencent.mm.pluginsdk.model.app.u5.Ni().b(str, j19);
    }

    public final void c(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() == j17) {
            Li.d1(str2);
            Li.r1(1);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
        }
        ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str, j17);
        if (y07 != null) {
            y07.field_xml = Li.j();
            ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(y07, new java.lang.String[]{"msgId"});
        }
        this.f24415g.remove(i17);
        ((bt3.x1) ((zs3.v) i95.n0.c(zs3.v.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.u5.Ni().b(str, j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "batch tran cdn ok, talker[%s], msgId[%d], recordLocalId[%d], begin send appmsg", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    public final boolean d(zs3.y yVar, java.util.List list, int i17) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 17) {
                    r45.ul5 A = bt3.g2.A(gp0Var.Z1);
                    if (A == null) {
                        break;
                    }
                    boolean d17 = d(yVar, A.f387465f, i17 + 1);
                    if (d17) {
                        gp0Var.C0(bt3.g2.i(A, gp0Var.Z1));
                    }
                    z17 = d17;
                } else if (yVar.field_dataId.equals(bt3.g2.w(gp0Var.T, i17))) {
                    gp0Var.a0(yVar.field_cdnKey);
                    gp0Var.b0(yVar.field_cdnUrl);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    z17 = true;
                    if (!(i17 == 1) && !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.T)) {
                        gp0Var.e0(bt3.g2.p(gp0Var.toString(), gp0Var.I));
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "replaceOtherCdnInfoEmbeddedRecord() msgData == null");
        }
        return z17;
    }

    public final boolean e(zs3.y yVar, java.util.List list, int i17) {
        boolean z17;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 17) {
                    r45.ul5 A = bt3.g2.A(gp0Var.Z1);
                    if (A == null) {
                        break;
                    }
                    boolean e17 = e(yVar, A.f387465f, i17 + 1);
                    if (e17) {
                        gp0Var.C0(bt3.g2.i(A, gp0Var.Z1));
                    }
                    z17 = e17;
                } else if (yVar.field_dataId.equals(bt3.g2.w(bt3.g2.F(gp0Var.T), i17))) {
                    gp0Var.c0(yVar.field_cdnKey);
                    gp0Var.d0(yVar.field_cdnUrl);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    z17 = true;
                    if (!(i17 == 1) && !com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.T)) {
                        gp0Var.e0(bt3.g2.p(gp0Var.toString(), gp0Var.I));
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMsgSendService", "replaceThumbCdnInfomEbeddedRecord() msgData == null");
        }
        return z17;
    }

    public void f(zs3.b0 b0Var, boolean z17) {
        bt3.j2 j2Var = new bt3.j2(this, b0Var, z17);
        jm0.f fVar = jm0.g.f300266e;
        if (b0Var == null) {
            ys3.i iVar = (ys3.i) i95.n0.c(ys3.i.class);
            kotlin.jvm.internal.o.d(iVar);
            ((bt3.h1) fVar.a(iVar, bt3.h1.class)).W6();
            gm0.j1.e().j(j2Var);
            return;
        }
        if (b0Var.field_type != 1) {
            gm0.j1.e().j(j2Var);
            return;
        }
        ys3.i iVar2 = (ys3.i) i95.n0.c(ys3.i.class);
        kotlin.jvm.internal.o.d(iVar2);
        ((bt3.h1) fVar.a(iVar2, bt3.h1.class)).W6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r16, int r17, java.lang.String r18, com.tencent.mm.modelbase.m1 r19) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt3.t2.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
