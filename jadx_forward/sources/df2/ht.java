package df2;

/* loaded from: classes10.dex */
public final class ht extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.iy2 f311885e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht(df2.lt ltVar, r45.iy2 iy2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311884d = ltVar;
        this.f311885e = iy2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ht(this.f311884d, this.f311885e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.ht htVar = (df2.ht) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        htVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862> m75941xfb821914 = this.f311885e.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getJump_infos(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19786x6a1e2862);
            arrayList2.add(new dk2.h(c19786x6a1e2862));
        }
        arrayList.addAll(arrayList2);
        df2.lt ltVar = this.f311884d;
        df2.lt.b7(ltVar, arrayList);
        df2.lt.f7(ltVar, arrayList);
        ym5.a1.f(new df2.gt(ltVar));
        return jz5.f0.f384359a;
    }
}
