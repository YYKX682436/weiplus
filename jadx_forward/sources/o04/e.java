package o04;

/* loaded from: classes10.dex */
public class e implements o04.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f423437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f423438b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f423439c;

    public e(java.lang.Class clazz, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        this.f423437a = clazz;
        this.f423438b = i17;
        this.f423439c = jz5.h.b(new o04.d(this));
    }

    @Override // o04.o
    public boolean b(android.content.Intent intent) {
        return true;
    }

    @Override // o04.o
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f c() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) ((jz5.n) this.f423439c).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fVar, "<get-data>(...)");
        return fVar;
    }

    @Override // o04.o
    /* renamed from: getType */
    public int mo150337xfb85f7b0() {
        return this.f423438b;
    }
}
