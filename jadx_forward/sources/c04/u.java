package c04;

/* loaded from: classes13.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 f119225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119226e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        super(1);
        this.f119225d = c17265xca2bb196;
        this.f119226e = c17324xa321818a;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.n1.f240492a.a(this.f119225d.f240205q);
        if (a17 == null || a17.isRecycled()) {
            km5.u.b().a(nm5.j.c(java.lang.Boolean.FALSE, "successView getResouce failed"));
            z17 = false;
        } else {
            android.widget.ImageView imageView = this.f119226e.G;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customSuccessView");
                throw null;
            }
            imageView.setImageBitmap(a17);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
