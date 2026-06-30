package qt0;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f448023d;

    public a(yz5.a aVar) {
        this.f448023d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18;
        boolean z19;
        l75.k0 k0Var;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) qt0.b.f448025b).iterator();
        loop0: while (true) {
            int i17 = 1;
            while (it.hasNext()) {
                qt0.e eVar = (qt0.e) it.next();
                eVar.getClass();
                j62.e g17 = j62.e.g();
                int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
                boolean l17 = g17.l(eVar.f448036h, (i18 == 788529167 || i18 == 788529166) || z65.c.a(), true, true);
                boolean z27 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eVar.f448034f).mo141623x754a37bb()).getBoolean(eVar.f448035g, false);
                if (!l17 || z27 || (k0Var = eVar.f448029a) == null) {
                    z18 = false;
                } else {
                    synchronized (k0Var) {
                        if (eVar.f448029a.G()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex skip: inTransaction");
                            z18 = false;
                            z19 = false;
                        } else {
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex: ".concat(kz5.z.d0(eVar.f448030b, null, null, null, 0, null, qt0.d.f448028d, 31, null)));
                            long F = eVar.f448029a.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                            try {
                                for (java.lang.String str : eVar.f448030b) {
                                    eVar.f448029a.A(eVar.f448031c, str);
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex: execSQL done");
                                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) eVar.f448034f).mo141623x754a37bb()).putBoolean(eVar.f448035g, true);
                                if (F > 0) {
                                    eVar.f448029a.w(java.lang.Long.valueOf(F));
                                }
                                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                                c6754x4f2fd58c.p("db_lazy_create_index");
                                c6754x4f2fd58c.r(eVar.f448031c);
                                c6754x4f2fd58c.s(r26.i0.t(kz5.z.d0(eVar.f448030b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                c6754x4f2fd58c.t("");
                                c6754x4f2fd58c.f140818n = (int) currentTimeMillis2;
                                c6754x4f2fd58c.f140819o = 1;
                                c6754x4f2fd58c.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                                c6754x4f2fd58c.k();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex: costMs=" + currentTimeMillis2);
                                z27 = true;
                            } catch (java.lang.Throwable th6) {
                                try {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(eVar.f448033e, th6, "createIndex: execSQL failed.", new java.lang.Object[0]);
                                    if (F > 0) {
                                        eVar.f448029a.w(java.lang.Long.valueOf(F));
                                    }
                                    long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                                    c6754x4f2fd58c2.p("db_lazy_create_index");
                                    c6754x4f2fd58c2.r(eVar.f448031c);
                                    c6754x4f2fd58c2.s(r26.i0.t(kz5.z.d0(eVar.f448030b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                    java.lang.String message = th6.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    c6754x4f2fd58c2.t(message);
                                    c6754x4f2fd58c2.f140818n = (int) currentTimeMillis3;
                                    c6754x4f2fd58c2.f140819o = 0;
                                    c6754x4f2fd58c2.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                                    c6754x4f2fd58c2.k();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex: costMs=" + currentTimeMillis3);
                                    z27 = false;
                                } catch (java.lang.Throwable th7) {
                                    if (F > 0) {
                                        eVar.f448029a.w(java.lang.Long.valueOf(F));
                                    }
                                    long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c c6754x4f2fd58c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6754x4f2fd58c();
                                    c6754x4f2fd58c3.p("db_lazy_create_index");
                                    c6754x4f2fd58c3.r(eVar.f448031c);
                                    c6754x4f2fd58c3.s(r26.i0.t(kz5.z.d0(eVar.f448030b, ",", null, null, 0, null, null, 62, null), ",", ";", false));
                                    java.lang.String message2 = th6.getMessage();
                                    if (message2 == null) {
                                        message2 = "";
                                    }
                                    c6754x4f2fd58c3.t(message2);
                                    c6754x4f2fd58c3.f140818n = (int) currentTimeMillis4;
                                    if (!z27) {
                                        i17 = 0;
                                    }
                                    c6754x4f2fd58c3.f140819o = i17;
                                    c6754x4f2fd58c3.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
                                    c6754x4f2fd58c3.k();
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f448033e, "createIndex: costMs=" + currentTimeMillis4);
                                    throw th7;
                                }
                            }
                            z18 = false;
                        }
                    }
                    z17 = (z19 || !z17) ? z18 : true;
                }
                z19 = z27;
                if (z19) {
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qt0.b.f448026c, "tryLazyCreateDbIndex done");
            yz5.a aVar = this.f448023d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
