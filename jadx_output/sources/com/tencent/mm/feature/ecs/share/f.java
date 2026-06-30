package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.ecs.share.f f65983d = new com.tencent.mm.feature.ecs.share.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject put = new org.json.JSONObject().put("element_id", it);
        kotlin.jvm.internal.o.f(put, "put(...)");
        return put;
    }
}
