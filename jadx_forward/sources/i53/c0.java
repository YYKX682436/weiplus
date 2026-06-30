package i53;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f370061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.l f370062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m33.m1 f370064g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f370065h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f370066i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.d0 f370067m;

    public c0(i53.d0 d0Var, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.l lVar, java.lang.String str, m33.m1 m1Var, int i17, int i18) {
        this.f370067m = d0Var;
        this.f370061d = map;
        this.f370062e = lVar;
        this.f370063f = str;
        this.f370064g = m1Var;
        this.f370065h = i17;
        this.f370066i = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f370061d;
        if (map.containsKey("videoid")) {
            map.put("videoid", com.p314xaae8f345.mm.vfs.w6.p((java.lang.String) map.get("videoid")));
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(this.f370062e.a(), new i53.b0(this, currentTimeMillis));
    }
}
