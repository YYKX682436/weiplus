package ju3;

/* loaded from: classes10.dex */
public final class u implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 f383553d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1) {
        this.f383553d = c17013x966ea0d1;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.os.Bundle bundle;
        jz5.l lVar = (jz5.l) obj;
        int ordinal = ((bs0.g) lVar.f384366d).ordinal();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1 c17013x966ea0d1 = this.f383553d;
        if (ordinal == 4) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new ju3.t(lVar, c17013x966ea0d1, null), interfaceC29045xdcb5ca57);
        }
        if (ordinal == 6 && (bundle = (android.os.Bundle) lVar.f384367e) != null) {
            int i17 = bundle.getInt("camera_int_1", 0);
            int i18 = bundle.getInt("camera_int_2", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "First_FRAME >> previewWidth: " + i17 + ", previewHeight: " + i18);
            c17013x966ea0d1.f237347p = true;
            ju3.y yVar = c17013x966ea0d1.f237342h;
            if (yVar != null) {
                yVar.b(new android.util.Size(i17, i18));
            }
        }
        return jz5.f0.f384359a;
    }
}
