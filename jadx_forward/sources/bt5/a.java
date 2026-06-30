package bt5;

/* loaded from: classes13.dex */
public abstract class a {
    public static java.util.List a(android.graphics.Bitmap bitmap, int[] iArr, boolean z17) {
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanImageUtil", "directScanBitmap enableMultiCode: %b", java.lang.Boolean.valueOf(z17));
        ((jd0.w2) ((kd0.e3) i95.n0.c(kd0.e3.class))).getClass();
        zs5.a0 type = (zs5.a0) ((jz5.n) zs5.n0.f556984b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        zs5.z zVar = new zs5.z();
        ry3.s sVar = new ry3.s(1);
        sVar.f483090c = z17;
        sVar.f483089b = ((jd0.l2) ((kd0.w2) i95.n0.c(kd0.w2.class))).Ai(1, false);
        sVar.f483092e = iArr;
        zVar.b(sVar.f483090c);
        zVar.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1, sVar);
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanImageUtil", "directScanBitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
            int[] iArr2 = new int[bitmap.getWidth() * bitmap.getHeight()];
            bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
            list = zVar.g(iArr2, new android.graphics.Point(bitmap.getWidth(), bitmap.getHeight()));
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Integer.valueOf(list == null ? 0 : ((java.util.ArrayList) list).size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanImageUtil", "directScanBitmap get %d decode results", objArr);
            if (list != null) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    zs5.c0 c0Var = (zs5.c0) it.next();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanImageUtil", "result " + c0Var.f556864e + "," + c0Var.f556865f);
                }
            }
        } else {
            list = null;
        }
        zVar.mo142436x41012807();
        int i17 = e04.f2.e() == 1 ? 1722 : 1229;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanImageUtil", "QBar init report, directScanBitmap idKey:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C((long) i17, 20L, 1L);
        return list;
    }

    public static zs5.c0 b(android.graphics.Bitmap bitmap, int[] iArr) {
        java.util.List a17 = a(bitmap, iArr, false);
        if (a17 == null || a17.size() <= 0) {
            return null;
        }
        return (zs5.c0) a17.get(0);
    }
}
