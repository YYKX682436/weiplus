package mk4;

/* loaded from: classes14.dex */
public final class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 f408679d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768) {
        this.f408679d = c18686x59ce5768;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768 = this.f408679d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18686x59ce5768.m71917x23aed0ac(), "surfaceChanged format:" + i17 + " [" + i18 + ' ' + i19 + "] listener:" + c18686x59ce5768.f256029e);
        mk4.a aVar = c18686x59ce5768.f256029e;
        if (aVar != null) {
            aVar.b(holder, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768 = this.f408679d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18686x59ce5768.m71917x23aed0ac(), "surfaceCreated listener:" + c18686x59ce5768.f256029e);
        c18686x59ce5768.f256035n = holder.getSurface();
        mk4.a aVar = c18686x59ce5768.f256029e;
        if (aVar != null) {
            aVar.c(holder, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2281xc84b4196.C18686x59ce5768 c18686x59ce5768 = this.f408679d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18686x59ce5768.m71917x23aed0ac(), "surfaceDestroy listener:" + c18686x59ce5768.f256029e);
        mk4.a aVar = c18686x59ce5768.f256029e;
        if (aVar != null) {
            aVar.a(holder);
        }
    }
}
