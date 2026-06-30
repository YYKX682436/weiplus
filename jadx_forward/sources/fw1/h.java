package fw1;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public jw1.h f348613a;

    /* renamed from: b, reason: collision with root package name */
    public gw1.e f348614b;

    /* renamed from: c, reason: collision with root package name */
    public jz5.l f348615c;

    /* renamed from: mImageReaderWrapper */
    private mw1.a f69790x7d842002;

    public final void a(mw1.c view, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: bind texture view name ".concat(userName));
        mw1.e eVar = c().f383840i;
        synchronized (eVar) {
            if (eVar.f413232g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already closed");
                return;
            }
            mw1.b bVar = (mw1.b) eVar.f413230e.get(userName);
            if (bVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MTR.RenderTargetHolder", "arrayMap already has " + userName + " key");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.a(), view)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "already has same targetHolder register");
                    return;
                }
                eVar.b(bVar);
            }
            mw1.b bVar2 = new mw1.b(userName, new java.lang.ref.WeakReference(view), null, null, false, 28, null);
            bVar2.f413227e = true;
            eVar.f413230e.put(userName, bVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fw1.e
            if (r0 == 0) goto L13
            r0 = r8
            fw1.e r0 = (fw1.e) r0
            int r1 = r0.f348608g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f348608g = r1
            goto L18
        L13:
            fw1.e r0 = new fw1.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f348606e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f348608g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f348605d
            fw1.h r7 = (fw1.h) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L61
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            jw1.h r8 = r6.c()
            jz5.l r2 = r6.f348615c
            if (r2 != 0) goto L66
            java.lang.String r2 = "MicroMsg.MTR.OpenVoiceRenderLogic"
            java.lang.String r4 = "getCameraSurfaceTexture: create camera texture"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4)
            lw1.l r2 = lw1.m.f403093e
            lw1.m r2 = lw1.m.f403094f
            lw1.f r4 = r8.f383837f
            oz5.l r2 = r4.mo7096x348d9a(r2)
            fw1.f r4 = new fw1.f
            r5 = 0
            r4.<init>(r8, r7, r5)
            r0.f348605d = r6
            r0.f348608g = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r2, r4, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r2 = r8
            jz5.l r2 = (jz5.l) r2
            r7.f348615c = r2
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fw1.h.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jw1.h c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        jw1.h hVar = this.f348613a;
        if (hVar != null && hVar.f383836e) {
            return hVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "real init");
        jw1.h hVar2 = new jw1.h();
        this.f348613a = hVar2;
        return hVar2;
    }

    public final void d(int i17, java.lang.String callbackName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackName, "callbackName");
        gw1.e eVar = this.f348614b;
        if (eVar != null) {
            java.util.HashMap hashMap = eVar.f357684c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (hashMap2 == null) {
                hashMap.remove(java.lang.Integer.valueOf(i17));
                return;
            }
            hashMap2.containsKey(callbackName);
            hashMap2.remove(callbackName);
            if (hashMap2.isEmpty()) {
                hashMap.remove(java.lang.Integer.valueOf(i17));
            }
        }
    }

    public final void e(int i17, java.lang.String callbackName, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.j callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callbackName, "callbackName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        gw1.e eVar = this.f348614b;
        if (eVar != null) {
            java.util.HashMap hashMap = eVar.f357684c;
            java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(java.lang.Integer.valueOf(i17));
            if (hashMap2 == null) {
                hashMap.put(java.lang.Integer.valueOf(i17), kz5.c1.i(new jz5.l(callbackName, callback)));
            } else {
                hashMap2.containsKey(callbackName);
                hashMap2.put(callbackName, callback);
            }
        }
    }

    public final void f(mw1.c view, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.OpenVoiceRenderLogic", "weiranli: unbind texture view name ".concat(userName));
        mw1.e eVar = c().f383840i;
        synchronized (eVar) {
            mw1.b bVar = (mw1.b) eVar.f413230e.get(userName);
            mw1.b bVar2 = null;
            if (bVar != null) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.a(), view)) {
                    bVar = null;
                }
                if (bVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView " + view + ", " + userName);
                    bVar.f413227e = false;
                    eVar.b(bVar);
                    bVar2 = (mw1.b) eVar.f413230e.remove(userName);
                }
            }
            if (bVar2 == null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MTR.RenderTargetHolder", "unbindOutputView not match current", new java.lang.Object[0]);
            }
        }
    }
}
