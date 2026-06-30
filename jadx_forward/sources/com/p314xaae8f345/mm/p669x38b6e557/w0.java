package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f146383d;

    public w0(com.p314xaae8f345.mm.p669x38b6e557.x0 x0Var, android.content.Intent intent) {
        this.f146383d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        long j38;
        long j39;
        long j47;
        long j48;
        java.lang.String str;
        com.p314xaae8f345.mm.vfs.q2 q2Var;
        com.p314xaae8f345.mm.vfs.x1 x1Var;
        java.lang.String str2;
        java.lang.String stringExtra = this.f146383d.getStringExtra("mode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "mode = " + stringExtra);
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.vfs.q2 b17 = ((com.p314xaae8f345.mm.vfs.r5) com.p314xaae8f345.mm.vfs.a3.f294314a.a()).b("image2");
        java.lang.Iterable o17 = com.p314xaae8f345.mm.vfs.e8.o(b17, "");
        long j49 = 0;
        if (o17 != null) {
            java.util.Iterator it = ((pm5.b) o17).iterator();
            long j57 = 0;
            long j58 = 0;
            long j59 = 0;
            long j66 = 0;
            long j67 = 0;
            long j68 = 0;
            long j69 = 0;
            long j76 = 0;
            long j77 = 0;
            long j78 = 0;
            long j79 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.vfs.x1 x1Var2 = (com.p314xaae8f345.mm.vfs.x1) it.next();
                java.util.Iterator it6 = it;
                if (x1Var2.f294769f) {
                    str = stringExtra;
                    q2Var = b17;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    long j86 = j66;
                    sb6.append(g83.a.b());
                    java.lang.String str3 = x1Var2.f294764a;
                    sb6.append(str3);
                    boolean g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(sb6.toString());
                    boolean z17 = x1Var2 instanceof com.p314xaae8f345.mm.vfs.k5;
                    long j87 = j58;
                    boolean equals = stringExtra.equals("detail");
                    long j88 = j59;
                    long j89 = x1Var2.f294767d;
                    if (equals) {
                        str = stringExtra;
                        if (z17) {
                            x1Var = x1Var2;
                            java.lang.String D = b17.D(str3, false);
                            if (D != null) {
                                q2Var = b17;
                                str2 = D.substring(D.indexOf(".ref/"));
                            } else {
                                q2Var = b17;
                                str2 = "null";
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", str3 + ", diskSpace = " + j89 + ", isLink = " + z17 + ", realPath = " + str2 + ", isWxam = " + g17);
                        } else {
                            x1Var = x1Var2;
                            q2Var = b17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", str3 + ", diskSpace = " + j89 + ", isLink = " + z17 + ", isWxam = " + g17);
                        }
                    } else {
                        x1Var = x1Var2;
                        str = stringExtra;
                        q2Var = b17;
                    }
                    if (g17) {
                        j49++;
                        j57 += j89;
                    }
                    if (z17) {
                        j67 += j89;
                        j88++;
                    }
                    j69++;
                    j77 += j89;
                    java.lang.String str4 = x1Var.f294765b;
                    if (str4.startsWith("th_")) {
                        if (str4.endsWith("hd")) {
                            j78++;
                            j79 += j89;
                        } else {
                            j68++;
                            j76 += j89;
                        }
                        j66 = j86;
                        j58 = j87;
                    } else {
                        j66 = j86 + j89;
                        j58 = j87 + 1;
                    }
                    j59 = j88;
                }
                it = it6;
                stringExtra = str;
                b17 = q2Var;
            }
            long j96 = j58;
            long j97 = j59;
            long j98 = j66;
            j29 = j49;
            j37 = j57;
            j39 = j67;
            j18 = j68;
            j47 = j69;
            j19 = j76;
            j48 = j77;
            j27 = j78;
            j28 = j79;
            j17 = j98;
            j49 = j96;
            j38 = j97;
        } else {
            j17 = 0;
            j18 = 0;
            j19 = 0;
            j27 = 0;
            j28 = 0;
            j29 = 0;
            j37 = 0;
            j38 = 0;
            j39 = 0;
            j47 = 0;
            j48 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalBigImageCount = " + j49 + ", totalBigImageSize = " + j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalThumbCount = " + j18 + ", totalThumbSize = " + j19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalHdThumbCount = " + j27 + ", totalHdThumbSize = " + j28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalWxamCount = " + j29 + ", totalWxamSize = " + j37);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalLinkFileCount = " + j38 + ", totalLinkFileSize = " + j39);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "totalImageCount = " + j47 + ", totalImageSize = " + j48);
    }
}
