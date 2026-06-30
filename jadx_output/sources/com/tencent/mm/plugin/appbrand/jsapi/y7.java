package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class y7 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83937b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.z7 f83938c;

    public y7(com.tencent.mm.plugin.appbrand.jsapi.z7 z7Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f83938c = z7Var;
        this.f83936a = e9Var;
        this.f83937b = i17;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        this.f83936a.a(this.f83937b, this.f83938c.o("ok"));
    }
}
