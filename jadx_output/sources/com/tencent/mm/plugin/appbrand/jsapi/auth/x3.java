package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.h4 f79781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bf.i f79783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.jv5 f79784g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ui1.z f79785h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var, com.tencent.mm.plugin.appbrand.y yVar, bf.i iVar, r45.jv5 jv5Var, ui1.z zVar) {
        super(1);
        this.f79781d = h4Var;
        this.f79782e = yVar;
        this.f79783f = iVar;
        this.f79784g = jv5Var;
        this.f79785h = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.appbrand.y yVar = this.f79782e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = this.f79781d;
        h4Var.e(h4Var.b(yVar), bitmap, this.f79783f.fi(), this.f79784g.f378131d, this.f79785h);
        return jz5.f0.f302826a;
    }
}
