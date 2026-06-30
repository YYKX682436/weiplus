package i95;

/* loaded from: classes12.dex */
public class u extends java.util.concurrent.RecursiveAction {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.v f371385d;

    public u(i95.v vVar, i95.n nVar) {
        this.f371385d = vVar;
    }

    @Override // java.util.concurrent.RecursiveAction
    public void compute() {
        boolean z17;
        boolean z18;
        boolean z19;
        i95.v vVar = this.f371385d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_start: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar, vVar.f371390h, vVar.f371391i, vVar.f371395p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
            i95.v vVar2 = this.f371385d;
            i95.r rVar = vVar2.f371390h;
            i95.r rVar2 = vVar2.f371391i;
            if (rVar == rVar2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_end: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar2, rVar, rVar2, vVar2.f371395p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
                return;
            }
            i95.r rVar3 = i95.r.INACTIVE;
            i95.r rVar4 = i95.r.ACTIVATED;
            i95.r rVar5 = i95.r.INITIALIZED;
            if (rVar == rVar3) {
                if (rVar2 == rVar4) {
                    i95.w wVar = vVar2.f371395p;
                    i95.w wVar2 = vVar2.f371389g;
                    i95.w.m134971xbbd798f8(wVar, wVar2);
                    wVar.m134977x632a9bf0(wVar2);
                    i95.w.m134972xbbd79cb9(wVar, vVar2.f371387e, vVar2.f371388f, vVar2.f371392m);
                    i95.w.m134964xbf18579f(wVar, vVar2.f371386d);
                } else {
                    if (rVar2 == rVar5) {
                        i95.w wVar3 = vVar2.f371395p;
                        i95.w wVar4 = vVar2.f371389g;
                        i95.w.m134971xbbd798f8(wVar3, wVar4);
                        wVar3.m134977x632a9bf0(wVar4);
                        i95.w.m134972xbbd79cb9(wVar3, vVar2.f371387e, vVar2.f371388f, vVar2.f371392m);
                        i95.w.m134964xbf18579f(wVar3, vVar2.f371386d);
                        if (i95.n0.g()) {
                            boolean[] zArr = i95.n0.f371359j;
                            synchronized (zArr) {
                                z19 = zArr[0];
                            }
                            if (!z19) {
                                i95.w.m134965xbf185b60(vVar.f371395p, vVar.f371386d);
                            }
                        }
                        vVar.a();
                    }
                    z18 = true;
                }
                z18 = false;
            } else if (rVar == rVar4) {
                if (rVar2 == rVar5) {
                    if (i95.n0.g()) {
                        boolean[] zArr2 = i95.n0.f371359j;
                        synchronized (zArr2) {
                            z17 = zArr2[0];
                        }
                        if (!z17) {
                            i95.w.m134965xbf185b60(vVar2.f371395p, vVar2.f371386d);
                            z18 = false;
                        }
                    }
                    vVar2.a();
                    z18 = false;
                }
                z18 = true;
            } else {
                if (rVar != rVar5) {
                    throw new java.lang.IllegalStateException("Illegal from-status: " + vVar.f371390h);
                }
                if (rVar2 == rVar4) {
                    if (i95.n0.g()) {
                        i95.w.m134966xbf185f21(vVar2.f371395p, vVar2.f371386d);
                    } else {
                        vVar2.a();
                    }
                    z18 = false;
                }
                z18 = true;
            }
            if (z18) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Found bad route: %s => %s", vVar.f371390h, vVar.f371391i));
            }
        } finally {
            i95.v vVar3 = this.f371385d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FeatureService", "[+] feature_service_transit_end: '%s'(%s => %s) of '%s' was invoked on thread: %s(%s)", vVar3, vVar3.f371390h, vVar3.f371391i, vVar3.f371395p, java.lang.Thread.currentThread().getName(), java.lang.Integer.valueOf(android.os.Process.myTid()));
        }
    }
}
