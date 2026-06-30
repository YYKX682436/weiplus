package c6;

/* loaded from: classes14.dex */
public final class q extends c6.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f120396a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f120397b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.k f120398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.drawable.Drawable drawable, c6.j request, c6.k metadata) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadata, "metadata");
        this.f120396a = drawable;
        this.f120397b = request;
        this.f120398c = metadata;
    }

    @Override // c6.l
    public android.graphics.drawable.Drawable a() {
        return this.f120396a;
    }

    @Override // c6.l
    public c6.j b() {
        return this.f120397b;
    }

    /* renamed from: equals */
    public boolean m14219xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.q)) {
            return false;
        }
        c6.q qVar = (c6.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120396a, qVar.f120396a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120397b, qVar.f120397b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120398c, qVar.f120398c);
    }

    /* renamed from: hashCode */
    public int m14220x8cdac1b() {
        return (((this.f120396a.hashCode() * 31) + this.f120397b.m14208x8cdac1b()) * 31) + this.f120398c.m14211x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m14221x9616526c() {
        return "SuccessResult(drawable=" + this.f120396a + ", request=" + this.f120397b + ", metadata=" + this.f120398c + ')';
    }
}
