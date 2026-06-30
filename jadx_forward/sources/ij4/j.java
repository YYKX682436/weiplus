package ij4;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f373265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.e0 f373266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f373267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ej4.e0 e0Var, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373266e = e0Var;
        this.f373267f = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ij4.j(this.f373266e, this.f373267f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ij4.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f373265d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f373265d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new gj4.a(2L, 0L, 50L, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        if (linkedList == null) {
            return null;
        }
        ej4.e0 e0Var = this.f373266e;
        e0Var.getClass();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(fj4.b.a((pj4.n1) it.next()));
        }
        java.util.ArrayList a17 = e0Var.a(linkedList2);
        ej4.d0 d0Var = ej4.e0.f334877c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopicSelfItemHelper", "setTopicHistoryIconTextStatusHistory >> " + linkedList2.size());
        java.util.LinkedList linkedList3 = ej4.e0.f334879e;
        linkedList3.clear();
        linkedList3.addAll(linkedList2);
        return java.lang.Boolean.valueOf(this.f373267f.addAll(a17));
    }
}
