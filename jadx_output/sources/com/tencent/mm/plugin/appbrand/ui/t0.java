package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vb f90216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f90218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f90219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90220h;

    public t0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, r45.vb vbVar, java.lang.String str, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.r rVar) {
        this.f90220h = appBrandAuthorizeUI;
        this.f90216d = vbVar;
        this.f90217e = str;
        this.f90218f = preference;
        this.f90219g = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f90216d.f388060f = 2;
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(this.f90217e);
        com.tencent.mm.plugin.appbrand.ui.s0 s0Var = new com.tencent.mm.plugin.appbrand.ui.s0(this);
        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
        this.f90220h.l7(arrayList, s0Var);
    }
}
