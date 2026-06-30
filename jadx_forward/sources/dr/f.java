package dr;

/* loaded from: classes12.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f323914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f323915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dr.g f323916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z17, android.graphics.Bitmap bitmap, dr.g gVar) {
        super(0);
        this.f323914d = z17;
        this.f323915e = bitmap;
        this.f323916f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        boolean z17 = this.f323914d;
        dr.g gVar = this.f323916f;
        if (!z17 || (bitmap = this.f323915e) == null) {
            dr.r rVar = gVar.f323917c;
            if (rVar != null) {
                rVar.a(-1, gVar.f323933a, null);
            }
        } else {
            dr.r rVar2 = gVar.f323917c;
            if (rVar2 != null) {
                rVar2.a(1, gVar.f323933a, bitmap);
            }
        }
        return jz5.f0.f384359a;
    }
}
