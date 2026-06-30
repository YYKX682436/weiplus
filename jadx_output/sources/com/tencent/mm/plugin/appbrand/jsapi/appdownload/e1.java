package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class e1 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f78951a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f78952b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f78953c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f78954d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 f78955e;

    public e1(com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 d1Var) {
        this.f78955e = d1Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 d1Var;
        this.f78953c = true;
        this.f78952b = z17;
        if (!this.f78954d || (d1Var = this.f78955e) == null) {
            return;
        }
        d1Var.a(this.f78951a, z17);
    }

    public void b(boolean z17) {
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 d1Var;
        this.f78951a = z17;
        this.f78954d = true;
        if (!this.f78953c || (d1Var = this.f78955e) == null) {
            return;
        }
        d1Var.a(z17, this.f78952b);
    }
}
