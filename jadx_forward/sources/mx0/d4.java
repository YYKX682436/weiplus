package mx0;

/* loaded from: classes5.dex */
public final class d4 implements android.view.SurfaceHolder.Callback {
    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder p07, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingPluginLayout", "surfaceChanged " + p07.getSurfaceFrame().width() + ' ' + p07.getSurfaceFrame().height());
        az0.w2 w2Var = az0.w2.f97524d;
        android.view.Surface surface = p07.getSurface();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
        int width = p07.getSurfaceFrame().width();
        int height = p07.getSurfaceFrame().height();
        android.os.Handler handler = az0.w2.f97533p;
        if (handler != null) {
            handler.post(new az0.o2(height, width, surface));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingPluginLayout", "surfaceCreated " + p07.getSurfaceFrame().width() + ' ' + p07.getSurfaceFrame().height());
        az0.w2 w2Var = az0.w2.f97524d;
        android.view.Surface surface = p07.getSurface();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(surface, "getSurface(...)");
        int width = p07.getSurfaceFrame().width();
        int height = p07.getSurfaceFrame().height();
        android.os.Handler handler = az0.w2.f97533p;
        if (handler != null) {
            handler.post(new az0.o2(height, width, surface));
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        az0.w2 w2Var = az0.w2.f97524d;
        android.os.Handler handler = az0.w2.f97533p;
        if (handler != null) {
            handler.post(az0.q2.f97364d);
        }
    }
}
