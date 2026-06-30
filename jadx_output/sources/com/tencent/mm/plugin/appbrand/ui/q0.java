package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f89941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.Preference f89942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f89943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.vb f89944g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.r f89945h;

    public q0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z17, com.tencent.mm.ui.base.preference.Preference preference, boolean z18, r45.vb vbVar, com.tencent.mm.ui.base.preference.r rVar) {
        this.f89941d = z17;
        this.f89942e = preference;
        this.f89943f = z18;
        this.f89944g = vbVar;
        this.f89945h = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f89941d;
        com.tencent.mm.ui.base.preference.r rVar = this.f89945h;
        r45.vb vbVar = this.f89944g;
        com.tencent.mm.ui.base.preference.Preference preference = this.f89942e;
        boolean z18 = this.f89943f;
        if (z17) {
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).O(z18);
            vbVar.f388060f = z18 ? 1 : 2;
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        } else {
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).O(!z18);
            vbVar.f388060f = z18 ? 2 : 1;
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}
