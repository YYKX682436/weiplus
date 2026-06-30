package qf2;

/* loaded from: classes10.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f443900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.u4 f443902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443903g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(qf2.c3 c3Var, dk2.u4 u4Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f443901e = c3Var;
        this.f443902f = u4Var;
        this.f443903g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.f2(this.f443901e, this.f443902f, this.f443903g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f443900d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            qf2.c3 c3Var = this.f443901e;
            java.lang.String str = this.f443902f.f315687a;
            if (str == null) {
                str = "";
            }
            qf2.e2 e2Var = new qf2.e2(c3Var, this.f443903g);
            this.f443900d = 1;
            if (qf2.c3.h7(c3Var, 4, str, false, e2Var, this, 4, null) == aVar) {
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
