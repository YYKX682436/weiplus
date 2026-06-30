package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes11.dex */
public final class i0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult f82807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.j0 f82808f;

    public i0(java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult, com.tencent.mm.plugin.appbrand.jsapi.profile.j0 j0Var) {
        this.f82806d = str;
        this.f82807e = profileResult;
        this.f82808f = j0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ((c01.k7) c01.n8.a()).f(this.f82806d);
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileResult profileResult = this.f82807e;
        profileResult.f82765d = 2;
        this.f82808f.finishProcess(profileResult);
    }
}
