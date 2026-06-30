package px3;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ px3.j f440478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f440479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(px3.j jVar, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440478d = jVar;
        this.f440479e = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px3.h(this.f440478d, this.f440479e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        px3.h hVar = (px3.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (vx3.a aVar2 : mx3.i0.g()) {
            java.lang.String str = aVar2.f522795e;
            java.util.ArrayList arrayList2 = this.f440479e;
            if (!kz5.n0.O(arrayList2, str) || arrayList2.isEmpty()) {
                java.lang.String str2 = aVar2.f522795e;
                if (str2 != null) {
                    t45.i iVar = new t45.i();
                    iVar.f497121d = str2;
                    arrayList.add(new ox3.a(iVar));
                    mx3.i0.k(str2, null);
                    mx3.i0.m(str2, null, 0L, 4, null);
                }
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.f440478d.f440484f).k(new px3.a(arrayList, 4));
        return jz5.f0.f384359a;
    }
}
