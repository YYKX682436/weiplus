package v62;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v62.i f515051h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v62.p pVar, long j17, v62.o oVar, boolean z17, v62.i iVar) {
        super(j17, oVar, z17);
        this.f515051h = iVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        v62.i iVar = this.f515051h;
        try {
            if (iVar != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5927xcd833740 c5927xcd833740 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5927xcd833740();
                am.nr nrVar = c5927xcd833740.f136231g;
                nrVar.f88981b = iVar.f515044b;
                nrVar.f88982c = iVar.f515045c;
                nrVar.f88980a = iVar.f515043a;
                nrVar.f88983d = new v62.k(this);
                c5927xcd833740.e();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQrCodeHandler", "hy: qrcode data not retrieved");
                c(null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ExtQrCodeHandler", e17, "hy: error when syncTaskScanQrCode", new java.lang.Object[0]);
            c(null);
        }
        return null;
    }
}
