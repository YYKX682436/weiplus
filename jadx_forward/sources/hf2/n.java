package hf2;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f362653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hf2.x xVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        super(0);
        this.f362651d = xVar;
        this.f362652e = str;
        this.f362653f = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hf2.x xVar = this.f362651d;
        hf2.b2 h76 = xVar.h7();
        java.lang.String str = this.f362652e;
        android.graphics.Bitmap bitmap = this.f362653f;
        h76.d(str, bitmap, 1.0f);
        xVar.f7().c(str, bitmap);
        return jz5.f0.f384359a;
    }
}
