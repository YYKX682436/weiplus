package wh5;

/* loaded from: classes3.dex */
public final class m0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f527611a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527612b;

    public m0(boolean z17, java.lang.String str, java.lang.String str2) {
        this.f527611a = z17;
        this.f527612b = str2;
    }

    /* renamed from: equals */
    public boolean m173828xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh5.m0)) {
            return false;
        }
        wh5.m0 m0Var = (wh5.m0) obj;
        return this.f527611a == m0Var.f527611a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("", "") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527612b, m0Var.f527612b);
    }

    /* renamed from: hashCode */
    public int m173829x8cdac1b() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f527611a) * 31) + 0) * 31;
        java.lang.String str = this.f527612b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m173830x9616526c() {
        return "TranslateData(isTranslated=" + this.f527611a + ", translatedRawPath=, translatedRetPath=" + this.f527612b + ')';
    }
}
