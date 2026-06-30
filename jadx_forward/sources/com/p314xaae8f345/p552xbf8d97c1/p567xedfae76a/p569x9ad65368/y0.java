package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 f134425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] f134426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g f134427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134428g;

    public y0(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] c4689x7ffeaceaArr, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g gVar, int i17) {
        this.f134425d = z0Var;
        this.f134426e = c4689x7ffeaceaArr;
        this.f134427f = gVar;
        this.f134428g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.z0 z0Var = this.f134425d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("supervisor called register, tokens(");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] c4689x7ffeaceaArr = this.f134426e;
        sb6.append(c4689x7ffeaceaArr.length);
        sb6.append("): ");
        java.lang.String arrays = java.util.Arrays.toString(c4689x7ffeaceaArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "java.util.Arrays.toString(this)");
        sb6.append(arrays);
        oj.j.c("Matrix.ProcessSupervisor.Service", sb6.toString(), new java.lang.Object[0]);
        try {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea token = (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea) kz5.z.L(c4689x7ffeaceaArr);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d = z0Var.f134431e;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d serviceC4692xa1b1260d2 = z0Var.f134431e;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.r0 r0Var = serviceC4692xa1b1260d.f134345e;
            r0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
            java.lang.String str = token.f134326f;
            int i18 = token.f134325e;
            ((java.util.concurrent.ConcurrentHashMap) r0Var.f134402a.mo141623x754a37bb()).put(java.lang.Integer.valueOf(i18), token);
            ((java.util.concurrent.ConcurrentHashMap) r0Var.f134403b.mo141623x754a37bb()).put(str, token);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f.c();
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g subordinate = this.f134427f;
            c17.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subordinate, "subordinate");
            java.util.concurrent.ConcurrentLinkedQueue b17 = serviceC4692xa1b1260d2.b();
            b17.remove(token);
            b17.add(token);
            oj.j.c("Matrix.ProcessSupervisor.Service", "CREATED: [" + i18 + '-' + str + "] -> [" + serviceC4692xa1b1260d2.b().size() + ']' + com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.a(serviceC4692xa1b1260d2, serviceC4692xa1b1260d2.b()), new java.lang.Object[0]);
            token.f134324d.linkToDeath(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.x0(token, this), 0);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.ProcessSupervisor.Service", th6, "", new java.lang.Object[0]);
        }
        int length = c4689x7ffeaceaArr.length;
        int i19 = 0;
        while (true) {
            i17 = this.f134428g;
            if (i19 >= length) {
                break;
            }
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea = c4689x7ffeaceaArr[i19];
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("register[");
            sb7.append(i17);
            sb7.append("]: ");
            sb7.append(c4689x7ffeacea.f134326f);
            sb7.append(", ");
            sb7.append(c4689x7ffeacea.f134327g);
            sb7.append(", ");
            boolean z17 = c4689x7ffeacea.f134328h;
            sb7.append(z17);
            oj.j.c("Matrix.ProcessSupervisor.Service", sb7.toString(), new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.ServiceC4692xa1b1260d.RemoteProcessLifecycleProxy.f19987x233c02ec.a(c4689x7ffeacea).m41107xaba1ac62(z17);
            i19++;
        }
        if (z0Var.f134431e.f134345e.a()) {
            oj.j.c("Matrix.ProcessSupervisor.Service", "stateRegister[" + i17 + "]: no other process registered, ignore state changes", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c cVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19976x233c02ec;
        android.content.Context applicationContext = z0Var.f134431e.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "applicationContext");
        int myPid = android.os.Process.myPid();
        java.lang.String b18 = oj.m.b(applicationContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b18, "MatrixUtil.getProcessName(context)");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea2 = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea(myPid, b18, "", false);
        java.lang.String scene = z0Var.F3();
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        if (!com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.d()) {
            throw new java.lang.IllegalStateException("call forbidden");
        }
        concurrentHashMap = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9.f19977x9d3dd13a;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            boolean mo40960xab2f7f06 = ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9) entry.getValue()).mo40960xab2f7f06();
            oj.j.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "syncStates: " + ((java.lang.String) entry.getKey()) + ' ' + mo40960xab2f7f06, new java.lang.Object[0]);
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v.f134416f.c().a(c4689x7ffeacea2, scene, (java.lang.String) entry.getKey(), mo40960xab2f7f06);
        }
    }
}
