package g53;

/* loaded from: classes8.dex */
public final class d implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f350437d;

    public d(long j17) {
        this.f350437d = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f350437d;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (fVar instanceof m53.g2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetGameIndexPreloadCgiResponse");
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 a17 = g53.e.f350438a.a();
                a17.f221388g = ((m53.g2) fVar).f405235d;
                a17.f221387f = false;
                a17.f221385d = java.lang.System.currentTimeMillis();
                a17.f221386e = currentTimeMillis;
                g53.e.d(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , success cgiResponseStr= " + g53.e.f350438a.a());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 a18 = g53.e.f350438a.a();
            a18.f221388g = null;
            a18.f221387f = true;
            a18.f221385d = java.lang.System.currentTimeMillis();
            a18.f221386e = currentTimeMillis;
            g53.e.d(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , falied  errorCode =" + i18 + " errorMsg = " + str);
        }
        g53.b bVar = g53.e.f350443f;
        if (bVar != null) {
            g53.e eVar = g53.e.f350438a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1746x633fb29.C15897x3884718 data = eVar.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = ((g53.k) bVar).f350455a;
            if (rVar != null) {
                rVar.a(eVar.a());
            }
            eVar.getClass();
            g53.e.f350443f = null;
        }
        return 0;
    }
}
