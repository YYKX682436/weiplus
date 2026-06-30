package p32;

/* loaded from: classes12.dex */
public abstract class g {
    public static boolean a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18, android.content.Intent intent, java.lang.String str) {
        java.lang.String o17;
        if (i17 == 1001 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
            if (stringArrayListExtra != null && stringArrayListExtra.size() >= 1) {
                java.lang.String str2 = stringArrayListExtra.get(0);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.gallery.picker.view.ImageCropUI");
                intent2.putExtra("CropImageMode", 1);
                intent2.putExtra("CropImage_OutputPath", lp0.b.v() + "temp.cover");
                intent2.putExtra("CropImage_ImgPath", str2);
                abstractActivityC21394xb3d2c0cf.startActivityForResult(intent2, 1002);
                return true;
            }
        } else if (i17 == 1002 && i18 == -1) {
            java.lang.String str3 = lp0.b.v() + "temp.cover";
            java.lang.String str4 = p32.c.f432992a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                o17 = "";
            } else {
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str3.getBytes()) + "_t";
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(p32.c.f432992a);
                if (!r6Var.m() || !r6Var.y()) {
                    r6Var.J();
                }
                o17 = new com.p314xaae8f345.mm.vfs.r6(r6Var, str5).o();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.x(str3, 640, 640, android.graphics.Bitmap.CompressFormat.JPEG, 100, o17, true);
            java.lang.System.currentTimeMillis();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180518s == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180518s = new p32.b();
            }
            p32.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180518s;
            bVar.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("uploadexdeivce", currentTimeMillis, c01.z1.g().d1(), "" + currentTimeMillis);
            bVar.f432991d = b17;
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_ExdevicePictureUploader";
            mVar.f323320f = bVar;
            mVar.f69601xaca5bdda = b17;
            mVar.f69595x6d25b0d9 = o17;
            mVar.f69619xe9ed65f6 = "";
            mVar.f69592xf1ebe47b = 20321;
            mVar.f69618x114ef53e = "";
            mVar.f69609xd84b8349 = 1;
            mVar.f69606xccdbf540 = true;
            mVar.f69597x853bb235 = false;
            mVar.f69580x454032b6 = 200;
            mVar.f69584x89a4c0cf = 2;
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExdevicePictureUploader", "hy: cdntra addSendTask failed. clientid:%s", b17);
            }
            return true;
        }
        return false;
    }

    public static void b(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17) {
        o11.g a17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || "#".equals(str)) {
            imageView.setImageResource(i17);
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t = n11.a.b();
        }
        n11.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.SubCoreExDevice", "newImageOptions failed, url is null or nil, return default.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3 Ai = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai();
            if (Ai.f180520u == null) {
                o11.f fVar = new o11.f();
                fVar.f423620k = 640;
                fVar.f423619j = 640;
                fVar.f423610a = false;
                fVar.f423611b = true;
                Ai.f180520u = fVar.a();
            }
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180520u;
        } else {
            o11.f fVar2 = new o11.f();
            fVar2.f423620k = 640;
            fVar2.f423619j = 640;
            fVar2.f423610a = false;
            fVar2.f423612c = true;
            fVar2.f423616g = g83.a.a();
            a17 = fVar2.a();
        }
        aVar.h(str, imageView, a17);
    }

    public static void c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf.mo55332x76847179(), 1, false);
        k0Var.f293405n = new p32.e(abstractActivityC21394xb3d2c0cf);
        k0Var.f293414s = new p32.f(abstractActivityC21394xb3d2c0cf);
        k0Var.v();
    }
}
