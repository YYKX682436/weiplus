package hz3;

/* loaded from: classes12.dex */
public abstract class v {
    public static final hz3.t a(hz3.s checkRequest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkRequest, "checkRequest");
        hz3.t tVar = new hz3.t();
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(checkRequest.f367888b);
        android.graphics.Point point = checkRequest.f367889c;
        jz5.g gVar = hz3.i.f367865a;
        boolean z17 = false;
        if (point != null && point.x * point.y > i17) {
            z17 = true;
        }
        if (j17 && z17) {
            tVar.f367894a = 1;
        } else if (j17) {
            tVar.f367894a = 2;
        } else {
            tVar.f367894a = 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageCDNCheckHelper", "checkImageValid imageSrc: %s, compressType: %d, imageSize: %s, imagePath: %s, fileExist: %s, checkResult: %s", java.lang.Integer.valueOf(checkRequest.f367887a), java.lang.Integer.valueOf(checkRequest.f367892f), checkRequest.f367889c, checkRequest.f367888b, java.lang.Boolean.valueOf(j17), java.lang.Integer.valueOf(tVar.f367894a));
        return tVar;
    }
}
