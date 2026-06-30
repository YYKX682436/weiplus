package d33;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        super(3);
        this.f307789d = activityC15646xc9a7ee3f;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String mediaPath = (java.lang.String) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedCallback, "loadedCallback");
        pm0.v.K(null, new d33.k(mediaPath, this.f307789d, imageView, loadedCallback));
        return jz5.f0.f384359a;
    }
}
