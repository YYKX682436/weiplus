package zh;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f554382a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f554383b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f554384c;

    public h(int i17, java.lang.String reason, java.lang.String subReason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subReason, "subReason");
        this.f554382a = i17;
        this.f554383b = reason;
        this.f554384c = subReason;
    }

    /* renamed from: equals */
    public boolean m178949xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh.h)) {
            return false;
        }
        zh.h hVar = (zh.h) obj;
        return this.f554382a == hVar.f554382a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554383b, hVar.f554383b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554384c, hVar.f554384c);
    }

    /* renamed from: hashCode */
    public int m178950x8cdac1b() {
        int i17 = this.f554382a * 31;
        java.lang.String str = this.f554383b;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f554384c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m178951x9616526c() {
        return "SmokeResult(code=" + this.f554382a + ", reason=" + this.f554383b + ", subReason=" + this.f554384c + ")";
    }
}
