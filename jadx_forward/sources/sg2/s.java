package sg2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ir1 f489468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f489469f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.ir1 ir1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489468e = ir1Var;
        this.f489469f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg2.s(this.f489468e, this.f489469f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f489467d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            r45.ir1 ir1Var = this.f489468e;
            sb6.append(ir1Var.m75939xb282bd08(0));
            sb6.append("-gesture_icon_url");
            java.lang.String sb7 = sb6.toString();
            java.lang.String m75945x2fec8307 = ir1Var.m75945x2fec8307(2);
            this.f489467d = 1;
            obj = sg2.x.a(sb7, m75945x2fec8307, this.f489469f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
