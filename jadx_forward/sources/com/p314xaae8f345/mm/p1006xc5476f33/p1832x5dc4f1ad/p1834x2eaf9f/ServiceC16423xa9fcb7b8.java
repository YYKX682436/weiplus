package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/core/MagicBrushServiceContextBase;", "Landroid/app/Service;", "<init>", "()V", "mb-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase */
/* loaded from: classes7.dex */
public class ServiceC16423xa9fcb7b8 extends android.app.Service {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229423f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f229424d = jz5.h.b(new pc3.w(this));

    /* renamed from: e, reason: collision with root package name */
    public final pc3.u f229425e = new pc3.u(this);

    public final pc3.t a() {
        return (pc3.t) ((jz5.n) this.f229424d).mo141623x754a37bb();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        return a();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        pc3.t a17 = a();
        synchronized (a17) {
            boolean D = com.p314xaae8f345.mm.ui.bk.D(newConfig);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onConfigurationChange: lastDarkMode = " + a17.f434936i + ", newDarkMode = " + D);
            if (a17.f434936i != D) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("theme", D ? "dark" : "light");
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "onConfigurationChange: sendData = ".concat(jSONObject2));
                a17.e("onThemeChange", jSONObject2);
                a17.f434936i = D;
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServiceContext", "service created");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229370b = true;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f229425e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.g.f229433a.a(new pc3.v(this));
        je3.i.t8(je3.k.f380831e, "magicbrush", "PRELOAD_SERVICE", com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229377i, null, 1.0E-4f, 8, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f229425e);
        pc3.t a17 = a();
        synchronized (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushServerMgr", "clear all biz: " + a17.f434935h);
            java.util.Iterator it = a17.f434935h.entrySet().iterator();
            while (it.hasNext()) {
                ((sc3.k1) ((java.util.Map.Entry) it.next()).getValue()).Oc(2);
            }
            a17.f434935h.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229370b = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1834x2eaf9f.p1835x5c6729a.g.f229433a.b();
        ((ft.e) i95.n0.c(ft.e.class)).v6();
    }
}
