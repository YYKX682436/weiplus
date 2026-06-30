package gm3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f355068a;

    /* renamed from: b, reason: collision with root package name */
    public long f355069b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f355070c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f355071d;

    /* renamed from: e, reason: collision with root package name */
    public int f355072e;

    /* renamed from: f, reason: collision with root package name */
    public int f355073f;

    public a(long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        j18 = (i19 & 2) != 0 ? 0L : j18;
        str = (i19 & 4) != 0 ? null : str;
        abstractC15633xee433078 = (i19 & 8) != 0 ? null : abstractC15633xee433078;
        i17 = (i19 & 16) != 0 ? 0 : i17;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        this.f355068a = j17;
        this.f355069b = j18;
        this.f355070c = str;
        this.f355071d = abstractC15633xee433078;
        this.f355072e = i17;
        this.f355073f = i18;
    }

    /* renamed from: equals */
    public boolean m131871xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm3.a)) {
            return false;
        }
        gm3.a aVar = (gm3.a) obj;
        return this.f355068a == aVar.f355068a && this.f355069b == aVar.f355069b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355070c, aVar.f355070c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355071d, aVar.f355071d) && this.f355072e == aVar.f355072e && this.f355073f == aVar.f355073f;
    }

    /* renamed from: hashCode */
    public int m131872x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f355068a) * 31) + java.lang.Long.hashCode(this.f355069b)) * 31;
        java.lang.String str = this.f355070c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f355071d;
        return ((((hashCode2 + (abstractC15633xee433078 != null ? abstractC15633xee433078.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f355072e)) * 31) + java.lang.Integer.hashCode(this.f355073f);
    }

    /* renamed from: toString */
    public java.lang.String m131873x9616526c() {
        return "AlbumItem(origId=" + this.f355068a + ", modifyDate=" + this.f355069b + ", thumbPath=" + this.f355070c + ", mediaItem=" + this.f355071d + ", width=" + this.f355072e + ", height=" + this.f355073f + ')';
    }
}
