package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 f180583d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var) {
        this.f180583d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.z0 z0Var = this.f180583d;
        try {
            java.lang.String str3 = lp0.b.l() + java.lang.String.format("%s%d.%s", "image", java.lang.Integer.valueOf(z0Var.I.hashCode()), "jpg");
            byte[] e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.e(z0Var.I);
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "get image error !");
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(z0Var.L, "send_data_failed");
                return;
            }
            int length = e17.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(e17);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/model/ExdeviceSendDataToNetworkDevice$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/exdevice/model/ExdeviceSendDataToNetworkDevice$1", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            z0Var.g(decodeByteArray, str3);
            z0Var.f180658n = str3;
            if (str3 == null && !com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "mSnsImagePath is null or file not exist!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p.l(z0Var.L, "send_data_failed");
                return;
            }
            r45.sf4 sf4Var = new r45.sf4();
            java.lang.String str4 = z0Var.f180658n;
            java.lang.String str5 = null;
            if (str4 == null || str4.length() <= 0) {
                i17 = -1;
                str = null;
                str2 = null;
            } else {
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
                java.lang.String str6 = a17.f294812f;
                if (str6 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str6, false, false);
                    if (!str6.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                str = a17.f294812f;
                int lastIndexOf = str.lastIndexOf("/");
                if (lastIndexOf >= 0) {
                    str = str.substring(lastIndexOf + 1);
                }
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                long j17 = 0;
                if (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) {
                    j17 = m17.f294766c;
                }
                int i18 = (int) j17;
                java.lang.String substring = str.substring(str.lastIndexOf(".") + 1, str.length());
                str2 = com.p314xaae8f345.mm.vfs.w6.p(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable filePath %s", str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileSize %s", java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "downloadImageRunnable fileMd5 %s", str2);
                i17 = i18;
                str5 = substring;
            }
            sf4Var.f467206d = str5;
            sf4Var.f467207e = str;
            sf4Var.f467208f = i17;
            sf4Var.f467209g = str2;
            r45.rf4 rf4Var = z0Var.f180650J;
            rf4Var.f466345g = sf4Var;
            rf4Var.f466342d = 3;
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.g2(rf4Var, z0Var.K, z0Var.L, z0Var.M));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", e18, "", new java.lang.Object[0]);
        }
    }
}
