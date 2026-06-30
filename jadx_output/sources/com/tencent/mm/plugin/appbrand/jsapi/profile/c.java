package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f82782e;

    public c(com.tencent.mm.plugin.appbrand.jsapi.l lVar, android.content.Intent intent) {
        this.f82781d = lVar;
        this.f82782e = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j45.l.j(this.f82781d.getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", this.f82782e, null);
    }
}
