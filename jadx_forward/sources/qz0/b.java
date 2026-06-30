package qz0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 f449344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.g f449345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 activityC11028x640d33e0, my0.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449344d = activityC11028x640d33e0;
        this.f449345e = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qz0.b(this.f449344d, this.f449345e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qz0.b bVar = (qz0.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        bVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0.f151889e;
        com.p314xaae8f345.mm.p916x4268f0dc.p929x364492.ActivityC11028x640d33e0 activityC11028x640d33e0 = this.f449344d;
        android.widget.TextView T6 = activityC11028x640d33e0.T6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task id ");
        my0.g gVar = this.f449345e;
        sb6.append(gVar.f414195a);
        sb6.append('\n');
        T6.append(sb6.toString());
        activityC11028x640d33e0.T6().append("local path " + gVar.f414196b + '\n');
        return jz5.f0.f384359a;
    }
}
