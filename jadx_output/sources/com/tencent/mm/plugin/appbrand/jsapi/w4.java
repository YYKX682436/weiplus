package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f83703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f83704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f83706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x4 f83707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(android.content.Context context, android.content.Intent intent, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.x4 x4Var) {
        super(0);
        this.f83703d = context;
        this.f83704e = intent;
        this.f83705f = e9Var;
        this.f83706g = i17;
        this.f83707h = x4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf.g.a(this.f83703d).j(this.f83704e, new com.tencent.mm.plugin.appbrand.jsapi.v4(this.f83705f, this.f83706g, this.f83707h));
        return jz5.f0.f302826a;
    }
}
