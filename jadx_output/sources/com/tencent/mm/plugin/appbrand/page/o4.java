package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class o4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86951g;

    public o4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        this.f86951g = i3Var;
        this.f86948d = str;
        this.f86949e = jSONObject;
        this.f86950f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f86951g.z(this.f86948d, com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB, this.f86949e, this.f86950f);
    }
}
