package zo1;

/* loaded from: classes5.dex */
public final class e5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f556129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f556130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e f556131g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f556132h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f556133i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12873xf94c39e activityC12873xf94c39e, int i18, long j17) {
        super(0);
        this.f556128d = u3Var;
        this.f556129e = i17;
        this.f556130f = gVar;
        this.f556131g = activityC12873xf94c39e;
        this.f556132h = i18;
        this.f556133i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar;
        this.f556128d.hide();
        if (this.f556129e == 0 && (gVar = this.f556130f) != null) {
            zo1.k4 k4Var = this.f556131g.f174402h;
            k4Var.getClass();
            java.util.Iterator it = k4Var.f556207e.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == gVar.f297362d) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                k4Var.f556207e.set(i17, gVar);
                k4Var.m8147xed6e4d18(i17);
            }
            if ((this.f556132h & 1) == 0) {
                ((ku5.t0) ku5.t0.f394148d).q(new zo1.c5(this.f556133i));
            } else {
                ku5.u0 u0Var = ku5.t0.f394148d;
                zo1.d5 d5Var = new zo1.d5(this.f556133i, this.f556132h, this.f556130f);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.t(d5Var, 3000L, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
