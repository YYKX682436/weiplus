package g4;

/* loaded from: classes5.dex */
public final class i4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f349908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.j4 f349909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u26.w f349910f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(g4.j4 j4Var, u26.w wVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f349909e = j4Var;
        this.f349910f = wVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new g4.i4(this.f349909e, this.f349910f, completion);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.i4) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f349908d;
        u26.w wVar = this.f349910f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                g4.h4 h4Var = new g4.h4(this, null);
                this.f349908d = 1;
                if (p3325xe03a0797.p3326xc267989b.z0.f(h4Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            u26.x0.a(wVar, null, 1, null);
        } catch (java.lang.Throwable th6) {
            wVar.s(th6);
        }
        return jz5.f0.f384359a;
    }
}
