package lc3;

/* loaded from: classes7.dex */
public final class j0 extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(java.lang.String text) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f399436a = text;
    }

    /* renamed from: equals */
    public boolean m145570xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.j0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399436a, ((lc3.j0) obj).f399436a);
    }

    /* renamed from: hashCode */
    public int m145571x8cdac1b() {
        return this.f399436a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145572x9616526c() {
        return "MBTextScriptDescriptor(text=" + r26.p0.E0(this.f399436a, 100) + "...)";
    }
}
