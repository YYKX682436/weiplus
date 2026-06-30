package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.feature.ecs.nirvana.input.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq0.c f65799a;

    public u(iq0.c cVar) {
        this.f65799a = cVar;
    }

    public void a(java.lang.String method, java.util.List list) {
        kotlin.jvm.internal.o.g(method, "method");
        java.lang.String obj = new lc3.a0(kz5.c1.k(new jz5.l(ya.b.METHOD, method), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, list))).toString();
        kotlin.jvm.internal.o.f(obj, "toString(...)");
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        ((nq0.p) tVar).Ui(this.f65799a, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("textInputEvent", obj));
    }
}
