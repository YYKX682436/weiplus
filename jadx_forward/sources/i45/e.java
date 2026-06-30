package i45;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f369937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i45.d f369938e;

    public e(android.content.Context context, android.os.Bundle bundle, i45.d dVar) {
        this.f369937d = bundle;
        this.f369938e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i45.j jVar = i45.j.f369948a;
        i45.d dVar = this.f369938e;
        android.os.Bundle bundle = this.f369937d;
        int i17 = bundle.getInt("verify_ability", 1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyFile verifyAbility:" + i17);
        if (i17 == 1) {
            java.lang.String string = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.W0(android.net.Uri.parse(string))) {
                i45.d.b(dVar, 3L, null, null, 6, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile: VERIFY_ABILITY_FOR_FILE_PROVIDER isUriSafeToBeCopySrc false: no safe");
                return;
            }
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.e(string)) {
                i45.d.b(dVar, 0L, null, null, 6, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile: VERIFY_ABILITY_FOR_FILE_PROVIDER success");
                return;
            } else {
                i45.d.b(dVar, 3L, null, null, 6, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile: VERIFY_ABILITY_FOR_FILE_PROVIDER checkFileValid is false ");
                return;
            }
        }
        if (i17 != 2) {
            i45.d.b(dVar, -1L, null, null, 6, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile UNKNOWN_ERR");
            return;
        }
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) bundle.getParcelable("pfd");
        java.lang.String string2 = bundle.getString("content", "");
        if (parcelFileDescriptor != null) {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(parcelFileDescriptor.getFileDescriptor());
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            fileInputStream.close();
            byteArrayOutputStream.close();
            parcelFileDescriptor.close();
            java.lang.String g17 = kk.k.g(byteArrayOutputStream.toByteArray());
            android.os.Bundle bundle2 = dVar.f369935c;
            if (bundle2 != null) {
                bundle2.remove("pfd");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxImeHelper", "verifyFile contentMd5:" + string2 + ", generateMd5:" + g17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(string2, g17)) {
                i45.d.b(dVar, 0L, null, null, 6, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile: VERIFY_ABILITY_FOR_PARCEL_FILE_DESCRIPTOR success");
            } else {
                i45.d.b(dVar, 5L, null, null, 6, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxImeHelper", "verifyFile: VERIFY_ABILITY_FOR_PARCEL_FILE_DESCRIPTOR checkFileValid is false ");
            }
        }
    }
}
