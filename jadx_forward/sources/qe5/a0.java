package qe5;

/* loaded from: classes12.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.b0 f443602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(qe5.b0 b0Var) {
        super(1);
        this.f443602d = b0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        kd5.n nVar = (kd5.n) state.a(kd5.n.class);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (nVar != null) {
            qe5.b0 b0Var = this.f443602d;
            j75.f Q6 = b0Var.Q6();
            jz5.f0 f0Var2 = null;
            kd5.e eVar = Q6 != null ? (kd5.e) Q6.mo140437x75286adb() : null;
            if (eVar != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = eVar.f388410e;
                if (f9Var != null) {
                    java.lang.String str = eVar.f388426x;
                    java.lang.String str2 = eVar.f388418p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.o oVar = new com.p314xaae8f345.mm.ui.p2731xc84c5534.o(f9Var, str, str2, eVar.f388427y);
                    com.p314xaae8f345.mm.ui.p2731xc84c5534.p pVar = nVar.f388436b;
                    switch (pVar.ordinal()) {
                        case 4:
                            if (!b0Var.f443608g || !nVar.f388437c) {
                                oVar.f291251m = nVar.f388437c;
                                b0Var.f443608g = true;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFilePreviewBtnExp");
                                break;
                            }
                            break;
                        case 5:
                            if (!b0Var.f443606e || !nVar.f388437c) {
                                oVar.f291251m = nVar.f388437c;
                                b0Var.f443606e = true;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileOpenBtnExp");
                                break;
                            }
                            break;
                        case 6:
                            if (!b0Var.f443607f || !nVar.f388437c) {
                                oVar.f291251m = nVar.f388437c;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.l lVar = nVar.f388438d;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
                                oVar.f291245g = lVar;
                                b0Var.f443607f = true;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileDownloadBtnExp");
                                break;
                            }
                            break;
                        case 7:
                            if (!b0Var.f443605d || !nVar.f388437c) {
                                oVar.f291251m = nVar.f388437c;
                                b0Var.f443605d = true;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedOpenByOtherAppExp");
                                break;
                            }
                            break;
                        case 8:
                            oVar.f291246h = nVar.f388439e ? com.p314xaae8f345.mm.ui.p2731xc84c5534.n.f291235f : com.p314xaae8f345.mm.ui.p2731xc84c5534.n.f291236g;
                            oVar.f291247i = nVar.f388440f ? com.p314xaae8f345.mm.ui.p2731xc84c5534.h.f291177f : com.p314xaae8f345.mm.ui.p2731xc84c5534.h.f291178g;
                            com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                            f0Var2 = f0Var;
                            break;
                        case 9:
                        default:
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: type is not support");
                            break;
                        case 10:
                            if (!b0Var.f443609h) {
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.m mVar = nVar.f388441g;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mVar, "<set-?>");
                                oVar.f291244f = mVar;
                                b0Var.f443609h = true;
                                com.p314xaae8f345.mm.ui.p2731xc84c5534.d0.f291159a.d(pVar, oVar);
                                f0Var2 = f0Var;
                                break;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: hasReportedFileClickedToMidPage");
                                break;
                            }
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: msgInfo is null");
                }
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachDownLoadReportUIC", "dealPreviewReport: state is null");
            }
        }
        return f0Var;
    }
}
