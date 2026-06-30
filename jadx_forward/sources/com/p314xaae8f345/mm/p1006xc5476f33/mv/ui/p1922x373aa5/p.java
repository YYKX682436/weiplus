package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233449d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 f233451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f233451f = c16682xd79fb962;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p(this.f233451f, interfaceC29045xdcb5ca57);
        pVar.f233450e = obj;
        return pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f233449d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f233450e;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962 = this.f233451f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16682xd79fb962.f233130d, y0Var.hashCode() + " setTrackInfo launch");
            kp4.a aVar2 = c16682xd79fb962.f233132f;
            if (aVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16682xd79fb962.f233130d, y0Var.hashCode() + " setTrackInfo init thumb fetcher");
                rm5.k kVar = c16682xd79fb962.f233143t;
                if (kVar != null) {
                    kVar.mo122875x5cd39ffa();
                }
                rm5.k a17 = c16682xd79fb962.f233144u.a(aVar2, c16682xd79fb962.f233145v);
                c16682xd79fb962.f233143t = a17;
                if (a17 != null) {
                    a17.mo122876x76500f83(aVar2.f392604a, aVar2.f392605b);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(y0Var.hashCode());
                sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
                java.util.LinkedList linkedList = aVar2.f392610g;
                sb6.append(linkedList.size());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = c16682xd79fb962.f233130d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                rm5.k kVar2 = c16682xd79fb962.f233143t;
                if (kVar2 != null) {
                    kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.m(c16682xd79fb962));
                }
                rm5.k kVar3 = c16682xd79fb962.f233143t;
                if (kVar3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new java.lang.Long(((kp4.m) it.next()).f392657a));
                    }
                    kVar3.a(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.n(c16682xd79fb962, aVar2));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, y0Var.hashCode() + " setTrackInfo request layout");
                if (!c16682xd79fb962.isInLayout() || aVar2.f392611h) {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o(c16682xd79fb962, null);
                    this.f233449d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, oVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
