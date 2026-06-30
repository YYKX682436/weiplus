package k23;

/* loaded from: classes12.dex */
public final class s0 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f385222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k23.v0 f385223b;

    public s0(k23.v0 v0Var) {
        this.f385223b = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String[] r11, java.util.List r12) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "voiceAddr.onRes, lst: ("
            r0.<init>(r1)
            r1 = 0
            if (r11 == 0) goto L11
            int r2 = r11.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L12
        L11:
            r2 = r1
        L12:
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r2 = 0
            if (r11 == 0) goto L21
            r3 = r11[r2]
            if (r3 != 0) goto L23
        L21:
            java.lang.String r3 = ""
        L23:
            r0.append(r3)
            java.lang.String r3 = "), voiceID: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.FTSFloatingVoiceInputViewModel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            k23.v0 r0 = r10.f385223b
            if (r11 == 0) goto L7e
            int r4 = r11.length
            r5 = 1
            if (r4 != 0) goto L41
            r4 = r5
            goto L42
        L41:
            r4 = r2
        L42:
            r4 = r4 ^ r5
            if (r4 == 0) goto L54
            r4 = r11[r2]
            int r4 = r4.length()
            if (r4 <= 0) goto L4f
            r4 = r5
            goto L50
        L4f:
            r4 = r2
        L50:
            if (r4 == 0) goto L54
            r4 = r5
            goto L55
        L54:
            r4 = r2
        L55:
            if (r4 == 0) goto L58
            goto L59
        L58:
            r11 = r1
        L59:
            if (r11 == 0) goto L7e
            r11 = r11[r2]
            r0.f385242d = r11
            k23.x r2 = r0.f385248j
            if (r2 == 0) goto L77
            r2.m141838x6fea3ce5(r11)
            boolean r11 = r10.f385222a
            if (r11 != 0) goto L7e
            r10.f385222a = r5
            r5 = 3
            java.lang.String r6 = ""
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r0
            k23.v0.x(r4, r5, r6, r7, r8, r9)
            goto L7e
        L77:
            java.lang.String r11 = "recognizingPanel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r11)
            throw r1
        L7e:
            if (r12 == 0) goto L8c
            java.lang.Object r11 = kz5.n0.Z(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L8c
            r0.f385243e = r11
            jz5.f0 r1 = jz5.f0.f384359a
        L8c:
            if (r1 != 0) goto L94
            java.lang.String r11 = "voiceIdSet is empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r11)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k23.s0.a(java.lang.String[], java.util.List):void");
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "voiceAddr.onRecordStart()");
        k23.v0.x(this.f385223b, 2, "{\"timeCost\":" + (java.lang.System.currentTimeMillis() - this.f385223b.f385245g) + '}', null, 4, null);
    }

    @Override // z21.b
    public void d(int i17) {
        k23.v0 v0Var = this.f385223b;
        if (!v0Var.f385253o.hasMessages(101)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "voiceAddr.onRecognizeFinish(endFlag=" + i17 + ')');
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "voiceAddr.onRecognizeFinish(endFlag=" + i17 + "), enforce tasks");
        ((k23.n0) v0Var.f385254p).run();
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        ym5.a1.f(new k23.r0(i17, i18, i19, j17, this.f385223b));
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSFloatingVoiceInputViewModel", "voiceAddr.onRecordFin()");
        this.f385223b.f385263y.d();
    }
}
