package qf2;

/* loaded from: classes3.dex */
public final class h2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f443935f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443936g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443934e = c3Var;
        this.f443935f = u4Var;
        this.f443936g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.h2(this.f443934e, this.f443935f, this.f443936g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.h2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443933d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qf2.c3 c3Var = this.f443934e;
            dk2.u4 u4Var = this.f443935f;
            java.lang.String str = u4Var.f315687a;
            if (str == null) {
                str = "";
            }
            qf2.g2 g2Var = new qf2.g2(c3Var, u4Var, this.f443936g);
            this.f443933d = 1;
            if (qf2.c3.h7(c3Var, 5, str, false, g2Var, this, 4, null) == aVar) {
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
