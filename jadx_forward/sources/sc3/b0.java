package sc3;

/* loaded from: classes7.dex */
public final class b0 implements com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f487963a;

    public b0(sc3.k1 k1Var) {
        this.f487963a = k1Var;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: getFilePath */
    public java.lang.String mo32199x5000ed37(java.lang.String src) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(src, "src");
        sc3.k1 k1Var = this.f487963a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wxAudio: getFilePath ".concat(src));
        if (r26.i0.y(src, "file://", false)) {
            src = src.substring(7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(src, "substring(...)");
        } else if (r26.i0.y(src, "data:audio", false) && r26.n0.B(src, "base64", false)) {
            java.lang.String substring = src.substring(r26.n0.L(src, "base64,", 0, false, 6, null) + 7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            src = jh1.d.b(r26.n0.u0(substring).toString());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(src, "writeToFile(...)");
        } else if (r26.i0.y(src, "wxblob://", false)) {
            jc3.x xVar = k1Var.f488019r;
            if (xVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49621x2f1a0d80 = xVar.b().mo49621x2f1a0d80(src);
            if (mo49621x2f1a0d80 != null && mo49621x2f1a0d80.m()) {
                src = mo49621x2f1a0d80.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(src, "getAbsolutePath(...)");
            }
        } else if (!r26.i0.y(src, "http://", false) && !r26.i0.y(src, "https://", false)) {
            jc3.x xVar2 = k1Var.f488019r;
            if (xVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgManagement");
                throw null;
            }
            com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = xVar2.b().mo49620x1d537609(src);
            if (mo49620x1d537609 != null && mo49620x1d537609.m()) {
                src = mo49620x1d537609.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(src, "getAbsolutePath(...)");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k1Var.Q, "wxAudio: getFilePath ret = ".concat(src));
        return src;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo32200x9ac7b764(long j17, java.lang.String str) {
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            bf3.g0 g0Var = bf3.g0.f101160a;
            sc3.a0 a0Var = sc3.a0.f487960d;
            g0Var.getClass();
            ((ku5.t0) ku5.t0.f394148d).q(new bf3.d0(a0Var));
        }
    }
}
