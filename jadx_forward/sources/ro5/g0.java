package ro5;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp5.e f479729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f479730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zo5.e f479731g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ to5.a f479732h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ro5.m1 m1Var, cp5.e eVar, int i17, zo5.e eVar2, to5.a aVar) {
        super(2);
        this.f479728d = m1Var;
        this.f479729e = eVar;
        this.f479730f = i17;
        this.f479731g = eVar2;
        this.f479732h = aVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        xo5.o textureRender = (xo5.o) obj;
        android.util.Size renderSize = (android.util.Size) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRender, "$this$textureRender");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderSize, "renderSize");
        ro5.h1 h1Var = (ro5.h1) textureRender;
        boolean a17 = h1Var.a();
        to5.a aVar = this.f479732h;
        if (a17) {
            ro5.m1 m1Var = this.f479728d;
            zo5.k kVar = m1Var.f479786o;
            int i17 = this.f479730f;
            cp5.e yuvGroup = this.f479729e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvGroup, "yuvGroup");
            zo5.e renderInfo = this.f479731g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
            kVar.getClass();
            java.util.concurrent.locks.ReentrantLock reentrantLock = yuvGroup.f302671e;
            if (reentrantLock.isLocked()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuvRenderLogic", "execute: texture uploading, skip frame");
            } else {
                reentrantLock.lock();
                try {
                    ap5.a aVar2 = (ap5.a) ((jz5.n) kVar.f556428a).mo141623x754a37bb();
                    aVar2.f94331u = i17;
                    aVar2.d(renderInfo.f556413a, renderInfo.f556414b);
                    int width = renderSize.getWidth();
                    aVar2.f94335d = renderSize.getHeight();
                    aVar2.f94334c = width;
                    aVar2.f94340i = renderInfo.f556415c;
                    aVar2.f94330t = yuvGroup;
                    aVar2.b();
                } finally {
                    reentrantLock.unlock();
                }
            }
            z17 = h1Var.b("SWDecode");
            bp5.g b17 = m1Var.f479775d.f537335p.b(aVar.f502525a, "SWDecode");
            ro5.c0.a(ro5.m1.C, b17 != null ? b17.a() : null, z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", "handleResult: sw decode make current for " + aVar.f502525a + " error");
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
