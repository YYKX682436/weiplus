package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f83226a = new jt0.j(100);

    public static final com.tencent.mm.plugin.appbrand.jsapi.share.q2 a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.share.q2 q2Var;
        if (str == null || str.length() == 0) {
            return null;
        }
        kk.j jVar = f83226a;
        synchronized (jVar) {
            q2Var = (com.tencent.mm.plugin.appbrand.jsapi.share.q2) ((lt0.f) jVar).get(str);
        }
        return q2Var;
    }

    public static final void b(java.lang.String shareActionId, com.tencent.mm.plugin.appbrand.jsapi.share.q2 details) {
        kotlin.jvm.internal.o.g(shareActionId, "shareActionId");
        kotlin.jvm.internal.o.g(details, "details");
        kk.j jVar = f83226a;
        synchronized (jVar) {
        }
    }
}
