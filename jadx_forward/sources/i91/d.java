package i91;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f371232b = new java.util.Vector();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Vector f371231a = new java.util.Vector();

    /* renamed from: c, reason: collision with root package name */
    public final dn.k f371233c = new i91.c(this);

    public d() {
        new java.util.HashMap();
    }

    public static void a(i91.d dVar, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.Vector vector = dVar.f371231a;
        if (vector == null || vector.size() <= 0) {
            return;
        }
        java.util.Iterator it = vector.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a7 a7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a7) ((i91.h) it.next());
            a7Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", java.lang.Boolean.valueOf(z17), str2, str, str3);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe c11693xc4fcf5fe = a7Var.f163231a;
                if (str.equals(c11693xc4fcf5fe.f157635d)) {
                    i91.d Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12168x62e4d433 c12168x62e4d433 = a7Var.f163232b;
                    i91.g gVar = c12168x62e4d433.f163220x;
                    java.util.Vector vector2 = Ni.f371232b;
                    if (vector2 != null && gVar != null) {
                        vector2.remove(gVar);
                    }
                    i91.d Ni2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni();
                    i91.h hVar = c12168x62e4d433.f163221y;
                    java.util.Vector vector3 = Ni2.f371231a;
                    if (vector3 != null && hVar != null) {
                        vector3.remove(hVar);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Ni().b(c11693xc4fcf5fe.f157635d);
                    if (z17) {
                        c12168x62e4d433.f163208i = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
                    }
                    i91.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj();
                    java.lang.String str4 = c12168x62e4d433.f163208i;
                    bj6.getClass();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                        for (i91.b bVar : bj6.f371234a.values()) {
                            java.lang.String str5 = bVar.f371226c;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (str5.equals(str4)) {
                                break;
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
                    }
                    bVar = null;
                    if (bVar == null || bVar.f371228e == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
                        i91.a aVar = bVar.f371228e;
                        c12168x62e4d433.f163209m = aVar.f69860xf11df5f5;
                        c12168x62e4d433.f163208i = aVar.f69861xf9dbbe9c;
                        c12168x62e4d433.f163210n = aVar.f69863x419c440e;
                        c12168x62e4d433.f163211o = aVar.f69862x17c343e7;
                    }
                    c12168x62e4d433.f163214r = 1;
                    c12168x62e4d433.c();
                }
            }
        }
    }

    public boolean b(java.lang.String str) {
        i91.b bVar;
        i91.e bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.bj();
        bj6.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandMediaCdnItemManager", "get by local id error, local id is null or nil");
            bVar = null;
        } else {
            bVar = (i91.b) bj6.f371234a.get(str);
        }
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppbrandCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", str);
            return false;
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(bVar.f371227d);
        return true;
    }
}
