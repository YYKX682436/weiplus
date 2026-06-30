package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes2.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f203814a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f203815b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f203816c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f203817d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vx0 f203818e;

    /* renamed from: f, reason: collision with root package name */
    public final nr2.m f203819f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f203820g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f203821h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f203822i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f203823j;

    public d2(long j17, java.lang.String str, java.lang.String nonceId, boolean z17, r45.vx0 vx0Var, nr2.m mVar, java.lang.String authorUsername, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorUsername, "authorUsername");
        this.f203814a = j17;
        this.f203815b = str;
        this.f203816c = nonceId;
        this.f203817d = z17;
        this.f203818e = vx0Var;
        this.f203819f = mVar;
        this.f203820g = authorUsername;
        this.f203821h = str2;
    }

    /* renamed from: equals */
    public boolean m58563xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d2 d2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.d2) obj;
        return this.f203814a == d2Var.f203814a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203815b, d2Var.f203815b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203816c, d2Var.f203816c) && this.f203817d == d2Var.f203817d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203818e, d2Var.f203818e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203819f, d2Var.f203819f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203820g, d2Var.f203820g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f203821h, d2Var.f203821h);
    }

    /* renamed from: hashCode */
    public int m58564x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f203814a) * 31;
        java.lang.String str = this.f203815b;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f203816c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f203817d)) * 31;
        r45.vx0 vx0Var = this.f203818e;
        int hashCode3 = (hashCode2 + (vx0Var == null ? 0 : vx0Var.hashCode())) * 31;
        nr2.m mVar = this.f203819f;
        int hashCode4 = (((hashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.f203820g.hashCode()) * 31;
        java.lang.String str2 = this.f203821h;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m58565x9616526c() {
        return "FinderPlayListInitParam(feedId=" + this.f203814a + ", dupFlag=" + this.f203815b + ", nonceId=" + this.f203816c + ", isSelfFeed=" + this.f203817d + ", collectionInfo=" + this.f203818e + ", paidCollectionData=" + this.f203819f + ", authorUsername=" + this.f203820g + ", encryptedTopicId=" + this.f203821h + ')';
    }

    public /* synthetic */ d2(long j17, java.lang.String str, java.lang.String str2, boolean z17, r45.vx0 vx0Var, nr2.m mVar, java.lang.String str3, java.lang.String str4, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, str, str2, z17, vx0Var, mVar, str3, (i17 & 128) != 0 ? null : str4);
    }
}
