package my3;

/* loaded from: classes13.dex */
public final class a0 implements com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my3.c0 f414314a;

    public a0(my3.c0 c0Var) {
        this.f414314a = c0Var;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onAnswerVoIPEvent */
    public void mo119292x7f83bedd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onAnswerVoIPEvent");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.o.class);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onCancelLoginEvent */
    public void mo119293x2a523aca() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "receive watch cancel login");
        gy3.a aVar = this.f414314a.f414319a;
        if (aVar != null) {
            ((gy3.d) aVar).a();
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.y.class);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onCannotLoginEvent */
    public void mo119294x5e098e13() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "onCannotLoginEvent");
        my3.v vVar = this.f414314a.f414325g;
        if (vVar != null) {
            ((iy3.e) vVar).a("", "");
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onChannelHandshakeSuccessEvent */
    public void mo119295xefba322a() {
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onChannelHandshakeSuccessEvent");
        my3.c0 c0Var = this.f414314a;
        if (c0Var.f414328j && (c27663xee5e94d4 = c0Var.f414320b) != null) {
            c27663xee5e94d4.m119280xff0d6305();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 24, 0);
        c0Var.f414323e = true;
        com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d42 = c0Var.f414320b;
        if (c27663xee5e94d42 != null) {
            gy3.a aVar = c0Var.f414319a;
            c27663xee5e94d42.m119290xe2095faa(aVar != null ? ((gy3.d) aVar).c() : "RtosWatch");
        }
        my3.x xVar = c0Var.f414324f;
        if (xVar != null) {
            boolean z17 = c0Var.f414323e;
            gy3.a aVar2 = c0Var.f414319a;
            ((iy3.c) xVar).a(z17, aVar2 != null ? ((gy3.d) aVar2).c() : "");
        }
        c0Var.f414324f = null;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onCloseChannelEvent */
    public void mo119296x738c7950(long j17) {
        gy3.j jVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onCloseChannelEvent " + j17);
        my3.c0 c0Var = this.f414314a;
        c0Var.f414323e = false;
        gy3.a aVar = c0Var.f414319a;
        if (aVar == null || (jVar = ((gy3.d) aVar).f359088c) == null) {
            return;
        }
        jVar.a();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onCloudHandShakeEvent */
    public void mo119297xe03e4639(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "begin handShake cgi " + str);
        my3.c0 c0Var = this.f414314a;
        c0Var.f414323e = false;
        android.os.Bundle bundle = new android.os.Bundle();
        h73.e.c(bundle, "taskid", i17);
        if (str == null) {
            str = "";
        }
        h73.e.d(bundle, "handshke", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, iy3.b.class, new my3.z(c0Var));
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onGetExtSpamInfoEvent */
    public java.lang.String mo119298x45dcc7b9(int i17) {
        try {
            byte[] o37 = fo3.s.INSTANCE.o3(16);
            if (o37 != null) {
                if (!(o37.length == 0)) {
                    java.lang.String str = new java.lang.String(o37, r26.c.f450398a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "spamInfo size in java = " + str.length());
                    return str;
                }
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return "";
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onGetLicenseEvent */
    public int mo119299x6a8a6170(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetLicense " + str2 + ' ' + str);
        my3.c0 c0Var = this.f414314a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = c0Var.f414321c;
        if (b4Var != null) {
            b4Var.d();
        }
        my3.v vVar = c0Var.f414325g;
        if (vVar == null) {
            return 0;
        }
        ((iy3.e) vVar).a(str, str2);
        return 0;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onGetLoginAvatarEvent */
    public java.lang.String mo119300x8c0e9caf() {
        java.lang.String str = this.f414314a.f414327i;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onHangupVoIPEvent */
    public void mo119301xbe4f3cee() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onHangupVoIPEvent");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.t.class);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onIsForegroundEvent */
    public boolean mo119302x9702a86e() {
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onIsPhysicalLinkConnectedEvent */
    public boolean mo119303xd6c3972b() {
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onListenServiceEvent */
    public void mo119304x1f1448b(java.lang.String service_name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service_name, "service_name");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onListenServiceEvent ".concat(service_name));
        gy3.a aVar = this.f414314a.f414319a;
        if (aVar != null) {
            ((gy3.d) aVar).b();
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onLoginResultEvent */
    public void mo119305x15f72553(int i17) {
        my3.c0 c0Var = this.f414314a;
        c0Var.getClass();
        c0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26126, 2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i17), 0);
        if (i17 == 0) {
            my3.w wVar = c0Var.f414326h;
            if (wVar != null) {
                iy3.j jVar = (iy3.j) wVar;
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = jVar.f377454a;
                ((android.os.Bundle) h0Var.f391656d).putBoolean("result", true);
                com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = jVar.f377455b;
                if (rVar != null) {
                    rVar.a(h0Var.f391656d);
                }
            }
            c0Var.f414326h = null;
            return;
        }
        my3.w wVar2 = c0Var.f414326h;
        if (wVar2 != null) {
            iy3.j jVar2 = (iy3.j) wVar2;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = jVar2.f377454a;
            ((android.os.Bundle) h0Var2.f391656d).putBoolean("result", false);
            com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar2 = jVar2.f377455b;
            if (rVar2 != null) {
                rVar2.a(h0Var2.f391656d);
            }
        }
        c0Var.f414326h = null;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onLogoutEvent */
    public void mo119306x823bdbd1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "onLogoutEvent");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), iy3.p.class);
        this.f414314a.a();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onRequestUseCloudHandShakeEvent */
    public boolean mo119307x50de9961() {
        return true;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onWriteChannelDataEvent */
    public void mo119308xbe9354ad(long j17, byte[] bArr) {
        gy3.a aVar;
        gy3.j jVar;
        gy3.i iVar;
        if (bArr == null || (aVar = this.f414314a.f414319a) == null || (jVar = ((gy3.d) aVar).f359088c) == null || (iVar = jVar.f359117d) == null) {
            return;
        }
        if (iVar.f359109g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Rtos.SendThread", "Send thread has been close. Send data abort");
            return;
        }
        synchronized (iVar.f359112m) {
            iVar.f359110h.add(bArr);
            iVar.f359112m.notify();
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4.Callback
    /* renamed from: onisNetworkConnectedEvent */
    public boolean mo119309x633d9316() {
        this.f414314a.getClass();
        return com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }
}
