package qm2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.k f446257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f446258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f446259f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f446260g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f446261h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f446262i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f446263m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qm2.k kVar, boolean z17, float f17, float f18, boolean z18, int i17, boolean z19, int i18) {
        super(0);
        this.f446257d = kVar;
        this.f446258e = f17;
        this.f446259f = f18;
        this.f446260g = z18;
        this.f446261h = i17;
        this.f446262i = z19;
        this.f446263m = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float f17 = this.f446258e;
        float f18 = this.f446259f;
        boolean z17 = this.f446260g;
        boolean z18 = this.f446262i;
        int i17 = this.f446263m;
        qm2.k kVar = this.f446257d;
        kVar.f446267f.set(false);
        kVar.f446265d = new qm2.f(!z17 ? 1 : 0, z17 ? this.f446261h : 0, f17, f18, z17, z18, i17);
        kVar.f446266e = java.lang.System.currentTimeMillis();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(kVar.f446266e));
        java.util.Iterator it = ((java.util.ArrayList) kVar.f446268g).iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        if (kVar.f446265d.f446248a == 0) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            ml2.k3[] k3VarArr = ml2.k3.f409181d;
            zy2.zb.j5(zbVar, 26L, java.lang.String.valueOf(1), null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
