package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class m5 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n5 {
    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.k5 k5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.n5
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5 a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17, int i18, int i19) {
        jc1.d dVar = jc1.g.f380465d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = lVar.mo50354x59eafec1();
        if (mo50354x59eafec1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:fileSystem is null");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:runtime fileSystem is null", jc1.f.f380448d);
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(str);
        if (mo49620x1d537609 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:file doesn't exist");
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:file doesn't exist", jc1.g.f380462a);
        }
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap Bc = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Bc(mo49620x1d537609.o(), options);
            if (Bc == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:decode image fail");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:decode image fail", jc1.g.f380463b);
            }
            android.graphics.Bitmap C = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j5.C(Bc, i18, i19);
            java.lang.String str2 = je.a.d(options) ? "jpg" : "png";
            java.lang.String str3 = lp0.b.K() + "microMsg.tmp." + java.lang.System.currentTimeMillis() + "." + str2;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(C, i17, je.a.d(options) ? android.graphics.Bitmap.CompressFormat.JPEG : android.graphics.Bitmap.CompressFormat.PNG, str3, true);
            if (je.a.d(options)) {
                ya1.d.b(mo49620x1d537609.o(), str3);
            }
            ik1.b0 b0Var = new ik1.b0();
            if (mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)), str2, false, b0Var) != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:create tmp file fail");
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:create tmp file fail", jc1.g.f380464c);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCompressImage.javayhu", "compressImage ok, dstPath:%s, tmpPath:%s", str3, b0Var.f373357a);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(true, (java.lang.String) b0Var.f373357a, jc1.f.f380445a);
        } catch (java.lang.NullPointerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image NPE", e17);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:compress image NPE", dVar);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image exception", e18);
            com.p314xaae8f345.mm.vfs.w6.h(null);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:compress image exception", dVar);
        } catch (java.lang.OutOfMemoryError e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCompressImage.javayhu", "compressImage fail:compress image OOM", e19);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.l5(false, "fail:compress image OOM", jc1.f.f380460p);
        }
    }
}
