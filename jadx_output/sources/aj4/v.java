package aj4;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final aj4.v f5377a = new aj4.v();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(aj4.v r11, java.lang.String r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj4.v.a(aj4.v, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final bw5.sb b(java.lang.String str) {
        bw5.sb sbVar = new bw5.sb();
        sbVar.f32874d = bw5.ub.Image;
        boolean[] zArr = sbVar.f32879i;
        zArr[1] = true;
        sbVar.f32875e = str == null ? "" : str;
        zArr[2] = true;
        if (!(str == null || str.length() == 0)) {
            android.graphics.BitmapFactory.Options n07 = com.tencent.mm.sdk.platformtools.x.n0(str);
            bw5.tb tbVar = new bw5.tb();
            if (n07 != null) {
                tbVar.f33344d = n07.outWidth;
                boolean[] zArr2 = tbVar.f33347g;
                zArr2[1] = true;
                tbVar.f33345e = n07.outHeight;
                zArr2[2] = true;
            }
            tbVar.c(com.tencent.mm.vfs.w6.k(str));
            sbVar.f32876f = tbVar;
            zArr[3] = true;
        }
        sbVar.f32877g = sbVar.b();
        zArr[4] = true;
        sbVar.f32878h = zArr[3] ? sbVar.f32876f : new bw5.tb();
        zArr[5] = true;
        return sbVar;
    }

    public final bw5.sb c(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        qc0.d1 wi6;
        bw5.sb sbVar = new bw5.sb();
        sbVar.f32874d = bw5.ub.Video;
        boolean[] zArr = sbVar.f32879i;
        zArr[1] = true;
        sbVar.f32875e = str == null ? "" : str;
        zArr[2] = true;
        bw5.tb tbVar = new bw5.tb();
        tbVar.c(com.tencent.mm.vfs.w6.k(str));
        if (!(str == null || str.length() == 0) && (wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str)) != null) {
            tbVar.f33344d = wi6.f361363a;
            boolean[] zArr2 = tbVar.f33347g;
            zArr2[1] = true;
            tbVar.f33345e = wi6.f361364b;
            zArr2[2] = true;
        }
        sbVar.f32876f = tbVar;
        zArr[3] = true;
        sbVar.f32877g = str2 != null ? str2 : "";
        zArr[4] = true;
        bw5.tb tbVar2 = new bw5.tb();
        tbVar2.c(com.tencent.mm.vfs.w6.k(str2));
        sbVar.f32878h = tbVar2;
        zArr[5] = true;
        return sbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bw5.sb d(bw5.sb r17) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj4.v.d(bw5.sb):bw5.sb");
    }

    public final byte[] e(android.graphics.Bitmap bitmap, int i17) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i17, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final java.lang.String f() {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir(), "TextStatus/flutter_compress");
        if (!r6Var.m()) {
            r6Var.J();
        }
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, "img_" + java.lang.System.currentTimeMillis() + '_' + e06.p.j(new e06.k(0, Integer.MAX_VALUE), c06.e.f37716d) + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        return o17;
    }
}
