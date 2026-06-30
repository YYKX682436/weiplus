package md1;

/* loaded from: classes7.dex */
public class j1 {

    /* renamed from: e, reason: collision with root package name */
    public static md1.j1 f407283e;

    /* renamed from: c, reason: collision with root package name */
    public mi1.w0 f407286c;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f407284a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f407285b = 2;

    /* renamed from: d, reason: collision with root package name */
    public boolean f407287d = false;

    public static md1.j1 b() {
        synchronized (md1.j1.class) {
            if (f407283e == null) {
                f407283e = new md1.j1();
            }
        }
        return f407283e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: Exception -> 0x00a3, TryCatch #0 {Exception -> 0x00a3, blocks: (B:3:0x0007, B:5:0x000b, B:10:0x0013, B:13:0x0025, B:15:0x002b, B:16:0x004b, B:18:0x004f, B:21:0x0059, B:24:0x0061, B:26:0x0069, B:30:0x0070, B:33:0x0075, B:35:0x0094, B:36:0x0099, B:39:0x0097, B:41:0x0035, B:43:0x0039, B:45:0x003f), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r0 = "_show"
            java.lang.String r1 = "MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r9.f407284a     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto La2
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.t3()     // Catch: java.lang.Exception -> La3
            if (r0 != 0) goto L13
            goto La2
        L13:
            com.tencent.mm.plugin.appbrand.page.v5 r0 = r9.f407284a     // Catch: java.lang.Exception -> La3
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r0 = r0.t3()     // Catch: java.lang.Exception -> La3
            mi1.f r0 = mi1.c.a(r0)     // Catch: java.lang.Exception -> La3
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r10 == 0) goto L49
            if (r11 != 0) goto L35
            int r6 = r0.j()     // Catch: java.lang.Exception -> La3
            if (r6 != r2) goto L35
            java.lang.String r6 = "showing camera CapsuleBar"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)     // Catch: java.lang.Exception -> La3
            r9.f407287d = r4     // Catch: java.lang.Exception -> La3
            r6 = r11
            r7 = r5
            goto L4b
        L35:
            mi1.w0 r6 = r9.f407286c     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L49
            int r6 = r0.j()     // Catch: java.lang.Exception -> La3
            if (r6 != r3) goto L49
            java.lang.String r6 = "showing voice CapsuleBar"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)     // Catch: java.lang.Exception -> La3
            r9.f407287d = r5     // Catch: java.lang.Exception -> La3
            r7 = r4
            r6 = r5
            goto L4b
        L49:
            r6 = r11
            r7 = r4
        L4b:
            mi1.w0 r8 = r9.f407286c     // Catch: java.lang.Exception -> La3
            if (r8 == 0) goto L55
            r8.mo147359x63a3b28a()     // Catch: java.lang.Exception -> La3
            r8 = 0
            r9.f407286c = r8     // Catch: java.lang.Exception -> La3
        L55:
            if (r10 == 0) goto Lb9
            if (r6 != 0) goto L67
            int r10 = r0.j()     // Catch: java.lang.Exception -> La3
            if (r10 == r2) goto L67
            if (r7 == 0) goto L67
            java.lang.String r10 = "force show voice CapsuleBar"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10)     // Catch: java.lang.Exception -> La3
            r6 = r5
        L67:
            if (r6 != 0) goto L6e
            boolean r10 = r9.f407287d     // Catch: java.lang.Exception -> La3
            if (r10 == 0) goto L6e
            r6 = r5
        L6e:
            if (r6 != 0) goto L75
            int r10 = r9.f407285b     // Catch: java.lang.Exception -> La3
            if (r10 != r3) goto L75
            r6 = r4
        L75:
            java.lang.String r10 = "isVoiceRecord:%b, showVoice:%b"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> La3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Exception -> La3
            r0[r4] = r11     // Catch: java.lang.Exception -> La3
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> La3
            r0[r5] = r11     // Catch: java.lang.Exception -> La3
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10, r0)     // Catch: java.lang.Exception -> La3
            com.tencent.mm.plugin.appbrand.page.v5 r10 = r9.f407284a     // Catch: java.lang.Exception -> La3
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r10 = r10.t3()     // Catch: java.lang.Exception -> La3
            mi1.f r10 = mi1.c.a(r10)     // Catch: java.lang.Exception -> La3
            if (r6 == 0) goto L97
            mi1.d r11 = mi1.d.VOICE     // Catch: java.lang.Exception -> La3
            goto L99
        L97:
            mi1.d r11 = mi1.d.CAMERA     // Catch: java.lang.Exception -> La3
        L99:
            mi1.w0 r10 = r10.h(r11)     // Catch: java.lang.Exception -> La3
            r9.f407286c = r10     // Catch: java.lang.Exception -> La3
            r9.f407287d = r6     // Catch: java.lang.Exception -> La3
            goto Lb9
        La2:
            return
        La3:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "_show error:"
            r11.<init>(r0)
            java.lang.String r10 = r10.toString()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r10)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md1.j1.a(boolean, boolean):void");
    }

    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "hideCapsuleBar");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new md1.i1(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "_hide");
        this.f407287d = false;
        mi1.w0 w0Var = this.f407286c;
        if (w0Var != null) {
            w0Var.mo147359x63a3b28a();
            this.f407286c = null;
        }
        this.f407284a = null;
        this.f407285b = 2;
    }

    public void d(boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        objArr[1] = java.lang.Boolean.valueOf(this.f407285b == 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "showCapsuleBar recording:%b, isAudioRecordOnly:%b", objArr);
        boolean z18 = this.f407285b == 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "showCapsuleBar");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            a(z17, z18);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new md1.h1(this, z17, z18));
        }
    }
}
