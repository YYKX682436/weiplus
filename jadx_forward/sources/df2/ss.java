package df2;

/* loaded from: classes3.dex */
public final class ss extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.h f312904f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss(df2.lt ltVar, dk2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312903e = ltVar;
        this.f312904f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ss(this.f312903e, this.f312904f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ss) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312902d;
        df2.lt ltVar = this.f312903e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            df2.qs qsVar = new df2.qs(this.f312904f, ltVar, null);
            this.f312902d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, qsVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String str = df2.lt.W;
        ltVar.z7();
        android.view.ViewGroup viewGroup = ltVar.f312237J;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            pl2.s sVar = ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438217g;
            if (sVar != null) {
                sVar.i(true, new df2.rs(ltVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
