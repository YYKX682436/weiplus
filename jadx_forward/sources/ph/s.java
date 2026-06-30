package ph;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.C4631x434b2cf5 f435813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435815f;

    public s(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.C4631x434b2cf5 c4631x434b2cf5, java.lang.String str, android.content.Intent intent) {
        this.f435813d = c4631x434b2cf5;
        this.f435814e = str;
        this.f435815f = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar2;
        if (this.f435813d.f134089b.n(this.f435814e, false)) {
            ph.t tVar = this.f435813d.f134089b;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = tVar.f435827i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(atomicBoolean);
            ph.t.a(tVar, atomicBoolean.get());
        }
        if (this.f435815f.getIntExtra("status", -1) == 5) {
            ph.t tVar2 = this.f435813d.f134089b;
            tVar2.getClass();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                tVar2.f();
                return;
            } else {
                tVar2.m().post(new ph.o(tVar2));
                return;
            }
        }
        int i17 = wh.m.i(this.f435813d.f134089b.f435819a);
        if (i17 >= 0 && i17 <= 1000) {
            long j17 = i17;
            if (java.lang.Math.abs(j17 - this.f435813d.f134089b.f435824f) >= 5) {
                ph.t tVar3 = this.f435813d.f134089b;
                tVar3.f435824f = j17;
                qh.f0 f0Var = tVar3.f435828j;
                if (f0Var != null && (kVar2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) f0Var.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("battery-change", java.lang.Boolean.TRUE);
                    hashMap.put("battery-pct", java.lang.Integer.valueOf(i17));
                    kVar2.k("BATTERY_STAT", 0, hashMap);
                }
                ph.t tVar4 = this.f435813d.f134089b;
                tVar4.getClass();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    tVar4.g(i17);
                } else {
                    tVar4.m().post(new ph.p(tVar4, i17));
                }
            }
        }
        try {
            int intExtra = this.f435815f.getIntExtra("temperature", -1);
            if (intExtra < 0 || i17 > 1000) {
                return;
            }
            long j18 = intExtra;
            if (java.lang.Math.abs(j18 - this.f435813d.f134089b.f435825g) >= 15) {
                ph.t tVar5 = this.f435813d.f134089b;
                tVar5.f435825g = j18;
                qh.f0 f0Var2 = tVar5.f435828j;
                if (f0Var2 != null && (kVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) f0Var2.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
                    int i18 = wh.m.i(kVar.f476827a.d());
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("battery-temp", java.lang.Integer.valueOf(intExtra));
                    hashMap2.put("battery-pct", java.lang.Integer.valueOf(i18));
                    kVar.k("BATTERY_STAT", 0, hashMap2);
                }
                ph.t tVar6 = this.f435813d.f134089b;
                tVar6.getClass();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                    tVar6.i(intExtra);
                } else {
                    tVar6.m().post(new ph.q(tVar6, intExtra));
                }
            }
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.LifeCycle", "get EXTRA_TEMPERATURE failed: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
