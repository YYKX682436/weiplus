package sc1;

/* loaded from: classes7.dex */
public class h1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e f487212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487213b;

    public h1(sc1.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e, java.lang.String str) {
        this.f487212a = c12151x47b5a23e;
        this.f487213b = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c0
    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1094x32b0ec.C12151x47b5a23e c12151x47b5a23e = this.f487212a;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, load background image fail");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("url", this.f487213b);
            c12151x47b5a23e.d(jc1.g.f380474m, 10005, "load filter image fail", hashMap);
            return;
        }
        java.lang.String a17 = kk.w.a(str, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUpdateLivePusher", "convertFilterImageToLocalPath, targetPath:%s", a17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15515x140e67ac, a17);
        c12151x47b5a23e.g(bundle);
    }
}
