package rw;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f482100a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f482101b;

    public a(java.lang.String name, yz5.a execute) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(execute, "execute");
        this.f482100a = name;
        this.f482101b = execute;
    }

    /* renamed from: equals */
    public boolean m163231xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw.a)) {
            return false;
        }
        rw.a aVar = (rw.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482100a, aVar.f482100a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482101b, aVar.f482101b);
    }

    /* renamed from: hashCode */
    public int m163232x8cdac1b() {
        return (this.f482100a.hashCode() * 31) + this.f482101b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163233x9616526c() {
        return "TestItem(name=" + this.f482100a + ", execute=" + this.f482101b + ')';
    }
}
