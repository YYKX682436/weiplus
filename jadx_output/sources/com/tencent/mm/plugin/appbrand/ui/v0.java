package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class v0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vb f90265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f90266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f90267f;

    public v0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, r45.vb vbVar, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.r rVar) {
        this.f90265d = vbVar;
        this.f90266e = preference;
        this.f90267f = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f90265d.f388060f = 1;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) this.f90266e).O(true);
        ((com.tencent.mm.ui.base.preference.h0) this.f90267f).notifyDataSetChanged();
    }
}
