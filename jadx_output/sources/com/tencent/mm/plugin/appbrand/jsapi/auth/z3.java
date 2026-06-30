package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class z3 implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f79810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.h4 f79812d;

    public z3(com.tencent.mm.plugin.appbrand.y yVar, kotlin.jvm.internal.f0 f0Var, ui1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var) {
        this.f79809a = yVar;
        this.f79810b = f0Var;
        this.f79811c = zVar;
        this.f79812d = h4Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void a(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m action) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f79810b.f310116d = action.f79518d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void b(java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f79811c.setSelectListItem(items);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public void c(boolean z17, boolean z18, java.lang.String limitWording, java.lang.String avatarWording, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o goAddUserPage) {
        kotlin.jvm.internal.o.g(limitWording, "limitWording");
        kotlin.jvm.internal.o.g(avatarWording, "avatarWording");
        kotlin.jvm.internal.o.g(goAddUserPage, "goAddUserPage");
        ui1.z zVar = this.f79811c;
        if (!z17 && !z18) {
            zVar.setFunctionButtonText(avatarWording);
            zVar.setFunctionButtonTextColor(b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478524a5));
            d(zVar, true, goAddUserPage);
        } else {
            if (z17) {
                zVar.setFunctionButtonText("");
            } else {
                zVar.setFunctionButtonText(limitWording);
                zVar.setFunctionButtonTextColor(b3.l.getColor(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.BW_0_Alpha_0_3));
            }
            d(zVar, false, goAddUserPage);
        }
    }

    public final void d(ui1.z dialog, boolean z17, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.o goAddUserPage) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(goAddUserPage, "goAddUserPage");
        if (z17) {
            dialog.setFunctionButtonOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.y3(this.f79812d, this.f79809a, goAddUserPage));
        } else {
            dialog.setFunctionButtonOnClickListener(null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n
    public java.lang.String getAppId() {
        java.lang.String appId = this.f79809a.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        return appId;
    }
}
