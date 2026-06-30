package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class r0 implements com.tencent.mm.plugin.appbrand.ui.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f89970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f89971b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.vb f89972c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f89973d;

    public r0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.r rVar, r45.vb vbVar) {
        this.f89973d = appBrandAuthorizeUI;
        this.f89970a = preference;
        this.f89971b = rVar;
        this.f89972c = vbVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.y0
    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.W6(this.f89973d, z17, true, this.f89970a, this.f89971b, this.f89972c);
    }
}
