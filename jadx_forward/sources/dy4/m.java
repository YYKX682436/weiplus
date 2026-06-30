package dy4;

/* loaded from: classes7.dex */
public class m implements dg.d {

    /* renamed from: a, reason: collision with root package name */
    public dg.c f326219a;

    public void a(int i17, int i18) {
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoErrorHandler", "onVideoError(%d, %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.c cVar = this.f326219a;
        if (cVar != null) {
            if (i17 == -1024) {
                str = "VIDEO_ERROR";
            } else {
                java.lang.String str2 = "MEDIA_ERR_SRC_NOT_SUPPORTED";
                if (i17 != -1010 && i17 != -1007) {
                    str2 = "MEDIA_ERR_NETWORK";
                    if (i17 != -1004 ? com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                        str = "MEDIA_ERR_DECODE";
                    }
                }
                str = str2;
            }
            cVar.a(str, i17, i18);
        }
    }

    public void b(dg.c cVar) {
        this.f326219a = cVar;
    }
}
