package yj2;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f544177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yj2.e f544178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f544179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Bitmap bitmap, yj2.e eVar, boolean z17) {
        super(0);
        this.f544177d = bitmap;
        this.f544178e = eVar;
        this.f544179f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f544177d != null) {
            this.f544178e.m177212xd2d0feea().f343579d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(this.f544178e.getContext().getResources(), this.f544177d));
            yj2.e eVar = this.f544178e;
            eVar.b(this.f544179f && eVar.f544189m);
            yj2.f fVar = this.f544178e.f544186g;
            if (fVar != null) {
                fVar.f544195c++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PreviewCountDownData", "cur: " + fVar.f544195c + " sum: " + fVar.f544193a + " code: " + fVar.hashCode());
                if (fVar.f544195c == fVar.f544193a) {
                    fVar.f544194b.mo152xb9724478();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
