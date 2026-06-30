package c61;

/* loaded from: classes3.dex */
public final class l9 implements mk4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f39144d;

    public l9(zy2.g5 g5Var) {
        this.f39144d = g5Var;
    }

    @Override // mk4.a
    public boolean a(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return false;
    }

    @Override // mk4.a
    public void b(java.lang.Object surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r5 == null) goto L16;
     */
    @Override // mk4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.String r5 = "surface"
            kotlin.jvm.internal.o.g(r4, r5)
            boolean r5 = r4 instanceof android.graphics.SurfaceTexture
            r6 = 0
            if (r5 == 0) goto Le
            r5 = r4
            android.graphics.SurfaceTexture r5 = (android.graphics.SurfaceTexture) r5
            goto Lf
        Le:
            r5 = r6
        Lf:
            zy2.g5 r0 = r3.f39144d
            if (r5 == 0) goto L2c
            boolean r1 = r0 instanceof zy2.p7
            if (r1 == 0) goto L1b
            r1 = r0
            zy2.p7 r1 = (zy2.p7) r1
            goto L1c
        L1b:
            r1 = r6
        L1c:
            if (r1 == 0) goto L29
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r5)
            r1.setRenderSurface(r2)
            jz5.f0 r5 = jz5.f0.f302826a
            goto L2a
        L29:
            r5 = r6
        L2a:
            if (r5 != 0) goto L46
        L2c:
            boolean r5 = r4 instanceof android.view.SurfaceHolder
            if (r5 == 0) goto L33
            android.view.SurfaceHolder r4 = (android.view.SurfaceHolder) r4
            goto L34
        L33:
            r4 = r6
        L34:
            if (r4 == 0) goto L46
            boolean r5 = r0 instanceof zy2.p7
            if (r5 == 0) goto L3d
            r6 = r0
            zy2.p7 r6 = (zy2.p7) r6
        L3d:
            if (r6 == 0) goto L46
            android.view.Surface r4 = r4.getSurface()
            r6.setRenderSurface(r4)
        L46:
            ez2.e r4 = ez2.g.f257902a
            if (r4 == 0) goto L51
            long r5 = android.os.SystemClock.elapsedRealtime()
            r4.i(r5)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.l9.c(java.lang.Object, int, int):void");
    }

    @Override // mk4.a
    public void d(java.lang.Object surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
    }
}
