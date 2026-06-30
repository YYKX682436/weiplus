package r16;

/* loaded from: classes16.dex */
public class c implements g26.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f450182a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.b f450183b;

    /* renamed from: c, reason: collision with root package name */
    public final o06.b f450184c;

    public c(boolean z17, o06.b bVar, o06.b bVar2) {
        this.f450182a = z17;
        this.f450183b = bVar;
        this.f450184c = bVar2;
    }

    @Override // g26.f
    public boolean a(f26.c2 c17, f26.c2 c27) {
        o06.b a17 = this.f450183b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "$a");
        o06.b b17 = this.f450184c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b17, "$b");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c27, "c2");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, c27)) {
            return true;
        }
        o06.j i17 = c17.i();
        o06.j i18 = c27.i();
        if (!(i17 instanceof o06.e2) || !(i18 instanceof o06.e2)) {
            return false;
        }
        return r16.f.f450189a.b((o06.e2) i17, (o06.e2) i18, this.f450182a, new r16.d(a17, b17));
    }
}
