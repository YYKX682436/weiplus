package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class w7 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f83714a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f83715b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f83716c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f83717d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.v7 f83718e;

    public w7(com.tencent.mm.plugin.appbrand.jsapi.v7 v7Var) {
        this.f83718e = v7Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.plugin.appbrand.jsapi.v7 v7Var;
        this.f83716c = true;
        this.f83715b = z17;
        if (!this.f83717d || (v7Var = this.f83718e) == null) {
            return;
        }
        v7Var.a(this.f83714a, z17);
    }
}
