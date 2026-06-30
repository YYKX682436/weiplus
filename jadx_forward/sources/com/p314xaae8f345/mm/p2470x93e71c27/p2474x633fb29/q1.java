package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

@j95.b
/* loaded from: classes9.dex */
public final class q1 extends i95.w implements o72.v3 {
    public java.lang.Object Ai(java.lang.String str, dn.m mVar, r45.gp0 gp0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jm0.o service = ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).f381800d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.t.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(service.getViewModel(), new jm0.e(service)).a(a82.t.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        jm0.g gVar = (jm0.g) a17;
        a82.t tVar = gVar instanceof a82.t ? (a82.t) gVar : null;
        if (tVar != null) {
            return tVar.d7(str, mVar, false, gp0Var, z17, interfaceC29045xdcb5ca57);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavApiFeatureService", "can not get downloader");
        return java.lang.Boolean.FALSE;
    }

    public dn.m wi(java.lang.String taskName, r45.gp0 dataItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        o72.b2 b2Var = o72.c2.f424850a;
        dn.m mVar = new dn.m();
        mVar.f323318d = taskName;
        mVar.f69601xaca5bdda = dataItem.T;
        mVar.f323322h = 2;
        mVar.f69580x454032b6 = 10;
        if (dataItem.I == 4) {
            if (dataItem.R >= 26214400) {
                mVar.f69592xf1ebe47b = 10007;
            } else {
                mVar.f69592xf1ebe47b = 10002;
            }
        } else if (dataItem.R >= 26214400) {
            mVar.f69592xf1ebe47b = 10007;
        } else {
            mVar.f69592xf1ebe47b = 10001;
        }
        mVar.f323319e = false;
        mVar.f69620xeb1a61d6 = dataItem.R;
        mVar.f69575xf11df5f5 = dataItem.f456971u;
        mVar.f69591xf9dbbe9c = dataItem.f456967s;
        mVar.f69609xd84b8349 = 2;
        mVar.f69595x6d25b0d9 = o72.x1.x(dataItem) + ".temp";
        mVar.f69606xccdbf540 = true;
        mVar.f323339x0 = 4;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dataItem.P1, "WeNoteHtmlFile") && o72.d3.f424854a.b()) {
            java.lang.String str = dataItem.K;
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogicKt", "note download new protocol in getFavDataDownloadCdnTaskInfo, bizid=8, format=".concat(str));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavApiLogicKt", "note download new protocol serialize error: " + e17.getMessage());
            }
        }
        return mVar;
    }
}
