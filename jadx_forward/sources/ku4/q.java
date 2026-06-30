package ku4;

/* loaded from: classes5.dex */
public final class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f394063b;

    public q(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f394062a = str;
        this.f394063b = interfaceC29045xdcb5ca57;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l6
    public final void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f394062a + "), onError(errCode:" + i17 + ", errMsg:" + str + ')');
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f394063b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }
}
