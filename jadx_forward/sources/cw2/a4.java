package cw2;

/* loaded from: classes8.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f305096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b) {
        super(0);
        this.f305096d = bitmap;
        this.f305097e = c15182x1607686b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = this.f305096d;
        if (bitmap != null && (imageView = (c15182x1607686b = this.f305097e).f212141o) != null) {
            imageView.setImageDrawable(new android.graphics.drawable.BitmapDrawable(c15182x1607686b.getContext().getResources(), bitmap));
        }
        return jz5.f0.f384359a;
    }
}
