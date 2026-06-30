package zg1;

/* loaded from: classes13.dex */
public class c implements o91.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z81.j f554347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z81.i f554348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554349c;

    public c(zg1.d dVar, z81.j jVar, z81.i iVar, java.lang.String str) {
        this.f554347a = jVar;
        this.f554348b = iVar;
        this.f554349c = str;
    }

    @Override // o91.b
    public void a(android.graphics.Bitmap bitmap) {
        z81.j jVar = this.f554347a;
        if (jVar == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        jVar.a(this.f554348b, this.f554349c, bitmap);
    }
}
