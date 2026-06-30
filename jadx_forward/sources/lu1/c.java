package lu1;

/* loaded from: classes12.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.List f402854a = new java.util.ArrayList();

    public static void a(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.String str3;
        lu1.b bVar;
        lu1.b bVar2;
        if (str == null || str2 == null || i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadHelpper", "the params is wrongful");
            return;
        }
        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(xt1.q.f538083c);
        if (!r6Var.J()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "mkdirs failed.File is exist = " + r6Var.m());
        }
        java.lang.String str4 = i18 == 2 ? ".jpeg" : ".mp4";
        if (r6Var.o().endsWith("/")) {
            str3 = r6Var.o() + b17 + str4;
        } else {
            str3 = r6Var.o() + "/" + b17 + str4;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "get file path from capture file name : %s == %s", b17, str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "before downloadVideoFromCDN fieldId:%s, aseKey:%s, dataLength:%d, type:%d, filePath:%s", str, str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "read file length = " + com.p314xaae8f345.mm.vfs.w6.k(str3));
        int i19 = 0;
        if (com.p314xaae8f345.mm.vfs.w6.j(str3) && com.p314xaae8f345.mm.vfs.w6.k(str3) == i17) {
            while (i19 < ((java.util.ArrayList) f402854a).size()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) f402854a).get(i19);
                if (weakReference != null && (bVar2 = (lu1.b) weakReference.get()) != null) {
                    bVar2.I1(str, str3);
                }
                i19++;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "filePath:%s is't exist, so download from CDN", str3);
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_CDNDownloadHelpper";
        mVar.f323320f = new lu1.a(str, str3);
        mVar.f323319e = false;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        mVar.f69601xaca5bdda = com.p314xaae8f345.mm.p947xba6de98f.i2.b("cardgiftfile", java.lang.System.currentTimeMillis(), str, str);
        mVar.f69595x6d25b0d9 = str3;
        mVar.f69620xeb1a61d6 = i17;
        mVar.f69592xf1ebe47b = 10011;
        mVar.f69591xf9dbbe9c = str;
        mVar.f69575xf11df5f5 = str2;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = true;
        boolean wi6 = ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "add download cdn task : %b, fileId : %s", java.lang.Boolean.valueOf(wi6), mVar.f69591xf9dbbe9c);
        if (wi6) {
            return;
        }
        while (i19 < ((java.util.ArrayList) f402854a).size()) {
            java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) f402854a).get(i19);
            if (weakReference2 != null && (bVar = (lu1.b) weakReference2.get()) != null) {
                bVar.J(str);
            }
            i19++;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadHelpper", "can't download from cdn!!!");
    }

    public static void b(lu1.b bVar) {
        if (f402854a == null) {
            f402854a = new java.util.ArrayList();
        }
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CDNDownloadHelpper", "ICDNDownloadCallback is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "register:%d", java.lang.Integer.valueOf(bVar.hashCode()));
            f402854a.add(new java.lang.ref.WeakReference(bVar));
        }
    }

    public static void c(lu1.b bVar) {
        lu1.b bVar2;
        if (f402854a == null || bVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CDNDownloadHelpper", "unregister:%d", java.lang.Integer.valueOf(bVar.hashCode()));
        for (int i17 = 0; i17 < f402854a.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) f402854a.get(i17);
            if (weakReference != null && (bVar2 = (lu1.b) weakReference.get()) != null && bVar2.equals(bVar)) {
                f402854a.remove(weakReference);
                return;
            }
        }
    }
}
