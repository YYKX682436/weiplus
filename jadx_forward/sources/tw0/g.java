package tw0;

/* loaded from: classes4.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f503966d;

    public g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f503966d = interfaceC29045xdcb5ca57;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecommendTitleService", "on cdn callback  mediaId = %s, startRet = %d, sceneResult %s", objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on cdn callback  progressInfo = ");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f69499x10a0fed7) : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecommendTitleService", sb6.toString());
        if (!(str == null || str.length() == 0) && i17 == 0 && hVar != null) {
            java.lang.String field_fileUrl = hVar.f69524x419c440e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
            if ((field_fileUrl.length() > 0) && hVar.f69553xb5f54fe9 == 0) {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                this.f503966d.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(hVar.f69524x419c440e));
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
