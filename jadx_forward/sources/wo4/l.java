package wo4;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Surface f529805a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f529806b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f529807c;

    /* renamed from: d, reason: collision with root package name */
    public final vo4.i f529808d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f529809e;

    /* renamed from: f, reason: collision with root package name */
    public zv3.a f529810f;

    /* renamed from: g, reason: collision with root package name */
    public long f529811g;

    /* renamed from: h, reason: collision with root package name */
    public final zv3.g f529812h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f529813i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f529814j;

    public l(android.view.Surface surface, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 scriptModel, yz5.p pVar, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scriptModel, "scriptModel");
        this.f529805a = surface;
        this.f529806b = pVar;
        this.f529807c = lVar;
        vo4.i iVar = new vo4.i(i17, i18, i19, i27, f17, f18, false, false);
        this.f529808d = iVar;
        vo4.p pVar2 = new vo4.p(i17, i18, i19, i27);
        this.f529811g = -1L;
        this.f529814j = new wo4.j(this);
        vo4.k kVar = vo4.k.f520182a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogMaterialsInfoCache", "clearCache");
        vo4.k.f520183b.clear();
        pVar2.a(surface);
        iVar.d(pVar2);
        iVar.c(30, 30);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", iVar.hashCode() + "  setScript  durationMs :" + i28 + "  musicUrl:");
        iVar.f520177o = i28;
        iVar.f520176n = 0L;
        iVar.f520175m = true;
        vo4.t tVar = iVar.f520169g;
        if (tVar != null) {
            tVar.b(new vo4.f(iVar, scriptModel));
        }
        wo4.h hVar = new wo4.h(this);
        wo4.i iVar2 = new wo4.i(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDirector", "setCallback");
        iVar.f520170h = hVar;
        iVar.f520171i = iVar2;
        zv3.g gVar = new zv3.g(new zv3.d(scriptModel.f257212g, scriptModel.f257213h, scriptModel.f257210e, i17, i18, i17, i18, 0, true, null, 512, null));
        this.f529812h = gVar;
        gVar.d();
    }
}
