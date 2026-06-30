package us0;

/* loaded from: classes10.dex */
public final class b implements android.media.ImageReader.OnImageAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us0.c f511978d;

    public b(us0.c cVar) {
        this.f511978d = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader imageReader) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markImageAvailable");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 13L, 1L);
        us0.c cVar = this.f511978d;
        vs0.l lVar = cVar.f511985f;
        vs0.c cVar2 = vs0.c.f521363a;
        android.graphics.Point point = vs0.c.f521367e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(point);
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vs0.c.f521365c, cVar2.b(1));
        android.media.Image acquireLatestImage = imageReader.acquireLatestImage();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(acquireLatestImage, "acquireLatestImage(...)");
        cVar.mo50293x3498a0(new vs0.a(lVar, point, z17, acquireLatestImage, new us0.a(cVar)));
    }
}
