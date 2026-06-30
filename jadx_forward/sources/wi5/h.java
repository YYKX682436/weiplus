package wi5;

/* loaded from: classes.dex */
public final class h extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f527824b;

    public h(ri5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f527824b = item;
    }

    /* renamed from: equals */
    public boolean m173843xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wi5.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527824b, ((wi5.h) obj).f527824b);
    }

    /* renamed from: hashCode */
    public int m173844x8cdac1b() {
        return this.f527824b.mo148315x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m173845x9616526c() {
        return "CreateGroupSelectHeaderAction(item=" + this.f527824b + ')';
    }
}
