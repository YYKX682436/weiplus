package com.tencent.luggage.sdk.jsapi.component.webaudio;

/* loaded from: classes7.dex */
public class m implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.f0 f47585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper f47586e;

    public m(com.tencent.luggage.sdk.jsapi.component.webaudio.WxAudioNativeInstallHelper wxAudioNativeInstallHelper, com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var) {
        this.f47586e = wxAudioNativeInstallHelper;
        this.f47585d = f0Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (this.f47586e.wxAudioNative == null) {
            return;
        }
        u81.b bVar2 = u81.b.SUSPEND;
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = this.f47585d;
        if (bVar2 == bVar) {
            f0Var.k(new com.tencent.luggage.sdk.jsapi.component.webaudio.k(this), true);
        } else if (u81.b.FOREGROUND == bVar) {
            f0Var.k(new com.tencent.luggage.sdk.jsapi.component.webaudio.l(this), true);
        }
    }
}
