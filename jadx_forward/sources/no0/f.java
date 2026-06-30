package no0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f420248a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f420249b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f420250c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f420251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f420252e;

    public f(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f420248a = j17;
        this.f420249b = str;
        this.f420250c = str2;
        this.f420251d = str3;
        this.f420252e = i17;
    }

    /* renamed from: equals */
    public boolean m149822xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0.f)) {
            return false;
        }
        no0.f fVar = (no0.f) obj;
        return this.f420248a == fVar.f420248a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420249b, fVar.f420249b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420250c, fVar.f420250c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420251d, fVar.f420251d) && this.f420252e == fVar.f420252e;
    }

    /* renamed from: hashCode */
    public int m149823x8cdac1b() {
        int hashCode = java.lang.Long.hashCode(this.f420248a) * 31;
        java.lang.String str = this.f420249b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f420250c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f420251d;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f420252e);
    }

    /* renamed from: toString */
    public java.lang.String m149824x9616526c() {
        return "CloseLiveMicInfo(liveId=" + this.f420248a + ", audience=" + this.f420249b + ", micId=" + this.f420250c + ", sdkUserId=" + this.f420251d + ", micType=" + this.f420252e + ')';
    }
}
