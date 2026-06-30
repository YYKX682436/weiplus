package ht2;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f366362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, ht2.y0 y0Var) {
        super(0);
        this.f366362d = bitmap;
        this.f366363e = c22699x3dcdb352;
        this.f366364f = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f366362d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f366363e;
            c22699x3dcdb352.m82040x7541828(0);
            c22699x3dcdb352.setColorFilter((android.graphics.ColorFilter) null);
            int d17 = i65.a.d(c22699x3dcdb352.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
            java.util.regex.Pattern pattern = ht2.y0.f366469g;
            ht2.y0 y0Var = this.f366364f;
            y0Var.getClass();
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmap);
            y0Var.cj(bitmapDrawable, d17);
            c22699x3dcdb352.setImageDrawable(bitmapDrawable);
        }
        return jz5.f0.f384359a;
    }
}
