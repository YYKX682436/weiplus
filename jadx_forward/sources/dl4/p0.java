package dl4;

/* loaded from: classes3.dex */
public final class p0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f316985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o11.g f316987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316988d;

    public p0(long j17, java.lang.String str, o11.g gVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        this.f316985a = j17;
        this.f316986b = str;
        this.f316987c = gVar;
        this.f316988d = w1Var;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        dl4.d1 d1Var = dl4.d1.f316916a;
        long j17 = this.f316985a;
        android.graphics.Bitmap bitmap = bVar != null ? bVar.f441067d : null;
        if (str == null) {
            str = "";
        }
        dl4.d1.c(d1Var, j17, bitmap, str, this.f316986b, this.f316987c, this.f316988d);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
