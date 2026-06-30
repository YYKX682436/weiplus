package ku4;

/* loaded from: classes7.dex */
public final class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394060a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f394061b;

    public p(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f394060a = str;
        this.f394061b = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.m6
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 record, java.lang.String filePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchBizPrefetchPkg(appId:");
        java.lang.String str = this.f394060a;
        sb6.append(str);
        sb6.append("), onSuccess(path:");
        sb6.append(filePath);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", sb6.toString());
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(filePath);
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f394061b;
        if (!j17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasStorageLogic", "fetchBizPrefetchPkg download success. appId=" + str);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
