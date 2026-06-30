package c04;

/* loaded from: classes9.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119224d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        super(1);
        this.f119224d = c17324xa321818a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "tipsImage roundBitmap is invalid"));
            z17 = false;
        } else {
            android.widget.ImageView imageView = this.f119224d.f241168J;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customTipsImage");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
