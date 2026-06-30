package kp4;

/* loaded from: classes10.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392682d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 f392684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392684f = c18807xe5ec60d0;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        kp4.v vVar = new kp4.v(this.f392684f, interfaceC29045xdcb5ca57);
        vVar.f392683e = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp4.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392682d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f392683e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18807xe5ec60d0 c18807xe5ec60d0 = this.f392684f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18807xe5ec60d0.f257534d, y0Var.hashCode() + " setTrackInfo launch");
            kp4.a aVar2 = c18807xe5ec60d0.f257536f;
            if (aVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18807xe5ec60d0.f257534d, y0Var.hashCode() + " setTrackInfo init thumb fetcher");
                rm5.k kVar = c18807xe5ec60d0.f257551x;
                if (kVar != null) {
                    kVar.mo122875x5cd39ffa();
                }
                rm5.k a17 = c18807xe5ec60d0.f257552y.a(aVar2, c18807xe5ec60d0.f257553z);
                c18807xe5ec60d0.f257551x = a17;
                if (a17 != null) {
                    a17.mo122876x76500f83(aVar2.f392604a, aVar2.f392605b);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(y0Var.hashCode());
                sb6.append(" setTrackInfo finish init thumb fetcher, frames.size:");
                java.util.LinkedList linkedList = aVar2.f392610g;
                sb6.append(linkedList.size());
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = c18807xe5ec60d0.f257534d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                rm5.k kVar2 = c18807xe5ec60d0.f257551x;
                if (kVar2 != null) {
                    kVar2.a(kz5.b0.c(new java.lang.Long(0L)), new kp4.s(c18807xe5ec60d0));
                }
                rm5.k kVar3 = c18807xe5ec60d0.f257551x;
                if (kVar3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new java.lang.Long(((kp4.m) it.next()).f392657a));
                    }
                    kVar3.a(arrayList, new kp4.t(c18807xe5ec60d0, aVar2));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, y0Var.hashCode() + " setTrackInfo request layout");
                if (!c18807xe5ec60d0.isInLayout() || aVar2.f392611h) {
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    kp4.u uVar = new kp4.u(c18807xe5ec60d0, null);
                    this.f392682d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, uVar, this) == aVar) {
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
