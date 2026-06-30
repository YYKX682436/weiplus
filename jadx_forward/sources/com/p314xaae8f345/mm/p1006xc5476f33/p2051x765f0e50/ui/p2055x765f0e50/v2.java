package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e f243161d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e) {
        this.f243161d = activityC17388xa7b1222e;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.STORAGE, d85.f0.M, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u2(this))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQRCodeNewUI", "business switch close ,return");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17388xa7b1222e activityC17388xa7b1222e = this.f243161d;
        java.io.OutputStream outputStream = null;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC17388xa7b1222e.f241713i)) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            java.lang.String str = activityC17388xa7b1222e.f241713i;
            ((qv.o) u2Var).getClass();
            if (!r01.z.j(str)) {
                bArr = activityC17388xa7b1222e.f241715n;
                if (bArr != null || bArr.length <= 0) {
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                sb6.append(q75.c.d());
                sb6.append("mmqrcode");
                sb6.append(java.lang.System.currentTimeMillis());
                sb6.append(".png");
                java.lang.String sb7 = sb6.toString();
                try {
                    try {
                        outputStream = com.p314xaae8f345.mm.sdk.p2603x2137b148.u6.a(activityC17388xa7b1222e.mo55332x76847179(), sb7);
                        outputStream.write(bArr);
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        dp.a.m125854x26a183b(activityC17388xa7b1222e, activityC17388xa7b1222e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573837g00, q75.c.e()), 1).show();
                        ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                        q75.c.f(sb7, activityC17388xa7b1222e);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelfQRCodeNewUI", e17, "", new java.lang.Object[0]);
                        if (outputStream == null) {
                            return;
                        }
                    }
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused) {
                        return;
                    }
                } catch (java.lang.Throwable th6) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                    throw th6;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 10L, 1L, true);
        android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(activityC17388xa7b1222e.findViewById(com.p314xaae8f345.mm.R.id.f568026lf2));
        if (b07 != null) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            b07.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            bArr = null;
        }
        if (bArr == null) {
            bArr = activityC17388xa7b1222e.f241715n;
        }
        if (bArr != null) {
        }
    }
}
