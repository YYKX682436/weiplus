package je2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f380788d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f380789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.pq1 f380790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ je2.t f380791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r45.pq1 pq1Var, je2.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f380790f = pq1Var;
        this.f380791g = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        je2.r rVar = new je2.r(this.f380790f, this.f380791g, interfaceC29045xdcb5ca57);
        rVar.f380789e = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((je2.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f380788d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f380789e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList linkedList = this.f380790f.f464837f;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new je2.q((r45.kv1) it6.next(), null), 3, null));
                }
            }
            it = arrayList.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f380789e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            p3325xe03a0797.p3326xc267989b.f1 f1Var = (p3325xe03a0797.p3326xc267989b.f1) it.next();
            this.f380789e = it;
            this.f380788d = 1;
            if (f1Var.k(this) == aVar) {
                return aVar;
            }
        }
        this.f380791g.Q6();
        return jz5.f0.f384359a;
    }
}
