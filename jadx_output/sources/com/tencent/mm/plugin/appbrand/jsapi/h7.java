package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class h7 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f81275a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f81276b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f81277c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f81278d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.g7 f81279e;

    public h7(com.tencent.mm.plugin.appbrand.jsapi.g7 g7Var) {
        this.f81279e = g7Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.jsapi.g7 g7Var;
        this.f81277c = true;
        this.f81276b = z17;
        if (!this.f81278d || (g7Var = this.f81279e) == null) {
            return;
        }
        g7Var.a(this.f81275a, z17);
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.g7 g7Var;
        this.f81275a = z17;
        this.f81278d = true;
        if (!this.f81277c || (g7Var = this.f81279e) == null) {
            return;
        }
        g7Var.a(z17, this.f81276b);
    }
}
