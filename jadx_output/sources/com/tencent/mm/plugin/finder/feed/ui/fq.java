package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class fq implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110033d;

    public fq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        this.f110033d = selectLocalFileRouterUI;
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
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_finishedLength) : null);
        com.tencent.mars.xlog.Log.i("FinderSelectLocalFileUI", sb6.toString());
        int i18 = hVar != null ? hVar.field_retCode : 0;
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f110033d;
        if ((i17 != 0 && i17 != -21005) || i18 != 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.dq(i17, i18, selectLocalFileRouterUI));
            int i19 = com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.f109628p;
            selectLocalFileRouterUI.getClass();
            pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.ui.jq(selectLocalFileRouterUI));
            return 0;
        }
        if (kotlin.jvm.internal.o.b(selectLocalFileRouterUI.f109636n, str) && hVar != null) {
            java.lang.String str2 = hVar.field_fileUrl;
            if (str2 == null) {
                str2 = "";
            }
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.eq(str2, selectLocalFileRouterUI));
            pm0.v.K(null, new com.tencent.mm.plugin.finder.feed.ui.jq(selectLocalFileRouterUI));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
