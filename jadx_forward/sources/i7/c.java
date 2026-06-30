package i7;

/* loaded from: classes13.dex */
public final class c implements i7.e {

    /* renamed from: a, reason: collision with root package name */
    public final x6.d f370924a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.e f370925b;

    /* renamed from: c, reason: collision with root package name */
    public final i7.e f370926c;

    public c(x6.d dVar, i7.e eVar, i7.e eVar2) {
        this.f370924a = dVar;
        this.f370925b = eVar;
        this.f370926c = eVar2;
    }

    @Override // i7.e
    public w6.z0 a(w6.z0 z0Var, t6.l lVar) {
        android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) z0Var.get();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            return this.f370925b.a(d7.e.b(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap(), this.f370924a), lVar);
        }
        if (drawable instanceof h7.f) {
            return this.f370926c.a(z0Var, lVar);
        }
        return null;
    }
}
