package rv0;

/* loaded from: classes5.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f481561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481561d = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.h1(this.f481561d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078> list = this.f481561d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 : list) {
            arrayList.add(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(qg.a.Filepath, abstractC15633xee433078.f219963e, abstractC15633xee433078.mo63659xfb85f7b0() == 2 ? qg.c.Video : qg.c.Image));
        }
        return com.p314xaae8f345.p457x3304c6.p479x4179489f.C4137x9218c45b.d(arrayList);
    }
}
