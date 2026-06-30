package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88989d;

    public a(java.lang.String str) {
        this.f88989d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult getOnLineInfoInfoResult = (com.tencent.mm.plugin.appbrand.config.GetOnLineInfoInfoResult) obj;
        if (getOnLineInfoInfoResult == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.m6.a(this.f88989d).f85723p = getOnLineInfoInfoResult.f77351d;
        com.tencent.mm.plugin.appbrand.m6.a(this.f88989d).f85724q = getOnLineInfoInfoResult.f77352e;
        com.tencent.mm.plugin.appbrand.m6.a(this.f88989d).f85725r = getOnLineInfoInfoResult.f77353f;
        com.tencent.mm.plugin.appbrand.m6.a(this.f88989d).f85726s = getOnLineInfoInfoResult.f77354g;
    }
}
