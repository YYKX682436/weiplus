package d32;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d32.j f307675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f307677f;

    public f(d32.j jVar, boolean z17, yz5.a aVar) {
        this.f307675d = jVar;
        this.f307676e = z17;
        this.f307677f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d32.j jVar = this.f307675d;
        d32.k kVar = jVar.f307689i;
        if (kVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        javax.microedition.khronos.opengles.GL10 gl10 = jVar.f307688h;
        if (gl10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gl");
            throw null;
        }
        kVar.onSurfaceCreated(gl10, jVar.f307687g);
        d32.k kVar2 = jVar.f307689i;
        if (kVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        javax.microedition.khronos.opengles.GL10 gl102 = jVar.f307688h;
        if (gl102 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gl");
            throw null;
        }
        jVar.getClass();
        jVar.getClass();
        kVar2.onSurfaceChanged(gl102, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        d32.k kVar3 = jVar.f307689i;
        if (kVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderer");
            throw null;
        }
        kVar3.f307703i = this.f307676e;
        try {
            p05.l4 l4Var = new p05.l4(0, false, false, false, false, false, rh0.z.f477145f, null, false, 445, null);
            kVar3.f307720z = l4Var;
            l4Var.J(640, 640);
            p05.l4 l4Var2 = kVar3.f307720z;
            if (l4Var2 != null) {
                l4Var2.H(kVar3.f307703i);
            }
            p05.l4 l4Var3 = kVar3.f307720z;
            if (l4Var3 != null) {
                l4Var3.i(kVar3.f307696b);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkSegmentInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1012L, 45L);
        }
        yz5.a aVar = this.f307677f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
