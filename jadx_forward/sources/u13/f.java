package u13;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u13.g f505290a;

    public f(u13.g gVar) {
        this.f505290a = gVar;
    }

    public void a(java.lang.String str, p13.y yVar) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(str, yVar, 0);
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(str, 0L);
        u13.g gVar = this.f505290a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f())) {
            return;
        }
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(gVar.f(), 0L);
    }

    public abstract void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr);

    public abstract android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view);

    public abstract boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr);
}
