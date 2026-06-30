package d7;

/* loaded from: classes13.dex */
public class j0 implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final f7.d f308349a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.d f308350b;

    public j0(f7.d dVar, x6.d dVar2) {
        this.f308349a = dVar;
        this.f308350b = dVar2;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        w6.z0 a17 = this.f308349a.a((android.net.Uri) obj, i17, i18, lVar);
        if (a17 == null) {
            return null;
        }
        return d7.a0.a(this.f308350b, (android.graphics.drawable.Drawable) ((f7.b) a17).get(), i17, i18);
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        return "android.resource".equals(((android.net.Uri) obj).getScheme());
    }
}
