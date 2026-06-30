package kk2;

/* loaded from: classes3.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f390023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk2.p f390024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, kk2.p pVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f390023d = hVar;
        this.f390024e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kk2.h(this.f390023d, interfaceC29045xdcb5ca57, this.f390024e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kk2.h hVar = (kk2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.es2 es2Var = (r45.es2) ((xg2.i) this.f390023d).f535926b;
        kk2.p pVar = this.f390024e;
        pVar.f390044p = es2Var;
        pVar.f390045q = java.lang.System.currentTimeMillis();
        java.util.LinkedList m75941xfb821914 = es2Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContainer_list(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((r45.fa2) obj2).f455659e == 14) {
                break;
            }
        }
        r45.fa2 fa2Var = (r45.fa2) obj2;
        if (fa2Var != null) {
            pVar.f390047s = fa2Var;
            if (pVar.q()) {
                pVar.D(fa2Var);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#requestFinderLiveCloseNav good size=");
        java.util.LinkedList m75941xfb8219142 = es2Var.m75941xfb821914(1);
        sb6.append(m75941xfb8219142 != null ? new java.lang.Integer(m75941xfb8219142.size()) : null);
        sb6.append(" isShowing: ");
        sb6.append(pVar.q());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareGuidePanel", sb6.toString());
        return jz5.f0.f384359a;
    }
}
