package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class w0 implements com.tencent.mm.plugin.appbrand.ui.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f90284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f90285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.vb f90286c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90287d;

    public w0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.r rVar, r45.vb vbVar) {
        this.f90287d = appBrandAuthorizeUI;
        this.f90284a = preference;
        this.f90285b = rVar;
        this.f90286c = vbVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.y0
    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.W6(this.f90287d, z17, false, this.f90284a, this.f90285b, this.f90286c);
    }
}
