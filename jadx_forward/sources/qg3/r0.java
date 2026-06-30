package qg3;

/* loaded from: classes.dex */
public final class r0 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f444390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444391e;

    public r0(int i17, yz5.l lVar) {
        this.f444390d = i17;
        this.f444391e = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NativeCgiJavaStatic", "fetchRelatedList onCgiBack pullType:" + this.f444390d + ", errType:" + i17 + ", errCode:" + i18);
        yz5.l lVar = this.f444391e;
        if (i17 == 0 && i18 == 0 && (fVar = oVar.f152244b.f152233a) != null) {
            byte[] bArr = null;
            bw5.qg qgVar = fVar instanceof bw5.qg ? (bw5.qg) fVar : null;
            if (qgVar != null) {
                try {
                    bArr = qgVar.mo14344x5f01b1f6();
                } catch (java.lang.Exception e17) {
                    lVar.mo146xb9724478(new byte[0]);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NativeCgiJavaStatic", e17, "fetchChannelFlow toByteArray", new java.lang.Object[0]);
                }
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            lVar.mo146xb9724478(bArr);
        } else {
            lVar.mo146xb9724478(new byte[0]);
        }
        return 0;
    }
}
