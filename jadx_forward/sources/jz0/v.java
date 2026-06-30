package jz0;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.a0 f384159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b, az0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f384158d = c11022x6fd7187b;
        this.f384159e = a0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz0.v vVar = new jz0.v(this.f384158d, this.f384159e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b = this.f384158d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c11022x6fd7187b.f151351d, "performCreation onCompletion");
        this.f384159e.f96842a.m33244xd852eb7a(c11022x6fd7187b.f151362r);
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b2 = this.f384158d;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.Q6(c11022x6fd7187b2, null, null, false, c11022x6fd7187b2.f151365u, 7, null);
        return jz5.f0.f384359a;
    }
}
