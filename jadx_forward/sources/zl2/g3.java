package zl2;

/* loaded from: classes2.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f555320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.view.View view, yz5.l lVar) {
        super(1);
        this.f555320d = view;
        this.f555321e = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        yz5.l lVar = this.f555321e;
        if (bitmap != null) {
            android.view.View view = this.f555320d;
            if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap));
            } else {
                view.setBackground(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap));
            }
            if (lVar != null) {
                lVar.mo146xb9724478(bitmap);
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(null);
        }
        return jz5.f0.f384359a;
    }
}
