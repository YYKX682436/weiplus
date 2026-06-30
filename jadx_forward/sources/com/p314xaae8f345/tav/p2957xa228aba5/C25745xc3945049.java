package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.TextureInfo */
/* loaded from: classes14.dex */
public class C25745xc3945049 {

    /* renamed from: enableDebugInfo */
    public static boolean f47879x6f958b5e;

    /* renamed from: textureList */
    private static final java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> f47880x602bf459 = new java.util.ArrayList<>();

    /* renamed from: format */
    private int f47881xb45ff7f7;

    /* renamed from: frameBuffer */
    private int f47882xdab7a40d;

    /* renamed from: height */
    public final int f47883xb7389127;

    /* renamed from: mixAlpha */
    private boolean f47884xbddab462;

    /* renamed from: needRelease */
    private boolean f47885x126d8291;

    /* renamed from: preferRotation */
    public final int f47886xcc7d15ae;

    /* renamed from: released */
    private boolean f47887xdf23d93d;

    /* renamed from: surfaceTextureRotation */
    public int f47888x2b8a394c;

    /* renamed from: surfaceTextureTransform */
    public float[] f47889xcef27b5e;

    /* renamed from: textureID */
    public final int f47890xc35d0376;

    /* renamed from: textureMatrix */
    private android.graphics.Matrix f47891x644d8bc;

    /* renamed from: textureRect */
    private android.graphics.Rect f47892x602e9d9f;

    /* renamed from: textureType */
    public final int f47893x602fd2f5;

    /* renamed from: width */
    public final int f47894x6be2dc6;

    public C25745xc3945049(int i17, int i18, int i19, int i27, int i28) {
        this(i17, i18, i19, i27, null, i28);
    }

    /* renamed from: addTextureInfo */
    private void m97271x8530d908(com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049) {
        if (f47879x6f958b5e) {
            java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> arrayList = f47880x602bf459;
            synchronized (arrayList) {
                if (!arrayList.contains(c25745xc3945049)) {
                    arrayList.add(c25745xc3945049);
                }
            }
        }
    }

