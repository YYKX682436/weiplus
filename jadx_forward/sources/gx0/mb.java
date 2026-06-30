package gx0;

/* loaded from: classes5.dex */
public final class mb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358250d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358251e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f358252f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358253g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(java.util.List list, gx0.ac acVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358252f = list;
        this.f358253g = acVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gx0.mb mbVar = new gx0.mb(this.f358252f, this.f358253g, interfaceC29045xdcb5ca57);
        mbVar.f358251e = obj;
        return mbVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.mb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358250d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f358251e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = this.f358252f.iterator();
            while (it.hasNext()) {
                arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new gx0.lb(this.f358253g, (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) it.next(), null), 3, null));
            }
            this.f358250d = 1;
            obj = p3325xe03a0797.p3326xc267989b.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
