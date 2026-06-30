package com.tencent.liteav.videobase.c;

/* loaded from: classes14.dex */
public abstract class e extends com.tencent.liteav.videobase.a.a {

    /* renamed from: i, reason: collision with root package name */
    protected final com.tencent.liteav.videobase.base.GLConstants.ColorSpace f46695i;

    /* renamed from: j, reason: collision with root package name */
    protected final com.tencent.liteav.videobase.base.GLConstants.ColorRange f46696j;

    /* renamed from: k, reason: collision with root package name */
    private int f46697k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f46698l;

    /* renamed from: m, reason: collision with root package name */
    private int f46699m;

    /* renamed from: n, reason: collision with root package name */
    private int f46700n;

    public e(java.lang.String str, java.lang.String str2, com.tencent.liteav.videobase.base.GLConstants.ColorRange colorRange, com.tencent.liteav.videobase.base.GLConstants.ColorSpace colorSpace) {
        super(str, str2);
        int[] iArr = new int[2];
        this.f46698l = iArr;
        this.f46699m = 0;
        this.f46700n = 0;
        java.util.Arrays.fill(iArr, -1);
        this.f46695i = colorSpace == com.tencent.liteav.videobase.base.GLConstants.ColorSpace.UNKNOWN ? com.tencent.liteav.videobase.base.GLConstants.ColorSpace.BT601 : colorSpace;
        this.f46696j = colorRange == com.tencent.liteav.videobase.base.GLConstants.ColorRange.UNKNOWN ? com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE : colorRange;
    }

    private void f() {
        int i17 = 0;
        while (true) {
            int[] iArr = this.f46698l;
            if (i17 >= iArr.length) {
                return;
            }
            com.tencent.liteav.videobase.utils.OpenGlUtils.deleteTexture(iArr[i17]);
            this.f46698l[i17] = -1;
            i17++;
        }
    }

    public final void a(java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        if (this.f46699m != i17 || this.f46700n != i18) {
            f();
            this.f46699m = i17;
            this.f46700n = i18;
        }
        com.tencent.liteav.videobase.utils.OpenGlUtils.loadYuv420DataToTextures(byteBuffer, e(), i17, i18, this.f46698l);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void d() {
        f();
        super.d();
    }

    public abstract int e();

    @Override // com.tencent.liteav.videobase.a.a
    public void a(com.tencent.liteav.videobase.frame.e eVar) {
        super.a(eVar);
        this.f46697k = android.opengl.GLES20.glGetUniformLocation(this.f46631g, "uvTexture");
    }

    public e(java.lang.String str, java.lang.String str2) {
        this(str, str2, com.tencent.liteav.videobase.base.GLConstants.ColorRange.VIDEO_RANGE, com.tencent.liteav.videobase.base.GLConstants.ColorSpace.BT601);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i17, com.tencent.liteav.videobase.frame.d dVar, java.nio.FloatBuffer floatBuffer, java.nio.FloatBuffer floatBuffer2) {
        super.a(this.f46698l[0], dVar, floatBuffer, floatBuffer2);
    }

    @Override // com.tencent.liteav.videobase.a.a
    public final void a(int i17) {
        super.a(i17);
        android.opengl.GLES20.glActiveTexture(33985);
        com.tencent.liteav.videobase.utils.OpenGlUtils.bindTexture(b(), this.f46698l[1]);
        android.opengl.GLES20.glUniform1i(this.f46697k, 1);
    }
}
