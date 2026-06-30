package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class q2 implements fl1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.w2 f79692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km5.b f79693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79694d;

    public q2(int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var, km5.b bVar, com.tencent.mm.plugin.appbrand.y yVar) {
        this.f79691a = i17;
        this.f79692b = w2Var;
        this.f79693c = bVar;
        this.f79694d = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [kz5.p0] */
    public static final r45.i24 b(com.tencent.mm.plugin.appbrand.y yVar, java.util.ArrayList arrayList, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var) {
        r45.i24 i24Var = new r45.i24();
        i24Var.f376680d = yVar.getAppId();
        java.util.LinkedList linkedList = i24Var.f376681e;
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList == null) {
            arrayList2 = kz5.p0.f313996d;
        }
        linkedList.addAll(arrayList2);
        i24Var.f376684h = i17;
        i24Var.f376685i = yVar.t3().f74805p.f77281g;
        r45.nd7 nd7Var = new r45.nd7();
        w2Var.c(nd7Var, yVar);
        i24Var.f376686m = nd7Var;
        return i24Var;
    }

    @Override // fl1.f
    public void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.JsApiLoginLU", "dialog onRecvMsg, resultCode[" + i17 + "], callbackId[" + this.f79691a + ']');
        com.tencent.mm.plugin.appbrand.y yVar = this.f79694d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.r rVar = com.tencent.mm.plugin.appbrand.jsapi.auth.r.f79700a;
        km5.b m17 = this.f79693c;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w2 w2Var = this.f79692b;
        if (i17 == 1) {
            kotlin.jvm.internal.o.f(m17, "$m");
            int i18 = com.tencent.mm.plugin.appbrand.jsapi.auth.w.f79764q0;
            km5.d q17 = rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login-confirm", b(yVar, arrayList, i17, w2Var), r45.j24.class).q(com.tencent.mm.plugin.appbrand.jsapi.auth.p2.f79681a);
            kotlin.jvm.internal.o.f(q17, "$logic(...)");
            w2Var.i(m17, q17);
            return;
        }
        if (i17 != 2) {
            m17.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.p("fail:auth canceled"));
            return;
        }
        m17.a(new com.tencent.mm.plugin.appbrand.jsapi.auth.p("fail:auth denied"));
        int i19 = com.tencent.mm.plugin.appbrand.jsapi.auth.w.f79764q0;
        rVar.b(yVar, "/cgi-bin/mmbiz-bin/js-login-confirm", b(yVar, arrayList, i17, w2Var), r45.j24.class);
    }
}
