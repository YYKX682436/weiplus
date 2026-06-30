package ir2;

/* loaded from: classes2.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f375662a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f375663b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f375664c;

    public e1(java.util.List feeds, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feeds, "feeds");
        this.f375662a = feeds;
        this.f375663b = z17;
        this.f375664c = jz5.h.b(new ir2.d1(this));
    }

    public abstract ym5.s3 a();

    public abstract void b(java.util.List list);

    public int c() {
        return 2;
    }
}
