package v11;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513909a;

    public g(java.util.List buttons) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttons, "buttons");
        this.f513909a = buttons;
    }

    /* renamed from: equals */
    public boolean m170887xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513909a, ((v11.g) obj).f513909a);
    }

    /* renamed from: hashCode */
    public int m170888x8cdac1b() {
        return this.f513909a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m170889x9616526c() {
        return "InteractOptions(buttons=" + this.f513909a + ')';
    }
}
