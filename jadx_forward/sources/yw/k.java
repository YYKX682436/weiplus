package yw;

/* loaded from: classes9.dex */
public final class k implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw.y f547901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f547902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f547903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f547904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.e f547905h;

    public k(yw.y yVar, int i17, boolean z17, boolean z18, i11.e eVar) {
        this.f547901d = yVar;
        this.f547902e = i17;
        this.f547903f = z17;
        this.f547904g = z18;
        this.f547905h = eVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffBizCppToNativeManagerImpl", "isOK: " + z17);
        boolean z18 = this.f547904g;
        boolean z19 = this.f547903f;
        int i18 = this.f547902e;
        yw.y yVar = this.f547901d;
        if (!z17) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar = yVar.f548042a;
            if (cVar == null) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 a17 = yw.m.a(z19, z18);
            a17.f300161m = 1;
            a17.f300162n[7] = true;
            cVar.F0(i18, a17);
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.c cVar2 = yVar.f548042a;
        if (cVar2 == null) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.s5 a18 = yw.m.a(z19, z18);
        a18.f300156e = f18;
        boolean[] zArr = a18.f300162n;
        zArr[2] = true;
        a18.f300155d = f17;
        zArr[1] = true;
        a18.f300160i = (int) (((i11.h) this.f547905h).d() / 1000);
        zArr[6] = true;
        a18.f300161m = 1;
        zArr[7] = true;
        cVar2.F0(i18, a18);
        return false;
    }
}
