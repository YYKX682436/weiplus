package an2;

/* loaded from: classes14.dex */
public final class a implements an2.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f90373a;

    /* renamed from: b, reason: collision with root package name */
    public final lo0.m f90374b;

    public a(java.lang.String label, lo0.m group) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(group, "group");
        this.f90373a = label;
        this.f90374b = group;
    }

    @Override // an2.b
    public java.lang.String a() {
        return "live_beauty_group_" + this.f90374b.f401578a;
    }

    @Override // an2.b
    public java.lang.String b() {
        return this.f90373a;
    }
}
