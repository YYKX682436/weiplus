package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f102438a;

    /* renamed from: b, reason: collision with root package name */
    public long f102439b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f102440c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f102441d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f102442e;

    /* renamed from: f, reason: collision with root package name */
    public int f102443f;

    /* renamed from: g, reason: collision with root package name */
    public int f102444g;

    /* renamed from: h, reason: collision with root package name */
    public in5.s0 f102445h;

    /* renamed from: i, reason: collision with root package name */
    public so2.j5 f102446i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f102447j;

    public p0(boolean z17, long j17, java.lang.String str, java.lang.String mediaId, com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f102438a = z17;
        this.f102439b = j17;
        this.f102440c = str;
        this.f102441d = mediaId;
        this.f102442e = feedData;
        this.f102443f = i17;
        this.f102444g = i18;
        this.f102445h = s0Var;
        this.f102446i = j5Var;
        this.f102447j = new java.util.LinkedList();
    }

    public static com.tencent.mm.plugin.finder.assist.p0 a(com.tencent.mm.plugin.finder.assist.p0 p0Var, boolean z17, long j17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var, int i19, java.lang.Object obj) {
        boolean z18 = (i19 & 1) != 0 ? p0Var.f102438a : z17;
        long j18 = (i19 & 2) != 0 ? p0Var.f102439b : j17;
        java.lang.String str3 = (i19 & 4) != 0 ? p0Var.f102440c : str;
        java.lang.String mediaId = (i19 & 8) != 0 ? p0Var.f102441d : str2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2 = (i19 & 16) != 0 ? p0Var.f102442e : feedData;
        int i27 = (i19 & 32) != 0 ? p0Var.f102443f : i17;
        int i28 = (i19 & 64) != 0 ? p0Var.f102444g : i18;
        in5.s0 s0Var2 = (i19 & 128) != 0 ? p0Var.f102445h : s0Var;
        so2.j5 j5Var2 = (i19 & 256) != 0 ? p0Var.f102446i : j5Var;
        p0Var.getClass();
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        return new com.tencent.mm.plugin.finder.assist.p0(z18, j18, str3, mediaId, feedData2, i27, i28, s0Var2, j5Var2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.p0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.p0 p0Var = (com.tencent.mm.plugin.finder.assist.p0) obj;
        return this.f102438a == p0Var.f102438a && this.f102439b == p0Var.f102439b && kotlin.jvm.internal.o.b(this.f102440c, p0Var.f102440c) && kotlin.jvm.internal.o.b(this.f102441d, p0Var.f102441d) && kotlin.jvm.internal.o.b(this.f102442e, p0Var.f102442e) && this.f102443f == p0Var.f102443f && this.f102444g == p0Var.f102444g && kotlin.jvm.internal.o.b(this.f102445h, p0Var.f102445h) && kotlin.jvm.internal.o.b(this.f102446i, p0Var.f102446i);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f102438a) * 31) + java.lang.Long.hashCode(this.f102439b)) * 31;
        java.lang.String str = this.f102440c;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f102441d.hashCode()) * 31;
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f102442e;
        int hashCode3 = (((((hashCode2 + (feedData == null ? 0 : feedData.hashCode())) * 31) + java.lang.Integer.hashCode(this.f102443f)) * 31) + java.lang.Integer.hashCode(this.f102444g)) * 31;
        in5.s0 s0Var = this.f102445h;
        int hashCode4 = (hashCode3 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        so2.j5 j5Var = this.f102446i;
        return hashCode4 + (j5Var != null ? j5Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isValid=");
        sb6.append(this.f102438a);
        sb6.append(" feedType=");
        sb6.append(this.f102443f);
        sb6.append(" feedPosition=");
        sb6.append(this.f102444g);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(this.f102439b));
        sb6.append(" mediaId=");
        sb6.append(this.f102441d);
        sb6.append(" holder=");
        sb6.append(this.f102445h != null);
        sb6.append(" centerList=");
        sb6.append(this.f102447j.size());
        sb6.append(" feed=");
        sb6.append(this.f102442e == null);
        return sb6.toString();
    }

    public /* synthetic */ p0(boolean z17, long j17, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17, int i18, in5.s0 s0Var, so2.j5 j5Var, int i19, kotlin.jvm.internal.i iVar) {
        this((i19 & 1) != 0 ? true : z17, (i19 & 2) != 0 ? 0L : j17, (i19 & 4) != 0 ? null : str, (i19 & 8) != 0 ? "" : str2, (i19 & 16) != 0 ? null : feedData, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) == 0 ? i18 : 0, (i19 & 128) != 0 ? null : s0Var, (i19 & 256) == 0 ? j5Var : null);
    }
}
