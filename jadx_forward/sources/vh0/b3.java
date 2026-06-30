package vh0;

/* loaded from: classes11.dex */
public final class b3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.h1 f518375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f518377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(vh0.h1 h1Var, vh0.f3 f3Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518375e = h1Var;
        this.f518376f = f3Var;
        this.f518377g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.b3(this.f518375e, this.f518376f, this.f518377g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.b3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518374d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = this.f518375e.ordinal();
            android.content.Context context = this.f518377g;
            vh0.f3 f3Var = this.f518376f;
            if (ordinal == 2) {
                this.f518374d = 1;
                if (vh0.f3.Di(f3Var, context, com.p314xaae8f345.mm.R.C30867xcad56011.n6k, this) == aVar) {
                    return aVar;
                }
            } else if (ordinal == 3) {
                this.f518374d = 2;
                if (vh0.f3.Di(f3Var, context, com.p314xaae8f345.mm.R.C30867xcad56011.n6j, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
