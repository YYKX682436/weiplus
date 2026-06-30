package ku3;

/* loaded from: classes10.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f393937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 f393938e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(jz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1997x34289e27.C17028xc20c4c47 c17028xc20c4c47, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393937d = lVar;
        this.f393938e = c17028xc20c4c47;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.s0(this.f393937d, this.f393938e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f393937d.f384367e;
        if (bundle == null) {
            return null;
        }
        float f17 = bundle.getFloat("camera_float_1");
        ku3.s sVar = this.f393938e.I;
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitIndicatorPlugin", "updateCurrentIndicator >> " + f17);
        sVar.f393936z = ((float) a06.d.b(f17 * 10.0f)) / 10.0f;
        if (sVar.b().getVisibility() == 0) {
            if (sVar.c().getVisibility() == 0) {
                java.lang.Object mo141623x754a37bb = ((jz5.n) sVar.f393921h).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                ((android.widget.TextView) mo141623x754a37bb).setText(sVar.e());
            } else if (sVar.d().getVisibility() == 0) {
                sVar.o();
            }
        }
        return jz5.f0.f384359a;
    }
}
