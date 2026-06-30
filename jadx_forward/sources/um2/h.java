package um2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f510348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(um2.x5 x5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f510349e = x5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new um2.h(this.f510349e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f510348d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            um2.x5 x5Var = this.f510349e;
            long j17 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410516m;
            java.lang.String str = ((mm2.e1) x5Var.c(mm2.e1.class)).f410525v;
            long m75942xfb822ef2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            java.lang.String str2 = ((mm2.e1) x5Var.c(mm2.e1.class)).f410517n;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
            this.f510348d = 1;
            obj = ((b92.d1) zbVar).Bi(j17, str, m75942xfb822ef2, str2, activityC0065xcd7aa112, this);
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
