package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class lz {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f216630a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f216631b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f216632c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f216633d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Long f216634e;

    public lz(java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, java.lang.Long l17) {
        this.f216630a = str;
        this.f216631b = str2;
        this.f216632c = z17;
        this.f216633d = str3;
        this.f216634e = l17;
    }

    /* renamed from: equals */
    public boolean m63180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216630a, lzVar.f216630a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216631b, lzVar.f216631b) && this.f216632c == lzVar.f216632c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216633d, lzVar.f216633d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216634e, lzVar.f216634e);
    }

    /* renamed from: hashCode */
    public int m63181x8cdac1b() {
        java.lang.String str = this.f216630a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f216631b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f216632c)) * 31;
        java.lang.String str3 = this.f216633d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Long l17 = this.f216634e;
        return hashCode3 + (l17 != null ? l17.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m63182x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AuthorItem(nickname=");
        sb6.append(this.f216630a);
        sb6.append(", username.length=");
        java.lang.String str = this.f216633d;
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        sb6.append(", showDot=");
        sb6.append(this.f216632c);
        sb6.append(", avatarUrl.length=");
        java.lang.String str2 = this.f216631b;
        sb6.append(str2 != null ? java.lang.Integer.valueOf(str2.length()) : null);
        sb6.append(", unreadObjectId=");
        sb6.append(this.f216634e);
        sb6.append(')');
        return sb6.toString();
    }
}
