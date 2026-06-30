package c6;

/* loaded from: classes14.dex */
public final class f extends c6.l {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f38797a;

    /* renamed from: b, reason: collision with root package name */
    public final c6.j f38798b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Throwable f38799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.graphics.drawable.Drawable drawable, c6.j request, java.lang.Throwable throwable) {
        super(null);
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(throwable, "throwable");
        this.f38797a = drawable;
        this.f38798b = request;
        this.f38799c = throwable;
    }

    @Override // c6.l
    public android.graphics.drawable.Drawable a() {
        return this.f38797a;
    }

    @Override // c6.l
    public c6.j b() {
        return this.f38798b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6.f)) {
            return false;
        }
        c6.f fVar = (c6.f) obj;
        return kotlin.jvm.internal.o.b(this.f38797a, fVar.f38797a) && kotlin.jvm.internal.o.b(this.f38798b, fVar.f38798b) && kotlin.jvm.internal.o.b(this.f38799c, fVar.f38799c);
    }

    public int hashCode() {
        android.graphics.drawable.Drawable drawable = this.f38797a;
        return ((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.f38798b.hashCode()) * 31) + this.f38799c.hashCode();
    }

    public java.lang.String toString() {
        return "ErrorResult(drawable=" + this.f38797a + ", request=" + this.f38798b + ", throwable=" + this.f38799c + ')';
    }
}
