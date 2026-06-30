package com.p314xaae8f345.mm.p2825x7e128009;

/* renamed from: com.tencent.mm.xeffect.VLogDirector */
/* loaded from: classes10.dex */
public class C22965x6f780cba {

    /* renamed from: a, reason: collision with root package name */
    public long f296330a;

    /* renamed from: b, reason: collision with root package name */
    public long f296331b;

    /* renamed from: c, reason: collision with root package name */
    public int f296332c;

    /* renamed from: d, reason: collision with root package name */
    public int f296333d;

    /* renamed from: e, reason: collision with root package name */
    public long f296334e = 0;

    static {
        tq5.k.a("xlabeffect");
        tq5.k.a("pag");
    }

    /* renamed from: nAddInputTexture */
    private static native int m83689x13488ee4(long j17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, long j18, long j19, long j27, boolean z17, boolean z18);

    /* renamed from: nDestroy */
    private static native void m83690x62cd7fac(long j17);

    /* renamed from: nInit */
    private static native long m83691x630f29e();

    /* renamed from: nRender */
    private static native int m83692x4c9da3a4(long j17, int i17, int i18, int i19, long j18);

    /* renamed from: nSetEffectManager */
    private static native void m83693xa30b0428(long j17, long j18);

    /* renamed from: nSetOutputTexCropRet */
    private static native int m83694xa4fdb2df(long j17, int i17, int i18, int i19, int i27);

    /* renamed from: nSetRenderArea */
    private static native int m83695xa074a377(long j17, int i17, int i18, int i19, int i27);

    public final void a() {
        if (java.lang.Thread.currentThread().getId() != this.f296331b) {
            com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.e("VLogDirector", "Thread error", new java.lang.Object[0]);
        }
    }

    public void b() {
        a();
        long j17 = this.f296330a;
        if (j17 != 0) {
            m83690x62cd7fac(j17);
            this.f296330a = 0L;
            this.f296334e = 0L;
        }
    }

    public void c() {
        this.f296331b = java.lang.Thread.currentThread().getId();
        boolean z17 = tq5.k.f502805a;
        if (tq5.k.f502805a) {
            this.f296330a = m83691x630f29e();
        } else {
            this.f296330a = 0L;
        }
    }

    public void d(java.util.List list, int i17, long j17) {
        a();
        if (this.f296330a != 0) {
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                tq5.f fVar = (tq5.f) it.next();
                if (fVar == null) {
                    com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.e("VLogDirector", "input is null", new java.lang.Object[0]);
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 c22964x8b2a0b18 = fVar.f502797i;
                    c22964x8b2a0b18.m83687x52529ad7(c22964x8b2a0b18.f296325a, c22964x8b2a0b18.f296326b, c22964x8b2a0b18.f296327c, c22964x8b2a0b18.f296328d, 0.0f, c22964x8b2a0b18.f296329e);
                    com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 c22964x8b2a0b182 = fVar.f502798j;
                    c22964x8b2a0b182.m83687x52529ad7(c22964x8b2a0b182.f296325a, c22964x8b2a0b182.f296326b, c22964x8b2a0b182.f296327c, c22964x8b2a0b182.f296328d, 0.0f, c22964x8b2a0b182.f296329e);
                    com.p314xaae8f345.mm.p2825x7e128009.C22963xba2dd2fa c22963xba2dd2fa = fVar.f502799k;
                    c22963xba2dd2fa.m83683x52529ad7(c22963xba2dd2fa.f296322a, c22963xba2dd2fa.f296323b, c22963xba2dd2fa.f296324c, 0);
                    long j18 = this.f296330a;
                    int i18 = fVar.f502789a;
                    int i19 = fVar.f502790b;
                    int i27 = fVar.f502791c;
                    int i28 = fVar.f502792d;
                    android.graphics.Rect rect = fVar.f502796h;
                    int i29 = rect.left;
                    int i37 = rect.top;
                    int i38 = rect.right;
                    int i39 = rect.bottom;
                    android.graphics.Rect rect2 = fVar.f502795g;
                    m83689x13488ee4(j18, i18, i19, i27, i28, i29, i37, i38, i39, rect2.left, rect2.top, rect2.right, rect2.bottom, fVar.f502797i.f296325a, fVar.f502798j.f296325a, fVar.f502799k.f296322a, fVar.f502793e, fVar.f502794f);
                }
            }
            if (this.f296332c <= 0 || this.f296333d <= 0) {
                int[] iArr = new int[2];
                android.opengl.GLES20.glBindTexture(3553, i17);
                android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr, 0);
                android.opengl.GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr, 1);
                this.f296332c = iArr[0];
                this.f296333d = iArr[1];
            }
            com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.f296336a.d("VLogDirector", "render output size, width:%d, height:%d", java.lang.Integer.valueOf(this.f296332c), java.lang.Integer.valueOf(this.f296333d));
            m83692x4c9da3a4(this.f296330a, i17, this.f296332c, this.f296333d, j17);
        }
    }

    public void e(com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc c22979xbb268bc) {
        if (c22979xbb268bc != null) {
            long j17 = c22979xbb268bc.f296338a;
            if (j17 == 0 || j17 == this.f296334e) {
                return;
            }
            m83693xa30b0428(this.f296330a, j17);
            this.f296334e = j17;
        }
    }

    public void f(int i17, int i18, int i19, int i27) {
        a();
        long j17 = this.f296330a;
        if (j17 != 0) {
            m83694xa4fdb2df(j17, i17, i18, i19, i27);
        }
    }

    public void g(int i17, int i18, int i19, int i27) {
        a();
        long j17 = this.f296330a;
        if (j17 != 0) {
            m83695xa074a377(j17, i17, i18, i19, i27);
        }
    }
}
