package hd2;

/* loaded from: classes10.dex */
public final class s implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f362058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f362059b;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, android.widget.ImageView imageView) {
        this.f362058a = c15276x168ec665;
        this.f362059b = imageView;
    }

    @Override // dr.r
    public void a(int i17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = this.f362058a;
        c15276x168ec665.setVisibility(4);
        c15276x168ec665.y();
        this.f362059b.setImageBitmap((android.graphics.Bitmap) obj);
    }
}
