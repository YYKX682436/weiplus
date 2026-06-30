package d33;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f f307740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f) {
        super(0);
        this.f307740d = activityC15646xc9a7ee3f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f.E;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.p1727x373aa5.ActivityC15646xc9a7ee3f activityC15646xc9a7ee3f = this.f307740d;
        android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(activityC15646xc9a7ee3f.Z6().getWidth(), activityC15646xc9a7ee3f.Z6().getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
        android.graphics.Bitmap bitmap = null;
        if (m17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
            activityC15646xc9a7ee3f.setResult(-1);
            activityC15646xc9a7ee3f.finish();
        } else {
            android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
            activityC15646xc9a7ee3f.Z6().draw(canvas);
            canvas.setBitmap(null);
            try {
                bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.E(m17, 0, 0, m17.getWidth(), m17.getHeight() - ym5.x.a(activityC15646xc9a7ee3f, 56.0f), true);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
                activityC15646xc9a7ee3f.setResult(-1);
                activityC15646xc9a7ee3f.finish();
            }
        }
        java.lang.String stringExtra = activityC15646xc9a7ee3f.getIntent().getStringExtra("CropImage_bg_vertical");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
        java.lang.String stringExtra2 = activityC15646xc9a7ee3f.getIntent().getStringExtra("CropImage_bg_horizontal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        if (activityC15646xc9a7ee3f.a7(stringExtra, bitmap, false) && activityC15646xc9a7ee3f.a7(stringExtra2, bitmap, true)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_bg_vertical", stringExtra);
            intent.putExtra("CropImage_bg_horizontal", stringExtra2);
            activityC15646xc9a7ee3f.setResult(-1, intent);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 9");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 9, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarCropUI", "finish background crop");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ImageCropReport", "inc: 8");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1361L, 8, 1L);
            activityC15646xc9a7ee3f.setResult(-1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AvatarCropUI", "background crop error");
        }
        pm0.v.X(new d33.b(activityC15646xc9a7ee3f));
        return jz5.f0.f384359a;
    }
}