    /* renamed from: printTextureInfo */
    public static java.lang.String m97272x13de1f7c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> it = f47880x602bf459.iterator();
        float f17 = 0.0f;
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 next = it.next();
            sb6.append("id:" + next.f47890xc35d0376);
            sb6.append(",size:" + next.f47894x6be2dc6 + "x" + next.f47883xb7389127);
            sb6.append("\n");
            f17 += ((((float) (next.f47894x6be2dc6 * next.f47883xb7389127)) * 3.0f) / 1024.0f) / 1024.0f;
        }
        return java.lang.String.format("size:%d memory:%d info:%s", java.lang.Integer.valueOf(f47880x602bf459.size()), java.lang.Integer.valueOf((int) f17), sb6.toString());
    }

    /* renamed from: equals */
    public boolean m97275xb2c87fbf(java.lang.Object obj) {
        return obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 ? ((com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049) obj).f47890xc35d0376 == this.f47890xc35d0376 : super.equals(obj);
    }

    /* renamed from: getFormat */
    public int m97276x19771aed() {
        return this.f47881xb45ff7f7;
    }

    /* renamed from: getFrameBuffer */
    public int m97277xb48dead7() {
        return this.f47882xdab7a40d;
    }

    /* renamed from: getSurfaceTextureRotation */
    public int m97278x9558b042() {
        return this.f47888x2b8a394c;
    }

    /* renamed from: getSurfaceTextureTransform */
    public float[] m97279x9ef2e328() {
        return this.f47889xcef27b5e;
    }

    /* renamed from: getTextureMatrix */
    public android.graphics.Matrix m97280xc3a49506() {
        return this.f47891x644d8bc;
    }

    /* renamed from: getTextureRect */
    public android.graphics.Rect m97281x3a04e469() {
        return this.f47892x602e9d9f;
    }

    /* renamed from: isMixAlpha */
    public boolean m97282x8e925bac() {
        return this.f47884xbddab462;
    }

    /* renamed from: isNeedRelease */
    public boolean m97283xbe621f07() {
        return this.f47885x126d8291;
    }

    /* renamed from: isReleased */
    public boolean m97284xafdb8087() {
        return this.f47887xdf23d93d;
    }

    /* renamed from: release */
    public void m97285x41012807() {
        this.f47887xdf23d93d = true;
        int i17 = this.f47882xdab7a40d;
        if (i17 != -1) {
            android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i17}, 0);
            this.f47882xdab7a40d = -1;
        }
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f47890xc35d0376}, 0);
        if (f47879x6f958b5e) {
            java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049> arrayList = f47880x602bf459;
            synchronized (arrayList) {
                arrayList.remove(this);
            }
        }
    }

    /* renamed from: setFormat */
    public void m97286xcac4ef9(int i17) {
        this.f47881xb45ff7f7 = i17;
    }

    /* renamed from: setFrameBuffer */
    public void m97287x4af35e4b(int i17) {
        this.f47882xdab7a40d = i17;
    }

    /* renamed from: setMixAlpha */
    public void m97288x346d52e4(boolean z17) {
        this.f47884xbddab462 = z17;
    }

    /* renamed from: setSurfaceTextureRotation */
    public void m97289xc79c4c4e(int i17) {
        this.f47888x2b8a394c = i17;
    }

    /* renamed from: setSurfaceTextureTransform */
    public void m97290xb522c89c(float[] fArr) {
        this.f47889xcef27b5e = fArr;
    }

    /* renamed from: setTextureMatrix */
    public void m97291x567afb7a(android.graphics.Matrix matrix) {
        this.f47891x644d8bc = matrix;
    }

    /* renamed from: setTextureRect */
    public void m97292xd06a57dd(android.graphics.Rect rect) {
        this.f47892x602e9d9f = rect;
    }

    /* renamed from: toString */
    public java.lang.String m97293x9616526c() {
        return "TextureInfo{textureID=" + this.f47890xc35d0376 + ", textureType=" + this.f47893x602fd2f5 + ", width=" + this.f47894x6be2dc6 + ", height=" + this.f47883xb7389127 + ", preferRotation=" + this.f47886xcc7d15ae + ", textureMatrix=" + this.f47891x644d8bc + ", frameBuffer=" + this.f47882xdab7a40d + ", needRelease=" + this.f47885x126d8291 + ", mixAlpha=" + this.f47884xbddab462 + ", format=" + this.f47881xb45ff7f7 + '}';
    }

    public C25745xc3945049(int i17, int i18, int i19, int i27, android.graphics.Matrix matrix, int i28) {
        this(i17, i18, i19, i27, matrix, i28, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 m97274x5a5dd5d() {
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = new com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049(this.f47890xc35d0376, this.f47893x602fd2f5, this.f47894x6be2dc6, this.f47883xb7389127, this.f47891x644d8bc, this.f47886xcc7d15ae, this.f47889xcef27b5e);
        c25745xc3945049.f47885x126d8291 = true;
        c25745xc3945049.f47892x602e9d9f = this.f47892x602e9d9f;
        c25745xc3945049.f47888x2b8a394c = this.f47888x2b8a394c;
        return c25745xc3945049;
    }

    public C25745xc3945049(int i17, int i18, int i19, int i27, android.graphics.Matrix matrix, int i28, float[] fArr) {
        this.f47882xdab7a40d = -1;
        this.f47885x126d8291 = false;
        this.f47892x602e9d9f = null;
        this.f47884xbddab462 = true;
        this.f47881xb45ff7f7 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5293x7d837a53;
        this.f47891x644d8bc = matrix;
        this.f47890xc35d0376 = i17;
        this.f47893x602fd2f5 = i18;
        this.f47894x6be2dc6 = i19;
        this.f47883xb7389127 = i27;
        this.f47886xcc7d15ae = i28;
        this.f47889xcef27b5e = fArr;
        m97271x8530d908(this);
    }
}
