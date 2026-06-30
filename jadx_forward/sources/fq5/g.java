package fq5;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f347200e;

    public g(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8, android.graphics.Bitmap bitmap) {
        this.f347199d = c22927xe8447aa8;
        this.f347200e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347199d;
        em.j4 j4Var = c22927xe8447aa8.f295809e;
        if (j4Var != null) {
            if (j4Var.f336020l == null) {
                j4Var.f336020l = (android.widget.ImageView) j4Var.f336009a.findViewById(com.p314xaae8f345.mm.R.id.uvr);
            }
            android.widget.ImageView imageView = j4Var.f336020l;
            if (imageView != null) {
                imageView.setImageBitmap(this.f347200e);
            }
        }
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.T6(c22927xe8447aa8, 4);
    }
}
