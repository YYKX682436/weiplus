package f40;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340990d;

    /* renamed from: e, reason: collision with root package name */
    public int f340991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f340992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.Collection collection, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340992f = collection;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f40.s(this.f340992f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f40.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.Object obj2;
        java.lang.Object obj3 = pz5.a.f440719d;
        int i17 = this.f340991e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            it = this.f340992f.iterator();
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f340990d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        do {
            boolean hasNext = it.hasNext();
            obj2 = jz5.f0.f384359a;
            if (!hasNext) {
                return obj2;
            }
            java.lang.String str = (java.lang.String) it.next();
            w65.n nVar = (w65.n) i95.n0.c(w65.n.class);
            this.f340990d = it;
            this.f340991e = 1;
            ((lm.r) nVar).getClass();
            java.lang.Object T6 = hm.u.f363710h.a().T6(f40.x.class, str, this);
            if (T6 == pz5.a.f440719d) {
                obj2 = T6;
            }
        } while (obj2 != obj3);
        return obj3;
    }
}
