package g43;

/* loaded from: classes5.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g43.x f350323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g43.x xVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350323d = xVar;
        this.f350324e = str;
        this.f350325f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g43.v(this.f350323d, this.f350324e, this.f350325f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g43.v vVar = (g43.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        vVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        g43.x xVar = this.f350323d;
        java.util.List Wd = ((y33.h) xVar.f350331h.mo141623x754a37bb()).Wd(this.f350324e, this.f350325f);
        p012xc85e97e9.p093xedfae76a.j0 j0Var = xVar.f350328e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Wd, 10));
        java.util.Iterator it = Wd.iterator();
        while (it.hasNext()) {
            arrayList.add(new w33.c(null, ((y33.g) it.next()).t0(), false, 701, 5, null));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (hashSet.add(((w33.c) next).f524243b.f524248a)) {
                arrayList2.add(next);
            }
        }
        j0Var.mo7808x76db6cb1(arrayList2);
        return jz5.f0.f384359a;
    }
}
