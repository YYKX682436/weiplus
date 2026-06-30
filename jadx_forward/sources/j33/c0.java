package j33;

/* loaded from: classes10.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final j33.w f378952d;

    /* renamed from: e, reason: collision with root package name */
    public final long f378953e;

    /* renamed from: f, reason: collision with root package name */
    public final long f378954f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f378955g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f378956h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f378957i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f378958m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378959n;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca c15673xa51c39ca, j33.w wVar, long j17, long j18, yz5.a aVar, yz5.a aVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        wVar = (i17 & 2) != 0 ? null : wVar;
        j17 = (i17 & 4) != 0 ? 100L : j17;
        j18 = (i17 & 8) != 0 ? 100L : j18;
        aVar = (i17 & 16) != 0 ? null : aVar;
        aVar2 = (i17 & 32) != 0 ? null : aVar2;
        this.f378952d = wVar;
        this.f378953e = j17;
        this.f378954f = j18;
        this.f378955g = aVar;
        this.f378956h = aVar2;
        this.f378957i = new java.lang.ref.WeakReference(c15673xa51c39ca);
        this.f378958m = "MicroMsg.AlbumScrollBarUIC.ScrollbarAnimChangeVisibilityTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        j33.z zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca c15673xa51c39ca = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca) this.f378957i.get();
        java.lang.String str = this.f378958m;
        if (c15673xa51c39ca == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "scrollBarView null");
            return;
        }
        k33.d m63725x30e2fb29 = c15673xa51c39ca.m63725x30e2fb29();
        if (c15673xa51c39ca.getVisibility() == 0) {
            com.p314xaae8f345.mm.ui.q2 f220205e = m63725x30e2fb29.getF220205e();
            com.p314xaae8f345.mm.ui.q2 q2Var = com.p314xaae8f345.mm.ui.q2.NORMAL;
            if (f220205e == q2Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "normal fade start");
                this.f378959n = true;
                yz5.a aVar = this.f378955g;
                if (aVar != null) {
                    aVar.mo152xb9724478();
                }
                sa5.d.d(c15673xa51c39ca, 0, this.f378954f, new j33.y(this), 1, null);
                return;
            }
            j33.w wVar = this.f378952d;
            if (wVar != null) {
                float translationY = c15673xa51c39ca.getTranslationY();
                zVar = new j33.z(c15673xa51c39ca, translationY, wVar.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) m63725x30e2fb29).c(wVar.b(), q2Var)) - translationY);
            } else {
                zVar = null;
            }
            this.f378959n = true;
            yz5.a aVar2 = this.f378955g;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            j33.b0 b0Var = new j33.b0(this, c15673xa51c39ca);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "focus to normal anim start");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) m63725x30e2fb29).b(q2Var, this.f378953e, zVar, b0Var);
        }
    }
}
