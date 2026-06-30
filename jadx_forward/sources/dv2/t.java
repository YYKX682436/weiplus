package dv2;

/* loaded from: classes2.dex */
public final class t extends qz5.l implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f325478d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ boolean f325479e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325480f;

    public t(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(4, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        dv2.t tVar = new dv2.t((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj4);
        tVar.f325478d = booleanValue;
        tVar.f325479e = booleanValue2;
        tVar.f325480f = (dv2.i) obj3;
        return tVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f325478d;
        boolean z18 = this.f325479e;
        dv2.i iVar = (dv2.i) this.f325480f;
        if (!z17 && z18) {
            return iVar;
        }
        return null;
    }
}
