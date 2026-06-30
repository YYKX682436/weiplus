package a50;

/* loaded from: classes9.dex */
public final class m implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a50.a0 f1507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f1510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i11.e f1511h;

    public m(a50.a0 a0Var, int i17, boolean z17, boolean z18, i11.e eVar) {
        this.f1507d = a0Var;
        this.f1508e = i17;
        this.f1509f = z17;
        this.f1510g = z18;
        this.f1511h = eVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mars.xlog.Log.i("Finder.BoxAffBizCppToNativeManagerImpl", "isOK: " + z17);
        boolean z18 = this.f1510g;
        boolean z19 = this.f1509f;
        int i18 = this.f1508e;
        a50.a0 a0Var = this.f1507d;
        if (!z17) {
            com.tencent.wechat.mm.finder_box.c cVar = a0Var.f1451a;
            if (cVar == null) {
                return false;
            }
            com.tencent.wechat.mm.finder_box.h4 a17 = a50.o.a(z19, z18);
            a17.f219497m = 1;
            a17.f219498n[7] = true;
            cVar.w0(i18, a17);
            return false;
        }
        com.tencent.wechat.mm.finder_box.c cVar2 = a0Var.f1451a;
        if (cVar2 == null) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.h4 a18 = a50.o.a(z19, z18);
        a18.f219492e = f18;
        boolean[] zArr = a18.f219498n;
        zArr[2] = true;
        a18.f219491d = f17;
        zArr[1] = true;
        a18.f219496i = (int) (((i11.h) this.f1511h).d() / 1000);
        zArr[6] = true;
        a18.f219497m = 1;
        zArr[7] = true;
        cVar2.w0(i18, a18);
        return false;
    }
}
