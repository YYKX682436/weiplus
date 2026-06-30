package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class t9 implements com.tencent.mm.plugin.appbrand.launching.a7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.y50 f85163a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85164b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f85165c;

    public t9(r45.y50 cgiCommRequestSource, java.lang.String str) {
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f85163a = cgiCommRequestSource;
        this.f85164b = str;
        this.f85165c = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a7
    public void a(com.tencent.mm.plugin.appbrand.launching.z6 request, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        java.lang.String str2 = this.f85164b;
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                e56.a.a(str2, str);
            }
        }
        this.f85165c.put(request, new jz5.l(onSuccess, onError));
    }

    public final void b() {
        com.tencent.mm.plugin.appbrand.launching.x5 x5Var = com.tencent.mm.plugin.appbrand.launching.x5.f85410a;
        java.util.Enumeration keys = this.f85165c.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        kotlin.jvm.internal.o.f(list, "list(...)");
        x5Var.e(list, new com.tencent.mm.plugin.appbrand.launching.r9(this), new com.tencent.mm.plugin.appbrand.launching.s9(this), 0, this.f85163a, this.f85164b);
    }
}
