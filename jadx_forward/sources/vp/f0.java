package vp;

/* loaded from: classes16.dex */
public class f0 implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f520304d;

    public f0(vp.d dVar, vp.e0 e0Var) {
        this.f520304d = new java.lang.ref.WeakReference(dVar);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        long a17;
        xp.a aVar;
        vp.d dVar = (vp.d) this.f520304d.get();
        if (dVar == null) {
            return false;
        }
        switch (message.what) {
            case 1:
                dVar.f520275e = false;
                dVar.f520287t = true;
                yp.b bVar = dVar.f520273J.f520257d;
                if (!bVar.f545905a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
                }
                bVar.f545905a = true;
                java.lang.Object obj = message.obj;
                if (obj != null) {
                    dVar.f520286s = ((java.lang.Long) obj).longValue();
                } else {
                    dVar.f520286s = 0L;
                }
                dVar.f520292y = 0;
                dVar.f520293z = 0;
                dVar.A = 0;
                zp.e eVar = dVar.f520284q;
                eVar.getClass();
                eVar.f556443c = android.os.SystemClock.uptimeMillis();
                zp.e eVar2 = dVar.f520284q;
                eVar2.f556441a = 0L;
                eVar2.f556442b = 0L;
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, "message start:startTime:" + dVar.f520286s);
                }
                dVar.m();
                break;
            case 2:
                dVar.m();
                break;
            case 3:
                dVar.l();
                break;
            case 4:
                dVar.r();
                if (dVar.f520277g && !dVar.f520275e && dVar.f520276f) {
                    if (dVar.M == 0 && dVar.N != null) {
                        android.view.Choreographer.getInstance().postFrameCallback(dVar.N);
                    }
                    long uptimeMillis = android.os.SystemClock.uptimeMillis();
                    if (dVar.G.g()) {
                        a17 = android.os.SystemClock.uptimeMillis() - dVar.f520285r;
                    } else {
                        long uptimeMillis2 = android.os.SystemClock.uptimeMillis();
                        long j17 = dVar.E;
                        if (uptimeMillis2 - j17 >= 200 || dVar.R) {
                            dVar.R = false;
                            dVar.E = uptimeMillis2;
                            xp.g gVar = dVar.G.f537368c;
                            a17 = gVar == null ? -1L : gVar.a();
                            dVar.F = a17;
                        } else {
                            a17 = (dVar.F + uptimeMillis2) - j17;
                        }
                    }
                    dVar.f520283p.f556447a = a17;
                    zp.e eVar3 = dVar.f520284q;
                    eVar3.getClass();
                    long uptimeMillis3 = android.os.SystemClock.uptimeMillis() - eVar3.f556443c;
                    eVar3.f556442b = uptimeMillis3;
                    eVar3.f556441a += uptimeMillis3;
                    eVar3.f556443c = android.os.SystemClock.uptimeMillis();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
                    if (dVar.f520287t) {
                        dVar.f520273J.a();
                        dVar.f520287t = false;
                    }
                    try {
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            dVar.f520289v = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.t();
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            dVar.f520290w = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.o();
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                            dVar.f520291x = android.os.SystemClock.uptimeMillis();
                        }
                        dVar.g();
                        dVar.p();
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(dVar.f520274d, th6.toString() + th6);
                    }
                    dVar.s((16 + uptimeMillis) - android.os.SystemClock.uptimeMillis());
                    break;
                }
                break;
            case 5:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleSeek() msg.obj is null = ");
                sb6.append(message.obj == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, sb6.toString());
                java.lang.Object obj2 = message.obj;
                if (obj2 != null) {
                    dVar.f520286s = ((java.lang.Long) obj2).longValue();
                    dVar.f520287t = true;
                    dVar.m();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
                break;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, "handleQuit()");
                dVar.f520275e = true;
                dVar.p();
                dVar.G.a();
                dVar.f520279i.b();
                dVar.f520281n.a();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, "message quit");
                break;
            case 7:
                java.lang.Object obj3 = message.obj;
                if (!(obj3 instanceof xp.d)) {
                    java.lang.String str = dVar.f520274d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleConfigChanged()");
                    dVar.f520273J.d();
                    dVar.f520279i.d();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "message config changed");
                    break;
                } else {
                    xp.d dVar2 = (xp.d) obj3;
                    java.lang.String str2 = dVar.f520274d;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleConfigChanged with context!");
                    dVar.G = dVar2;
                    dVar.f520282o.f520299d = dVar2;
                    dVar.f520280m.f520369a = dVar2;
                    vp.a aVar2 = dVar.f520273J;
                    aVar2.f520258e = dVar2;
                    if (!(dVar.f520278h instanceof yp.l) && (aVar = dVar2.f537373h) != null) {
                        dVar.L.f520310e = aVar.f537344i;
                    }
                    aVar2.d();
                    dVar.f520279i.d();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "message config changed with context!");
                    break;
                }
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, "handleRelease()");
                vp.g0 g0Var = dVar.L;
                if (g0Var.f520307b != null && !g0Var.f520308c.booleanValue()) {
                    g0Var.f520307b.quitSafely();
                }
                g0Var.f520307b = null;
                dVar.f520282o.getClass();
                dVar.f520281n.getClass();
                break;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.f520274d, "handleClear()");
                dVar.f520273J.a();
                dVar.G.a();
                dVar.f520279i.b();
                break;
            case 10:
                dVar.k();
                break;
            case 11:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "handleClearDrawingCache");
                dVar.r();
                if (dVar.f520277g) {
                    dVar.e();
                    break;
                }
                break;
            case 12:
                dVar.p();
                dVar.s(4L);
                break;
            case 13:
                dVar.g();
                break;
            case 14:
                vp.a aVar3 = dVar.f520273J;
                if (aVar3 instanceof vp.z0) {
                    vp.z0 z0Var = (vp.z0) aVar3;
                    z0Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) z0Var.f520412n).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll((java.util.List) it.next());
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z0Var.f520407i, "getDrawingDanmakuList: size = %d" + arrayList.size());
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        wp.a aVar4 = (wp.a) it6.next();
                        dVar.G.c(aVar4).h(aVar4, false, null);
                    }
                    break;
                }
                break;
            case 15:
                java.lang.Object obj4 = message.obj;
                if (obj4 instanceof wp.e) {
                    wp.e eVar4 = (wp.e) obj4;
                    dVar.P = eVar4;
                    yp.j jVar = dVar.f520278h;
                    if (jVar.mo177446xfb86a31b() instanceof com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d) {
                        ((com.p314xaae8f345.mm.p672x55b6590f.p673xc84b4196.C10429x362d5b9d) jVar.mo177446xfb86a31b()).m43628x454604d2(eVar4);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
