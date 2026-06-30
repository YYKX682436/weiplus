package zf0;

/* loaded from: classes11.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f553912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f553913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553917i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var, zf0.v0 v0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553913e = n2Var;
        this.f553914f = v0Var;
        this.f553915g = str;
        this.f553916h = str2;
        this.f553917i = str3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zf0.b0(this.f553913e, this.f553914f, this.f553915g, this.f553916h, this.f553917i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zf0.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f553912d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = this.f553913e;
            if (n2Var == null) {
                return jz5.f0.f384359a;
            }
            zf0.a0 a0Var = new zf0.a0(this.f553914f, this.f553915g, this.f553916h, this.f553917i);
            this.f553912d = 1;
            if (n2Var.a(a0Var, this) == aVar) {
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
