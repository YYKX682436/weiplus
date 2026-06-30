package sc3;

/* loaded from: classes7.dex */
public final class q1 extends sc3.k1 {
    public final java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public je3.o f488056l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f488057p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.HashMap f488058x0;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.Set f488059y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.content.Context context, java.lang.String serviceName, com.p314xaae8f345.p485x5dc4f1ad.biz.C4210x94b68e8f bizManager) {
        super(context, serviceName, bizManager, null, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serviceName, "serviceName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizManager, "bizManager");
        this.Z = serviceName;
        this.f488058x0 = new java.util.HashMap();
        this.f488059y0 = new java.util.LinkedHashSet();
    }

    public final void A1() {
        java.util.HashMap hashMap = this.f488058x0;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            kz5.q qVar = (kz5.q) entry.getValue();
            x1(str);
            java.util.Iterator it = qVar.iterator();
            while (it.hasNext()) {
                M0().mo51545x3498a0(new sc3.p1(this, str, (java.lang.String) it.next()));
            }
        }
        hashMap.clear();
    }

    public final void B1() {
        java.util.Set set = this.f488059y0;
        boolean z17 = true;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!((sc3.l1) it.next()).f488031b) {
                    z17 = false;
                    break;
                }
            }
        }
        java.lang.String str = this.Q;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "all paused! public service will trigger pause!");
            z3();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resume public service");
            uc();
        }
    }

    @Override // sc3.k1, qc3.f
    public void Oc(int i17) {
        je3.o oVar = this.f488056l1;
        if (oVar != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            oVar.f380846i = android.os.SystemClock.elapsedRealtime();
        }
        super.Oc(i17);
    }

    @Override // sc3.k1
    public void Y0() {
        super.Y0();
        je3.o oVar = this.f488056l1;
        if (oVar != null) {
            oVar.c();
        }
        synchronized (this) {
            this.f488057p0 = true;
            A1();
        }
    }

    @Override // sc3.k1
    /* renamed from: onCreated */
    public void mo164293x8cf48009() {
        super.mo164293x8cf48009();
        je3.o oVar = this.f488056l1;
        if (oVar != null) {
            oVar.b();
        }
        je3.o oVar2 = this.f488056l1;
        if (oVar2 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            oVar2.f380844g = android.os.SystemClock.elapsedRealtime();
        }
        D1();
    }

    @Override // sc3.k1
    /* renamed from: onDestroy */
    public void mo164294xac79a11b(int i17) {
        super.mo164294xac79a11b(i17);
        je3.o oVar = this.f488056l1;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // sc3.k1, qc3.f
    /* renamed from: setMute */
    public void mo159830x764d819b(boolean z17) {
    }

    @Override // sc3.k1
    public boolean t1(int i17) {
        return true;
    }

    public final synchronized void w1(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        this.f488059y0.add(new sc3.l1(from, false));
        B1();
        if (this.f488057p0) {
            x1(from);
        } else {
            this.f488058x0.put(from, new kz5.q());
        }
    }

    @Override // sc3.k1, qc3.f
    public void w3(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (config.f229365v) {
            je3.o oVar = new je3.o(this.Z, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, null);
            java.lang.String str = oVar.f380839b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            config.f229352f = str;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            oVar.f380842e = android.os.SystemClock.elapsedRealtime();
            this.f488056l1 = oVar;
        }
        super.w3(config);
    }

    public final void x1(java.lang.String instanceName) {
        java.lang.String str = this.Z;
        java.lang.String str2 = this.Q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        r26.n0.s0(instanceName, "-", instanceName);
        try {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            jc3.x T9 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4.T9((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s4) c17, str, null, 2, null);
            if (T9 instanceof lc3.q) {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "Failed to check supportsDynamicBiz: " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "Public service '" + str + "' does not support dynamic biz connection, skip permission registration");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "biz connect by ".concat(instanceName));
        M0().mo51545x3498a0(new sc3.m1(this, instanceName));
    }

    public final synchronized void y1(java.lang.String from) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        pm0.v.c0(this.f488059y0, new sc3.n1(from));
        if (this.f488057p0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.Q, "biz disconnect by ".concat(from));
            M0().mo51545x3498a0(new sc3.o1(this, from));
        }
        this.f488058x0.remove(from);
        B1();
    }
}
