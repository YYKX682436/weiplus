package ku3;

/* loaded from: classes10.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f393899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393900e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393899d = lVar;
        this.f393900e = c17028xc20c4c47;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.q0(this.f393899d, this.f393900e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ku3.q0 q0Var = (ku3.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f393899d.f384367e;
        boolean z17 = bundle != null ? bundle.getBoolean("camera_boolean") : false;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47.f237389x1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47 = this.f393900e;
        c17028xc20c4c47.getCameraSwitchPlugin().a(z17);
        nu3.i.f421751a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(z17 ? 1 : 2));
        if (z17) {
            c17028xc20c4c47.I.mo9067x901b6914(4);
        }
        if (c17028xc20c4c47.getKitContext().O6(1)) {
            zt3.a.V6(c17028xc20c4c47.getKitContext(), 1, false, null, !z17, false, 20, null);
        } else {
            zt3.a.V6(c17028xc20c4c47.getKitContext(), 1, false, null, !z17, false, 4, null);
        }
        zt3.a kitContext = c17028xc20c4c47.getKitContext();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putInt("KEY_CAMERA_KIT_CONTEXT_INT", 0);
        kitContext.f557115m.mo7808x76db6cb1(new zt3.b(2, bundle2));
        if (c17028xc20c4c47.getKitContext().N6(10) == 0) {
            zt3.a.U6(c17028xc20c4c47.getKitContext(), 10, 4, null, 4, null);
        }
        c17028xc20c4c47.getKitContext().getClass();
        return jz5.f0.f384359a;
    }
}
