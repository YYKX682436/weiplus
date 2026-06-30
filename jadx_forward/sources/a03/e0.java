package a03;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f81948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f81949g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.o f81950h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81951i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f81952m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context, android.view.ViewGroup viewGroup, a03.h0 h0Var, p012xc85e97e9.p093xedfae76a.o oVar, java.lang.String str, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81947e = context;
        this.f81948f = viewGroup;
        this.f81949g = h0Var;
        this.f81950h = oVar;
        this.f81951i = str;
        this.f81952m = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a03.e0(this.f81947e, this.f81948f, this.f81949g, this.f81950h, this.f81951i, this.f81952m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81946d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p40.a aVar2 = new p40.a(this.f81947e, this.f81948f);
            a03.h0 h0Var = this.f81949g;
            p012xc85e97e9.p093xedfae76a.o oVar = this.f81950h;
            java.lang.String str = this.f81951i;
            yz5.a aVar3 = this.f81952m;
            this.f81946d = 1;
            if (a03.h0.aj(h0Var, aVar2, oVar, str, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
