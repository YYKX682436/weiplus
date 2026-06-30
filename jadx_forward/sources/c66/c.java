package c66;

/* loaded from: classes2.dex */
public final class c extends qz5.l implements yz5.p {
    public c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new c66.c(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        c66.c cVar = new c66.c((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            c66.q.f121026a.d().m107088x90df30e9(ni0.d.f418743g.le(c01.id.e()));
        } catch (java.lang.Exception unused) {
            c66.q qVar = c66.q.f121026a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.WCFinderWCDB", "cleanExpiredLocalBackupCache fail");
        }
        return jz5.f0.f384359a;
    }
}
