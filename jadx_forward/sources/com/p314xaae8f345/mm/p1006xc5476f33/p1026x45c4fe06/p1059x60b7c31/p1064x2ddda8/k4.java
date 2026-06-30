package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class k4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 {

    /* renamed from: CTRL_INDEX */
    public static final int f33857x366c91de = 79;

    /* renamed from: NAME */
    public static final java.lang.String f33858x24728b = "operateWXData";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Boolean f161156g;

    public k4() {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4();
    }

    public static void J(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        try {
            java.lang.String[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1.b();
            if (b17 == null) {
                return;
            }
            for (java.lang.String str2 : b17) {
                if (!android.text.TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1.remove(str2);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th6);
        }
    }

    public static int K(java.lang.String str) {
        int m84094xe3d6cca;
        int i17 = 0;
        if (android.text.TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            java.lang.String[] b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1.b();
            if (b17 == null) {
                return 0;
            }
            int length = b17.length;
            int i18 = 0;
            while (i17 < length) {
                try {
                    java.lang.String str2 = b17[i17];
                    if (!android.text.TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce.f160907z1;
                        if (o4Var.U()) {
                            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f274434g;
                            readLock.lock();
                            o4Var.c(o4Var.f274432e);
                            m84094xe3d6cca = o4Var.f274431d.m84094xe3d6cca(str2);
                            readLock.unlock();
                        } else {
                            m84094xe3d6cca = o4Var.f274431d.m84094xe3d6cca(str2);
                        }
                        i18 += m84094xe3d6cca;
                    }
                    i17++;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    i17 = i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "clear(%s) e=%s", str, th);
                    return i17;
                }
            }
            return i18;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff ffVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) ffVar.f162546b;
        org.json.JSONObject jSONObject = ffVar.f162547c;
        int i17 = ffVar.f162549e;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jSONObject.put("wxdataDequeueTimestamp", java.lang.System.currentTimeMillis());
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
            th1.c a17 = th1.c.a(jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce c12004xb7c17ce = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12004xb7c17ce();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = yVar.x();
            boolean z18 = false;
            c12004xb7c17ce.B = x17 != null ? x17.i() : 0;
            c12004xb7c17ce.A = x17 != null ? x17.W0() : "";
            c12004xb7c17ce.f160930y = yVar.mo48798x74292566();
            c12004xb7c17ce.f160914m = "operateWXData";
            k91.z0 E0 = yVar.mo32091x9a3f0ba2().E0();
            if (E0 != null) {
                c12004xb7c17ce.f160920q = E0.f387385r.f156932d;
            }
            try {
                z18 = yVar.mo32091x9a3f0ba2().V0(new org.json.JSONObject(string).optString("api_name"));
            } catch (org.json.JSONException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "illegal arguments");
            }
            c12004xb7c17ce.W = z18;
            c12004xb7c17ce.f160909f = this;
            c12004xb7c17ce.f160910g = yVar;
            c12004xb7c17ce.f160915n = string;
            c12004xb7c17ce.V = a17;
            c12004xb7c17ce.f160912i = i17;
            c12004xb7c17ce.f160911h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.x2(c12004xb7c17ce, oVar);
            c12004xb7c17ce.H = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(c12004xb7c17ce.f160930y);
            if (d17 != null) {
                c12004xb7c17ce.T = d17.f169323f;
            }
            if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
                c12004xb7c17ce.U = 1;
            } else if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
                c12004xb7c17ce.U = 2;
            }
            int optInt = jSONObject.optInt("queueLength", -1);
            long optLong = jSONObject.optLong("wxdataQueueTimestamp", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            long optLong2 = jSONObject.optLong("wxdataDequeueTimestamp", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
            c12004xb7c17ce.Y = optInt;
            c12004xb7c17ce.Z = optLong;
            c12004xb7c17ce.f160918p0 = optLong2;
            c12004xb7c17ce.d();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateWXData", "Exception %s", e17.getMessage());
            yVar.a(i17, o("fail"));
            oVar.a();
        }
    }
}
