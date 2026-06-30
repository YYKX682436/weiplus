package fx2;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx2.c f348645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f348646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fx2.c cVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f348645d = cVar;
        this.f348646e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f348646e;
        fx2.c cVar = this.f348645d;
        cVar.f348651c = bitmap;
        cVar.invalidateSelf();
        return jz5.f0.f384359a;
    }
}
