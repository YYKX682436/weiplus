package a82;

/* loaded from: classes12.dex */
public final class t extends a82.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f83703g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f83704h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jm0.o plugin) {
        super(plugin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f83703g = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20248x9ad5dc65()) == 1;
        this.f83704h = jz5.h.b(a82.n.f83616d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ff, code lost:
    
        if (r14 != 10) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0248 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0349  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(a82.t r24, java.lang.String r25, com.p314xaae8f345.mm.p947xba6de98f.n1 r26, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r27) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.t.a7(a82.t, java.lang.String, com.tencent.mm.modelcdntran.n1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        e7();
    }

    public final void b7(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask ".concat(mediaId));
        v65.i.b(W6(), null, new a82.l(((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId), mediaId, this, null), 1, null);
    }

    public final v65.h c7() {
        return (v65.h) ((jz5.n) this.f83704h).mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d7(java.lang.String r26, dn.m r27, boolean r28, r45.gp0 r29, boolean r30, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r31) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.t.d7(java.lang.String, dn.m, boolean, r45.gp0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e7() {
        v65.i.b(W6(), null, new a82.q(this, null), 1, null);
    }

    public final void f7(o72.e2 e2Var, boolean z17) {
        r45.gp0 gp0Var;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "startCdnTask:" + e2Var.mo124851xcc313de3());
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_FavCdnService";
        mVar.f69601xaca5bdda = e2Var.f67085xf604e54a;
        mVar.f323322h = 2;
        mVar.f69580x454032b6 = 10;
        mVar.f323319e = false;
        mVar.f69620xeb1a61d6 = e2Var.f67094xeb1a61d6;
        mVar.f69575xf11df5f5 = e2Var.f67083xf47749d7;
        mVar.f69591xf9dbbe9c = e2Var.f67084xf47770e7;
        mVar.f69609xd84b8349 = 2;
        mVar.f69595x6d25b0d9 = com.p314xaae8f345.mm.vfs.w6.i(e2Var.f67091x2260084a, false) + ".temp";
        mVar.f69606xccdbf540 = true;
        mVar.f69597x853bb235 = e2Var.y0();
        mVar.f323339x0 = 4;
        if ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20246x24701f66()) == 1) && e2Var.y0()) {
            mVar.f323322h = 8;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "startCdnTask: using kBizC2CNova for video, dataId=" + e2Var.f67085xf604e54a);
        } else {
            mVar.f323322h = 2;
        }
        if (e2Var.y0()) {
            mVar.f69592xf1ebe47b = V6(e2Var, 10002);
        } else {
            mVar.f69592xf1ebe47b = V6(e2Var, 10001);
        }
        if (z17) {
            int i17 = mVar.f69592xf1ebe47b;
            if (i17 == 10007) {
                mVar.f69592xf1ebe47b = 10001;
            } else {
                mVar.f69592xf1ebe47b = i17 != 10001 ? 10001 : 10002;
            }
        }
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.f67088x958756b0);
        if (F != null && F.f67657x2262335f == 18) {
            r45.bq0 bq0Var = F.f67640x5ab01132;
            if (bq0Var == null || (linkedList = bq0Var.f452497f) == null) {
                gp0Var = null;
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.gp0) obj).T, e2Var.f67085xf604e54a)) {
                            break;
                        }
                    }
                }
                gp0Var = (r45.gp0) obj;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gp0Var != null ? gp0Var.P1 : null, "WeNoteHtmlFile") && o72.d3.f424854a.b()) {
                java.lang.String str = gp0Var.K;
                if (str == null) {
                    str = "";
                }
                mVar.f323322h = 8;
                mVar.f69606xccdbf540 = false;
                try {
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.q();
                    qVar.f298388d.add(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ".md") ? com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u.MARKDOWN : com.p314xaae8f345.p3133xd0ce8b26.aff.p3143x95976a57.u.HTML);
                    qVar.f298390f[1] = true;
                    mVar.P = qVar.mo14344x5f01b1f6();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "note download new protocol, bizid=8, format=" + str);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavCdnDownloadServiceFSC", "note download new protocol serialize error: " + e17.getMessage());
                }
            }
        }
        v65.i.b(W6(), null, new a82.s(e2Var, mVar, this, null), 1, null);
    }
}
