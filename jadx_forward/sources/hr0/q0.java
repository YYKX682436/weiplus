package hr0;

@j95.b
/* loaded from: classes11.dex */
public final class q0 extends i95.w implements lp0.g {

    /* renamed from: d, reason: collision with root package name */
    public m3.d f364853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f364854e;

    public void Ai() {
        char c17;
        if (this.f364853d != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            m3.d dVar = this.f364853d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
            java.lang.Throwable th6 = (java.lang.Throwable) dVar.f404626b;
            m3.d dVar2 = this.f364853d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar2);
            java.lang.Object first = dVar2.f404625a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
            long longValue = currentTimeMillis - ((java.lang.Number) first).longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SdcardRemountingHandler", "handleExternalCacheDirRecover: lastErr=" + th6.getMessage() + ", durationMs=" + longValue);
            ap.a.a(1, "errGetExtCacheDir", th6, null, "recover", th6.getMessage(), java.lang.String.valueOf(longValue));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                synchronized (this) {
                    if (!this.f364854e) {
                        java.lang.String a17 = bm5.f1.a();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                        if (r26.n0.B(a17, ":", false)) {
                            c17 = 0;
                            a17 = a17.substring(r26.n0.P(a17, ":", 0, false, 6, null) + 1);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "substring(...)");
                        } else {
                            c17 = 0;
                        }
                        java.lang.String str = "MicroMsg.SdcardRemountingHandler." + a17 + ".LastRelaunchPostMs";
                        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong(str, 0L);
                        if (j17 > 0) {
                            long j18 = currentTimeMillis - j17;
                            if (j18 >= 0 && j18 <= 43200000) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SdcardRemountingHandler", "skip, duration bounded, last was " + (j18 / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) + "min ago");
                                return;
                            }
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong(str, currentTimeMillis);
                        this.f364854e = true;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SdcardRemountingHandler", "post relaunch task");
                        java.lang.String[] strArr = new java.lang.String[3];
                        strArr[c17] = "relaunch";
                        strArr[1] = th6.getMessage();
                        strArr[2] = java.lang.String.valueOf(longValue);
                        ap.a.a(1, "errGetExtCacheDir", th6, null, strArr);
                        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new hr0.p0());
                    }
                }
            }
        }
        this.f364853d = null;
    }

    public void wi(java.lang.Throwable throwable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.r()) {
            return;
        }
        this.f364853d = new m3.d(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), throwable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SdcardRemountingHandler", "handleExternalCacheDirError: " + throwable.getMessage());
        ap.a.a(1, "errGetExtCacheDir", throwable, null, "err", throwable.getMessage());
    }
}
