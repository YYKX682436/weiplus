package d33;

/* loaded from: classes10.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        super(0);
        this.f307733d = activityC15646xc9a7ee3f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307733d;
        activityC15646xc9a7ee3f.f220012w = com.p314xaae8f345.mm.sdk.p2603x2137b148.l.a(activityC15646xc9a7ee3f.X6());
        android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(activityC15646xc9a7ee3f.X6());
        boolean z17 = false;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.c(n07.outWidth, n07.outHeight) && n07.outWidth > 480;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.q2.e(n07.outWidth, n07.outHeight) && n07.outHeight > 480) {
            z17 = true;
        }
        if (z18 || z17) {
            pm0.v.X(new d33.y(activityC15646xc9a7ee3f));
        } else {
            int p17 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2511xac32c159.C19941x601a367f.p();
            int p18 = com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2511xac32c159.C19941x601a367f.p();
            int i18 = activityC15646xc9a7ee3f.f220012w;
            int i19 = (i18 == 90 || i18 == 270) ? p18 : p17;
            if (i18 != 90 && i18 != 270) {
                p17 = p18;
            }
            android.graphics.Bitmap T = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(activityC15646xc9a7ee3f.X6(), p17, i19, true);
            android.graphics.Bitmap w07 = T != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(T, activityC15646xc9a7ee3f.f220012w) : null;
            if (w07 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
                activityC15646xc9a7ee3f.setResult(-1);
                activityC15646xc9a7ee3f.finish();
            } else {
                pm0.v.X(new d33.z(activityC15646xc9a7ee3f, w07));
            }
        }
        return jz5.f0.f384359a;
    }
}
