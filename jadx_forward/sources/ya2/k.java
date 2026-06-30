package ya2;

/* loaded from: classes2.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f542032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.ref.WeakReference weakReference) {
        super(2);
        this.f542032d = weakReference;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zy2.i5 i5Var;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((cp0.n) obj, "<anonymous parameter 0>");
        java.lang.ref.WeakReference weakReference = this.f542032d;
        if (weakReference != null && (i5Var = (zy2.i5) weakReference.get()) != null) {
            i5Var.a(java.lang.Integer.valueOf(bitmap != null ? 0 : -1));
        }
        return jz5.f0.f384359a;
    }
}
