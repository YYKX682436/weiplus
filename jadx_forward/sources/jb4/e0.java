package jb4;

/* loaded from: classes14.dex */
public class e0 implements jb4.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f380319a;

    /* renamed from: b, reason: collision with root package name */
    public int f380320b;

    /* renamed from: c, reason: collision with root package name */
    public int f380321c;

    /* renamed from: d, reason: collision with root package name */
    public int f380322d;

    /* renamed from: e, reason: collision with root package name */
    public int f380323e;

    /* renamed from: g, reason: collision with root package name */
    public int f380325g;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.FloatBuffer f380326h;

    /* renamed from: i, reason: collision with root package name */
    public java.nio.FloatBuffer f380327i;

    /* renamed from: j, reason: collision with root package name */
    public int f380328j;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f380324f = new float[16];

    /* renamed from: k, reason: collision with root package name */
    public float f380329k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public float f380330l = 90.0f;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f380331m = new float[16];

    /* renamed from: n, reason: collision with root package name */
    public final float[] f380332n = new float[16];

    /* renamed from: o, reason: collision with root package name */
    public float f380333o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public float f380334p = 20.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f380335q = 0.0f;

    public e0(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        this.f380319a = context;
        java.lang.String str5 = "SphereImageView.SphereRender";
        java.lang.String str6 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82;
        java.lang.String str7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 50;
            float f17 = 50;
            double d17 = 6.283185307179586d / f17;
            double d18 = 1.0f / f17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i18 = 0;
            while (i18 < i17) {
                int i19 = 0;
                while (i19 < i17) {
                    str = str6;
                    str2 = str7;
                    double d19 = i18;
                    int i27 = i18;
                    float f18 = (float) (d19 * d18);
                    long j17 = currentTimeMillis;
                    double d27 = i19;
                    java.lang.String str8 = str5;
                    float f19 = (float) (d27 * d18);
                    double d28 = i27 + 1;
                    float f27 = (float) (d28 * d18);
                    int i28 = i19 + 1;
                    double d29 = i28;
                    str4 = str8;
                    float f28 = (float) (d29 * d18);
                    try {
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f27));
                        arrayList2.add(java.lang.Float.valueOf(f28));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        arrayList2.add(java.lang.Float.valueOf(f19));
                        arrayList2.add(java.lang.Float.valueOf(f18));
                        double d37 = (d19 * d17) / 2.0d;
                        double d38 = d27 * d17;
                        double d39 = d18;
                        float sin = (float) (java.lang.Math.sin(d37) * java.lang.Math.cos(d38));
                        float sin2 = (float) (java.lang.Math.sin(d37) * java.lang.Math.sin(d38));
                        float cos = (float) java.lang.Math.cos(d37);
                        double d47 = (d28 * d17) / 2.0d;
                        float sin3 = (float) (java.lang.Math.sin(d47) * java.lang.Math.cos(d38));
                        float sin4 = (float) (java.lang.Math.sin(d47) * java.lang.Math.sin(d38));
                        float cos2 = (float) java.lang.Math.cos(d47);
                        double d48 = d29 * d17;
                        double d49 = d17;
                        float sin5 = (float) (java.lang.Math.sin(d47) * java.lang.Math.cos(d48));
                        java.util.ArrayList arrayList3 = arrayList2;
                        float sin6 = (float) (java.lang.Math.sin(d47) * java.lang.Math.sin(d48));
                        float cos3 = (float) java.lang.Math.cos(d47);
                        float sin7 = (float) (java.lang.Math.sin(d37) * java.lang.Math.cos(d48));
                        float sin8 = (float) (java.lang.Math.sin(d48) * java.lang.Math.sin(d37));
                        float cos4 = (float) java.lang.Math.cos(d37);
                        arrayList.add(java.lang.Float.valueOf(sin));
                        arrayList.add(java.lang.Float.valueOf(cos));
                        arrayList.add(java.lang.Float.valueOf(sin2));
                        arrayList.add(java.lang.Float.valueOf(sin3));
                        arrayList.add(java.lang.Float.valueOf(cos2));
                        arrayList.add(java.lang.Float.valueOf(sin4));
                        arrayList.add(java.lang.Float.valueOf(sin5));
                        arrayList.add(java.lang.Float.valueOf(cos3));
                        arrayList.add(java.lang.Float.valueOf(sin6));
                        arrayList.add(java.lang.Float.valueOf(sin5));
                        arrayList.add(java.lang.Float.valueOf(cos3));
                        arrayList.add(java.lang.Float.valueOf(sin6));
                        arrayList.add(java.lang.Float.valueOf(sin7));
                        arrayList.add(java.lang.Float.valueOf(cos4));
                        arrayList.add(java.lang.Float.valueOf(sin8));
                        arrayList.add(java.lang.Float.valueOf(sin));
                        arrayList.add(java.lang.Float.valueOf(cos));
                        arrayList.add(java.lang.Float.valueOf(sin2));
                        str6 = str;
                        arrayList2 = arrayList3;
                        str7 = str2;
                        i18 = i27;
                        currentTimeMillis = j17;
                        str5 = str4;
                        i19 = i28;
                        d18 = d39;
                        d17 = d49;
                        i17 = 50;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        str3 = str4;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "init, exp:" + th.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                    }
                }
                i18++;
                currentTimeMillis = currentTimeMillis;
                i17 = 50;
            }
            str4 = str5;
            str = str6;
            str2 = str7;
            long j18 = currentTimeMillis;
            java.util.ArrayList arrayList4 = arrayList2;
            int size = arrayList.size() / 3;
            try {
                this.f380325g = size;
                int i29 = size * 2;
                float[] fArr = new float[i29];
                for (int i37 = 0; i37 < i29; i37++) {
                    fArr[i37] = ((java.lang.Float) arrayList4.get(i37)).floatValue();
                }
                java.nio.FloatBuffer asFloatBuffer = java.nio.ByteBuffer.allocateDirect(i29 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                this.f380327i = asFloatBuffer;
                asFloatBuffer.put(fArr);
                this.f380327i.position(0);
                int i38 = this.f380325g * 3;
                float[] fArr2 = new float[i38];
                for (int i39 = 0; i39 < i38; i39++) {
                    fArr2[i39] = ((java.lang.Float) arrayList.get(i39)).floatValue();
                }
                java.nio.FloatBuffer asFloatBuffer2 = java.nio.ByteBuffer.allocateDirect(i38 * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
                this.f380326h = asFloatBuffer2;
                asFloatBuffer2.put(fArr2);
                this.f380326h.position(0);
                str3 = str4;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "init, timeCost=" + (java.lang.System.currentTimeMillis() - j18));
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "init, exp:" + th.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                str3 = str4;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "init, exp:" + th.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            str = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82;
            str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender";
            str3 = "SphereImageView.SphereRender";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    public void a(javax.microedition.khronos.opengles.GL10 gl10) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            android.opengl.Matrix.rotateM(this.f380331m, 0, -this.f380329k, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.rotateM(this.f380331m, 0, -this.f380330l, 0.0f, 1.0f, 0.0f);
            android.opengl.Matrix.rotateM(this.f380331m, 0, -0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            android.opengl.GLES20.glClear(16640);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(3553, this.f380328j);
            int i17 = this.f380322d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            android.opengl.Matrix.multiplyMM(this.f380332n, 0, this.f380324f, 0, this.f380331m, 0);
            android.opengl.Matrix.setIdentityM(this.f380331m, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getfinalMVPMatrix", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            android.opengl.GLES20.glUniformMatrix4fv(i17, 1, false, this.f380332n, 0);
            android.opengl.GLES20.glDrawArrays(4, 0, this.f380325g);
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDrawFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
    }

    public void b(javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        long currentTimeMillis;
        float[] fArr = this.f380324f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "onSurfaceChanged, w=" + i17 + ", h=" + i18 + "， textureID=" + this.f380328j + ", near=" + this.f380333o + ", far=" + this.f380334p + ", z=" + this.f380335q);
            currentTimeMillis = java.lang.System.currentTimeMillis();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.SphereRender", "onSurfaceChanged, exp=" + th6.toString());
        }
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
            return;
        }
        android.opengl.GLES20.glViewport(0, 0, i17, i18);
        android.opengl.GLES20.glEnable(2884);
        float f17 = i17 / i18;
        android.opengl.Matrix.frustumM(this.f380324f, 0, -f17, f17, -1.0f, 1.0f, this.f380333o, this.f380334p);
        android.opengl.Matrix.setIdentityM(this.f380331m, 0);
        android.opengl.Matrix.setIdentityM(this.f380332n, 0);
        android.opengl.Matrix.translateM(fArr, 0, 0.0f, 0.0f, this.f380335q);
        android.opengl.Matrix.scaleM(fArr, 0, 4.0f, 4.0f, 4.0f);
        int a17 = jb4.f0.a(this.f380319a);
        this.f380320b = a17;
        android.opengl.GLES20.glUseProgram(a17);
        this.f380321c = android.opengl.GLES20.glGetAttribLocation(this.f380320b, "aPosition");
        this.f380322d = android.opengl.GLES20.glGetUniformLocation(this.f380320b, "uProjectMatrix");
        this.f380323e = android.opengl.GLES20.glGetAttribLocation(this.f380320b, "aTextureCoord");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "aPosition:" + this.f380321c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "uProjectMatrix:" + this.f380322d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "aTextureCoord:" + this.f380323e);
        android.opengl.GLES20.glVertexAttribPointer(this.f380321c, 3, 5126, false, 0, (java.nio.Buffer) this.f380326h);
        android.opengl.GLES20.glVertexAttribPointer(this.f380323e, 2, 5126, false, 0, (java.nio.Buffer) this.f380327i);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f380321c);
        android.opengl.GLES20.glEnableVertexAttribArray(this.f380323e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.SphereRender", "onSurfaceChanged, timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSurfaceChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
    }
}
