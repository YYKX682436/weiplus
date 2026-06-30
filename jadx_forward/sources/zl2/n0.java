package zl2;

/* loaded from: classes4.dex */
public final class n0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f555431d;

    public n0(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f555431d = qVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (hVar == null) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUploadUtil", "[uploadVideoFile] upload end, sceneResult = " + hVar);
        int i18 = hVar.f69553xb5f54fe9;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f555431d;
        if (i18 != 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hVar.f69524x419c440e)) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return 0;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(hVar.f69524x419c440e, hVar.f69560x7b284d5e)));
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
