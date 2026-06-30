package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

@j95.b
/* loaded from: classes8.dex */
public final class s extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static final l75.q0 f151937e = new com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.o();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151938d = jz5.h.b(com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.q.f151936d);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:6:0x0013, B:11:0x001e, B:13:0x0023, B:14:0x0026, B:16:0x002a, B:22:0x0052, B:28:0x0037, B:33:0x003c), top: B:5:0x0013, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai(com.p314xaae8f345.mm.p2621x8fb0427b.e r8) {
        /*
            r7 = this;
            java.lang.String r0 = "storage"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            com.tencent.mm.sdk.platformtools.o4 r0 = r7.wi()
            r0.clear()
            android.database.Cursor r8 = r8.mo78085xb5882a6b()
            if (r8 == 0) goto L63
            boolean r1 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            if (r1 != 0) goto L1e
            vz5.b.a(r8, r2)
            return
        L1e:
            com.tencent.mm.storage.c r1 = new com.tencent.mm.storage.c     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
        L23:
            r1.mo9015xbf5d97fd(r8)     // Catch: com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 -> L3b java.lang.Throwable -> L5c
            java.lang.String r3 = r1.f66192x72127c07     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L31
            goto L33
        L31:
            r3 = 0
            goto L34
        L33:
            r3 = 1
        L34:
            if (r3 == 0) goto L37
            goto L52
        L37:
            r7.Bi(r1, r0)     // Catch: java.lang.Throwable -> L5c
            goto L52
        L3b:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.PluginABTest.NewABTestMMKV"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "resetAllExp, convertFrom cursor get exception:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c
            r5.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L5c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L5c
        L52:
            boolean r3 = r8.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L23
            vz5.b.a(r8, r2)
            goto L63
        L5c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r1 = move-exception
            vz5.b.a(r8, r0)
            throw r1
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.s.Ai(com.tencent.mm.storage.e):void");
    }

    public final void Bi(com.p314xaae8f345.mm.p2621x8fb0427b.c cVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        java.lang.String str = "layer_" + cVar.f66192x72127c07;
        o4Var.putString(str + "_rawXML", cVar.f66195xde9f9b4);
        o4Var.putLong(str + "_startTime", cVar.f66197x1bb3b54a);
        o4Var.putLong(str + "_endTime", cVar.f66190x14c61803);
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAccountInitialized uin[");
        java.lang.String m143587x9616526c = new kk.v(gm0.j1.b().h()).m143587x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m143587x9616526c, "toString(...)");
        sb6.append(m143587x9616526c);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginABTest.NewABTestMMKV", sb6.toString());
        com.p314xaae8f345.mm.p2621x8fb0427b.e Ai = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.z.Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ai, "getABTestStorage(...)");
        Ai(Ai);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 wi() {
        java.lang.String m143587x9616526c = new kk.v(((com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.r) ((jz5.n) this.f151938d).mo141623x754a37bb()).a()).m143587x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m143587x9616526c, "toString(...)");
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(m143587x9616526c.concat("_PluginABTest_NewABTestMMKV"));
    }
}
