package a50;

/* loaded from: classes9.dex */
public final class m implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f83040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f83042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f83043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.e f83044h;

    public m(a50.a0 a0Var, int i17, boolean z17, boolean z18, i11.e eVar) {
        this.f83040d = a0Var;
        this.f83041e = i17;
        this.f83042f = z17;
        this.f83043g = z18;
        this.f83044h = eVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public final boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", "isOK: " + z17);
        boolean z18 = this.f83043g;
        boolean z19 = this.f83042f;
        int i18 = this.f83041e;
        a50.a0 a0Var = this.f83040d;
        if (!z17) {
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar = a0Var.f82984a;
            if (cVar == null) {
                return false;
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h4 a17 = a50.o.a(z19, z18);
            a17.f301030m = 1;
            a17.f301031n[7] = true;
            cVar.w0(i18, a17);
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.c cVar2 = a0Var.f82984a;
        if (cVar2 == null) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.h4 a18 = a50.o.a(z19, z18);
        a18.f301025e = f18;
        boolean[] zArr = a18.f301031n;
        zArr[2] = true;
        a18.f301024d = f17;
        zArr[1] = true;
        a18.f301029i = (int) (((i11.h) this.f83044h).d() / 1000);
        zArr[6] = true;
        a18.f301030m = 1;
        zArr[7] = true;
        cVar2.w0(i18, a18);
        return false;
    }
}
