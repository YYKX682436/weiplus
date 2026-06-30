package aj0;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f86812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86813b;

    /* renamed from: c, reason: collision with root package name */
    public android.os.Handler f86814c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f86815d;

    /* renamed from: e, reason: collision with root package name */
    public aj0.a f86816e;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f86818g;

    /* renamed from: f, reason: collision with root package name */
    public int f86817f = -1;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.c0 f86819h = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);

    public s(int i17, int i18) {
        this.f86812a = i17;
        this.f86813b = i18;
        android.os.HandlerThread j17 = pi0.r.f436250a.j("PreRenderSurface_GL");
        j17.start();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Handler handler = myLooper != null ? new android.os.Handler(myLooper) : null;
        this.f86814c = handler;
        this.f86815d = j17;
        aj0.r rVar = new aj0.r(this);
        if (handler != null) {
            handler.post(new aj0.q(rVar));
        }
        aj0.n nVar = new aj0.n(this);
        android.os.Handler handler2 = this.f86814c;
        if (handler2 != null) {
            handler2.post(new aj0.q(nVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof aj0.o
            if (r0 == 0) goto L13
            r0 = r5
            aj0.o r0 = (aj0.o) r0
            int r1 = r0.f86808g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86808g = r1
            goto L18
        L13:
            aj0.o r0 = new aj0.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f86806e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f86808g
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.f86805d
            aj0.s r0 = (aj0.s) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            kotlinx.coroutines.c0 r5 = r4.f86819h
            r0.f86805d = r4
            r0.f86808g = r3
            kotlinx.coroutines.c3 r5 = (p3325xe03a0797.p3326xc267989b.c3) r5
            java.lang.Object r5 = r5.C(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            android.graphics.SurfaceTexture r5 = r0.f86818g
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aj0.s.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
