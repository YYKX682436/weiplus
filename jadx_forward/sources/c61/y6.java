package c61;

/* loaded from: classes3.dex */
public final class y6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f120958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f120960g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120961h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(c61.l7 l7Var, android.content.Context context, r45.br2 br2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f120958e = l7Var;
        this.f120959f = context;
        this.f120960g = br2Var;
        this.f120961h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c61.y6(this.f120958e, this.f120959f, this.f120960g, this.f120961h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.y6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f120957d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.l7 l7Var = this.f120958e;
            android.content.Context context = this.f120959f;
            r45.br2 br2Var = this.f120960g;
            java.lang.String str = this.f120961h;
            this.f120957d = 1;
            if (zy2.b6.b9(l7Var, context, br2Var, null, str, false, false, this, 48, null) == aVar) {
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
