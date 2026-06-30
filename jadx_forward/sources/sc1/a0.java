package sc1;

/* loaded from: classes7.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487175b;

    public a0(sc1.x0 x0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e, java.lang.String str) {
        this.f487174a = c12151x47b5a23e;
        this.f487175b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = this.f487174a;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, load background image fail");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", this.f487175b);
            c12151x47b5a23e.d(jc1.g.f380474m, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261, "load background image fail", hashMap);
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInsertLivePusher", "convertBackgroundImageToLocalPath, targetPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15505x57568ce2, a17);
        c12151x47b5a23e.g(bundle);
    }
}
