package ry2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f482902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.e f482903e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, ry2.e eVar) {
        super(0);
        this.f482902d = bitmap;
        this.f482903e = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f482902d;
        if (bitmap != null) {
            this.f482903e.n(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
