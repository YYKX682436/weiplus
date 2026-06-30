package gx0;

/* loaded from: classes5.dex */
public final class w6 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f358640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f358641e = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.w6(this.f358641e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((gx0.w6) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358640d;
        gx0.w8 w8Var = this.f358641e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf V6 = w8Var.V6();
            this.f358640d = 1;
            if (gx0.bf.d7(V6, null, null, false, this, 7, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        gx0.bf V62 = w8Var.V6();
        this.f358640d = 2;
        if (gx0.bf.d7(V62, null, null, false, this, 7, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
