package um5;

/* loaded from: classes10.dex */
public final class p extends um5.w {
    public um5.e A;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.SurfaceTexture f510711v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f510712w;

    /* renamed from: x, reason: collision with root package name */
    public long f510713x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f510715z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f510709t = "EffectRenderController@" + hashCode();

    /* renamed from: u, reason: collision with root package name */
    public final um5.f f510710u = new um5.f(0, false, 0, 0, 0, 31, null);

    /* renamed from: y, reason: collision with root package name */
    public int f510714y = 1;

    public static final void k(final um5.p pVar) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createExternInputTexture, size:[");
        um5.f fVar = pVar.f510710u;
        sb6.append(fVar.f510685c);
        sb6.append(", ");
        sb6.append(fVar.f510686d);
        sb6.append(']');
        java.lang.String str = pVar.f510709t;
        xm5.b.c(str, sb6.toString(), new java.lang.Object[0]);
        int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(36197);
        fVar.f510683a = m97623x3164f87f;
        fVar.f510684b = true;
        pVar.f510715z = false;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(m97623x3164f87f);
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: um5.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                um5.p pVar2 = um5.p.this;
                java.lang.String str2 = pVar2.f510709t;
                if (surfaceTexture2 != null) {
                    try {
                        surfaceTexture2.updateTexImage();
                    } catch (java.lang.Exception unused) {
                        xm5.b.b(str2, "updateTexImage error", new java.lang.Object[0]);
                    }
                }
                if (!pVar2.f510715z) {
                    xm5.b.c(str2, "onExternTextureInputUpdate", new java.lang.Object[0]);
                    pVar2.f510715z = true;
                }
                pVar2.f510713x = (surfaceTexture2 != null ? surfaceTexture2.getTimestamp() : 0L) / 1000000;
                pVar2.f(new um5.l(pVar2));
            }
        });
        int i18 = fVar.f510685c;
        if (i18 > 0 && (i17 = fVar.f510686d) > 0) {
            try {
                surfaceTexture.setDefaultBufferSize(i18, i17);
            } catch (java.lang.Exception e17) {
                xm5.b.d(str, e17, "setDefaultBufferSize error:" + e17.getMessage(), new java.lang.Object[0]);
            }
        }
        pVar.f510711v = surfaceTexture;
        xm5.d.b(new um5.h(pVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    @Override // um5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(long r11) {
        /*
            r10 = this;
            um5.f r11 = r10.f510710u
            int r1 = r11.f510683a
            r12 = 0
            if (r1 <= 0) goto L54
            int r2 = r11.f510685c
            if (r2 <= 0) goto L54
            int r3 = r11.f510686d
            if (r3 > 0) goto L10
            goto L54
        L10:
            int r0 = r11.f510687e
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2a
            r4 = 90
            if (r0 == r4) goto L28
            r4 = 180(0xb4, float:2.52E-43)
            if (r0 == r4) goto L26
            r4 = 270(0x10e, float:3.78E-43)
            if (r0 == r4) goto L24
            goto L2a
        L24:
            r5 = r6
            goto L2b
        L26:
            r5 = r7
            goto L2b
        L28:
            r5 = r8
            goto L2b
        L2a:
            r5 = r12
        L2b:
            tq5.f r9 = new tq5.f
            boolean r4 = r11.f510684b
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            com.tencent.mm.xeffect.LayoutInfo r11 = r9.f502797i
            int r0 = r10.f510727c
            int r0 = r0 / r7
            r11.f296326b = r0
            int r0 = r10.f510728d
            int r0 = r0 / r7
            r11.f296327c = r0
            int r0 = r10.f510714y
            if (r0 == r7) goto L47
            if (r0 == r6) goto L48
            r6 = r8
            goto L48
        L47:
            r6 = 4
        L48:
            r11.f296329e = r6
            if (r0 == r8) goto L4d
            r12 = r8
        L4d:
            r9.f502794f = r12
            java.util.List r11 = kz5.b0.c(r9)
            return r11
        L54:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "error externInput id:"
            r0.<init>(r1)
            int r1 = r11.f510683a
            r0.append(r1)
            java.lang.String r1 = " width:"
            r0.append(r1)
            int r1 = r11.f510685c
            r0.append(r1)
            java.lang.String r1 = " height:"
            r0.append(r1)
            int r11 = r11.f510686d
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r0 = r10.f510709t
            xm5.b.f(r0, r11, r12)
            kz5.p0 r11 = kz5.p0.f395529d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: um5.p.a(long):java.util.List");
    }

    @Override // um5.w
    public void b() {
        f(new um5.i(this));
        super.b();
        xm5.d.b(new um5.j(this));
    }

    @Override // um5.w
    public java.lang.String c() {
        return this.f510709t;
    }

    @Override // um5.w
    public void d() {
        super.d();
        f(new um5.k(this));
    }

    @Override // um5.w
    public void h(long j17) {
        super.h(j17);
        if (this.f510727c > 0 && this.f510728d > 0) {
            xm5.d.b(new um5.m(this));
            return;
        }
        xm5.b.f(this.f510709t, "render with size error " + this.f510727c + ", " + this.f510728d, new java.lang.Object[0]);
    }

    public final void l(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        java.lang.String str = this.f510709t;
        xm5.b.c(str, "setInputBitmap: " + bitmap + ", size:[" + bitmap.getWidth() + ',' + bitmap.getHeight() + ']', new java.lang.Object[0]);
        if (this.f510710u.f510683a > 0) {
            xm5.b.c(str, "already set a inputTexture, will override the old one", new java.lang.Object[0]);
            android.graphics.SurfaceTexture surfaceTexture = this.f510711v;
            if (surfaceTexture != null) {
                surfaceTexture.setOnFrameAvailableListener(null);
            }
        }
        this.f510713x = 0L;
        f(new um5.n(this, bitmap));
    }

    public final void m(int i17, int i18, int i19) {
        java.lang.String str = this.f510709t;
        xm5.b.c(str, "setInputContentInfo, size:[" + i17 + ',' + i18 + "], rotate:" + i19, new java.lang.Object[0]);
        um5.f fVar = this.f510710u;
        fVar.f510685c = i17;
        fVar.f510686d = i18;
        fVar.f510687e = i19;
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.f510711v;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i17, i18);
            }
        } catch (java.lang.Exception e17) {
            xm5.b.d(str, e17, "setDefaultBufferSize error:" + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public final void n(um5.e eVar) {
        this.A = eVar;
        this.f510712w = true;
        if (!this.f510734j || this.f510710u.f510683a > 0) {
            return;
        }
        f(new um5.o(this));
    }
}
