package v11;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513926a;

    public h(java.util.List buttons) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttons, "buttons");
        this.f513926a = buttons;
    }

    /* renamed from: equals */
    public boolean m170893xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513926a, ((v11.h) obj).f513926a);
    }

    /* renamed from: hashCode */
    public int m170894x8cdac1b() {
        return this.f513926a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m170895x9616526c() {
        return "InteractOptionsUiModel(buttons=" + this.f513926a + ')';
    }
}
