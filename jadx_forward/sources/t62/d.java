package t62;

/* loaded from: classes12.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {
    public d(com.p314xaae8f345.mm.p1006xc5476f33.ext.p1398xb4b53790.p1399xc52405f1.C13498x68291483 c13498x68291483, long j17, android.database.MatrixCursor matrixCursor, boolean z17, java.lang.String[] strArr) {
        super(j17, matrixCursor, z17);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        try {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5393x647d0d72 c5393x647d0d72 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5393x647d0d72();
            c5393x647d0d72.f135731g.getClass();
            c5393x647d0d72.f273897d = new t62.c(this, c5393x647d0d72);
            if (c5393x647d0d72.e()) {
                return null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtControlProviderOpenApi", "getWifiList publish getWifiListEvent fail");
            c(v25.a.a(8));
            return null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderOpenApi", "exception in getWifiList syncTaskCur.", e17);
            c(v25.a.a(12));
            return null;
        }
    }
}
