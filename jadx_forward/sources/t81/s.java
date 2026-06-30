package t81;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f497904d = {l75.n0.m145250x3fdc6f77(t81.g.f497893r, "PersistentWxaSyncInvalidCodeCmd"), l75.n0.m145250x3fdc6f77(t81.h.f497894r, "PersistentWxaSyncInvalidContactCmd")};

    /* renamed from: e, reason: collision with root package name */
    public static t81.p f497905e;

    /* renamed from: f, reason: collision with root package name */
    public static t81.o f497906f;

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f497907a;

    /* renamed from: b, reason: collision with root package name */
    public final t81.q f497908b;

    /* renamed from: c, reason: collision with root package name */
    public final t81.r f497909c;

    public s(l75.k0 db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f497907a = db6;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.appcache.predownload.storage.WxaSyncCmdPersistentStorage$1
            {
                this.f39173x3fe91575 = -1646206336;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7 c11822x3b96e8c7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7 event = c11822x3b96e8c7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (t81.s.this.f497907a.J()) {
                    mo48814x2efc64();
                } else {
                    boolean z17 = true;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("single", event.f158932g)) {
                        java.lang.Object obj = event.f158934i;
                        java.lang.String obj2 = obj != null ? obj.toString() : null;
                        if (obj2 != null && obj2.length() != 0) {
                            z17 = false;
                        }
                        if (!z17) {
                            ((ku5.t0) ku5.t0.f394148d).h(new t81.m(t81.s.this, obj2), "MicroMsg.WxaSyncCmdPersistentStorage");
                        }
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("batch", event.f158932g)) {
                        java.lang.Object obj3 = event.f158934i;
                        java.util.List list = obj3 instanceof java.util.List ? (java.util.List) obj3 : null;
                        if (list != null && !list.isEmpty()) {
                            z17 = false;
                        }
                        if (!z17) {
                            ((ku5.t0) ku5.t0.f394148d).h(new t81.n(list, t81.s.this), "MicroMsg.WxaSyncCmdPersistentStorage");
                        }
                    }
                }
                return false;
            }
        }.mo48813x58998cd();
        this.f497908b = new t81.q(db6, t81.g.f497893r, dm.d9.f317946h);
        this.f497909c = new t81.r(db6, t81.h.f497894r, dm.e9.f318199h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0018, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x001a, code lost:
    
        r3 = new t81.g();
        r3.mo9015xbf5d97fd(r1);
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        if (r1.moveToNext() != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x002b, code lost:
    
        vz5.b.a(r1, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.qa r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t81.s.a(com.tencent.mm.plugin.appbrand.appcache.qa):void");
    }

    public int b(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        t81.h hVar = new t81.h();
        hVar.f66424xdec927b = str;
        if (this.f497909c.get(hVar, new java.lang.String[0])) {
            return hVar.f66422x44eeb14;
        }
        return -1;
    }

    public boolean c(java.lang.String str) {
        t81.q qVar = this.f497908b;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        t81.g gVar = new t81.g();
        gVar.f66271x28d45f97 = str;
        try {
            if (qVar.get(gVar, new java.lang.String[0])) {
                int i17 = gVar.f66272x44eeb14;
                boolean mo9951xb06685ab = qVar.mo9951xb06685ab(gVar, new java.lang.String[0]);
                if (mo9951xb06685ab && f497906f != null) {
                    r81.f.INSTANCE.b(i17, 192);
                }
                z17 = mo9951xb06685ab;
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidCodeTimestampForAppId appId:" + str + " exception:" + e17);
            return false;
        }
    }

    public boolean d(java.lang.String str) {
        t81.r rVar = this.f497909c;
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        t81.h hVar = new t81.h();
        hVar.f66424xdec927b = str;
        try {
            if (rVar.get(hVar, new java.lang.String[0])) {
                int i17 = hVar.f66422x44eeb14;
                boolean mo9951xb06685ab = rVar.mo9951xb06685ab(hVar, new java.lang.String[0]);
                if (mo9951xb06685ab && f497906f != null) {
                    r81.f.INSTANCE.b(i17, 200);
                }
                z17 = mo9951xb06685ab;
            }
            return z17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "removeInvalidContactTimestampForUsername username:" + str + ", exception:" + e17);
            return false;
        }
    }

    public final t81.g e(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        t81.g gVar = new t81.g();
        gVar.f66271x28d45f97 = str;
        int K = r26.n0.K(str, '$', 0, false, 6, null);
        if (K >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaSyncCmdPersistentStorage", "getInvalidCodeTimestampForAppId get invalid appId(" + str + "), stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
            java.lang.String substring = str.substring(0, K);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            gVar.f66271x28d45f97 = substring;
            if (substring.length() == 0) {
                return null;
            }
        }
        if (this.f497908b.get(gVar, new java.lang.String[0])) {
            return gVar;
        }
        return null;
    }
}
