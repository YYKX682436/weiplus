package cj2;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f123397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.widget.ImageView imageView) {
        super(1);
        this.f123397d = imageView;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            this.f123397d.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), bitmap));
        }
        return jz5.f0.f384359a;
    }
}
