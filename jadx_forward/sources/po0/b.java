package po0;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f438815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f438816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, yz5.l lVar) {
        super(1);
        this.f438815d = i17;
        this.f438816e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawColor(this.f438815d);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new po0.a(this.f438816e, bitmap));
        return jz5.f0.f384359a;
    }
}
