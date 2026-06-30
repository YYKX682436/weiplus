package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class a4 {
    public static ot0.q a(java.lang.String str, ot0.s0 s0Var) {
        ot0.q qVar = new ot0.q();
        qVar.f430187f = s0Var.f430294d;
        qVar.f430191g = s0Var.f430302n;
        qVar.f430199i = 33;
        qVar.f430206j2 = s0Var.f430308r;
        qVar.f430202i2 = s0Var.f430309s;
        qVar.f430210k2 = s0Var.f430312v;
        qVar.f430270z2 = s0Var.f430311u;
        qVar.A2 = s0Var.f430310t;
        qVar.f430218m2 = "";
        qVar.f430214l2 = 2;
        qVar.f430207k = s0Var.f430295e;
        qVar.B2 = s0Var.f430314x;
        qVar.L1 = "wxapp_" + s0Var.f430312v + s0Var.f430309s;
        qVar.f430255w = s0Var.f430308r;
        qVar.f430259x = s0Var.f430316y;
        ot0.a aVar = new ot0.a();
        aVar.f429879b = false;
        aVar.f429880c = "";
        qVar.f(aVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f430267z)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(str);
            if (n07 != null) {
                qVar.f430267z = n07.c();
            }
        }
        return qVar;
    }

    public static boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (f9Var == null || !f9Var.t2()) {
            return false;
        }
        java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j()).f430114i;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            if (i17 < 0 || i17 >= linkedList.size()) {
                i17 = 0;
            }
            if (k01.o.a(((ot0.s0) linkedList.get(i17)).f430308r)) {
                return true;
            }
        }
        return false;
    }

    public static void c(java.lang.String str, boolean z17, ot0.q qVar, java.lang.String str2) {
        try {
            byte[] bArr = new byte[0];
            android.graphics.Bitmap bitmap = null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (str2.startsWith("http://") || str2.startsWith("https://"))) {
                bitmap = l01.d0.f396294a.f(str2, null);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            byte[] bArr2 = bArr;
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) ? 1 : 0;
            java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, qVar.f430210k2, qVar.n(), str, null, bArr2).second;
            if (obj != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(str, (java.lang.Long) obj);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14127, qVar.f430210k2, qVar.f430206j2, qVar.f430202i2, qVar.n(), qVar.f430191g, "", qVar.f430207k, 0, 1, 2, java.lang.Integer.valueOf(i17), str, 1, qVar.f430222n2, "");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingEditModeSendToAppBrand", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", e17.getLocalizedMessage());
        }
    }
}
