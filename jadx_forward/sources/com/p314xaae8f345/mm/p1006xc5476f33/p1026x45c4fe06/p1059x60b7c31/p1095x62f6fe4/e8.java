package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public abstract class e8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f163323d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f163324e = new java.lang.Object();

    /* renamed from: f, reason: collision with root package name */
    public java.util.Set f163325f;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 Gd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var) {
        if (this.f163323d) {
            return b(true, r1Var, true);
        }
        if (!g()) {
            return b(false, r1Var, false);
        }
        this.f163323d = true;
        return b(true, r1Var, true);
    }

    public abstract boolean a();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8 b(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8 d8Var;
        synchronized (this.f163324e) {
            d8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8(r1Var != null ? r1Var.hashCode() : 0, z17, r1Var);
            if (z18) {
                java.util.Set set = this.f163325f;
                if (set == null) {
                    set = new java.util.HashSet();
                    this.f163325f = set;
                }
                set.add(d8Var);
            }
        }
        return d8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {, blocks: (B:9:0x0019, B:11:0x001d, B:12:0x0022, B:14:0x0027, B:20:0x0036), top: B:8:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "session"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8
            r1 = 0
            if (r0 != 0) goto L14
            java.lang.String r7 = r6.c()
            java.lang.String r0 = "abandonFocus, unknown session"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r0)
            return r1
        L14:
            com.tencent.mm.plugin.appbrand.jsapi.media.d8 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8) r7
            java.lang.Object r0 = r6.f163324e
            monitor-enter(r0)
            java.util.Set r2 = r6.f163325f     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L22
            java.util.HashSet r2 = (java.util.HashSet) r2     // Catch: java.lang.Throwable -> L70
            r2.remove(r7)     // Catch: java.lang.Throwable -> L70
        L22:
            java.util.Set r7 = r6.f163325f     // Catch: java.lang.Throwable -> L70
            r2 = 1
            if (r7 == 0) goto L32
            java.util.HashSet r7 = (java.util.HashSet) r7     // Catch: java.lang.Throwable -> L70
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L70
            if (r7 == 0) goto L30
            goto L32
        L30:
            r7 = r1
            goto L33
        L32:
            r7 = r2
        L33:
            r3 = 0
            if (r7 == 0) goto L3a
            r6.f163325f = r3     // Catch: java.lang.Throwable -> L70
            r7 = r2
            goto L3b
        L3a:
            r7 = r1
        L3b:
            monitor-exit(r0)
            java.lang.String r0 = r6.c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "abandonFocusForSession, need do real abandonFocus: "
            r4.<init>(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4)
            if (r7 == 0) goto L6f
            boolean r7 = r6.a()
            if (r7 == 0) goto L6e
            r6.f163323d = r1
            java.lang.Object r7 = r6.f163324e
            monitor-enter(r7)
            java.util.Set r0 = r6.f163325f     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L67
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L6b
            r0.clear()     // Catch: java.lang.Throwable -> L6b
        L67:
            r6.f163325f = r3     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r7)
            return r2
        L6b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L6e:
            return r1
        L6f:
            return r2
        L70:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8.b3(com.tencent.mm.plugin.appbrand.jsapi.media.s1):boolean");
    }

    public abstract java.lang.String c();

    public final void d() {
        java.util.Set emptySet;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onAudioFocusPause");
        this.f163323d = false;
        synchronized (this.f163324e) {
            java.util.Set set = this.f163325f;
            emptySet = set == null ? java.util.Collections.emptySet() : new java.util.HashSet(set);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(emptySet);
        java.util.Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8) it.next()).f163309c;
            if (r1Var != null) {
                r1Var.mo10367xb01dfb57();
            }
        }
    }

    public final void e() {
        java.util.Set emptySet;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onAudioFocusResume");
        this.f163323d = true;
        synchronized (this.f163324e) {
            java.util.Set set = this.f163325f;
            emptySet = set == null ? java.util.Collections.emptySet() : new java.util.HashSet(set);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(emptySet);
        java.util.Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8) it.next()).f163309c;
            if (r1Var != null) {
                r1Var.mo10368x57429eec();
            }
        }
    }

    public final void f() {
        java.util.Set emptySet;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onAudioFocusStop");
        this.f163323d = false;
        synchronized (this.f163324e) {
            java.util.Set set = this.f163325f;
            emptySet = set == null ? java.util.Collections.emptySet() : new java.util.HashSet(set);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(emptySet);
        java.util.Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8) it.next()).f163309c;
            if (r1Var != null) {
                r1Var.mo10369xc39f8281();
            }
        }
    }

    public abstract boolean g();
}
