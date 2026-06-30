package j40;

@j95.b
/* loaded from: classes4.dex */
public final class r extends i95.w implements v94.l {
    public java.lang.String wi(byte[] bArr) {
        if (bArr != null) {
            if (!(bArr.length == 0)) {
                try {
                    r45.kv2 kv2Var = new r45.kv2();
                    kv2Var.mo11468x92b714fd(bArr);
                    return ot0.q.u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.h(kv2Var), null, null);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsFinderBackPreviewService", "makeFinderShareAppMsgContent error: " + e17.getMessage());
                    return null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsFinderBackPreviewService", "makeFinderShareAppMsgContent: finderShareObjectBuffer is empty");
        return null;
    }
}
