package nn4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f420229a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f420230b;

    public b(int i17, java.lang.String TranslatedText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TranslatedText, "TranslatedText");
        this.f420229a = i17;
        this.f420230b = TranslatedText;
    }

    /* renamed from: equals */
    public boolean m149816xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn4.b)) {
            return false;
        }
        nn4.b bVar = (nn4.b) obj;
        return this.f420229a == bVar.f420229a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f420230b, bVar.f420230b);
    }

    /* renamed from: hashCode */
    public int m149817x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f420229a) * 31) + this.f420230b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m149818x9616526c() {
        return "TransResult(clientMsgId=" + this.f420229a + ", TranslatedText=" + this.f420230b + ')';
    }
}
