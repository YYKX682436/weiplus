package oc5;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6652x4988fe73 f425927a;

    /* renamed from: b, reason: collision with root package name */
    public oc5.a f425928b;

    /* renamed from: c, reason: collision with root package name */
    public oc5.b f425929c;

    public final void a(int i17) {
        oc5.a aVar = this.f425928b;
        if (aVar != null) {
            aVar.f425908b = i17;
        }
        if (aVar != null) {
            aVar.f425912f = java.lang.System.currentTimeMillis();
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        oc5.a aVar2 = this.f425928b;
        objArr[1] = aVar2 != null ? java.lang.Long.valueOf(aVar2.f425912f) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanButtonReporter", "clickFinish clickResult: %d, %s", objArr);
        oc5.a aVar3 = this.f425928b;
        if (aVar3 != null && aVar3.f425914h) {
            return;
        }
        if (aVar3 != null) {
            aVar3.f425914h = true;
        }
        if (!(aVar3 != null && aVar3.f425908b == 1) && aVar3 != null) {
            aVar3.f425908b = 2;
        }
        if (aVar3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[9];
            objArr2[0] = aVar3.f425907a;
            objArr2[1] = java.lang.Integer.valueOf(aVar3.f425908b);
            objArr2[2] = java.lang.Integer.valueOf(aVar3.f425910d);
            objArr2[3] = java.lang.Long.valueOf(aVar3.f425911e);
            objArr2[4] = java.lang.Long.valueOf(aVar3.f425912f);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6652x4988fe73 c6652x4988fe73 = this.f425927a;
            objArr2[5] = c6652x4988fe73 != null ? c6652x4988fe73.f139993i : null;
            objArr2[6] = c6652x4988fe73 != null ? c6652x4988fe73.f139994j : null;
            objArr2[7] = java.lang.Integer.valueOf(aVar3.f425909c);
            objArr2[8] = java.lang.Long.valueOf(aVar3.f425913g);
            g0Var.d(19778, objArr2);
        }
    }

    public final void b(int i17, int i18, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanButtonReporter", "clickScanButton entryType: " + i17 + ", iconType: %d, codeSessionId: " + j17, java.lang.Integer.valueOf(i18));
        oc5.a aVar = new oc5.a();
        this.f425928b = aVar;
        aVar.f425907a = "";
        aVar.f425908b = 0;
        aVar.f425909c = 0;
        aVar.f425910d = 0;
        aVar.f425911e = 0L;
        aVar.f425912f = 0L;
        aVar.f425914h = false;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6652x4988fe73 c6652x4988fe73 = this.f425927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c6652x4988fe73);
        java.lang.String str = c6652x4988fe73.f139990f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getSessionId(...)");
        aVar.f425907a = str;
        aVar.f425909c = i17;
        aVar.f425910d = i18;
        aVar.f425911e = java.lang.System.currentTimeMillis();
        if (i18 == 2) {
            aVar.f425913g = j17;
        } else {
            aVar.f425913g = 0L;
        }
    }

    public final void c(int i17, m11.b0 b0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6652x4988fe73 c6652x4988fe73 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6652x4988fe73();
        this.f425927a = c6652x4988fe73;
        c6652x4988fe73.f139992h = 1L;
        c6652x4988fe73.f139991g = 1L;
        c6652x4988fe73.f139988d = java.lang.System.currentTimeMillis();
        c6652x4988fe73.f139989e = i17;
        c6652x4988fe73.f139990f = c6652x4988fe73.b("SessionId", c01.z1.r() + '_' + c6652x4988fe73.f139988d, true);
        c6652x4988fe73.f139993i = c6652x4988fe73.b("FileID", b0Var != null ? b0Var.f() : null, true);
        c6652x4988fe73.f139994j = c6652x4988fe73.b("AesKey", b0Var != null ? b0Var.d() : null, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c6652x4988fe73.f139990f, "getSessionId(...)");
        oc5.b bVar = new oc5.b();
        java.lang.System.currentTimeMillis();
        this.f425929c = bVar;
    }
}
