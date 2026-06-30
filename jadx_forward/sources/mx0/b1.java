package mx0;

/* loaded from: classes5.dex */
public final class b1 implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f413376a;

    public b1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f413376a = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.j0
    public final void a(com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5 c3981x30b9dbd5, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f413376a;
        if (c4093x6b88526b == null && c3981x30b9dbd5 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c3981x30b9dbd5));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExportingVideoForMaterialImport: mjError ");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaterialImportHelper", sb6.toString());
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
    }
}
