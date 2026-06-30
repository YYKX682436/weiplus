package rm5;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f479100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.l lVar) {
        super(2);
        this.f479100d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getThumbBitmap result, timeMs:");
        sb6.append(longValue);
        sb6.append(", bitmap:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(", ");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append(']');
        xm5.b.c("VideoComposition", sb6.toString(), new java.lang.Object[0]);
        this.f479100d.mo146xb9724478(bitmap);
        return jz5.f0.f384359a;
    }
}
