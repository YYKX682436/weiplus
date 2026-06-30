package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f183971a;

    /* renamed from: b, reason: collision with root package name */
    public long f183972b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f183973c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183974d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f183975e;

    /* renamed from: f, reason: collision with root package name */
    public int f183976f;

    /* renamed from: g, reason: collision with root package name */
    public int f183977g;

    /* renamed from: h, reason: collision with root package name */
    public in5.s0 f183978h;

    /* renamed from: i, reason: collision with root package name */
    public so2.j5 f183979i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f183980j;

    public p0(boolean z17, long j17, java.lang.String str, java.lang.String mediaId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f183971a = z17;
        this.f183972b = j17;
        this.f183973c = str;
        this.f183974d = mediaId;
        this.f183975e = c14989xf862ae88;
        this.f183976f = i17;
        this.f183977g = i18;
        this.f183978h = s0Var;
        this.f183979i = j5Var;
        this.f183980j = new java.util.LinkedList();
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var, boolean z17, long j17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var, int i19, java.lang.Object obj) {
        boolean z18 = (i19 & 1) != 0 ? p0Var.f183971a : z17;
        long j18 = (i19 & 2) != 0 ? p0Var.f183972b : j17;
        java.lang.String str3 = (i19 & 4) != 0 ? p0Var.f183973c : str;
        java.lang.String mediaId = (i19 & 8) != 0 ? p0Var.f183974d : str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = (i19 & 16) != 0 ? p0Var.f183975e : c14989xf862ae88;
        int i27 = (i19 & 32) != 0 ? p0Var.f183976f : i17;
        int i28 = (i19 & 64) != 0 ? p0Var.f183977g : i18;
        in5.s0 s0Var2 = (i19 & 128) != 0 ? p0Var.f183978h : s0Var;
        so2.j5 j5Var2 = (i19 & 256) != 0 ? p0Var.f183979i : j5Var;
        p0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0(z18, j18, str3, mediaId, c14989xf862ae882, i27, i28, s0Var2, j5Var2);
    }

    /* renamed from: equals */
    public boolean m55533xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0) obj;
        return this.f183971a == p0Var.f183971a && this.f183972b == p0Var.f183972b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183973c, p0Var.f183973c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183974d, p0Var.f183974d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183975e, p0Var.f183975e) && this.f183976f == p0Var.f183976f && this.f183977g == p0Var.f183977g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183978h, p0Var.f183978h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f183979i, p0Var.f183979i);
    }

    /* renamed from: hashCode */
    public int m55534x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f183971a) * 31) + java.lang.Long.hashCode(this.f183972b)) * 31;
        java.lang.String str = this.f183973c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f183974d.hashCode()) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f183975e;
        int hashCode3 = (((((hashCode2 + (c14989xf862ae88 == null ? 0 : c14989xf862ae88.hashCode())) * 31) + java.lang.Integer.hashCode(this.f183976f)) * 31) + java.lang.Integer.hashCode(this.f183977g)) * 31;
        in5.s0 s0Var = this.f183978h;
        int hashCode4 = (hashCode3 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        so2.j5 j5Var = this.f183979i;
        return hashCode4 + (j5Var != null ? j5Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m55535x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isValid=");
        sb6.append(this.f183971a);
        sb6.append(" feedType=");
        sb6.append(this.f183976f);
        sb6.append(" feedPosition=");
        sb6.append(this.f183977g);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(this.f183972b));
        sb6.append(" mediaId=");
        sb6.append(this.f183974d);
        sb6.append(" holder=");
        sb6.append(this.f183978h != null);
        sb6.append(" centerList=");
        sb6.append(this.f183980j.size());
        sb6.append(" feed=");
        sb6.append(this.f183975e == null);
        return sb6.toString();
    }

    public /* synthetic */ p0(boolean z17, long j17, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? true : z17, (i19 & 2) != 0 ? 0L : j17, (i19 & 4) != 0 ? null : str, (i19 & 8) != 0 ? "" : str2, (i19 & 16) != 0 ? null : c14989xf862ae88, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) == 0 ? i18 : 0, (i19 & 128) != 0 ? null : s0Var, (i19 & 256) == 0 ? j5Var : null);
    }
}
