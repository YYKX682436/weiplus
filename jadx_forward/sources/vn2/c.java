package vn2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f519777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f519778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, v65.n nVar) {
        super(1);
        this.f519777d = i17;
        this.f519778e = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i17 = this.f519777d;
        if (i17 != 0 && bitmap != null) {
            vn2.i iVar = vn2.i.f519836a;
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setAntiAlias(true);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawColor(i17);
        }
        this.f519778e.a(bitmap);
        return jz5.f0.f384359a;
    }
}
