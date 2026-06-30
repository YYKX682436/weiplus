package f53;

/* loaded from: classes15.dex */
public class k implements r53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f53.m f341196b;

    public k(f53.m mVar, java.lang.String str) {
        this.f341196b = mVar;
        this.f341195a = str;
    }

    @Override // r53.x
    public void a(android.view.View view, android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        ((jt0.i) this.f341196b.f341210g.f221510j2).put(this.f341195a, bitmap);
    }

    @Override // r53.x
    public void b(java.lang.String str, android.view.View view) {
    }
}
