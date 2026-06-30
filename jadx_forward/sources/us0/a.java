package us0;

/* loaded from: classes10.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ us0.c f511977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(us0.c cVar) {
        super(1);
        this.f511977d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap image = (android.graphics.Bitmap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(image, "image");
        us0.c cVar = this.f511977d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f511981b, "onImageAvailableListener, image:" + image + ", width:" + image.getWidth() + ", height:" + image.getHeight());
        yz5.l lVar = cVar.f511984e;
        if (lVar != null) {
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vs0.c.f521365c, vs0.c.f521363a.b(1))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageBack");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 14L, 1L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureSuccessUseImageFront");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 15L, 1L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera2ProcessIDKeyStat", "markCaptureUseImageSuccess");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1099L, 16L, 1L);
        vs0.l lVar2 = cVar.f511985f;
        if (lVar2 != null) {
            lVar2.b();
        }
        cVar.f511985f = null;
        return jz5.f0.f384359a;
    }
}
