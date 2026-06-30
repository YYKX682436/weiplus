package dl4;

/* loaded from: classes3.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f316953d = bitmap;
        this.f316954e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f316954e;
        android.graphics.Bitmap bitmap = this.f316953d;
        if (bitmap == null || bitmap.isRecycled()) {
            if (view != null) {
                view.setBackground(null);
            }
        } else if (view != null) {
            view.setBackground(new android.graphics.drawable.BitmapDrawable(view.getResources(), bitmap));
        }
        return jz5.f0.f384359a;
    }
}
