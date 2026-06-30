package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    public final long f275376a;

    /* renamed from: b, reason: collision with root package name */
    public final int f275377b;

    /* renamed from: c, reason: collision with root package name */
    public final int f275378c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f275379d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f275380e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f275381f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f275382g;

    public da(long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
        this.f275376a = j17;
        this.f275377b = i17;
        this.f275378c = i18;
        this.f275379d = str;
        this.f275380e = str2;
        this.f275381f = str3;
        this.f275382g = num;
    }

    /* renamed from: equals */
    public boolean m77977xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.da)) {
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.da daVar = (com.p314xaae8f345.mm.p2621x8fb0427b.da) obj;
        return this.f275376a == daVar.f275376a && this.f275377b == daVar.f275377b && this.f275378c == daVar.f275378c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f275379d, daVar.f275379d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f275380e, daVar.f275380e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f275381f, daVar.f275381f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f275382g, daVar.f275382g);
    }

    /* renamed from: hashCode */
    public int m77978x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f275376a) * 31) + java.lang.Integer.hashCode(this.f275377b)) * 31) + java.lang.Integer.hashCode(this.f275378c)) * 31;
        java.lang.String str = this.f275379d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f275380e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f275381f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num = this.f275382g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m77979x9616526c() {
        return "RecMsgReportInfo(mid=" + this.f275376a + ", idx=" + this.f275377b + ", style=" + this.f275378c + ", recInfo=" + this.f275379d + ", extData=" + this.f275380e + ", bizUsername=" + this.f275381f + ", bizUin=" + this.f275382g + ')';
    }
}
