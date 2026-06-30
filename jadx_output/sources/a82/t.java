package a82;

/* loaded from: classes12.dex */
public final class t extends a82.b {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2170g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f2171h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jm0.o plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f2170g = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavCheckCdnFixSwitch()) == 1;
        this.f2171h = jz5.h.b(a82.n.f2083d);
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
    public static final java.lang.Object a7(a82.t r24, java.lang.String r25, com.tencent.mm.modelcdntran.n1 r26, kotlin.coroutines.Continuation r27) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.t.a7(a82.t, java.lang.String, com.tencent.mm.modelcdntran.n1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        e7();
    }

    public final void b7(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "cancelTask ".concat(mediaId));
        v65.i.b(W6(), null, new a82.l(((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(mediaId), mediaId, this, null), 1, null);
    }

    public final v65.h c7() {
        return (v65.h) ((jz5.n) this.f2171h).getValue();
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
    public final java.lang.Object d7(java.lang.String r26, dn.m r27, boolean r28, r45.gp0 r29, boolean r30, kotlin.coroutines.Continuation r31) {
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
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "startCdnTask:" + e2Var.toJSON());
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FavCdnService";
        mVar.field_mediaId = e2Var.field_dataId;
        mVar.f241789h = 2;
        mVar.field_appType = 10;
        mVar.f241786e = false;
        mVar.field_totalLen = e2Var.field_totalLen;
        mVar.field_aesKey = e2Var.field_cdnKey;
        mVar.field_fileId = e2Var.field_cdnUrl;
        mVar.field_priority = 2;
        mVar.field_fullpath = com.tencent.mm.vfs.w6.i(e2Var.field_path, false) + ".temp";
        mVar.field_needStorage = true;
        mVar.field_isStreamMedia = e2Var.y0();
        mVar.f241806x0 = 4;
        if ((j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFav265Switch()) == 1) && e2Var.y0()) {
            mVar.f241789h = 8;
            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "startCdnTask: using kBizC2CNova for video, dataId=" + e2Var.field_dataId);
        } else {
            mVar.f241789h = 2;
        }
        if (e2Var.y0()) {
            mVar.field_fileType = V6(e2Var, 10002);
        } else {
            mVar.field_fileType = V6(e2Var, 10001);
        }
        if (z17) {
            int i17 = mVar.field_fileType;
            if (i17 == 10007) {
                mVar.field_fileType = 10001;
            } else {
                mVar.field_fileType = i17 != 10001 ? 10001 : 10002;
            }
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.field_favLocalId);
        if (F != null && F.field_type == 18) {
            r45.bq0 bq0Var = F.field_favProto;
            if (bq0Var == null || (linkedList = bq0Var.f370964f) == null) {
                gp0Var = null;
            } else {
                java.util.Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((r45.gp0) obj).T, e2Var.field_dataId)) {
                            break;
                        }
                    }
                }
                gp0Var = (r45.gp0) obj;
            }
            if (kotlin.jvm.internal.o.b(gp0Var != null ? gp0Var.P1 : null, "WeNoteHtmlFile") && o72.d3.f343321a.b()) {
                java.lang.String str = gp0Var.K;
                if (str == null) {
                    str = "";
                }
                mVar.f241789h = 8;
                mVar.field_needStorage = false;
                try {
                    com.tencent.wechat.aff.favorites.q qVar = new com.tencent.wechat.aff.favorites.q();
                    qVar.f216855d.add(kotlin.jvm.internal.o.b(str, ".md") ? com.tencent.wechat.aff.favorites.u.MARKDOWN : com.tencent.wechat.aff.favorites.u.HTML);
                    qVar.f216857f[1] = true;
                    mVar.P = qVar.toByteArray();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavCdnDownloadServiceFSC", "note download new protocol, bizid=8, format=" + str);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavCdnDownloadServiceFSC", "note download new protocol serialize error: " + e17.getMessage());
                }
            }
        }
        v65.i.b(W6(), null, new a82.s(e2Var, mVar, this, null), 1, null);
    }
}
