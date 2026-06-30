package ju1;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f383232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f383233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, android.widget.ImageView imageView) {
        super(2);
        this.f383232d = str;
        this.f383233e = imageView;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cp0.n imageView = (cp0.n) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (bitmap != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560051a0);
            ju1.b bVar = new ju1.b(bitmap, this.f383232d, context, this.f383233e);
            if (bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardViewUtils", "getPrimaryColor, bitmap is null");
                bVar.a(d17);
            } else {
                new i4.f(bitmap).a(new ju1.d(bVar, d17));
            }
        }
        return jz5.f0.f384359a;
    }
}
