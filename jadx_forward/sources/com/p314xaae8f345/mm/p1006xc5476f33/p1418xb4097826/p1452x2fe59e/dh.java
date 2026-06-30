package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes.dex */
public final class dh implements db2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f188100a;

    public dh(yz5.p pVar) {
        this.f188100a = pVar;
    }

    @Override // db2.z0
    public void a(int i17, int i18, java.lang.String str, r45.v71 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        yz5.p pVar = this.f188100a;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveForMiniAppLauncher", "request full list failed: errType=" + i17 + ", errCode=" + i18);
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
            return;
        }
        r45.j32 j32Var = (r45.j32) resp.m75936x14adae67(4);
        if (j32Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveForMiniAppLauncher", "request full list failed: listInfo is null");
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveForMiniAppLauncher", "request full list success: count=" + j32Var.m75941xfb821914(0).size() + ", totalNotice=" + j32Var.m75939xb282bd08(2));
        pVar.mo149xb9724478(java.lang.Boolean.TRUE, j32Var);
    }
}
