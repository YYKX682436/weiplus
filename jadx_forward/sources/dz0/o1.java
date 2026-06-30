package dz0;

/* loaded from: classes5.dex */
public final class o1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326491d;

    public o1(com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b) {
        this.f326491d = c11015x5b190a3b;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        dz0.k kVar = this.f326491d.f151318f;
        if (kVar != null) {
            java.lang.Float f17 = new java.lang.Float(floatValue);
            if (!(!java.lang.Float.isNaN(f17.floatValue()))) {
                f17 = null;
            }
            kVar.A(f17 != null ? f17.floatValue() : 0.0f);
        }
        return jz5.f0.f384359a;
    }
}
