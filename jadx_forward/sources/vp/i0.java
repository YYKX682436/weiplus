package vp;

/* loaded from: classes16.dex */
public class i0 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f520312d;

    public i0(vp.k kVar, vp.h0 h0Var) {
        this.f520312d = new java.lang.ref.WeakReference(kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        xp.a aVar;
        vp.k kVar = (vp.k) this.f520312d.get();
        if (kVar == null) {
            return false;
        }
        switch (message.what) {
            case 1:
                kVar.f520321d = false;
                kVar.f520333s = true;
                yp.b bVar = kVar.I.f520388c;
                if (!bVar.f545905a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
                }
                bVar.f545905a = true;
                java.lang.Object obj = message.obj;
                if (obj != null) {
                    kVar.f520332r = ((java.lang.Long) obj).longValue();
                } else {
                    kVar.f520332r = 0L;
                }
                kVar.f520338x = 0;
                kVar.f520339y = 0;
                kVar.f520340z = 0;
                zp.e eVar = kVar.f520330p;
                eVar.getClass();
                eVar.f556443c = android.os.SystemClock.uptimeMillis();
                zp.e eVar2 = kVar.f520330p;
                eVar2.f556441a = 0L;
                eVar2.f556442b = 0L;
                vp.v0 v0Var = kVar.f520325h;
                if (v0Var.f520383l) {
                    v0Var.e();
                    v0Var.f520383l = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Open: dataSource reopened with new channel and consumer job");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Open: dataSource is already open");
                }
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "message start:startTime:" + kVar.f520332r);
                }
                kVar.o();
                return false;
            case 2:
                kVar.o();
                return false;
            case 3:
                kVar.m();
                return false;
            case 4:
                kVar.r();
                if (kVar.f520323f && !kVar.f520321d && kVar.f520322e) {
                    if (kVar.L == 0 && kVar.M != null) {
                        android.view.Choreographer.getInstance().postFrameCallback(kVar.M);
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    kVar.f520329o.f556447a = kVar.k();
                    zp.e eVar3 = kVar.f520330p;
                    eVar3.getClass();
                    long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - eVar3.f556443c;
                    eVar3.f556442b = uptimeMillis2;
                    eVar3.f556441a += uptimeMillis2;
                    eVar3.f556443c = android.os.SystemClock.uptimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
                    if (kVar.f520333s) {
                        kVar.I.a();
                        kVar.f520333s = false;
                    }
                    try {
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            kVar.f520335u = android.os.SystemClock.uptimeMillis();
                        }
                        kVar.t();
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            kVar.f520336v = android.os.SystemClock.uptimeMillis();
                        }
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            kVar.f520337w = android.os.SystemClock.uptimeMillis();
                        }
                        kVar.g();
                        kVar.p();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuControllerAsync", th6.toString() + th6);
                    }
                    kVar.s((16 + uptimeMillis) - android.os.SystemClock.uptimeMillis());
                }
                return false;
            case 5:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSeek() msg.obj is null = ");
                sb6.append(message.obj == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", sb6.toString());
                java.lang.Object obj2 = message.obj;
                if (obj2 != null) {
                    kVar.f520332r = ((java.lang.Long) obj2).longValue();
                    kVar.f520333s = true;
                    kVar.o();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
                return false;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleQuit()");
                kVar.f520321d = true;
                vp.d0 d0Var = kVar.f520328n;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = d0Var.f520300e;
                if (n3Var != null) {
                    n3Var.mo50302x6b17ad39(null);
                    d0Var.f520300e = null;
                }
                android.os.Handler handler = d0Var.f520298c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    d0Var.f520298c = null;
                }
                kVar.p();
                kVar.F.a();
                vp.v0 v0Var2 = kVar.f520325h;
                v0Var2.f520383l = true;
                p3325xe03a0797.p3326xc267989b.r2 r2Var = v0Var2.f520379h;
                if (r2Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("consumerJob");
                    throw null;
                }
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                u26.w wVar = v0Var2.f520378g;
                if (wVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("taskChannel");
                    throw null;
                }
                u26.x0.a(wVar, null, 1, null);
                p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h) v0Var2.f520382k).f392029d.get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
                if (r2Var2 != null) {
                    java.util.Iterator mo144672x467c086e = r2Var2.c().mo144672x467c086e();
                    while (mo144672x467c086e.hasNext()) {
                        ((p3325xe03a0797.p3326xc267989b.r2) mo144672x467c086e.next()).b(null);
                    }
                }
                p3325xe03a0797.p3326xc267989b.l.d(v0Var2.f520382k, null, null, new vp.p0(v0Var2, null), 3, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Close: cancelled consumer job, closed channel and cleared data");
                kVar.f520327m.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "message quit");
                return false;
            case 7:
                java.lang.Object obj3 = message.obj;
                if (obj3 instanceof xp.d) {
                    xp.d dVar = (xp.d) obj3;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleConfigChanged with context!");
                    kVar.F = dVar;
                    kVar.f520328n.f520299d = dVar;
                    kVar.f520326i.f520369a = dVar;
                    vp.x0 x0Var = kVar.I;
                    x0Var.f520389d = dVar;
                    if (!(kVar.f520324g instanceof yp.l) && (aVar = dVar.f537373h) != null) {
                        kVar.K.f520318e = aVar.f537344i;
                    }
                    x0Var.e();
                    kVar.f520325h.f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "message config changed with context!");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleConfigChanged()");
                    kVar.I.e();
                    kVar.f520325h.f();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "message config changed");
                }
                return false;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleRelease()");
                vp.j0 j0Var = kVar.K;
                if (j0Var.f520315b != null && !j0Var.f520316c.booleanValue()) {
                    j0Var.f520315b.quitSafely();
                }
                j0Var.f520315b = null;
                kVar.f520328n.getClass();
                kVar.f520327m.getClass();
                return false;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleClear()");
                kVar.I.a();
                kVar.F.a();
                vp.v0 v0Var3 = kVar.f520325h;
                p3325xe03a0797.p3326xc267989b.l.d(v0Var3.f520382k, null, null, new vp.p0(v0Var3, null), 3, null);
                return false;
            case 10:
                kVar.l();
                return false;
            case 11:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "handleClearDrawingCache");
                kVar.r();
                if (kVar.f520323f) {
                    kVar.e();
                }
                return false;
            case 12:
                kVar.p();
                kVar.s(4L);
                return false;
            case 13:
                kVar.g();
                return false;
            case 14:
                vp.x0 x0Var2 = kVar.I;
                if (x0Var2 instanceof vp.y0) {
                    vp.y0 y0Var = (vp.y0) x0Var2;
                    y0Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) y0Var.f520400k).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll((java.util.List) it.next());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(y0Var.f520396g, "getDrawingDanmakuList: size = %d" + arrayList.size());
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        wp.a aVar2 = (wp.a) it6.next();
                        kVar.F.c(aVar2).h(aVar2, false, null);
                    }
                }
                return false;
            case 15:
                java.lang.Object obj4 = message.obj;
                if (obj4 instanceof wp.e) {
                    wp.e eVar4 = (wp.e) obj4;
                    kVar.N = eVar4;
                    yp.j jVar = kVar.f520324g;
                    if (jVar.mo177446xfb86a31b() instanceof com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d) {
                        ((com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d) jVar.mo177446xfb86a31b()).m43628x454604d2(eVar4);
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
