package sm2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f491277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f491278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f491279h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f491280i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491281m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f491282n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491283o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491276e = o4Var;
        this.f491277f = z17;
        this.f491278g = i17;
        this.f491279h = l01Var;
        this.f491280i = z18;
        this.f491281m = str;
        this.f491282n = i18;
        this.f491283o = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sm2.v(this.f491276e, this.f491277f, this.f491278g, this.f491279h, this.f491280i, this.f491281m, this.f491282n, this.f491283o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((sm2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491275d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sm2.o4 o4Var = this.f491276e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "isReadyPluginCountDownOk startCollect");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = ((mm2.c1) o4Var.c(mm2.c1.class)).G5;
            sm2.u uVar = new sm2.u(this.f491276e, this.f491277f, this.f491278g, this.f491279h, this.f491280i, this.f491281m, this.f491282n, this.f491283o);
            this.f491275d = 1;
            if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(uVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
