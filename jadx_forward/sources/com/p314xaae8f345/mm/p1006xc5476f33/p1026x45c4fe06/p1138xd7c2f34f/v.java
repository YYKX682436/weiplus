package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166770a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f166772c;

    /* renamed from: d, reason: collision with root package name */
    public final int f166773d;

    /* renamed from: e, reason: collision with root package name */
    public final long f166774e;

    /* renamed from: f, reason: collision with root package name */
    public final wu5.c f166775f;

    public v(java.lang.String instanceId, java.lang.String userName, int i17, int i18, long j17, wu5.c futureResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(futureResult, "futureResult");
        this.f166770a = instanceId;
        this.f166771b = userName;
        this.f166772c = i17;
        this.f166773d = i18;
        this.f166774e = j17;
        this.f166775f = futureResult;
    }

    /* renamed from: equals */
    public boolean m51838xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166770a, vVar.f166770a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166771b, vVar.f166771b) && this.f166772c == vVar.f166772c && this.f166773d == vVar.f166773d && this.f166774e == vVar.f166774e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166775f, vVar.f166775f);
    }

    /* renamed from: hashCode */
    public int m51839x8cdac1b() {
        return (((((((((this.f166770a.hashCode() * 31) + this.f166771b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f166772c)) * 31) + java.lang.Integer.hashCode(this.f166773d)) * 31) + java.lang.Long.hashCode(this.f166774e)) * 31) + this.f166775f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51840x9616526c() {
        return "AppBrandCgiPrefetchTask(instanceId=" + this.f166770a + ", userName=" + this.f166771b + ", versionType=" + this.f166772c + ", prefetchType=" + this.f166773d + ", ts=" + this.f166774e + ", futureResult=" + this.f166775f + ')';
    }
}
