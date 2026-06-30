package vv0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f521914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f521915b;

    public j(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f521914a = name;
        this.f521915b = i17;
    }

    /* renamed from: equals */
    public boolean m172694xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.j)) {
            return false;
        }
        vv0.j jVar = (vv0.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521914a, jVar.f521914a) && this.f521915b == jVar.f521915b;
    }

    /* renamed from: hashCode */
    public int m172695x8cdac1b() {
        return (this.f521914a.hashCode() * 31) + java.lang.Integer.hashCode(this.f521915b);
    }

    /* renamed from: toString */
    public java.lang.String m172696x9616526c() {
        return "FilterCategoryInfo(name=" + this.f521914a + ", id=" + this.f521915b + ')';
    }
}
