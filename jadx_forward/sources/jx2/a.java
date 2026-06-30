package jx2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f383932a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f383933b;

    public a(int i17, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f383932a = i17;
        this.f383933b = text;
    }

    /* renamed from: equals */
    public boolean m141473xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx2.a)) {
            return false;
        }
        jx2.a aVar = (jx2.a) obj;
        return this.f383932a == aVar.f383932a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f383933b, aVar.f383933b);
    }

    /* renamed from: hashCode */
    public int m141474x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f383932a) * 31) + this.f383933b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141475x9616526c() {
        return "FeedbackReason(id=" + this.f383932a + ", text=" + this.f383933b + ')';
    }
}
