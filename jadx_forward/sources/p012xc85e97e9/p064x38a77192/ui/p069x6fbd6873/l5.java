package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f92169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405 f92170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1066x9f035405 c1066x9f035405, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f92170e = c1066x9f035405;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l5(this.f92170e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.l5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f92169d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92170e.f92029d;
            this.f92169d = 1;
            java.lang.Object b17 = c1059xa8272988.f91996l1.b(this);
            if (b17 != aVar) {
                b17 = f0Var;
            }
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
