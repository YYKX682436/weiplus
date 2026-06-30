package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.b;

/* loaded from: classes14.dex */
public final class a extends com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a {
    public a() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nuniform mat4 textureTransform;\nvarying highp vec2 textureCoordinate;\nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = (textureTransform * inputTextureCoordinate).xy;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 textureCoordinate;\nuniform samplerExternalOES inputImageTexture;\nvoid main()\n{\n   gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    @Override // com.p314xaae8f345.p373xbe494963.p397x4f7965cc.a.a
    public final int b() {
        return 36197;
    }
}
