package vt3;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521548a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f521549b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f521550c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Long f521551d;

    public n(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.Long l18) {
        this.f521548a = str;
        this.f521549b = l17;
        this.f521550c = str2;
        this.f521551d = l18;
    }

    /* renamed from: equals */
    public boolean m172617xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt3.n)) {
            return false;
        }
        vt3.n nVar = (vt3.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521548a, nVar.f521548a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521549b, nVar.f521549b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521550c, nVar.f521550c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521551d, nVar.f521551d);
    }

    /* renamed from: hashCode */
    public int m172618x8cdac1b() {
        java.lang.String str = this.f521548a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l17 = this.f521549b;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.String str2 = this.f521550c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l18 = this.f521551d;
        return hashCode3 + (l18 != null ? l18.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m172619x9616526c() {
        return "FollowContext(followTemplateId=" + this.f521548a + ", followEventId=" + this.f521549b + ", followSongId=" + this.f521550c + ", sourceFeedId=" + this.f521551d + ')';
    }

    public /* synthetic */ n(java.lang.String str, java.lang.Long l17, java.lang.String str2, java.lang.Long l18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, l17, str2, (i17 & 8) != 0 ? null : l18);
    }
}
