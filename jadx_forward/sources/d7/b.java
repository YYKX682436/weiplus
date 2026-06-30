package d7;

/* loaded from: classes13.dex */
public class b implements t6.o {

    /* renamed from: a, reason: collision with root package name */
    public final x6.d f308318a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.o f308319b;

    public b(x6.d dVar, t6.o oVar) {
        this.f308318a = dVar;
        this.f308319b = oVar;
    }

    @Override // t6.o
    public t6.c a(t6.l lVar) {
        return this.f308319b.a(lVar);
    }

    @Override // t6.d
    public boolean b(java.lang.Object obj, java.io.File file, t6.l lVar) {
        return this.f308319b.b(new d7.e(((android.graphics.drawable.BitmapDrawable) ((w6.z0) obj).get()).getBitmap(), this.f308318a), file, lVar);
    }
}
