package t10;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f496083a;

    /* renamed from: b, reason: collision with root package name */
    public final t10.b f496084b;

    public c(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f496083a = name;
        this.f496084b = new t10.b(this);
    }

    public abstract boolean a(pq.a aVar, bw5.x7 x7Var);

    public abstract void b(pq.a aVar, bw5.x7 x7Var, t10.d dVar);

    public abstract void c(pq.a aVar, bw5.x7 x7Var, bw5.l8 l8Var, t10.d dVar);
}
