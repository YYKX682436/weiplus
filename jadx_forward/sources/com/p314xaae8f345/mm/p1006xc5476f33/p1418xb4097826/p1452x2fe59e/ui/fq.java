package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class fq implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f191566d;

    public fq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        this.f191566d = activityC14125xe2977688;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId:");
        sb6.append(str);
        sb6.append(" startRet:");
        sb6.append(i17);
        sb6.append(" sceneResult:");
        sb6.append(hVar);
        sb6.append(" finishedLength:");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.f69496x83ec3dd) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", sb6.toString());
        int i18 = hVar != null ? hVar.f69553xb5f54fe9 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f191566d;
        if ((i17 != 0 && i17 != -21005) || i18 != 0) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.dq(i17, i18, activityC14125xe2977688));
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688.f191161p;
            activityC14125xe2977688.getClass();
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jq(activityC14125xe2977688));
            return 0;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(activityC14125xe2977688.f191169n, str) && hVar != null) {
            java.lang.String str2 = hVar.f69524x419c440e;
            if (str2 == null) {
                str2 = "";
            }
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.eq(str2, activityC14125xe2977688));
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.jq(activityC14125xe2977688));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
