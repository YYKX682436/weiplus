package d33;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d f307827e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.C15652xb39b5f9d c15652xb39b5f9d) {
        super(0);
        this.f307826d = activityC15646xc9a7ee3f;
        this.f307827e = c15652xb39b5f9d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307826d;
        java.lang.String X6 = activityC15646xc9a7ee3f.X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "access$getImgPath(...)");
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(X6);
        int[] iArr = null;
        if (n07 != null) {
            if (!(n07.outWidth > 0 && n07.outHeight > 0)) {
                n07 = null;
            }
            if (n07 != null) {
                iArr = new int[]{n07.outWidth, n07.outHeight};
            }
        }
        if (iArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarCropUI", "load matting img info error");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
            activityC15646xc9a7ee3f.setResult(-1);
            activityC15646xc9a7ee3f.finish();
        } else {
            activityC15646xc9a7ee3f.f220014y = iArr;
            activityC15646xc9a7ee3f.f220012w = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(activityC15646xc9a7ee3f.X6());
            pm0.v.X(new d33.v(this.f307827e, activityC15646xc9a7ee3f));
        }
        return jz5.f0.f384359a;
    }
}
