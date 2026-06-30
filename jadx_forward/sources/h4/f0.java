package h4;

/* loaded from: classes14.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360183d;

    /* renamed from: e, reason: collision with root package name */
    public int f360184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.g0 f360185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h4.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360185f = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new h4.f0(this.f360185f, completion);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((h4.f0) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f360184e;
        h4.g0 g0Var = this.f360185f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = g0Var.f360189a;
                this.f360184e = 1;
                if (((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    if (i17 == 2) {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        return jz5.f0.f384359a;
                    }
                    if (i17 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th6 = (java.lang.Throwable) this.f360183d;
                    try {
                        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                        throw th6;
                    } catch (u26.g0 unused) {
                        throw th6;
                    }
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            yz5.p pVar = g0Var.f360192d;
            h4.m mVar = new h4.m(g0Var);
            this.f360184e = 2;
            if (pVar.mo149xb9724478(mVar, this) == aVar) {
                return aVar;
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th7) {
            try {
                yz5.p pVar2 = g0Var.f360192d;
                h4.m mVar2 = new h4.m(g0Var);
                this.f360183d = th7;
                this.f360184e = 3;
                if (pVar2.mo149xb9724478(mVar2, this) == aVar) {
                    return aVar;
                }
            } catch (u26.g0 unused2) {
            }
            throw th7;
        }
    }
}
