package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86875g;

    public m4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        this.f86875g = i3Var;
        this.f86872d = str;
        this.f86873e = jSONObject;
        this.f86874f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f86875g.z(this.f86872d, com.tencent.mm.plugin.appbrand.page.wd.REDIRECT_TO, this.f86873e, this.f86874f);
    }
}
