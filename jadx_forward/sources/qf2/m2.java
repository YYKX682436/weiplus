package qf2;

/* loaded from: classes.dex */
public final class m2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f444013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f444014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444013e = c3Var;
        this.f444014f = u4Var;
        this.f444015g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.m2(this.f444013e, this.f444014f, this.f444015g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.m2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444012d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qf2.c3 c3Var = this.f444013e;
            java.lang.String str = this.f444014f.f315687a;
            if (str == null) {
                str = "";
            }
            qf2.l2 l2Var = new qf2.l2(this.f444015g);
            this.f444012d = 1;
            if (qf2.c3.h7(c3Var, 3, str, false, l2Var, this, 4, null) == aVar) {
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
