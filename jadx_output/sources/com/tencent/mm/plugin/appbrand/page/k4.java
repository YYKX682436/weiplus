package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f86826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86827f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f86828g;

    public k4(com.tencent.mm.plugin.appbrand.page.i3 i3Var, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        this.f86828g = i3Var;
        this.f86825d = str;
        this.f86826e = jSONObject;
        this.f86827f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f86828g.z(this.f86825d, com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_TO, this.f86826e, this.f86827f);
    }
}
