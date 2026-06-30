package com.tencent.mm.mmpostprocessing;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0007¢\u0006\u0004\b-\u0010.J#\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\fJ$\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nJ\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0001J\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nJ\u001e\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\nJ\u001e\u0010$\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eJ&\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eJ>\u0010*\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0005R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/tencent/mm/mmpostprocessing/MMPostProcessing;", "", "", "Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$ShaderDesc;", "shaderDescs", "", "enableDebug", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "([Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$ShaderDesc;Z)Z", "isInitialized", "", "getNativeHandle", "Ljz5/f0;", "release", "", "postProcessorType", "", "", "postProcessorParams", "createPostProcessor", "postProcessor", "releasePostProcessor", "key", "value", "updatePostProcessorParam", "createInputTexture", "inputTexture", "releaseInputTexture", "getInputTextureId", "Landroid/view/Surface;", "surface", "width", "height", "createSwapChain", "swapChain", "releaseSwapChain", "resizeSwapChain", "recreateSwapChain", "inputTextureWidth", "inputTextureHeight", "rotation", "flip", "onFrameAvailable", "nativeHandle", "J", "<init>", "()V", "Companion", "ShaderDesc", "MMPostProcessing_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MMPostProcessing {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mm.mmpostprocessing.MMPostProcessing.Companion INSTANCE = new com.tencent.mm.mmpostprocessing.MMPostProcessing.Companion(null);
    private static final java.lang.String TAG = "MMPostProcessing";
    private byte _hellAccFlag_;
    private long nativeHandle;

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0087 J/\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0087 J\u0019\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0087 J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0001H\u0087 J\u0011\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0087 J\u0019\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0087 J\u0019\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0087 J)\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0087 J\u0019\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0087 J)\u0010#\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0087 J1\u0010$\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0087 JI\u0010)\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\"H\u0087 J\u001f\u0010,\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010+\u001a\u00020\"H\u0087 R\u0014\u0010-\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$Companion;", "", "Landroid/content/Context;", "context", "", "Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$ShaderDesc;", "loadShaderDescs", "(Landroid/content/Context;)[Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$ShaderDesc;", "", "nativeHandle", "Ljz5/f0;", "release", "", "postProcessorType", "", "", "postProcessorParams", "createPostProcessor", "postProcessor", "releasePostProcessor", "key", "value", "updatePostProcessorParam", "createInputTexture", "inputTexture", "releaseInputTexture", "getInputTextureId", "Landroid/view/Surface;", "surface", "width", "height", "createSwapChain", "swapChain", "releaseSwapChain", "", "resizeSwapChain", "recreateSwapChain", "inputTextureWidth", "inputTextureHeight", "rotation", "flip", "onFrameAvailable", "shaderDescs", "enableDebug", "create", "TAG", "Ljava/lang/String;", "<init>", "()V", "MMPostProcessing_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final long create(com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[] shaderDescArr, boolean z17) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.create(shaderDescArr, z17);
        }

        public final long createInputTexture(long nativeHandle) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.createInputTexture(nativeHandle);
        }

        public final long createPostProcessor(long nativeHandle, int postProcessorType, java.util.Map<java.lang.String, java.lang.String> postProcessorParams) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.createPostProcessor(nativeHandle, postProcessorType, postProcessorParams);
        }

        public final long createSwapChain(long nativeHandle, android.view.Surface surface, int width, int height) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.createSwapChain(nativeHandle, surface, width, height);
        }

        public final int getInputTextureId(long nativeHandle, long inputTexture) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.getInputTextureId(nativeHandle, inputTexture);
        }

        public final com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[] loadShaderDescs(android.content.Context context) {
            kotlin.jvm.internal.o.g(context, "context");
            java.lang.String[] list = context.getAssets().list("MMPostProcessing/shaders");
            if (list == null) {
                return new com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[0];
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
            for (java.lang.String str : list) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.n(str, ".svc", false)) {
                    arrayList.add(str);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            for (java.lang.String str2 : arrayList) {
                java.io.InputStream open = context.getAssets().open("MMPostProcessing/shaders/" + str2);
                kotlin.jvm.internal.o.f(open, "open(...)");
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(open.available());
                allocateDirect.put(vz5.a.c(open));
                open.close();
                kotlin.jvm.internal.o.d(str2);
                arrayList2.add(new com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc(str2, allocateDirect));
            }
            return (com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[]) arrayList2.toArray(new com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[0]);
        }

        public final boolean onFrameAvailable(long nativeHandle, long postProcessor, long swapChain, long inputTexture, int inputTextureWidth, int inputTextureHeight, int rotation, boolean flip) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.onFrameAvailable(nativeHandle, postProcessor, swapChain, inputTexture, inputTextureWidth, inputTextureHeight, rotation, flip);
        }

        public final boolean recreateSwapChain(long nativeHandle, long swapChain, android.view.Surface surface, int width, int height) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.recreateSwapChain(nativeHandle, swapChain, surface, width, height);
        }

        public final void release(long j17) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing.release(j17);
        }

        public final void releaseInputTexture(long j17, long j18) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing.releaseInputTexture(j17, j18);
        }

        public final void releasePostProcessor(long j17, long j18) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing.releasePostProcessor(j17, j18);
        }

        public final void releaseSwapChain(long j17, long j18) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing.releaseSwapChain(j17, j18);
        }

        public final boolean resizeSwapChain(long nativeHandle, long swapChain, int width, int height) {
            return com.tencent.mm.mmpostprocessing.MMPostProcessing.resizeSwapChain(nativeHandle, swapChain, width, height);
        }

        public final void updatePostProcessorParam(long j17, long j18, java.lang.String str, java.lang.Object obj) {
            com.tencent.mm.mmpostprocessing.MMPostProcessing.updatePostProcessorParam(j17, j18, str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/mmpostprocessing/MMPostProcessing$ShaderDesc;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "shader", "Ljava/nio/ByteBuffer;", "(Ljava/lang/String;Ljava/nio/ByteBuffer;)V", "getName", "()Ljava/lang/String;", "getShader", "()Ljava/nio/ByteBuffer;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MMPostProcessing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class ShaderDesc {
        private final java.lang.String name;
        private final java.nio.ByteBuffer shader;

        public ShaderDesc(java.lang.String name, java.nio.ByteBuffer shader) {
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(shader, "shader");
            this.name = name;
            this.shader = shader;
        }

        public static /* synthetic */ com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc copy$default(com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc shaderDesc, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, java.lang.Object obj) {
            if ((i17 & 1) != 0) {
                str = shaderDesc.name;
            }
            if ((i17 & 2) != 0) {
                byteBuffer = shaderDesc.shader;
            }
            return shaderDesc.copy(str, byteBuffer);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final java.nio.ByteBuffer getShader() {
            return this.shader;
        }

        public final com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc copy(java.lang.String name, java.nio.ByteBuffer shader) {
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(shader, "shader");
            return new com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc(name, shader);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc)) {
                return false;
            }
            com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc shaderDesc = (com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc) other;
            return kotlin.jvm.internal.o.b(this.name, shaderDesc.name) && kotlin.jvm.internal.o.b(this.shader, shaderDesc.shader);
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.nio.ByteBuffer getShader() {
            return this.shader;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.shader.hashCode();
        }

        public java.lang.String toString() {
            return "ShaderDesc(name=" + this.name + ", shader=" + this.shader + ")";
        }
    }

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("MMPostProcessingJNI");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mmpostprocessing/MMPostProcessing", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/mmpostprocessing/MMPostProcessing", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static final native long create(com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[] shaderDescArr, boolean z17);

    public static final native long createInputTexture(long j17);

    public static final native long createPostProcessor(long j17, int i17, java.util.Map<java.lang.String, java.lang.String> map);

    public static final native long createSwapChain(long j17, android.view.Surface surface, int i17, int i18);

    public static final native int getInputTextureId(long j17, long j18);

    public static final native boolean onFrameAvailable(long j17, long j18, long j19, long j27, int i17, int i18, int i19, boolean z17);

    public static final native boolean recreateSwapChain(long j17, long j18, android.view.Surface surface, int i17, int i18);

    public static final native void release(long j17);

    public static final native void releaseInputTexture(long j17, long j18);

    public static final native void releasePostProcessor(long j17, long j18);

    public static final native void releaseSwapChain(long j17, long j18);

    public static final native boolean resizeSwapChain(long j17, long j18, int i17, int i18);

    public static final native void updatePostProcessorParam(long j17, long j18, java.lang.String str, java.lang.Object obj);

    public final long createInputTexture() {
        return INSTANCE.createInputTexture(this.nativeHandle);
    }

    public final long createPostProcessor(int postProcessorType, java.util.Map<java.lang.String, java.lang.String> postProcessorParams) {
        kotlin.jvm.internal.o.g(postProcessorParams, "postProcessorParams");
        return INSTANCE.createPostProcessor(this.nativeHandle, postProcessorType, postProcessorParams);
    }

    public final long createSwapChain(android.view.Surface surface, int width, int height) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return INSTANCE.createSwapChain(this.nativeHandle, surface, width, height);
    }

    public final int getInputTextureId(long inputTexture) {
        return INSTANCE.getInputTextureId(this.nativeHandle, inputTexture);
    }

    public final long getNativeHandle() {
        return this.nativeHandle;
    }

    public final boolean init(com.tencent.mm.mmpostprocessing.MMPostProcessing.ShaderDesc[] shaderDescs, boolean enableDebug) {
        kotlin.jvm.internal.o.g(shaderDescs, "shaderDescs");
        long create = INSTANCE.create(shaderDescs, enableDebug);
        this.nativeHandle = create;
        return create != 0;
    }

    public final boolean isInitialized() {
        return this.nativeHandle != 0;
    }

    public final boolean onFrameAvailable(long postProcessor, long swapChain, long inputTexture, int inputTextureWidth, int inputTextureHeight, int rotation, boolean flip) {
        return INSTANCE.onFrameAvailable(this.nativeHandle, postProcessor, swapChain, inputTexture, inputTextureWidth, inputTextureHeight, rotation, flip);
    }

    public final boolean recreateSwapChain(long swapChain, android.view.Surface surface, int width, int height) {
        kotlin.jvm.internal.o.g(surface, "surface");
        return INSTANCE.recreateSwapChain(this.nativeHandle, swapChain, surface, width, height);
    }

    public final void release() {
        long j17 = this.nativeHandle;
        if (j17 != 0) {
            INSTANCE.release(j17);
            this.nativeHandle = 0L;
        }
    }

    public final void releaseInputTexture(long j17) {
        INSTANCE.releaseInputTexture(this.nativeHandle, j17);
    }

    public final void releasePostProcessor(long j17) {
        INSTANCE.releasePostProcessor(this.nativeHandle, j17);
    }

    public final void releaseSwapChain(long j17) {
        INSTANCE.releaseSwapChain(this.nativeHandle, j17);
    }

    public final boolean resizeSwapChain(long swapChain, int width, int height) {
        return INSTANCE.resizeSwapChain(this.nativeHandle, swapChain, width, height);
    }

    public final void updatePostProcessorParam(long j17, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        INSTANCE.updatePostProcessorParam(this.nativeHandle, j17, key, value);
    }
}
