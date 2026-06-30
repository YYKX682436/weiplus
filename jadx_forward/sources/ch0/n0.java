package ch0;

/* loaded from: classes8.dex */
public final class n0 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback f122777a;

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: createPlatformView */
    public void mo14830x800200d4(double d17, boolean z17) {
        int a17 = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (float) d17);
        java.lang.String content = "into createPlatformView, height: " + d17 + ", h: " + a17 + ", sugVisible: " + z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.j0 j0Var = new ch0.j0(a17, z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            j0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).D(new tg0.e2(j0Var));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: dispose */
    public void mo14831x63a5261f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into platform webview scene dispose");
        ch0.k0 k0Var = new ch0.k0(i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            k0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new tg0.d2(k0Var));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: getWebViewPixelsAsync */
    public void mo14832x6fa537ec(long j17) {
        java.lang.Object m143895xf1229813;
        ch0.h hVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into getWebViewPixelsAsync");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            tg0.k1 Ri = ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).Ri();
            jz5.f0 f0Var = null;
            ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
            byte[] b17 = (zVar == null || (hVar = zVar.f122806m) == null) ? null : hVar.b();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback callback = this.f122777a;
            if (callback != null) {
                callback.mo117736x4d420ac8(j17, b17);
                f0Var = jz5.f0.f384359a;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "getWebViewPixelsAsync exception: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: notifyFilterShowOrHideAsync */
    public void mo14833xab4e0a19(long j17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into notifyFilterShowOrHideAsync");
        ch0.l0 l0Var = new ch0.l0(z17, this, j17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            l0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new tg0.d2(l0Var));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: notifyFocusChanged */
    public void mo14834x5a8f48a5(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into notifyFocusChanged");
        ch0.m0 m0Var = new ch0.m0(z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            m0Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).B(new tg0.d2(m0Var));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: notifyH5BoxResult */
    public void mo14835x93387072(int i17, java.lang.String boxId, java.lang.String query, java.lang.String requestId, java.lang.String parentSearchId, java.lang.String resultJson) {
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentSearchId, "parentSearchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultJson, "resultJson");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSPlatformWebView", "into create h5 box");
        tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("boxId", boxId);
        lVarArr[1] = new jz5.l("query", query);
        lVarArr[2] = new jz5.l("resultJson", resultJson);
        lVarArr[3] = new jz5.l("businessType", java.lang.String.valueOf(i17));
        lVarArr[4] = new jz5.l("requestId", requestId);
        lVarArr[5] = new jz5.l("parentSearchId", parentSearchId);
        lVarArr[6] = new jz5.l("mode", "2");
        yg0.o3 o3Var = (yg0.o3) l1Var;
        tg0.k1 Ri = o3Var.Ri();
        ch0.z zVar = Ri instanceof ch0.z ? (ch0.z) Ri : null;
        lVarArr[7] = new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(zVar != null ? java.lang.Integer.valueOf(zVar.f122795b) : null));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            o3Var.Ai(l17);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "create h5 box exception: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f
    /* renamed from: setCallback */
    public void mo14836x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3165xf1c361fc.InterfaceC27574x746b60f.Callback callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f122777a = callback;
    }
}
