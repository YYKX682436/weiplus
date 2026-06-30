package oj0;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj0.h f427267d;

    public f(oj0.h hVar) {
        this.f427267d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oj0.h hVar = this.f427267d;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterRender", "initGL");
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("FilterRenderCallbackHandlerThread", 5);
        hVar.f427272d = a17;
        a17.start();
        android.os.HandlerThread handlerThread = hVar.f427272d;
        if (handlerThread == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callbackThread");
            throw null;
        }
        hVar.f427271c = new android.os.Handler(handlerThread.getLooper());
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(hVar.f427279k, hVar.f427280l, 1, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        hVar.f427273e = newInstance;
        oj0.e eVar = new oj0.e();
        android.os.Handler handler = hVar.f427271c;
        if (handler == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callbackHandler");
            throw null;
        }
        newInstance.setOnImageAvailableListener(eVar, handler);
        rs0.g gVar = rs0.i.f480829a;
        android.media.ImageReader imageReader = hVar.f427273e;
        if (imageReader == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageReader");
            throw null;
        }
        hVar.f427274f = rs0.g.n(gVar, imageReader.getSurface(), null, 0, 0, null, 16, null);
        rh0.d0 d0Var = hVar.f427278j;
        if (d0Var != null) {
            ((p05.l4) d0Var).o();
        }
        i95.m c17 = i95.n0.c(rh0.f0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        rh0.d0 u86 = rh0.f0.u8((rh0.f0) c17, 1, null, null, false, 14, null);
        hVar.f427278j = u86;
        ((p05.l4) u86).J(hVar.f427279k, hVar.f427280l);
        rh0.d0 d0Var2 = hVar.f427278j;
        if (d0Var2 != null) {
            ((p05.l4) d0Var2).H(false);
        }
        hVar.f427276h = gVar.r();
        hVar.f427277i = gVar.r();
        android.graphics.Bitmap a18 = hVar.a();
        android.opengl.GLES20.glBindTexture(3553, hVar.f427276h);
        android.opengl.GLUtils.texImage2D(3553, 0, a18, 0);
        android.opengl.GLES20.glBindTexture(3553, 0);
        int i18 = hVar.f427277i;
        int i19 = hVar.f427279k;
        int i27 = hVar.f427280l;
        android.opengl.GLES20.glBindTexture(3553, i18);
        android.opengl.GLES20.glTexImage2D(3553, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, i19, i27, 0, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, null);
        android.opengl.GLES20.glBindTexture(3553, 0);
    }
}
