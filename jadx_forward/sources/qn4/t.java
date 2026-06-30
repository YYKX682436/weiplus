package qn4;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f446812a;

    /* renamed from: b, reason: collision with root package name */
    public long f446813b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f446816e;

    /* renamed from: g, reason: collision with root package name */
    public long f446818g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f446821j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f446822k;

    /* renamed from: l, reason: collision with root package name */
    public qn4.a f446823l;

    /* renamed from: n, reason: collision with root package name */
    public pn4.q0 f446825n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f446826o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f446827p;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f446814c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f446815d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f446817f = true;

    /* renamed from: h, reason: collision with root package name */
    public int f446819h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f446820i = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public final y21.h f446824m = new y21.h(false, true, 1, null);

    public t() {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f446826o = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
    }

    public static final void a(qn4.t tVar, float f17, qn4.a aVar) {
        if (tVar.f446816e) {
            ((qn4.w) aVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onHideLoading");
            qn4.i iVar = qn4.y.f446838d;
            iVar.getClass();
            qn4.v.f446830a.a(new qn4.d(iVar), null);
            tVar.f446816e = false;
        }
        tVar.b();
        if (tVar.f446817f) {
            tVar.f446817f = false;
            ((qn4.w) aVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onSpeechPlaying");
            qn4.i iVar2 = qn4.y.f446838d;
            iVar2.getClass();
            qn4.v.f446830a.a(new qn4.g(iVar2), new qn4.h(iVar2));
        }
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        if (e17 >= 1.0f) {
            ((qn4.w) aVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onSpeechComplete");
            qn4.y.f446835a.f();
            tVar.f446812a = false;
            return;
        }
        ((qn4.w) aVar).getClass();
        qn4.m mVar = qn4.y.f446837c;
        if (mVar.f446792e) {
            qn4.v.f446830a.a(new qn4.l(mVar, e17), null);
        }
    }

    public final void b() {
        java.lang.Runnable runnable = this.f446822k;
        android.os.Handler handler = this.f446820i;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f446821j;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029 A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x00a7, B:16:0x0016, B:18:0x001d, B:23:0x0029, B:24:0x002f, B:27:0x0049, B:29:0x0053, B:30:0x0062, B:34:0x007b, B:37:0x0090, B:38:0x0088, B:39:0x0071), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #0 {all -> 0x00ac, blocks: (B:3:0x0006, B:5:0x000e, B:7:0x00a7, B:16:0x0016, B:18:0x001d, B:23:0x0029, B:24:0x002f, B:27:0x0049, B:29:0x0053, B:30:0x0062, B:34:0x007b, B:37:0x0090, B:38:0x0088, B:39:0x0071), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r13 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "TranslationSpeechController"
            java.lang.String r2 = "getSpeechPath: mkdir "
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> Lac
            gm0.b0 r3 = gm0.j1.u()     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L16
            java.lang.String r2 = "getSpeechPath: MMKernel.storage() is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lac
        L13:
            r3 = r0
            goto La7
        L16:
            java.lang.String r3 = r3.h()     // Catch: java.lang.Throwable -> Lac
            r4 = 0
            if (r3 == 0) goto L26
            int r5 = r3.length()     // Catch: java.lang.Throwable -> Lac
            if (r5 != 0) goto L24
            goto L26
        L24:
            r5 = r4
            goto L27
        L26:
            r5 = 1
        L27:
            if (r5 == 0) goto L2f
            java.lang.String r2 = "getSpeechPath: getPrivateAccountPath is null or empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)     // Catch: java.lang.Throwable -> Lac
            goto L13
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "imSpeech"
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            com.tencent.mm.vfs.z7 r5 = com.p314xaae8f345.mm.vfs.z7.a(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = r5.f294812f
            if (r6 == 0) goto L62
            java.lang.String r10 = com.p314xaae8f345.mm.vfs.e8.l(r6, r4, r4)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.equals(r10)     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L62
            com.tencent.mm.vfs.z7 r6 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r5.f294810d     // Catch: java.lang.Throwable -> Lac
            java.lang.String r9 = r5.f294811e     // Catch: java.lang.Throwable -> Lac
            java.lang.String r11 = r5.f294813g     // Catch: java.lang.Throwable -> Lac
            java.lang.String r12 = r5.f294814h     // Catch: java.lang.Throwable -> Lac
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lac
            r5 = r6
        L62:
            com.tencent.mm.vfs.b3 r6 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> Lac
            r7 = 0
            com.tencent.mm.vfs.z2 r6 = r6.m(r5, r7)     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r6.a()     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto L71
            r7 = r4
            goto L79
        L71:
            com.tencent.mm.vfs.q2 r7 = r6.f294799a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r8 = r6.f294800b     // Catch: java.lang.Throwable -> Lac
            boolean r7 = r7.F(r8)     // Catch: java.lang.Throwable -> Lac
        L79:
            if (r7 != 0) goto La7
            com.tencent.mm.vfs.b3 r7 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> Lac
            com.tencent.mm.vfs.z2 r5 = r7.m(r5, r6)     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r5.a()     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L88
            goto L90
        L88:
            com.tencent.mm.vfs.q2 r4 = r5.f294799a     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = r5.f294800b     // Catch: java.lang.Throwable -> Lac
            boolean r4 = r4.r(r5)     // Catch: java.lang.Throwable -> Lac
        L90:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = ", result="
            r5.append(r2)     // Catch: java.lang.Throwable -> Lac
            r5.append(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Throwable -> Lac
        La7:
            java.lang.Object r2 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r3)     // Catch: java.lang.Throwable -> Lac
            goto Lb7
        Lac:
            r2 = move-exception
            kotlin.Result$Companion r3 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r2 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r2)
            java.lang.Object r2 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r2)
        Lb7:
            java.lang.Throwable r3 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r2)
            if (r3 != 0) goto Lbf
            r0 = r2
            goto Ld4
        Lbf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "getSpeechPath error: "
            r2.<init>(r4)
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2)
        Ld4:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qn4.t.c():java.lang.String");
    }

    public final void d() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = jz5.f0.f384359a;
        y21.h hVar = this.f446824m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechController", "stopSpeech");
        if (this.f446812a) {
            if (this.f446813b > 0) {
                if (this.f446814c.length() > 0) {
                    if (this.f446815d.length() > 0) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f446818g;
                        long j17 = this.f446813b;
                        java.lang.String talker = this.f446814c;
                        java.lang.String langCode = this.f446815d;
                        int i17 = this.f446819h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(langCode, "langCode");
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("msgid", java.lang.String.valueOf(j17));
                        hashMap.put("chat_username", talker);
                        hashMap.put("translated_language", langCode);
                        hashMap.put("read_aloud_end_type", java.lang.Integer.valueOf(i17));
                        hashMap.put("read_aloud_duration", java.lang.Long.valueOf(currentTimeMillis));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("translate_read_aloud_end", hashMap, 35268);
                    }
                }
            }
            this.f446812a = false;
            b();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f446827p;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f446827p = null;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                if (hVar.a()) {
                    y21.h.e(hVar, false, false, 3, null);
                }
                hVar.c(null);
                pn4.q0 q0Var = this.f446825n;
                if (q0Var != null) {
                    q0Var.mo158760x5a5ddf8();
                }
                this.f446825n = null;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "Stop speech failed", m143898xd4a2fc34);
            }
            try {
                if (this.f446816e) {
                    if (this.f446823l != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onHideLoading");
                        qn4.i iVar = qn4.y.f446838d;
                        iVar.getClass();
                        qn4.v.f446830a.a(new qn4.d(iVar), null);
                    }
                    this.f446816e = false;
                }
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
            } catch (java.lang.Throwable th7) {
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
            }
            this.f446823l = null;
        }
    }
}
