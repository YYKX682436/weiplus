package v11;

/* loaded from: classes11.dex */
public final class p extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.List runs) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runs, "runs");
        this.f513986a = runs;
    }

    /* renamed from: equals */
    public boolean m170939xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.p) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513986a, ((v11.p) obj).f513986a);
    }

    /* renamed from: hashCode */
    public int m170940x8cdac1b() {
        return this.f513986a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m170941x9616526c() {
        return "Paragraph(runs=" + this.f513986a + ')';
    }
}
