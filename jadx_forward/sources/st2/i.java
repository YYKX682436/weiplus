package st2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f493892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(st2.h1 h1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f493893e = h1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.i(this.f493893e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((st2.i) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493892d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5 z5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.class);
            st2.h1 h1Var = this.f493893e;
            android.content.Context context = h1Var.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            gk2.e eVar = h1Var.f493868f;
            this.f493892d = 1;
            obj = z5Var.Ni(context, 0L, eVar, 1, true, false, this);
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
