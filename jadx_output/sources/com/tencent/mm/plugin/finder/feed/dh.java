package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class dh implements db2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f106567a;

    public dh(yz5.p pVar) {
        this.f106567a = pVar;
    }

    @Override // db2.z0
    public void a(int i17, int i18, java.lang.String str, r45.v71 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        yz5.p pVar = this.f106567a;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("FinderLiveForMiniAppLauncher", "request full list failed: errType=" + i17 + ", errCode=" + i18);
            pVar.invoke(java.lang.Boolean.FALSE, null);
            return;
        }
        r45.j32 j32Var = (r45.j32) resp.getCustom(4);
        if (j32Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveForMiniAppLauncher", "request full list failed: listInfo is null");
            pVar.invoke(java.lang.Boolean.FALSE, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveForMiniAppLauncher", "request full list success: count=" + j32Var.getList(0).size() + ", totalNotice=" + j32Var.getInteger(2));
        pVar.invoke(java.lang.Boolean.TRUE, j32Var);
    }
}
