package re2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final re2.g f475950a;

    /* renamed from: b, reason: collision with root package name */
    public final int f475951b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f475952c;

    public h(re2.g stage, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
        this.f475950a = stage;
        this.f475951b = i17;
        this.f475952c = str;
    }

    /* renamed from: equals */
    public boolean m162222xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re2.h)) {
            return false;
        }
        re2.h hVar = (re2.h) obj;
        return this.f475950a == hVar.f475950a && this.f475951b == hVar.f475951b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f475952c, hVar.f475952c);
    }

    /* renamed from: hashCode */
    public int m162223x8cdac1b() {
        int hashCode = ((this.f475950a.hashCode() * 31) + java.lang.Integer.hashCode(this.f475951b)) * 31;
        java.lang.String str = this.f475952c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m162224x9616526c() {
        return "Failure(stage=" + this.f475950a + ", errCode=" + this.f475951b + ", errMsg=" + this.f475952c + ')';
    }
}
