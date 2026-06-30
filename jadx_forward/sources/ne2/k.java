package ne2;

/* loaded from: classes3.dex */
public final class k implements ne2.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f418067a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f418069c;

    /* renamed from: d, reason: collision with root package name */
    public ne2.d f418070d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f418071e;

    /* renamed from: f, reason: collision with root package name */
    public r45.td2 f418072f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q84 f418073g;

    /* renamed from: h, reason: collision with root package name */
    public int f418074h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f418075i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f418076j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f418077k;

    public k(int i17, long j17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i18 = (i27 & 4) != 0 ? 5 : i18;
        i19 = (i27 & 8) != 0 ? 30 : i19;
        this.f418067a = j17;
        this.f418068b = i18;
        this.f418069c = i19;
        this.f418076j = jz5.h.b(new ne2.j(this));
        this.f418077k = jz5.h.b(new ne2.h(this));
    }

    public final void b(r45.td2 td2Var) {
        java.lang.String str;
        if (td2Var == null) {
            str = "FinderLiveUrlOption:NULL!";
        } else {
            str = "FinderLiveUrlOption:[" + td2Var.m75939xb282bd08(1) + ',' + td2Var.m75939xb282bd08(3) + ']';
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeTimeManager", java.lang.String.valueOf(str));
        this.f418072f = td2Var;
    }

    public void c(r45.td2 td2Var) {
        ne2.d dVar;
        this.f418073g = (r45.q84) ((yz5.r) ((jz5.n) this.f418076j).mo141623x754a37bb()).C("startTask", 1, java.lang.Long.valueOf(this.f418067a), td2Var);
        b(td2Var);
        r45.q84 q84Var = this.f418073g;
        int m75939xb282bd08 = q84Var != null ? q84Var.m75939xb282bd08(2) : 0;
        r45.q84 q84Var2 = this.f418073g;
        this.f418074h = m75939xb282bd08 - (q84Var2 != null ? q84Var2.m75939xb282bd08(1) : 0);
        r45.q84 q84Var3 = this.f418073g;
        if (q84Var3 != null && (dVar = this.f418070d) != null) {
            dVar.a(q84Var3);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f418071e;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4("LiveFreeTimeManager" + hashCode(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) ((jz5.n) this.f418077k).mo141623x754a37bb(), true);
        this.f418071e = b4Var2;
        b4Var2.m77789xc5a5549d(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var3 = this.f418071e;
        if (b4Var3 != null) {
            b4Var3.c(1000L, 1000L);
        }
        this.f418075i = true;
    }

    public void d(long j17, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f418071e;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f418075i = false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopTask remote liveId:");
        sb6.append(j17);
        sb6.append(",local liveId:");
        long j18 = this.f418067a;
        sb6.append(j18);
        sb6.append(", updateInfo:");
        sb6.append(z17);
        sb6.append(", taskOver:");
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveFreeTimeManager", sb6.toString());
        if (z17 && j17 == j18) {
            f(z18);
        }
    }

    public boolean e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f418071e;
        return (b4Var == null || b4Var.e()) ? false : true;
    }

    public final void f(boolean z17) {
        if (z17) {
            return;
        }
        be2.c Nj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).Nj();
        long j17 = this.f418067a;
        int i17 = this.f418074h;
        rl2.d dVar = (rl2.d) Nj;
        if (!dVar.f478723f) {
            dVar.z0();
        }
        rl2.c cVar = (rl2.c) dVar.f478724g.get(java.lang.Long.valueOf(j17));
        if (cVar != null) {
            cVar.f478718b = i17;
        }
        zl2.r4.f555483a.M2("FinderLiveChargeInfoStorage", "updateLiveChargeInfo " + dVar.f478724g.get(java.lang.Long.valueOf(j17)));
    }
}
