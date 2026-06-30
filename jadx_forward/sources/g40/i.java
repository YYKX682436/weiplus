package g40;

/* loaded from: classes12.dex */
public final class i implements com.p314xaae8f345.mm.p947xba6de98f.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g40.l f350223d;

    public i(g40.l lVar) {
        this.f350223d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.c1
    public void a(int i17, com.p314xaae8f345.mm.p947xba6de98f.d1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String str = info.f152441d;
        g40.l lVar = this.f350223d;
        jz5.f0 f0Var = null;
        if (r26.i0.q(str, lVar.f350232g, false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "CdnMediaListener status: " + i17 + ", mediaId: " + lVar.f350232g);
            if (i17 == 1) {
                lVar.f350230e = false;
                java.util.ArrayList arrayList = lVar.f350229d;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i40.a aVar = (i40.a) ((java.lang.ref.WeakReference) it.next()).get();
                    if (aVar != null) {
                        aVar.c();
                    }
                }
                kz5.h0.B(arrayList, g40.k.f350225d);
                lVar.f();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = lVar.f350234i;
                if (f9Var != null) {
                    java.lang.String str2 = lVar.f350233h;
                    if (str2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "reportDownloadSucceed " + f9Var.m124847x74d37ac6() + ", " + f9Var.Q0() + ", " + f9Var.I0() + ", fileExt is empty");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "reportDownloadSucceed " + f9Var.m124847x74d37ac6() + ", " + f9Var.Q0() + ", " + f9Var.I0() + ", downloadFromScene: " + lVar.f350226a.f360258d);
                        ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).Ai(f9Var, str2, lVar.f350226a.f360258d, lVar.f350227b);
                    }
                }
            } else if (i17 == 2) {
                lVar.d(3, -1, "record file failed", false);
            } else if (i17 == 3) {
                lVar.d(3, -1, "record file expired", true);
            } else if (i17 == 4) {
                lVar.e(info.f152442e, info.f152443f);
            } else if (i17 != 5) {
                lVar.e(info.f152442e, info.f152443f);
            } else {
                lVar.c();
            }
            java.lang.String str3 = lVar.f350232g;
            if (str3 != null) {
                d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
                f40.k kVar = new f40.k(i17, info.f152442e, info.f152443f);
                qVar.getClass();
                f40.m.f340971g.a().f340972f.compute(str3, new f40.l(kVar));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileRecordMsgDownloadHelper", "mediaId is null");
            }
        }
    }
}
