package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class l6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166286a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166287b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166288c;

    public l6(int i17, java.lang.String str, java.lang.String str2) {
        this.f166286a = i17;
        this.f166287b = str;
        this.f166288c = str2;
    }

    /* renamed from: equals */
    public boolean m51745xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6 l6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l6) obj;
        return this.f166286a == l6Var.f166286a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166287b, l6Var.f166287b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166288c, l6Var.f166288c);
    }

    /* renamed from: hashCode */
    public int m51746x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f166286a) * 31;
        java.lang.String str = this.f166287b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f166288c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m51747x9616526c() {
        return "PreDownloadStat(scene=" + this.f166286a + ", preDownloadRequestUsername=" + this.f166287b + ", preDownloadRequestAppId=" + this.f166288c + ')';
    }
}
