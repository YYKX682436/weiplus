package sc1;

/* loaded from: classes7.dex */
public class i1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487215a;

    public i1(sc1.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e) {
        this.f487215a = c12151x47b5a23e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, targetPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15532xbc3ed888, a17);
        this.f487215a.g(bundle);
    }
}
