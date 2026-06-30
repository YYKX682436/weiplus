package i45;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f369929a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f369930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f369932d;

    public c(java.lang.String content, java.lang.String match, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(match, "match");
        this.f369929a = content;
        this.f369930b = match;
        this.f369931c = i17;
        this.f369932d = i18;
    }

    /* renamed from: equals */
    public boolean m134713xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i45.c)) {
            return false;
        }
        i45.c cVar = (i45.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369929a, cVar.f369929a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369930b, cVar.f369930b) && this.f369931c == cVar.f369931c && this.f369932d == cVar.f369932d;
    }

    /* renamed from: hashCode */
    public int m134714x8cdac1b() {
        return (((((this.f369929a.hashCode() * 31) + this.f369930b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f369931c)) * 31) + java.lang.Integer.hashCode(this.f369932d);
    }

    /* renamed from: toString */
    public java.lang.String m134715x9616526c() {
        return "WeTypeVoiceToTextAfterSendText(content=" + this.f369929a + ", match=" + this.f369930b + ", interval=" + this.f369931c + ", maxTime=" + this.f369932d + ')';
    }
}
