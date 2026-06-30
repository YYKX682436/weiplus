package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class p implements rv.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f79996a;

    public p(com.tencent.mm.ipcinvoker.r rVar) {
        this.f79996a = rVar;
    }

    @Override // rv.f3
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f79996a.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet(true, str, str2, str3, l17, str4, str5, str6));
    }

    @Override // rv.f3
    public void b(boolean z17) {
    }

    @Override // rv.f3
    public void onCancel() {
        this.f79996a.a(new com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiHandleBrandPersonalCenterAction$IPCEditTextCoverTaskRet(false, null, null, null, null, null, null, null));
    }
}
