package jb4;

/* loaded from: classes4.dex */
public abstract class f0 {
    public static int a(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        int glCreateShader = android.opengl.GLES20.glCreateShader(35632);
        int glCreateShader2 = android.opengl.GLES20.glCreateShader(35633);
        android.opengl.GLES20.glShaderSource(glCreateShader2, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uProjectMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uProjectMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
        android.opengl.GLES20.glShaderSource(glCreateShader, "precision mediump float;varying vec2 vTextureCoord;uniform sampler2D uTexture;void main(){gl_FragColor = texture2D(uTexture, vTextureCoord);}");
        android.opengl.GLES20.glCompileShader(glCreateShader2);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        android.opengl.GLES20.glAttachShader(glCreateProgram, glCreateShader);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        return glCreateProgram;
    }

    public static int b(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.Utils", "initTexture, bmp==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SphereImageView.Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr, 0);
            int i17 = iArr[0];
            android.opengl.GLES20.glBindTexture(3553, i17);
            android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, com.p176xb6135e39.p177xcca8366f.gms.gcm.C2046x27a9a5.f6064x20a7e2cb, 9728.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10242, 33071.0f);
            android.opengl.GLES20.glTexParameterf(3553, 10243, 33071.0f);
            android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return i17;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SphereImageView.Utils", "initTexture exp:" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
    }
}
