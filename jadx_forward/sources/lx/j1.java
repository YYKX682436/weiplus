package lx;

/* loaded from: classes8.dex */
public final class j1 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i11.e f403346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403347e;

    public j1(i11.e eVar, yz5.l lVar) {
        this.f403346d = eVar;
        this.f403347e = lVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        yz5.l lVar = this.f403347e;
        if (!z17) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return false;
        }
        long d27 = ((i11.h) this.f403346d).d();
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.biz.C23184x5f38fda5(java.lang.Double.valueOf(f18), java.lang.Double.valueOf(f17), null, d27 > 0 ? java.lang.Double.valueOf(d27 / 1000.0d) : null, 4, null))));
        return false;
    }
}
