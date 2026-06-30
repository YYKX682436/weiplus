package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class y9 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 f288797d;

    public y9(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8) {
        this.f288797d = activityC22325x8baa24f8;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8 activityC22325x8baa24f8 = this.f288797d;
        if (hVar == null || hVar.f69553xb5f54fe9 != 0) {
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactUI", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                int i18 = hVar.f69553xb5f54fe9;
                int i19 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.f288069m2;
                activityC22325x8baa24f8.L7(i18, "cdn ret error", "");
                return 0;
            }
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SelectContactUI", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            int i27 = com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22325x8baa24f8.f288069m2;
            activityC22325x8baa24f8.L7(0, "cdn start error", "");
            return 0;
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.oa oaVar = (com.p314xaae8f345.mm.ui.p2690x38b72420.oa) activityC22325x8baa24f8.f288080j2.get(str);
        if (oaVar == null || !oaVar.f288601b) {
            activityC22325x8baa24f8.J1 = hVar;
            activityC22325x8baa24f8.G1 = false;
        } else {
            activityC22325x8baa24f8.N1 = hVar;
            activityC22325x8baa24f8.K1 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactUI", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, java.lang.Integer.valueOf(i17), gVar, hVar, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(oaVar.f288600a)));
        activityC22325x8baa24f8.K7();
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f82120f;
        if (a18 > j17) {
            a17.f82115a.f141905s = a18 - j17;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
