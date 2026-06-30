package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c;

/* loaded from: classes10.dex */
public final class t implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 f191428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f191429b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084, so2.y0 y0Var) {
        this.f191428a = activityC14126xa5cf9084;
        this.f191429b = y0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        so2.y0 y0Var = this.f191429b;
        java.lang.Long valueOf = java.lang.Long.valueOf(y0Var.mo2128x1ed62e84());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(y0Var.f492236d.Y0());
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1463x2ff5de5c.ActivityC14126xa5cf9084 activityC14126xa5cf9084 = this.f191428a;
        activityC14126xa5cf9084.getClass();
        if (valueOf != null && valueOf2 != null) {
            android.content.Intent intent = activityC14126xa5cf9084.E;
            intent.putExtra("lastSentCommentIdKey", valueOf.longValue());
            intent.putExtra("lastSentCommentRootIdKey", valueOf2.longValue());
        }
        activityC14126xa5cf9084.e7();
    }
}
