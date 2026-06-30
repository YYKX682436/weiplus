package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f205403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f205404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f205405c;

    /* renamed from: d, reason: collision with root package name */
    public long f205406d;

    /* renamed from: e, reason: collision with root package name */
    public long f205407e;

    /* renamed from: f, reason: collision with root package name */
    public long f205408f;

    /* renamed from: g, reason: collision with root package name */
    public long f205409g;

    /* renamed from: h, reason: collision with root package name */
    public long f205410h;

    /* renamed from: i, reason: collision with root package name */
    public long f205411i;

    /* renamed from: j, reason: collision with root package name */
    public int f205412j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Integer f205413k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Integer f205414l;

    /* renamed from: m, reason: collision with root package name */
    public int f205415m;

    /* renamed from: n, reason: collision with root package name */
    public final long f205416n;

    /* renamed from: o, reason: collision with root package name */
    public long f205417o;

    public k2(int i17, int i18, int i19, long j17, long j18, long j19, long j27, long j28, long j29, int i27, java.lang.Integer num, java.lang.Integer num2, int i28, long j37, long j38, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j39 = (i29 & 8) != 0 ? 0L : j17;
        long j47 = (i29 & 16) != 0 ? 0L : j18;
        long j48 = (i29 & 32) != 0 ? 0L : j19;
        long j49 = (i29 & 64) != 0 ? 0L : j27;
        long j57 = (i29 & 128) != 0 ? 0L : j28;
        long j58 = (i29 & 256) != 0 ? 0L : j29;
        int i37 = (i29 & 512) != 0 ? 0 : i27;
        java.lang.Integer num3 = (i29 & 1024) != 0 ? null : num;
        java.lang.Integer num4 = (i29 & 2048) != 0 ? null : num2;
        int i38 = (i29 & 4096) != 0 ? 0 : i28;
        long c17 = (i29 & 8192) != 0 ? c01.id.c() : j37;
        long j59 = (i29 & 16384) != 0 ? 0L : j38;
        this.f205403a = i17;
        this.f205404b = i18;
        this.f205405c = i19;
        this.f205406d = j39;
        this.f205407e = j47;
        this.f205408f = j48;
        this.f205409g = j49;
        this.f205410h = j57;
        this.f205411i = j58;
        this.f205412j = i37;
        this.f205413k = num3;
        this.f205414l = num4;
        this.f205415m = i38;
        this.f205416n = c17;
        this.f205417o = j59;
    }

    /* renamed from: equals */
    public boolean m58724xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.k2) obj;
        return this.f205403a == k2Var.f205403a && this.f205404b == k2Var.f205404b && this.f205405c == k2Var.f205405c && this.f205406d == k2Var.f205406d && this.f205407e == k2Var.f205407e && this.f205408f == k2Var.f205408f && this.f205409g == k2Var.f205409g && this.f205410h == k2Var.f205410h && this.f205411i == k2Var.f205411i && this.f205412j == k2Var.f205412j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f205413k, k2Var.f205413k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f205414l, k2Var.f205414l) && this.f205415m == k2Var.f205415m && this.f205416n == k2Var.f205416n && this.f205417o == k2Var.f205417o;
    }

    /* renamed from: hashCode */
    public int m58725x8cdac1b() {
        int hashCode = ((((((((((((((((((java.lang.Integer.hashCode(this.f205403a) * 31) + java.lang.Integer.hashCode(this.f205404b)) * 31) + java.lang.Integer.hashCode(this.f205405c)) * 31) + java.lang.Long.hashCode(this.f205406d)) * 31) + java.lang.Long.hashCode(this.f205407e)) * 31) + java.lang.Long.hashCode(this.f205408f)) * 31) + java.lang.Long.hashCode(this.f205409g)) * 31) + java.lang.Long.hashCode(this.f205410h)) * 31) + java.lang.Long.hashCode(this.f205411i)) * 31) + java.lang.Integer.hashCode(this.f205412j)) * 31;
        java.lang.Integer num = this.f205413k;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f205414l;
        return ((((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f205415m)) * 31) + java.lang.Long.hashCode(this.f205416n)) * 31) + java.lang.Long.hashCode(this.f205417o);
    }

    /* renamed from: toString */
    public java.lang.String m58726x9616526c() {
        return "CgiReportInfo(cgiId=" + this.f205403a + ", bizType=" + this.f205404b + ", tabType=" + this.f205405c + ", totCost=" + this.f205406d + ", connCost=" + this.f205407e + ", startPacketCost=" + this.f205408f + ", tlsCost=" + this.f205409g + ", readPacketCost=" + this.f205410h + ", decodePacketCost=" + this.f205411i + ", finished=" + this.f205412j + ", reqSize=" + this.f205413k + ", respSize=" + this.f205414l + ", ret=" + this.f205415m + ", beginTimeStamp=" + this.f205416n + ", finishTimeStamp=" + this.f205417o + ')';
    }
}
