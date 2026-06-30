package c6;

/* loaded from: classes14.dex */
public final class q extends c6.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f38863a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f38864b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.k f38865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.graphics.drawable.Drawable drawable, c6.j request, c6.k metadata) {
        super(null);
        kotlin.jvm.internal.o.g(drawable, "drawable");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(metadata, "metadata");
        this.f38863a = drawable;
        this.f38864b = request;
        this.f38865c = metadata;
    }

    @Override // c6.l
    public android.graphics.drawable.Drawable a() {
        return this.f38863a;
    }

    @Override // c6.l
    public c6.j b() {
        return this.f38864b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.q)) {
            return false;
        }
        c6.q qVar = (c6.q) obj;
        return kotlin.jvm.internal.o.b(this.f38863a, qVar.f38863a) && kotlin.jvm.internal.o.b(this.f38864b, qVar.f38864b) && kotlin.jvm.internal.o.b(this.f38865c, qVar.f38865c);
    }

    public int hashCode() {
        return (((this.f38863a.hashCode() * 31) + this.f38864b.hashCode()) * 31) + this.f38865c.hashCode();
    }

    public java.lang.String toString() {
        return "SuccessResult(drawable=" + this.f38863a + ", request=" + this.f38864b + ", metadata=" + this.f38865c + ')';
    }
}
