package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f64804d;

    public h1(com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f64804d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File file = new java.io.File("/sdcard/Documents/com.tencent.wechat");
        if (file.exists()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "pkg_dir path exist, deleting: " + file.getAbsolutePath());
            com.tencent.mm.vfs.w6.g(file.getAbsolutePath(), true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "deleteDir done");
        }
        java.io.File file2 = new java.io.File(file, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
        java.io.File file3 = new java.io.File(file2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.io.File file4 = new java.io.File(file2, "obb");
        java.io.File file5 = new java.io.File(file3, "MicroMsg");
        file2.mkdirs();
        file3.mkdirs();
        file4.mkdirs();
        file5.mkdirs();
        java.io.File file6 = new java.io.File(file, "ce");
        java.io.File file7 = new java.io.File(file6, "files");
        java.io.File file8 = new java.io.File(file6, "MicroMsg");
        file7.mkdirs();
        file8.mkdirs();
        new java.io.File(file, "de").mkdirs();
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir() + "/KeyInfo.bin";
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "Start copy KeyInfo.bin");
        com.tencent.mm.vfs.w6.c(str, file7.getAbsolutePath() + "/KeyInfo.bin");
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "Copy KeyInfo.bin done");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(gm0.j1.u().h());
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!a17.f213279f.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        final java.io.File file9 = new java.io.File(file8, str3);
        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(gm0.j1.u().d());
        java.lang.String str4 = a18.f213279f;
        if (str4 != null) {
            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
            if (!a18.f213279f.equals(l18)) {
                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
            }
        }
        java.lang.String str5 = a18.f213279f;
        int lastIndexOf2 = str5.lastIndexOf("/");
        if (lastIndexOf2 >= 0) {
            str5 = str5.substring(lastIndexOf2 + 1);
        }
        final java.io.File file10 = new java.io.File(file5, str5);
        file9.mkdirs();
        file10.mkdirs();
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "Start copy data account");
        java.lang.String[] strArr = {"account.mapping", "EnMicroMsg.db", "EnMicroMsg.db-wal", "image2", "video", "voice2", "attachment", "record"};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.console.h1$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String absolutePath = new java.io.File(gm0.j1.u().h(), com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE).getAbsolutePath();
                java.lang.String absolutePath2 = new java.io.File(absolutePath, "media").getAbsolutePath();
                if (new java.io.File(absolutePath).exists()) {
                    java.lang.String absolutePath3 = new java.io.File(file9.getAbsolutePath(), com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE).getAbsolutePath();
                    java.lang.String absolutePath4 = new java.io.File(absolutePath3, "media").getAbsolutePath();
                    com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "copy data_account from = " + absolutePath + ", to = " + absolutePath3);
                    if (new java.io.File(absolutePath).isDirectory()) {
                        try {
                            s46.b.b(new java.io.File(absolutePath2), new java.io.File(absolutePath4));
                        } catch (java.io.IOException e17) {
                            throw new java.lang.RuntimeException(e17);
                        }
                    }
                }
            }
        }));
        for (int i17 = 0; i17 < 8; i17++) {
            final java.lang.String str6 = strArr[i17];
            arrayList.add(((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.console.h1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String h17 = gm0.j1.u().h();
                    java.lang.String str7 = str6;
                    java.lang.String absolutePath = new java.io.File(h17, str7).getAbsolutePath();
                    if (new java.io.File(absolutePath).exists()) {
                        java.lang.String absolutePath2 = new java.io.File(file9.getAbsolutePath(), str7).getAbsolutePath();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "copy data_account from = " + absolutePath + ", to = " + absolutePath2);
                        if (new java.io.File(absolutePath).isDirectory()) {
                            try {
                                s46.b.b(new java.io.File(absolutePath), new java.io.File(absolutePath2));
                            } catch (java.io.IOException e17) {
                                throw new java.lang.RuntimeException(e17);
                            }
                        } else {
                            try {
                                s46.b.c(new java.io.File(absolutePath), new java.io.File(absolutePath2));
                            } catch (java.io.IOException e18) {
                                throw new java.lang.RuntimeException(e18);
                            }
                        }
                    }
                    java.lang.String absolutePath3 = new java.io.File(gm0.j1.u().d(), str7).getAbsolutePath();
                    if (new java.io.File(absolutePath3).exists()) {
                        java.lang.String absolutePath4 = new java.io.File(file10.getAbsolutePath(), str7).getAbsolutePath();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "copy sdcard_account from = " + absolutePath3 + ", to = " + absolutePath4);
                        if (new java.io.File(absolutePath3).isDirectory()) {
                            try {
                                s46.b.b(new java.io.File(absolutePath3), new java.io.File(absolutePath4));
                            } catch (java.io.IOException e19) {
                                throw new java.lang.RuntimeException(e19);
                            }
                        } else {
                            try {
                                s46.b.c(new java.io.File(absolutePath3), new java.io.File(absolutePath4));
                            } catch (java.io.IOException e27) {
                                throw new java.lang.RuntimeException(e27);
                            }
                        }
                    }
                }
            }));
        }
        arrayList.add(((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.console.i1(this, "Download", file5)));
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "beofre copy");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((wu5.c) it.next()).get();
            } catch (java.lang.InterruptedException e17) {
                throw new java.lang.RuntimeException(e17);
            } catch (java.util.concurrent.ExecutionException e18) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "copy done");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.console.j1(this));
    }
}
