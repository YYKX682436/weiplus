package kp4;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 f392655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392655e = c18806xf42dd2e6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kp4.l lVar = new kp4.l(this.f392655e, interfaceC29045xdcb5ca57);
        lVar.f392654d = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        kp4.l lVar = (kp4.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f392654d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditFrameListView", y0Var.hashCode() + " setTrackInfo launch");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = this.f392655e;
        kp4.c1 c1Var = c18806xf42dd2e6.f257515e;
        if (c1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditFrameListView", y0Var.hashCode() + " setTrackInfo init thumb fetcher");
            rm5.k kVar = c18806xf42dd2e6.f257529v;
            if (kVar != null) {
                kVar.mo122875x5cd39ffa();
            }
            rm5.h a17 = rm5.h.f479022h.a(c1Var.f392630n.f257160l);
            c18806xf42dd2e6.f257529v = a17;
            a17.mo122876x76500f83(c1Var.f392604a, c1Var.f392605b);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(y0Var.hashCode());
            sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
            java.util.LinkedList linkedList = c1Var.f392610g;
            sb6.append(linkedList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditFrameListView", sb6.toString());
            rm5.k kVar2 = c18806xf42dd2e6.f257529v;
            if (kVar2 != null) {
                kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new kp4.j(c18806xf42dd2e6));
            }
            rm5.k kVar3 = c18806xf42dd2e6.f257529v;
            if (kVar3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((kp4.m) it.next()).f392657a));
                }
                kVar3.a(arrayList, new kp4.k(c18806xf42dd2e6, c1Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
