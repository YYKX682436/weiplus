package yw3;

/* loaded from: classes5.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f548397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f548398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f548398e = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yw3.r2(this.f548398e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f548397d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f548398e;
            pi0.l1 l1Var = repairerFlutterWeUIDemoUI.e;
            if (l1Var != null) {
                this.f548397d = 1;
                if (l1Var.h(repairerFlutterWeUIDemoUI, this) == aVar) {
                    return aVar;
                }
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
