package wi3;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f527793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi3.o f527794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f527796g;

    public r(long j17, wi3.o oVar, java.lang.String str, int i17) {
        this.f527793d = j17;
        this.f527794e = oVar;
        this.f527795f = str;
        this.f527796g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "do report, id:%d", java.lang.Long.valueOf(this.f527793d));
        if (this.f527794e.f527769e != 1) {
            java.lang.String[] split = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_multi_media_report_video_sample, "0,0.5,1.0", true).split(",");
            float[] fArr = new float[split.length];
            for (int i17 = 0; i17 < split.length; i17++) {
                fArr[i17] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(split[i17], 0.0f);
            }
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(this.f527795f, false);
            final java.lang.String str = this.f527795f;
            final wi3.o oVar = this.f527794e;
            final int i19 = this.f527796g;
            final long j17 = this.f527793d;
            yz5.p pVar = new yz5.p() { // from class: wi3.r$$a
                @Override // yz5.p
                /* renamed from: invoke */
                public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                    int i27 = i19;
                    long j18 = j17;
                    java.util.LinkedList linkedList = (java.util.LinkedList) obj;
                    jz5.l lVar = (jz5.l) obj2;
                    if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20321xf3a058b5()) == 1) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            java.util.Iterator it6 = ((java.util.LinkedList) it.next()).iterator();
                            while (it6.hasNext()) {
                                sb6.append((java.lang.Float) it6.next());
                                sb6.append("\n");
                            }
                            sb6.append("\n\n");
                        }
                        ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).aj(java.lang.String.format("mmfg_rpt_%s.txt", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), sb6.toString().getBytes(), true);
                    }
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(linkedList.size());
                    java.lang.String str2 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "mmfg check result:%s, path:%s", valueOf, str2);
                    wi3.n nVar = new wi3.n();
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    java.util.Iterator it7 = linkedList.iterator();
                    while (it7.hasNext()) {
                        java.util.LinkedList linkedList3 = (java.util.LinkedList) it7.next();
                        if (linkedList.size() > 38400) {
                            linkedList3 = new java.util.LinkedList(linkedList3.subList(0, 38400));
                        }
                        wi3.m mVar = new wi3.m();
                        mVar.f527766d = linkedList3;
                        linkedList2.add(mVar);
                    }
                    nVar.f527767d = linkedList2;
                    int intValue = ((java.lang.Integer) lVar.f384366d).intValue();
                    wi3.o oVar2 = oVar;
                    oVar2.f527778q = intValue;
                    oVar2.f527779r = ((java.lang.Integer) lVar.f384367e).intValue();
                    try {
                        byte[] mo14344x5f01b1f6 = nVar.mo14344x5f01b1f6();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneMultiMediaReport", "[checkVideo] byte size = " + mo14344x5f01b1f6.length);
                        oVar2.B = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(mo14344x5f01b1f6, 0, mo14344x5f01b1f6.length);
                    } catch (java.io.IOException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneMultiMediaReport", e17, java.lang.String.format("error %s", str2), new java.lang.Object[0]);
                    }
                    gm0.j1.d().g(new wi3.u(oVar2, i27, j18, null));
                    return null;
                }
            };
            wi3.l lVar = wi3.l.f527759a;
            synchronized (wi3.l.class) {
                p3325xe03a0797.p3326xc267989b.l.f(null, new wi3.e(pVar, i18, fArr, null), 1, null);
            }
            return;
        }
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(this.f527795f);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multi_media_report_filter_limit, 2048);
        int i27 = n07.outWidth;
        int i28 = n07.outHeight;
        if (i27 * i28 > Ni * Ni && i27 * i28 > com.p314xaae8f345.mm.ui.bk.f() * com.p314xaae8f345.mm.ui.bk.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneMultiMediaReport", "image too large (%d * %d)", java.lang.Integer.valueOf(n07.outWidth), java.lang.Integer.valueOf(n07.outHeight));
            gm0.j1.d().g(new wi3.u(this.f527794e, this.f527796g, this.f527793d, null));
            return;
        }
        wi3.o oVar2 = this.f527794e;
        oVar2.f527778q = n07.outWidth;
        oVar2.f527779r = n07.outHeight;
        java.lang.String str2 = this.f527795f;
        wi3.t tVar = new wi3.t(this);
        wi3.l lVar2 = wi3.l.f527759a;
        synchronized (wi3.l.class) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new wi3.d(tVar, str2, null), 1, null);
        }
    }
}
