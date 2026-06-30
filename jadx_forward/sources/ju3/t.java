package ju3;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f383548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 f383549e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f383548d = lVar;
        this.f383549e = c17013x966ea0d1;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ju3.t(this.f383548d, this.f383549e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f383548d.f384367e;
        if (bundle == null) {
            return null;
        }
        int i17 = bundle.getInt("camera_int_3", -1);
        float f17 = bundle.getFloat("camera_float_1", 0.0f);
        float f18 = bundle.getFloat("camera_float_2", 0.0f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "CAMERA_OPEN >>  " + i17 + " minZoom: " + f17 + ". maxZoom: " + f18);
        ju3.x xVar = this.f383549e.f237343i;
        if (xVar == null) {
            return null;
        }
        xVar.a(i17, new android.util.Range(new java.lang.Float(f17), new java.lang.Float(f18)));
        return jz5.f0.f384359a;
    }
}
