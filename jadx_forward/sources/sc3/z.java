package sc3;

/* loaded from: classes7.dex */
public final class z implements com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f488086a;

    public z(sc3.k1 k1Var) {
        this.f488086a = k1Var;
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getAbTest */
    public java.lang.String mo32132x1029ef49(java.lang.String str) {
        java.lang.String a17 = j62.e.g().a(str, "", true, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMulitExpt(...)");
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getAbsolutePath */
    public java.lang.String mo32133x1d57e4b2(java.lang.String str) {
        java.lang.String str2;
        sc3.k1 k1Var = this.f488086a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wemedia: getFilePath " + str);
        if ((str == null || str.length() == 0) || r26.i0.y(str, "http://", false) || r26.i0.y(str, "https://", false)) {
            return str;
        }
        if (r26.i0.y(str, "wxfile://", false)) {
            jc3.x xVar = k1Var.f488019r;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = xVar.b().mo49620x1d537609(str);
            if (mo49620x1d537609 != null && mo49620x1d537609.m()) {
                java.lang.String o17 = mo49620x1d537609.o();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wemedia: getFilePath ret = " + o17);
                return o17;
            }
        }
        bf3.g0 g0Var = bf3.g0.f101160a;
        jc3.x xVar2 = k1Var.f488019r;
        if (xVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
            throw null;
        }
        java.nio.ByteBuffer c17 = g0Var.c(xVar2, str);
        if (c17 != null && c17.capacity() > 0) {
            jc3.x xVar3 = k1Var.f488019r;
            if (xVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b17 = xVar3.b();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(k1Var.Q);
            sb6.append("_wemedia_getAbsolutePath_");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            com.p314xaae8f345.mm.vfs.r6 mo49614x6665a5c5 = b17.mo49614x6665a5c5(sb6.toString());
            if (mo49614x6665a5c5 != null) {
                byte[] bArr = new byte[c17.remaining()];
                c17.get(bArr);
                com.p314xaae8f345.mm.vfs.s6.c(mo49614x6665a5c5, bArr);
                str2 = mo49614x6665a5c5.o();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wemedia: getFilePath ret, before " + str + " after " + str2);
                return str2;
            }
        }
        str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wemedia: getFilePath ret, before " + str + " after " + str2);
        return str2;
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: getExternalConfig */
    public boolean mo32134xb7705be3(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.p314xaae8f345.mm.p2815x498e71d6.InterfaceC22933xef8aa7fb
    /* renamed from: reportEvent */
    public void mo32135xefe04dc6(java.lang.String event, java.lang.String reportInfo, java.lang.String extJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extJson, "extJson");
        mq0.s0 s0Var = (mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class));
        s0Var.getClass();
        if (reportInfo.length() == 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject(reportInfo);
        java.lang.String optString = jSONObject.optString("bizName");
        h0Var.f391656d = optString;
        if (s0Var.f412149e.contains(optString)) {
            h0Var2.f391656d = jSONObject.optString("frameSetName");
            ym5.a1.f(new mq0.p0(event, h0Var, h0Var2, extJson));
        }
    }
}
