package m06;

/* loaded from: classes15.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f404140a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f404141b;

    public m(n16.c packageFqName, java.lang.String classNamePrefix, boolean z17, n16.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageFqName, "packageFqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classNamePrefix, "classNamePrefix");
        this.f404140a = packageFqName;
        this.f404141b = classNamePrefix;
    }

    public final n16.g a(int i17) {
        return n16.g.k(this.f404141b + i17);
    }

    /* renamed from: toString */
    public java.lang.String m146607x9616526c() {
        return this.f404140a + '.' + this.f404141b + 'N';
    }
}
