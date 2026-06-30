package lv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f403041a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f403042b;

    /* renamed from: c, reason: collision with root package name */
    public final long f403043c;

    public a(long j17, java.lang.String str, long j18) {
        this.f403041a = j17;
        this.f403042b = str;
        this.f403043c = j18;
    }

    /* renamed from: equals */
    public boolean m146392xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv3.a)) {
            return false;
        }
        lv3.a aVar = (lv3.a) obj;
        return this.f403041a == aVar.f403041a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f403042b, aVar.f403042b) && this.f403043c == aVar.f403043c;
    }

    /* renamed from: hashCode */
    public int m146393x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f403041a) * 31;
        java.lang.String str = this.f403042b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f403043c);
    }

    /* renamed from: toString */
    public java.lang.String m146394x9616526c() {
        return "MusicData(musicId=" + this.f403041a + ", musicUrl=" + this.f403042b + ", duration=" + this.f403043c + ')';
    }

    public /* synthetic */ a(long j17, java.lang.String str, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, str, (i17 & 4) != 0 ? 0L : j18);
    }
}
