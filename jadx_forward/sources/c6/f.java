package c6;

/* loaded from: classes14.dex */
public final class f extends c6.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f120330a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f120331b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Throwable f120332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.graphics.drawable.Drawable drawable, c6.j request, java.lang.Throwable throwable) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        this.f120330a = drawable;
        this.f120331b = request;
        this.f120332c = throwable;
    }

    @Override // c6.l
    public android.graphics.drawable.Drawable a() {
        return this.f120330a;
    }

    @Override // c6.l
    public c6.j b() {
        return this.f120331b;
    }

    /* renamed from: equals */
    public boolean m14202xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.f)) {
            return false;
        }
        c6.f fVar = (c6.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120330a, fVar.f120330a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120331b, fVar.f120331b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120332c, fVar.f120332c);
    }

    /* renamed from: hashCode */
    public int m14203x8cdac1b() {
        android.graphics.drawable.Drawable drawable = this.f120330a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f120331b.m14208x8cdac1b()) * 31) + this.f120332c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m14204x9616526c() {
        return "ErrorResult(drawable=" + this.f120330a + ", request=" + this.f120331b + ", throwable=" + this.f120332c + ')';
    }
}
