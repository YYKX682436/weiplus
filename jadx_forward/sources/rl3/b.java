package rl3;

/* loaded from: classes12.dex */
public abstract class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f478759a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f478761c;

    /* renamed from: d, reason: collision with root package name */
    public kl3.h f478762d;

    /* renamed from: e, reason: collision with root package name */
    public kl3.e f478763e;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f478760b = "";

    /* renamed from: f, reason: collision with root package name */
    public long f478764f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f478765g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f478766h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[] f478767i = {null};

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f478768j = new java.util.LinkedList();

    public void k() {
        if (b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.READ_PHONE_STATE") != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.BaseMusicPlayer", "addPhoneStatusWatcher() not have read_phone_state perm");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[] h5VarArr = this.f478767i;
        if (h5VarArr[0] != null) {
            return;
        }
        synchronized (h5VarArr) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.h5[] h5VarArr2 = this.f478767i;
            if (h5VarArr2[0] != null) {
                return;
            }
            h5VarArr2[0] = new rl3.a(this);
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.l5) i95.n0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.class)).wi(this.f478767i[0]);
        }
    }

    public void l(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f98879e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onCompleteEvent: %s", objArr);
        this.f478760b = "ended";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 7;
        jkVar.f88570c = rVar;
        jkVar.f88573f = "ended";
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88571d = rVar.f98879e;
        jkVar.f88574g = e();
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.m(rVar);
        }
    }

    public void m(b21.r rVar, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onErrorEvent with errCode:%d", java.lang.Integer.valueOf(i17));
        this.f478760b = "error";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 4;
        jkVar.f88570c = rVar;
        jkVar.f88573f = "error";
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        jkVar.f88578k = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.m.b(i17);
        jkVar.f88579l = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.m.a(i17);
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.n(rVar, i17);
        }
    }

    public void n(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f98879e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onPauseEvent: %s", objArr);
        this.f478760b = "pause";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 3;
        jkVar.f88570c = rVar;
        jkVar.f88573f = "pause";
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.e(rVar);
        }
    }

    public void o(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f98879e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onResumeEvent: %s", objArr);
        this.f478760b = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 1;
        jkVar.f88570c = rVar;
        jkVar.f88573f = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.r(rVar);
        }
    }

    public void p(b21.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onSeekToEvent");
        this.f478760b = "seeked";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 8;
        jkVar.f88570c = rVar;
        jkVar.f88573f = "seeked";
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.w(rVar);
        }
    }

    public void q(b21.r rVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStartEvent %b", java.lang.Boolean.valueOf(i()));
        this.f478760b = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 0;
        jkVar.f88570c = rVar;
        jkVar.f88573f = com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27;
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.p(rVar);
        }
    }

    public void r(b21.r rVar) {
        java.lang.String str;
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (rVar == null || (str = rVar.f98879e) == null) {
            str = "";
        }
        objArr[0] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.BaseMusicPlayer", "onStopEvent: %s", objArr);
        this.f478760b = "stop";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
        am.jk jkVar = c5722xb16ab0f4.f136045g;
        jkVar.f88569b = 2;
        jkVar.f88570c = rVar;
        jkVar.f88573f = "stop";
        jkVar.f88572e = mo67219x51e8b0a();
        jkVar.f88574g = e();
        boolean z17 = this.f478761c;
        this.f478761c = false;
        jkVar.f88576i = z17;
        c5722xb16ab0f4.b(android.os.Looper.getMainLooper());
        kl3.e eVar = this.f478763e;
        if (eVar != null) {
            eVar.f(rVar);
        }
    }

    public boolean s() {
        kl3.e eVar = this.f478763e;
        return eVar != null && eVar.mo143622x4c4bb389();
    }

    public boolean t(b21.r rVar) {
        if (rVar != null) {
            return rVar.V;
        }
        return true;
    }

    public void u(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k kVar) {
        if (kVar == null) {
            return;
        }
        java.util.LinkedList linkedList = this.f478768j;
        if (linkedList.contains(kVar)) {
            linkedList.remove(kVar);
        }
    }
}
