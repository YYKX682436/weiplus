package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f146337d;

    public h1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f146337d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.File file = new java.io.File("/sdcard/Documents/com.tencent.wechat");
        if (file.exists()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "pkg_dir path exist, deleting: " + file.getAbsolutePath());
            com.p314xaae8f345.mm.vfs.w6.g(file.getAbsolutePath(), true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "deleteDir done");
        }
        java.io.File file2 = new java.io.File(file, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f);
        java.io.File file3 = new java.io.File(file2, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
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
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir() + "/KeyInfo.bin";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Start copy KeyInfo.bin");
        com.p314xaae8f345.mm.vfs.w6.c(str, file7.getAbsolutePath() + "/KeyInfo.bin");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Copy KeyInfo.bin done");
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().h());
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        final java.io.File file9 = new java.io.File(file8, str3);
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(gm0.j1.u().d());
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!a18.f294812f.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        java.lang.String str5 = a18.f294812f;
        int lastIndexOf2 = str5.lastIndexOf("/");
        if (lastIndexOf2 >= 0) {
            str5 = str5.substring(lastIndexOf2 + 1);
        }
        final java.io.File file10 = new java.io.File(file5, str5);
        file9.mkdirs();
        file10.mkdirs();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Start copy data account");
        java.lang.String[] strArr = {"account.mapping", "EnMicroMsg.db", "EnMicroMsg.db-wal", "image2", "video", "voice2", "attachment", "record"};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.console.h1$$a
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String absolutePath = new java.io.File(gm0.j1.u().h(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7).getAbsolutePath();
                java.lang.String absolutePath2 = new java.io.File(absolutePath, "media").getAbsolutePath();
                if (new java.io.File(absolutePath).exists()) {
                    java.lang.String absolutePath3 = new java.io.File(file9.getAbsolutePath(), com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7).getAbsolutePath();
                    java.lang.String absolutePath4 = new java.io.File(absolutePath3, "media").getAbsolutePath();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "copy data_account from = " + absolutePath + ", to = " + absolutePath3);
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
            arrayList.add(((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.console.h1$$b
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String h17 = gm0.j1.u().h();
                    java.lang.String str7 = str6;
                    java.lang.String absolutePath = new java.io.File(h17, str7).getAbsolutePath();
                    if (new java.io.File(absolutePath).exists()) {
                        java.lang.String absolutePath2 = new java.io.File(file9.getAbsolutePath(), str7).getAbsolutePath();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "copy data_account from = " + absolutePath + ", to = " + absolutePath2);
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "copy sdcard_account from = " + absolutePath3 + ", to = " + absolutePath4);
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
        arrayList.add(((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p669x38b6e557.i1(this, "Download", file5)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "beofre copy");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "copy done");
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p669x38b6e557.j1(this));
    }
}
