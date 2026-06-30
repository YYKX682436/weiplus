package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166085a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166086b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166087c;

    public cb(java.lang.String jsapiName, java.lang.String scope, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapiName, "jsapiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f166085a = jsapiName;
        this.f166086b = scope;
        this.f166087c = i17;
    }

    /* renamed from: equals */
    public boolean m51700xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb cbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cb) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166085a, cbVar.f166085a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166086b, cbVar.f166086b) && this.f166087c == cbVar.f166087c;
    }

    /* renamed from: hashCode */
    public int m51701x8cdac1b() {
        return (((this.f166085a.hashCode() * 31) + this.f166086b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f166087c);
    }

    /* renamed from: toString */
    public java.lang.String m51702x9616526c() {
        return "AuthItem(jsapiName=" + this.f166085a + ", scope=" + this.f166086b + ", authStatus=" + this.f166087c + ')';
    }
}
