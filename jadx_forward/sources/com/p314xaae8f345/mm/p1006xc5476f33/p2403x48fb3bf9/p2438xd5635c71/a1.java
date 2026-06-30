package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class a1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f269272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d f269273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f269274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269275d;

    public a1(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var, java.lang.String str) {
        this.f269272a = interfaceC29045xdcb5ca57;
        this.f269273b = dVar;
        this.f269274c = f1Var;
        this.f269275d = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void c(int i17, java.lang.String reqUrl, int i18, int i19, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f269272a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.i0(20001, this.f269275d, "getA8Key error:" + i18 + ", " + i19 + ", " + errMsg))));
        this.f269274c.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269295z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void d(int i17, java.lang.String reqUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void e(int i17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void f(int i17, java.lang.String reqUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public boolean g(int i17, java.lang.String reqUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.a
    public void h(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl, java.lang.Object obj) {
        r45.s83 response = (r45.s83) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullUrl, "fullUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1.f269330e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebComponent", "finish geta8key:".concat(fullUrl));
        java.util.LinkedList<r45.rx3> HttpHeader = response.f467095x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HttpHeader, "HttpHeader");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(HttpHeader, 10));
        for (r45.rx3 rx3Var : HttpHeader) {
            arrayList.add(new jz5.l(rx3Var.f466805d, rx3Var.f466806e));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        kz5.c1.r(arrayList, hashMap);
        this.f269272a.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.c(this.f269273b, fullUrl, hashMap)));
        this.f269274c.f269345b.a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.b.f269294y);
    }
}
