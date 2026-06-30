package w21;

/* loaded from: classes12.dex */
public class f1 implements tl.d {

    /* renamed from: e, reason: collision with root package name */
    public static int f523897e = 100;

    /* renamed from: a, reason: collision with root package name */
    public final tl.t f523898a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f523899b = "";

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.e1 f523900c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f523901d = 0;

    public f1(to.c cVar) {
        this.f523898a = new tl.t(cVar);
    }

    @Override // tl.d
    public int a() {
        tl.w wVar;
        to.c cVar = to.c.PCM;
        tl.t tVar = this.f523898a;
        to.c cVar2 = tVar.f501670q;
        if ((cVar2 == cVar || cVar2 == to.c.SILK) && (wVar = tVar.f501669p) != null) {
            return wVar.D;
        }
        return 1;
    }

    @Override // tl.d
    public void b(com.p314xaae8f345.mm.p944x882e457a.e1 e1Var) {
        this.f523900c = e1Var;
    }

    @Override // tl.d
    public int d() {
        if (this.f523901d != 1) {
            return 0;
        }
        int a17 = this.f523898a.a();
        if (a17 > f523897e) {
            f523897e = a17;
        }
        return (a17 * 100) / f523897e;
    }

    @Override // tl.d
    /* renamed from: getStatus */
    public int mo166724x2fe4f2e8() {
        return this.f523901d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r6 = r0.f501668o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r6 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r6.setOutputFormat(3);
     */
    @Override // tl.d
    /* renamed from: startRecord */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo166725x8e35cb53(java.lang.String r9) {
        /*
            r8 = this;
            tl.t r0 = r8.f523898a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r9
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r9)
            if (r3 == 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r9.length()
        L14:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "[startRecord] fileName:%s size:%s"
            java.lang.String r5 = "VoiceRecorder"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3, r1)
            fp.j r1 = new fp.j
            r1.<init>()
            java.lang.String r3 = r8.f523899b
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L3d
            java.lang.String r3 = r8.f523899b
            int r3 = r3.length()
            if (r3 <= 0) goto L3d
            java.lang.String r9 = "Duplicate Call startRecord , maybe Stop Fail Before"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r9)
            return r2
        L3d:
            r8.f523899b = r9
            w21.e1 r9 = new w21.e1     // Catch: java.lang.Exception -> L8a
            r9.<init>(r8)     // Catch: java.lang.Exception -> L8a
            r0.e(r9)     // Catch: java.lang.Exception -> L8a
            to.c r9 = to.c.AMR     // Catch: java.lang.Exception -> L8a
            to.c r3 = r0.f501670q
            if (r3 != r9) goto L55
            android.media.MediaRecorder r6 = r0.f501668o     // Catch: java.lang.Exception -> L8a
            if (r6 != 0) goto L52
            goto L55
        L52:
            r6.setAudioSource(r4)     // Catch: java.lang.Exception -> L8a
        L55:
            if (r3 != r9) goto L60
            android.media.MediaRecorder r6 = r0.f501668o     // Catch: java.lang.Exception -> L8a
            if (r6 != 0) goto L5c
            goto L60
        L5c:
            r7 = 3
            r6.setOutputFormat(r7)     // Catch: java.lang.Exception -> L8a
        L60:
            if (r3 != r9) goto L69
            android.media.MediaRecorder r6 = r0.f501668o     // Catch: java.lang.Exception -> L8a
            if (r6 == 0) goto L69
            r6.setAudioEncoder(r4)     // Catch: java.lang.Exception -> L8a
        L69:
            java.lang.String r6 = r8.f523899b     // Catch: java.lang.Exception -> L8a
            r0.f(r6)     // Catch: java.lang.Exception -> L8a
            r6 = 70000(0x11170, float:9.8091E-41)
            if (r3 != r9) goto L7b
            android.media.MediaRecorder r9 = r0.f501668o     // Catch: java.lang.Exception -> L8a
            if (r9 == 0) goto L7e
            r9.setMaxDuration(r6)     // Catch: java.lang.Exception -> L8a
            goto L7e
        L7b:
            long r6 = (long) r6     // Catch: java.lang.Exception -> L8a
            r0.f501661h = r6     // Catch: java.lang.Exception -> L8a
        L7e:
            r0.c()     // Catch: java.lang.Exception -> L8a
            r0.g()     // Catch: java.lang.Exception -> L8a
            r1.a()     // Catch: java.lang.Exception -> L8a
            r8.f523901d = r4
            return r4
        L8a:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StartRecord File["
            r0.<init>(r1)
            java.lang.String r1 = r8.f523899b
            r0.append(r1)
            java.lang.String r1 = "] ErrMsg["
            r0.append(r1)
            java.lang.String r9 = r9.getMessage()
            r0.append(r9)
            java.lang.String r9 = "]"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r9)
            r9 = -1
            r8.f523901d = r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.f1.mo166725x8e35cb53(java.lang.String):boolean");
    }

    @Override // tl.d
    /* renamed from: stopRecord */
    public boolean mo166726xad07d6f3() {
        tl.t tVar = this.f523898a;
        if (tVar == null) {
            return true;
        }
        try {
            tVar.h();
            tVar.d();
            this.f523899b = "";
            this.f523901d = 0;
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VoiceRecorder", "StopRecord File[" + this.f523899b + "] ErrMsg[" + e17.getMessage() + "]");
            this.f523901d = -1;
            return false;
        }
    }
}
