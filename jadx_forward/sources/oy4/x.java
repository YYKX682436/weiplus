package oy4;

@j95.b
/* loaded from: classes5.dex */
public final class x extends i95.w implements ek0.e {

    /* renamed from: d, reason: collision with root package name */
    public static ny4.e f431618d;

    public final oy4.a Ai(java.lang.String imagePath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "getBufferImageData >> ".concat(imagePath));
        if (!com.p314xaae8f345.mm.vfs.w6.j(imagePath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "file is no exists");
            return null;
        }
        android.graphics.Bitmap M = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.M(imagePath, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, true, null);
        if (M == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "bitmap is null");
            return null;
        }
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(M.getByteCount());
        M.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        return new oy4.a(M, allocateDirect);
    }

    public java.util.ArrayList Bi(java.util.ArrayList imagePathList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePathList, "imagePathList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f431618d == null) {
            f431618d = new ny4.e();
        }
        java.util.Iterator it = imagePathList.iterator();
        while (true) {
            if (!it.hasNext()) {
                f431618d = null;
                return arrayList;
            }
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "getImageHash >> " + str);
            oy4.a Ai = Ai(str);
            java.nio.Buffer buffer = Ai != null ? Ai.f431585b : null;
            android.graphics.Bitmap bitmap = Ai != null ? Ai.f431584a : null;
            java.lang.String str2 = "";
            if (buffer == null || bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OcrApiImpl", "getImageHash >> buffer get error");
                arrayList.add("");
            } else {
                if (f431618d != null) {
                    str2 = com.p314xaae8f345.p3194x3786ebc.p3196x49292787.p3197x30c10e.C27757x4898d7e.m119887x8fb1c183(new com.p314xaae8f345.p3194x3786ebc.p3195x2e06d1.C27752xfde37e46(bitmap.getWidth(), bitmap.getHeight(), 3, (java.nio.ByteBuffer) buffer)).f60673x6ac9171;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatClsManager", "getImageOcrHash >> result: " + str2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                }
                arrayList.add(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "getImageHash >> ".concat(str2));
            }
        }
    }

    public java.util.ArrayList Di(java.util.ArrayList imagePathList) {
        java.lang.String a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePathList, "imagePathList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!Ni()) {
            return arrayList;
        }
        java.util.Iterator it = imagePathList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "getImageOcrResult >> " + str);
            oy4.a Ai = Ai(str);
            java.nio.Buffer buffer = Ai != null ? Ai.f431585b : null;
            android.graphics.Bitmap bitmap = Ai != null ? Ai.f431584a : null;
            java.lang.String str2 = "";
            if (buffer == null || bitmap == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OcrApiImpl", "getImageOcrResult >> buffer get error");
                arrayList.add("");
            } else {
                ny4.e eVar = f431618d;
                if (eVar != null && (a17 = eVar.a(buffer, bitmap.getWidth(), bitmap.getHeight())) != null) {
                    str2 = a17;
                }
                arrayList.add(str2);
            }
        }
        wi();
        return arrayList;
    }

    public final boolean Ni() {
        if (f431618d != null) {
            return true;
        }
        ny4.e eVar = new ny4.e();
        f431618d = eVar;
        boolean e17 = eVar.e(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "initEnv >> " + e17);
        return e17;
    }

    public final void wi() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OcrApiImpl", "destroyEnv");
        ny4.e eVar = f431618d;
        if (eVar != null) {
            eVar.c();
        }
        f431618d = null;
    }
}
