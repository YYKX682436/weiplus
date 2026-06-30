package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.c;

/* loaded from: classes14.dex */
public abstract class e extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a {

    /* renamed from: i, reason: collision with root package name */
    protected final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace f128228i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange f128229j;

    /* renamed from: k, reason: collision with root package name */
    private int f128230k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f128231l;

    /* renamed from: m, reason: collision with root package name */
    private int f128232m;

    /* renamed from: n, reason: collision with root package name */
    private int f128233n;

    public e(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange colorRange, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace colorSpace) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f128231l = iArr;
        this.f128232m = 0;
        this.f128233n = 0;
        java.util.Arrays.fill(iArr, -1);
        this.f128228i = colorSpace == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.UNKNOWN ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.BT601 : colorSpace;
        this.f128229j = colorRange == com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.UNKNOWN ? com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE : colorRange;
    }

    private void f() {
        int i17 = 0;
        while (true) {
            int[] iArr = this.f128231l;
            if (i17 >= iArr.length) {
                return;
            }
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31156x9f4940f0(iArr[i17]);
            this.f128231l[i17] = -1;
            i17++;
        }
    }

    public final void a(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        if (this.f128232m != i17 || this.f128233n != i18) {
            f();
            this.f128232m = i17;
            this.f128233n = i18;
        }
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31169x4baa401b(byteBuffer, e(), i17, i18, this.f128231l);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void d() {
        f();
        super.d();
    }

    public abstract int e();

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public void a(com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.e eVar) {
        super.a(eVar);
        this.f128230k = android.opengl.GLES20.glGetUniformLocation(this.f128164g, "uvTexture");
    }

    public e(java.lang.String str, java.lang.String str2) {
        this(str, str2, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorRange.VIDEO_RANGE, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p398x2e06d1.InterfaceC3809x2f81d9ea.ColorSpace.BT601);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void a(int i17, com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        super.a(this.f128231l[0], dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final void a(int i17) {
        super.a(i17);
        android.opengl.GLES20.glActiveTexture(33985);
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31148x89bf7a1e(b(), this.f128231l[1]);
        android.opengl.GLES20.glUniform1i(this.f128230k, 1);
    }
}
