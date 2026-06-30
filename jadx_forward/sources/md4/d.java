package md4;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f407408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f407409b;

    public d(r45.jj4 jj4Var, android.widget.ImageView imageView) {
        this.f407408a = jj4Var;
        this.f407409b = imageView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2
    public final void a(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        java.lang.String str = this.f407408a.f459388d;
        android.widget.ImageView imageView = this.f407409b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, imageView.getTag())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        } else {
            imageView.setImageBitmap(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        }
    }
}
