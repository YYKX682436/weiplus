package d33;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        super(3);
        this.f307788d = activityC15646xc9a7ee3f;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String imgPath = (java.lang.String) obj;
        android.widget.ImageView imgView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgView, "imgView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedCallback, "loadedCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "enter previewMatting");
        pm0.v.K(null, new d33.j0(imgPath, this.f307788d, imgView, loadedCallback));
        return jz5.f0.f384359a;
    }
}
