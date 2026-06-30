package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.z0 f99050d;

    public r0(com.tencent.mm.plugin.exdevice.model.z0 z0Var) {
        this.f99050d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.plugin.exdevice.model.z0 z0Var = this.f99050d;
        try {
            java.lang.String str3 = lp0.b.l() + java.lang.String.format("%s%d.%s", "image", java.lang.Integer.valueOf(z0Var.I.hashCode()), "jpg");
            byte[] e17 = com.tencent.mm.plugin.exdevice.model.p.e(z0Var.I);
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get image error !");
                com.tencent.mm.plugin.exdevice.model.p.l(z0Var.L, "send_data_failed");
                return;
            }
            int length = e17.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(e17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/model/ExdeviceSendDataToNetworkDevice$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/exdevice/model/ExdeviceSendDataToNetworkDevice$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            z0Var.g(decodeByteArray, str3);
            z0Var.f99125n = str3;
            if (str3 == null && !com.tencent.mm.vfs.w6.j(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mSnsImagePath is null or file not exist!");
                com.tencent.mm.plugin.exdevice.model.p.l(z0Var.L, "send_data_failed");
                return;
            }
            r45.sf4 sf4Var = new r45.sf4();
            java.lang.String str4 = z0Var.f99125n;
            java.lang.String str5 = null;
            if (str4 == null || str4.length() <= 0) {
                i17 = -1;
                str = null;
                str2 = null;
            } else {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str4);
                java.lang.String str6 = a17.f213279f;
                if (str6 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                str = a17.f213279f;
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str = str.substring(lastIndexOf + 1);
                }
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                long j17 = 0;
                if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                    j17 = m17.f213233c;
                }
                int i18 = (int) j17;
                java.lang.String substring = str.substring(str.lastIndexOf(".") + 1, str.length());
                str2 = com.tencent.mm.vfs.w6.p(str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable filePath %s", str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileSize %s", java.lang.Integer.valueOf(i18));
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileMd5 %s", str2);
                i17 = i18;
                str5 = substring;
            }
            sf4Var.f385673d = str5;
            sf4Var.f385674e = str;
            sf4Var.f385675f = i17;
            sf4Var.f385676g = str2;
            r45.rf4 rf4Var = z0Var.f99117J;
            rf4Var.f384812g = sf4Var;
            rf4Var.f384809d = 3;
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.exdevice.model.g2(rf4Var, z0Var.K, z0Var.L, z0Var.M));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e18, "", new java.lang.Object[0]);
        }
    }
}
