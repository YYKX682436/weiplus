package dz4;

/* loaded from: classes12.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static final dz4.y2 f327001a = new dz4.y2();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f327002b = p3325xe03a0797.p3326xc267989b.z0.b();

    static {
        k82.c cVar = k82.c.f386420a;
        k82.c.f386422c = new dz4.v2();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dz4.y2 r11, java.lang.String r12, java.util.Map r13, ez4.u r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            r11.getClass()
            boolean r0 = r15 instanceof dz4.w2
            if (r0 == 0) goto L16
            r0 = r15
            dz4.w2 r0 = (dz4.w2) r0
            int r1 = r0.f326980h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f326980h = r1
            goto L1b
        L16:
            dz4.w2 r0 = new dz4.w2
            r0.<init>(r11, r15)
        L1b:
            java.lang.Object r11 = r0.f326978f
            pz5.a r15 = pz5.a.f440719d
            int r1 = r0.f326980h
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r12 = r0.f326977e
            pi0.l1 r12 = (pi0.l1) r12
            java.lang.Object r13 = r0.f326976d
            r14 = r13
            ez4.u r14 = (ez4.u) r14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r15 = r12
            goto L75
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            java.lang.Class<f50.y> r11 = f50.y.class
            i95.m r11 = i95.n0.c(r11)
            f50.y r11 = (f50.y) r11
            e50.z0 r11 = (e50.z0) r11
            pi0.q r4 = r11.Ui()
            pi0.l1 r11 = new pi0.l1
            java.lang.String r5 = "we_note_editor_ui"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r13.putAll(r1)
            r13.toString()
            r0.f326976d = r14
            r0.f326977e = r11
            r0.f326980h = r2
            java.lang.Object r12 = r11.o(r12, r13, r0)
            if (r12 != r15) goto L74
            goto L81
        L74:
            r15 = r11
        L75:
            dz4.m3 r11 = new dz4.m3
            r11.<init>(r14)
            java.util.List r11 = kz5.b0.c(r11)
            r15.a(r11)
        L81:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.y2.a(dz4.y2, java.lang.String, java.util.Map, ez4.u, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        ih0.r rVar = (ih0.r) i95.n0.c(ih0.r.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterHandler", "prepareOpen weNoteFlutterFeatureService:" + rVar);
        long c17 = c01.id.c();
        ((dz4.s1) rVar).m134976x2690a4ac();
        long c18 = c01.id.c() - c17;
        if (c18 > 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeNoteFlutterHandler", "ensureReady cost too long: " + c18 + "ms");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22021, 20260608, java.lang.Long.valueOf(c18), "prepareOpen", 0, "", "", "", 0);
        }
    }
}
