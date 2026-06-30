package v11;

/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final v11.j0 f513887a;

    public d0(v11.j0 textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        this.f513887a = textView;
    }

    /* renamed from: equals */
    public boolean m170875xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.d0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513887a, ((v11.d0) obj).f513887a);
    }

    /* renamed from: hashCode */
    public int m170876x8cdac1b() {
        return this.f513887a.m170909x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m170877x9616526c() {
        return "NativeMarkdownMathBlockConfig(textView=" + this.f513887a + ')';
    }
}
