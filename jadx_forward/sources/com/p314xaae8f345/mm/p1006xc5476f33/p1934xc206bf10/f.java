package com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1934xc206bf10.u uVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().sourceDir;
                byte[] l17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.l(gm0.j1.b().h());
                byte[] m17 = com.p314xaae8f345.mm.p975xc206bf10.C11193xebe3852e.m(gm0.j1.b().h());
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                java.lang.String format = java.lang.String.format("<k25>%s</k25>", ko3.e0.a(l17, 0, l17.length));
                if (m17 != null) {
                    if (m17.length == 8) {
                        byte b17 = m17[0];
                        m17[0] = m17[3];
                        m17[3] = b17;
                        byte b18 = m17[1];
                        m17[1] = m17[2];
                        m17[2] = b18;
                        byte b19 = m17[4];
                        m17[4] = m17[7];
                        m17[7] = b19;
                        byte b27 = m17[5];
                        m17[5] = m17[6];
                        m17[6] = b27;
                        format = format + java.lang.String.format("<k28>%s</k28><k29>%s</k29>", ko3.e0.a(m17, 0, 4), ko3.e0.a(m17, 4, 8));
                    } else {
                        format = format + java.lang.String.format("<k27>%s</k27>", ko3.e0.a(m17, 0, m17.length));
                    }
                }
                try {
                    java.lang.String hostAddress = java.net.InetAddress.getByName(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9)).getHostAddress();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(format);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (hostAddress == null) {
                        hostAddress = "";
                    }
                    objArr[0] = hostAddress;
                    sb6.append(java.lang.String.format("<k32>%s</k32>", objArr));
                    format = sb6.toString();
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSourceImpl", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormsgSourceImpl", "checkSoftType2 [time: " + currentTimeMillis2 + ", value: " + format + "]");
                gm0.j1.u().c().w(79, format);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NormsgSourceImpl", e18, "Failed checkSoftType2.", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m67472x9616526c() {
        return super.toString() + "|checkSoftTypeExtra";
    }
}
