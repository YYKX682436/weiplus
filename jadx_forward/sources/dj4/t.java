package dj4;

/* loaded from: classes10.dex */
public final class t implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mj4.h f314580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314581d;

    public t(java.lang.String str, java.lang.String str2, mj4.h hVar, java.lang.String str3) {
        this.f314578a = str;
        this.f314579b = str2;
        this.f314580c = hVar;
        this.f314581d = str3;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.s(this.f314578a, this.f314579b, this.f314580c, bitmap, this.f314581d));
    }
}
