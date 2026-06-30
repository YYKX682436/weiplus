package l83;

/* loaded from: classes14.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public tl.w f398637a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f398638b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f398640d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f398641e = true;

    /* renamed from: f, reason: collision with root package name */
    public final tl.v f398642f = new l83.e(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f398639c = false;

    public static void a(l83.h hVar) {
        hVar.getClass();
        tl.w wVar = new tl.w(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.Y1, 1, 6);
        hVar.f398637a = wVar;
        wVar.g(20);
        hVar.f398637a.j(true);
        hVar.f398637a.f(true);
        tl.w wVar2 = hVar.f398637a;
        wVar2.f501693m = -19;
        wVar2.h(1, false);
        hVar.f398637a.i(true);
        tl.w wVar3 = hVar.f398637a;
        wVar3.f501705y = hVar.f398642f;
        if (wVar3.k()) {
            hVar.f398637a.n(hVar.f398640d);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallRecorder", "start record failed");
        if (hVar.f398637a.f501681a != 13) {
            m83.d Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Zi();
            if (Zi.F == 0) {
                Zi.F = 1;
            }
        }
    }

    public void b(boolean z17) {
        tl.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRecorder", "setMute: %b", java.lang.Boolean.valueOf(z17));
        if (this.f398639c && (wVar = this.f398637a) != null) {
            wVar.n(z17);
        }
        this.f398640d = z17;
    }
}
