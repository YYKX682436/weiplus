package pk3;

/* loaded from: classes8.dex */
public final class l implements jk3.f {

    /* renamed from: d, reason: collision with root package name */
    public pk3.e f437991d;

    /* renamed from: e, reason: collision with root package name */
    public ak3.c f437992e;

    @Override // kk3.c
    public void f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            l(c16601x7ed0e40c, aVar);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pk3.k(this, c16601x7ed0e40c, aVar));
        }
    }

    public final void k() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pk3.e eVar = new pk3.e(context);
        this.f437991d = eVar;
        ak3.c cVar = this.f437992e;
        android.view.ViewGroup a17 = cVar != null ? cVar.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = eVar.f437974a;
        if (c16602xcd2cf222 != null) {
            c16602xcd2cf222.setVisibility(8);
        }
        eVar.f437975b = a17;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = 0 - com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232018b;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232027k;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.q0.f232019c;
        marginLayoutParams.topMargin = i17 - i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success, topMargin:" + marginLayoutParams.topMargin);
        int i19 = marginLayoutParams.topMargin;
        if (i19 > 0) {
            marginLayoutParams.topMargin = i19 - i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2222 = eVar.f437974a;
        if (c16602xcd2cf2222 != null) {
            c16602xcd2cf2222.setLayoutParams(marginLayoutParams);
        }
        try {
            a17.addView(eVar.f437974a, a17.getChildCount());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "attachFloatBallViewToWindow success");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallContainer", e17, "attachFloatBallViewToWindow fail", new java.lang.Object[0]);
        }
    }

    public final void l(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        try {
            if (c16601x7ed0e40c != null) {
                if (this.f437991d != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskUIManager", "float ball already created");
                    m(c16601x7ed0e40c, aVar);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskUIManager", "float ball did not create");
                    k();
                    m(c16601x7ed0e40c, aVar);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskUIManager", "empty ball info list");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pk3.i(this));
                if (aVar != null) {
                    aVar.a(null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskUIManager", "doOnFloatBallInfoChanged exp:%s", e17);
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    public final void m(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, qn5.a aVar) {
        pk3.e eVar = this.f437991d;
        if (!(eVar != null) || eVar == null) {
            return;
        }
        if (c16601x7ed0e40c != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf222 = eVar.f437974a;
            objArr[0] = c16602xcd2cf222 != null ? java.lang.Boolean.valueOf(c16602xcd2cf222.f232055u) : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2222 = eVar.f437974a;
            if (c16602xcd2cf2222 != null && !c16602xcd2cf2222.f232055u) {
                c16602xcd2cf2222.getVisibility();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "show without animation");
                c16602xcd2cf2222.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2223 = eVar.f437974a;
            if (c16602xcd2cf2223 != null && c16602xcd2cf2223.getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2224 = eVar.f437974a;
                if (c16602xcd2cf2224 != null) {
                    c16602xcd2cf2224.l(false, false, aVar);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.C16602xcd2cf222 c16602xcd2cf2225 = eVar.f437974a;
        if (c16602xcd2cf2225 != null) {
            c16602xcd2cf2225.f(c16601x7ed0e40c, aVar);
        }
    }
}
