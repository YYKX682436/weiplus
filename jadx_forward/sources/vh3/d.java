package vh3;

/* loaded from: classes14.dex */
public final class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 f518578d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768) {
        this.f518578d = c16525x59ce5768;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768 = this.f518578d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16525x59ce5768.m66758x23aed0ac(), "surfaceChanged format:" + i17 + " [" + i18 + ' ' + i19 + "] listener:" + c16525x59ce5768.f230320e);
        vh3.a aVar = c16525x59ce5768.f230320e;
        if (aVar != null) {
            ((uh3.a) aVar).t(holder, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768 = this.f518578d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16525x59ce5768.m66758x23aed0ac(), "surfaceCreated listener:" + c16525x59ce5768.f230320e);
        c16525x59ce5768.f230328p = holder.getSurface();
        vh3.a aVar = c16525x59ce5768.f230320e;
        if (aVar != null) {
            ((uh3.a) aVar).s(holder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1872xc84b4196.C16525x59ce5768 c16525x59ce5768 = this.f518578d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16525x59ce5768.m66758x23aed0ac(), "surfaceDestroy listener:" + c16525x59ce5768.f230320e);
        vh3.a aVar = c16525x59ce5768.f230320e;
        if (aVar != null) {
            ((uh3.a) aVar).u(holder);
        }
    }
}
