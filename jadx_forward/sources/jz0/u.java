package jz0;

/* loaded from: classes5.dex */
public final class u extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f384156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b f384157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
        this.f384157e = c11022x6fd7187b;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz0.u uVar = new jz0.u(this.f384157e, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        uVar.f384156d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f384156d;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b c11022x6fd7187b = this.f384157e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(c11022x6fd7187b.f151351d, th6, "creation error", new java.lang.Object[0]);
        c11022x6fd7187b.t("creation error");
        return jz5.f0.f384359a;
    }
}
