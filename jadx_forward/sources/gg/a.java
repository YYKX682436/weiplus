package gg;

/* loaded from: classes7.dex */
public class a implements gg.c {

    /* renamed from: a, reason: collision with root package name */
    public eg.c f353017a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f353018b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public sf.d f353019c;

    public boolean a(java.lang.String str, sf.f fVar) {
        return true;
    }

    public final java.lang.String b() {
        return java.lang.String.format(java.util.Locale.US, "%s(%s)", "MicroMsg.SameLayer.DefaultExtendPluginClientProxy", java.lang.Integer.valueOf(hashCode()));
    }

    public final synchronized eg.b c(java.lang.String str, int i17, java.lang.String str2) {
        return d(str, i17, str2, true);
    }

    public final eg.b d(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        java.util.Map map = this.f353018b;
        eg.b bVar = (eg.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str2);
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b(), "getPluginHandler, key:%s, current no handler for this key", str2);
            eg.c cVar = this.f353017a;
            if (cVar != null) {
                if (z17) {
                    bVar = cVar.Ua(str);
                    if (bVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "getPluginHandler, key:%s, created new plugin handler(%s)", str2, java.lang.Integer.valueOf(bVar.hashCode()));
                        eg.a aVar = (eg.a) bVar;
                        aVar.f334030d = i17;
                        aVar.f334031e = str;
                        aVar.f334032f = this;
                        ((java.util.concurrent.ConcurrentHashMap) map).put(str2, bVar);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b(), "getPluginHandler, key:%s, no handler for this key?", str2);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "getPluginHandler, key:%s, do not create handler", str2);
                }
            }
        }
        return bVar;
    }

    public java.lang.String e(java.lang.String str, int i17, sf.f fVar) {
        eg.b d17;
        java.lang.String d18 = sf.i.d(str, i17);
        boolean a17 = a(str, fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "handleJsApi, key:%s, jsapi:%s, createHandlerIfNeed: %b", d18, fVar.l(), java.lang.Boolean.valueOf(a17));
        synchronized (this) {
            d17 = d(str, i17, d18, a17);
        }
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "handleJsApi, key:%s, handler is null", d18);
            if (fVar.j()) {
                return fVar.a(jc1.f.f380448d);
            }
            fVar.a(jc1.f.f380448d);
            return "";
        }
        if (d17.b(fVar)) {
            if (fVar.j()) {
                return d17.f(fVar);
            }
            d17.f(fVar);
            return "";
        }
        if (fVar.j()) {
            return fVar.a(jc1.f.f380445a);
        }
        fVar.a(jc1.f.f380445a);
        return "";
    }

    public void f(java.lang.String str, int i17) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onPluginDestroy, key:%s", d17);
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "onPluginDestroy, key:%s, handler is null", d17);
        } else {
            c17.e();
        }
    }

    public void g(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onPluginReady, key:%s", d17);
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "onPluginReady, key:%s, handler is null", d17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "onPluginReady, key:%s, handler is ready", d17);
            c17.p(surfaceTexture);
        }
    }

    public void h(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        java.lang.String d17 = sf.i.d(str, i17);
        b();
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(b(), "onPluginTouch, key:%s, handler is null", d17);
        } else {
            c17.c(motionEvent);
        }
    }

    public synchronized void i(java.lang.String str, int i17) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b(), "removePlugin, key:%s", d17);
        ((java.util.concurrent.ConcurrentHashMap) this.f353018b).remove(d17);
    }
}
