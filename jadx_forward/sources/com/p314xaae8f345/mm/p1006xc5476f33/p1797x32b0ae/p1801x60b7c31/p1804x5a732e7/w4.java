package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes5.dex */
public final class w4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x4 f225352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x4 x4Var) {
        super(1);
        this.f225352d = x4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiPlatformViewTapEvent", "tapEvent ret: " + map);
        jd.c cVar = this.f225352d.f224975e;
        java.util.Map t17 = map != null ? kz5.c1.t(map) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(t17, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        java.util.Map c17 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(t17);
        if (c17 == null) {
            c17 = new java.util.LinkedHashMap();
        }
        cVar.e(c17);
        return jz5.f0.f384359a;
    }
}
