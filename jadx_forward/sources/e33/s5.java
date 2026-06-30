package e33;

/* loaded from: classes10.dex */
public class s5 implements e33.z5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd f328997a;

    public s5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd) {
        this.f328997a = activityC15659x3c9ebdbd;
    }

    public void a(t23.f2 f2Var) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmartGalleryUI", "onAlbumClick, albumId: %s, albumName: %s.", f2Var.f496681c, f2Var.f496682d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15659x3c9ebdbd activityC15659x3c9ebdbd = this.f328997a;
        android.content.Intent intent = new android.content.Intent(activityC15659x3c9ebdbd, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.class);
        intent.putExtras(activityC15659x3c9ebdbd.getIntent());
        intent.putExtra("send_raw_img", activityC15659x3c9ebdbd.f220170v);
        if (activityC15659x3c9ebdbd.f220165q) {
            t23.g2 g2Var = f2Var.f496686h;
            if (g2Var == null || !g2Var.f496687a) {
                intent.putExtra("select_type_tag", 0);
            } else {
                intent.putExtra("select_type_tag", 1);
            }
        } else {
            intent.putExtra("select_type_tag", 2);
        }
        try {
            t23.i2 i2Var = f2Var.f496680b;
            if (i2Var == null || (str = i2Var.f496718c) == null) {
                str = "";
            }
            java.lang.String str2 = f2Var.f496682d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18269, java.net.URLEncoder.encode(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6), java.net.URLEncoder.encode(str2 != null ? str2 : "", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
        } catch (java.lang.Exception unused) {
        }
        intent.putExtra("is_from_smart_gallery", true);
        java.lang.String str3 = f2Var.f496682d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = f2Var.f496680b.f496718c;
        }
        intent.putExtra("title_from_smart_gallery", str3);
        intent.putExtra("album_id_from_smart_gallery", f2Var.f496681c);
        activityC15659x3c9ebdbd.startActivityForResult(intent, 1);
    }
}
