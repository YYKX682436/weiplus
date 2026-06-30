package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f147048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f147049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147050f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f147049e = b1Var;
        this.f147050f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.p(this.f147049e, this.f147050f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.p) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f147048d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147049e;
            cv.f1 mj6 = b1Var.mj();
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.o oVar = new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.o(b1Var);
            this.f147048d = 1;
            if (((pn4.z) mj6).bj(this.f147050f, false, oVar, this) == aVar) {
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
