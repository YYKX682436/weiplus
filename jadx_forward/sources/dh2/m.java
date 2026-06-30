package dh2;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ boolean f313984d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313985e;

    public m(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(3, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dh2.m mVar = new dh2.m((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3);
        mVar.f313984d = booleanValue;
        mVar.f313985e = (mm2.j6) obj2;
        return mVar.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f313984d;
        mm2.j6 j6Var = (mm2.j6) this.f313985e;
        mm2.i6 i6Var = j6Var instanceof mm2.i6 ? (mm2.i6) j6Var : null;
        return java.lang.Boolean.valueOf(z17 && (i6Var != null ? i6Var.f410676c : true));
    }
}
