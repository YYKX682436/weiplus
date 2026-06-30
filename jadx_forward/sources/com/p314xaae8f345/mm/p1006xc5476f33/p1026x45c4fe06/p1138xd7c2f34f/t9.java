package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class t9 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.y50 f166696a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166697b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f166698c;

    public t9(r45.y50 cgiCommRequestSource, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f166696a = cgiCommRequestSource;
        this.f166697b = str;
        this.f166698c = new java.util.concurrent.ConcurrentHashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 request, yz5.l onSuccess, yz5.q onError, int i17, r45.y50 cgiCommRequestSource, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        java.lang.String str2 = this.f166697b;
        if (!(str2 == null || str2.length() == 0)) {
            if (!(str == null || str.length() == 0)) {
                e56.a.a(str2, str);
            }
        }
        this.f166698c.put(request, new jz5.l(onSuccess, onError));
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5 x5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a;
        java.util.Enumeration keys = this.f166698c.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        java.util.ArrayList list = java.util.Collections.list(keys);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list(...)");
        x5Var.e(list, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r9(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s9(this), 0, this.f166696a, this.f166697b);
    }
}
