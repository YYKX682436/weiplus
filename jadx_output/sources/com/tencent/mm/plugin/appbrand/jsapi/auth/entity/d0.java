package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCBoolean f79489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f79492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l f79493h;

    public d0(com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17, java.util.ArrayList arrayList, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar) {
        this.f79489d = iPCBoolean;
        this.f79490e = m0Var;
        this.f79491f = i17;
        this.f79492g = arrayList;
        this.f79493h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = this.f79489d;
        boolean z17 = iPCBoolean != null ? iPCBoolean.f68400d : false;
        int i17 = this.f79491f;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79490e;
        if (z17) {
            m0Var.f79523e.clear();
            m0Var.f79523e.addAll(this.f79492g);
            com.tencent.mars.xlog.Log.i("WxaUserInfoListOperationController", "delete avatar success.index:" + i17 + "  current szie=" + m0Var.f79523e.size());
        } else {
            m0Var.e(m0Var.f79523e);
            com.tencent.mars.xlog.Log.i("WxaUserInfoListOperationController", "delete avatar failed, revert delete item. index:" + i17, java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar = this.f79493h;
        if (lVar != null) {
            lVar.a(z17);
        }
    }
}
