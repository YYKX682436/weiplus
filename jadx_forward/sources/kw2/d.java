package kw2;

/* loaded from: classes15.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final kw2.e a(long j17, java.lang.String mediaId, ek4.b taskContext) {
        r45.vf2 vf2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
        kw2.e eVar = new kw2.e();
        eVar.f394488a = taskContext.f335157a;
        eVar.f394489b = taskContext.f335158b;
        eVar.f394490c = taskContext.f335159c;
        eVar.f394491d = taskContext.f335160d;
        eVar.f394492e = pm0.v.u(j17);
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        eVar.f394498k = valueOf;
        long j18 = taskContext.f335161e;
        eVar.f394493f = j18 / 1000;
        eVar.f394494g = j18;
        eVar.f394509v = mediaId;
        eVar.f394510w = c01.id.a();
        jz5.o oVar = (jz5.o) ((c61.l7) i95.n0.c(c61.l7.class)).ek().f546234r.get(mediaId);
        if (oVar != null && (vf2Var = (r45.vf2) oVar.f384374d) != null) {
            java.lang.String m75945x2fec8307 = vf2Var.m75945x2fec8307(15);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            eVar.U = m75945x2fec8307;
        }
        return eVar;
    }

    public final void b(kw2.e eVar, so2.i3 i3Var) {
        eVar.f394495h = i3Var.f68989x78351860;
        java.lang.String str = i3Var.f68976xe1500f8;
        if (str == null) {
            str = "";
        }
        eVar.f394496i = str;
        try {
            eVar.f394500m = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).ij();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", "generateClientStatus e:" + th6);
        }
    }

    public final void c(kw2.e downloadReportData, so2.i3 i3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadReportData, "downloadReportData");
        if (i3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", downloadReportData.Q + " updateFromMediaCacheOnStart return for " + i3Var);
            return;
        }
        downloadReportData.F = i3Var.f68968x799e9d9e;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        downloadReportData.f394498k = valueOf;
        b(downloadReportData, i3Var);
    }

    public final void d(kw2.e downloadReportData, so2.i3 i3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadReportData, "downloadReportData");
        if (i3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderNetworkFlowReport", downloadReportData.Q + " updateFromMediaCacheOnStop return for " + i3Var);
            return;
        }
        if (downloadReportData.K) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNetworkFlowReport", "updateFromMediaCacheOnStop return for result item:" + downloadReportData);
            return;
        }
        downloadReportData.G = i3Var.f68968x799e9d9e;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        downloadReportData.f394499l = valueOf;
        downloadReportData.f394497j = downloadReportData.G - downloadReportData.F;
        downloadReportData.f394511x = c01.id.a();
        b(downloadReportData, i3Var);
    }

    public final void e(kw2.e downloadReportData, dn.h result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadReportData, "downloadReportData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        downloadReportData.f394495h = result.f69523x17c343e7;
        java.lang.String field_videoFlag = result.f69570xea0afd82;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_videoFlag, "field_videoFlag");
        downloadReportData.f394496i = field_videoFlag;
        downloadReportData.f394497j = result.f69548xe026fea1;
        java.lang.String valueOf = java.lang.String.valueOf(result.f69559x1bb3b54a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        downloadReportData.f394498k = valueOf;
        java.lang.String valueOf2 = java.lang.String.valueOf(result.f69520x14c61803);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf2, "<set-?>");
        downloadReportData.f394499l = valueOf2;
        downloadReportData.f394500m = result.f323304f;
        downloadReportData.K = true;
        downloadReportData.f394511x = c01.id.a();
        java.lang.String profile = result.f323311m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
        downloadReportData.T = r26.i0.t(profile, ",", ";", false);
    }
}
