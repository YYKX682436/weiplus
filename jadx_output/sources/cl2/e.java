package cl2;

/* loaded from: classes10.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMRoundCornerImageView f42923b;

    public e(java.lang.String str, com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView) {
        this.f42922a = str;
        this.f42923b = mMRoundCornerImageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (!kotlin.jvm.internal.o.b(((mn2.h3) aVar.f293573a).getUrl(), this.f42922a) || bitmap == null) {
            return;
        }
        pm0.v.X(new cl2.d(this.f42923b, bitmap));
    }
}
