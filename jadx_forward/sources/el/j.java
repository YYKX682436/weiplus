package el;

/* loaded from: classes9.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el.k f335251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.g f335252e;

    public j(el.k kVar, el.g gVar) {
        this.f335251d = kVar;
        this.f335252e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        el.g gVar = this.f335252e;
        java.lang.String str = gVar.f335233d;
        java.lang.String str2 = gVar.f335242m;
        el.k kVar = this.f335251d;
        kVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", "[handleDeleteFavorite]");
        ((a82.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(str, str2, new el.h(str, kVar));
    }
}
