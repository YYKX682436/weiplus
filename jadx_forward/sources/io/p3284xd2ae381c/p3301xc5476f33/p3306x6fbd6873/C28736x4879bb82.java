package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController;", "Lio/flutter/plugin/platform/CustomPlatformViewsController;", "Landroid/content/Context;", "context", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "Lio/flutter/embedding/engine/dart/DartExecutor;", "dartExecutor", "Ljz5/f0;", "attach", "onDetachedFromJNI", "", "viewId", "Landroid/view/View;", "getPlatformViewById", "engineId", "I", "getEngineId", "()I", "Landroid/util/SparseArray;", "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;", "textureEntryList", "Landroid/util/SparseArray;", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "skylineChannelHandler", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "<init>", "(I)V", "Companion", "SkylineEmptyView", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.flutter.plugin.platform.SkylinePlatformViewsController */
/* loaded from: classes15.dex */
public class C28736x4879bb82 extends io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6 {
    private static final java.lang.String TAG = "SkylinePlatformViewsController";
    private final int engineId;
    private android.util.SparseArray<io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry> textureEntryList = new android.util.SparseArray<>();
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler skylineChannelHandler = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.SkylinePlatformViewsController$skylineChannelHandler$1
        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: clearFocus */
        public void mo138267xd2ef968b(int i17) {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                return;
            }
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138267xd2ef968b(i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: createForPlatformViewLayer */
        public void mo138268xa2344fcc(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest request) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138268xa2344fcc(request);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: createForTextureLayer */
        public long mo138269x96d983c3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest request) {
            android.util.SparseArray sparseArray;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            java.lang.String viewType = request.f71395x4747637f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewType, "viewType");
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138827x4aadd9ea(viewType)) {
                return ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138269x96d983c3(request);
            }
            int i17 = request.f71394xcf532ea0;
            java.nio.ByteBuffer byteBuffer = request.f71393xc4aaf986;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = null;
            java.util.Map map = (java.util.Map) (byteBuffer != null ? io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28691x13977fcc.f71627x4fbc8495.mo138407x37439e39(byteBuffer) : null);
            java.lang.String str = (java.lang.String) (map != null ? map.get("type") : null);
            if (str == null) {
                str = "empty";
            }
            java.lang.String str2 = str;
            int m138653xf10575bf = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.m138653xf10575bf(request.f71392xdc50bf3d);
            int m138653xf10575bf2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.m138653xf10575bf(request.f71389x93f82e90);
            android.graphics.SurfaceTexture m138828x6473dce0 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138828x6473dce0(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), str2, i17);
            if (m138828x6473dce0 != null) {
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658 = ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71767x4cc71e78;
                if (interfaceC28980x1159d658 != null) {
                    surfaceTextureEntry = interfaceC28980x1159d658.mo138035x37857531(m138828x6473dce0);
                }
            } else {
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d6582 = ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71767x4cc71e78;
                if (interfaceC28980x1159d6582 != null) {
                    surfaceTextureEntry = interfaceC28980x1159d6582.mo138022xdee757ca();
                }
            }
            if (surfaceTextureEntry == null) {
                return -1L;
            }
            sparseArray = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.textureEntryList;
            sparseArray.put(i17, surfaceTextureEntry);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138821x18402dc7(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17, str2);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138831x1ae798c7(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), str2, i17, surfaceTextureEntry.mo138117x299653ae(), m138653xf10575bf, m138653xf10575bf2);
            return surfaceTextureEntry.id();
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: dispose */
        public void mo138270x63a5261f(int i17) {
            android.util.SparseArray sparseArray;
            android.util.SparseArray sparseArray2;
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138270x63a5261f(i17);
                return;
            }
            java.lang.String m138824x8b5ba916 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138824x8b5ba916(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138834xb40ea46a(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138830x1bd2261e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), m138824x8b5ba916, i17);
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138829xaa156780(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), m138824x8b5ba916, i17)) {
                return;
            }
            sparseArray = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.textureEntryList;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) sparseArray.get(i17);
            if (surfaceTextureEntry != null) {
                surfaceTextureEntry.mo138094x41012807();
            }
            sparseArray2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.textureEntryList;
            sparseArray2.remove(i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: offset */
        public void mo138271xc3376493(int i17, double d17, double d18) {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                return;
            }
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138271xc3376493(i17, d17, d18);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: onTouch */
        public void mo138272xb05cb4a0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewTouch touch) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touch, "touch");
            int i17 = touch.f71416xcf532ea0;
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138272xb05cb4a0(touch);
                return;
            }
            android.view.MotionEvent mo138652x97f17309 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.mo138652x97f17309(((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71752x38b735af.getResources().getDisplayMetrics().density, touch, false);
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138832x1b089e63(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138824x8b5ba916(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17), i17, mo138652x97f17309);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: resize */
        public void mo138273xc84d9cb4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewResizeRequest request, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized onComplete) {
            android.util.SparseArray sparseArray;
            android.graphics.SurfaceTexture mo138117x299653ae;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
            int i17 = request.f71402xcf532ea0;
            if (!io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138273xc84d9cb4(request, onComplete);
                return;
            }
            java.lang.String m138824x8b5ba916 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138824x8b5ba916(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17);
            int m138653xf10575bf = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.m138653xf10575bf(request.f71401x7dcc4cfd);
            int m138653xf10575bf2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.m138653xf10575bf(request.f71400x21ee58d0);
            sparseArray = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.textureEntryList;
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = (io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry) sparseArray.get(i17);
            if (surfaceTextureEntry != null && (mo138117x299653ae = surfaceTextureEntry.mo138117x299653ae()) != null) {
                mo138117x299653ae.setDefaultBufferSize(m138653xf10575bf, m138653xf10575bf2);
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138833x47c65e25(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), m138824x8b5ba916, i17, m138653xf10575bf, m138653xf10575bf2);
            onComplete.run(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize((int) request.f71401x7dcc4cfd, (int) request.f71400x21ee58d0));
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: setDirection */
        public void mo138274x2261393d(int i17, int i18) {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this.getEngineId(), i17)) {
                return;
            }
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138274x2261393d(i17, i18);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler
        /* renamed from: synchronizeToNativeViewHierarchy */
        public void mo138275xed95344e(boolean z17) {
            ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.this).f71751xf8a558c7.mo138275xed95344e(z17);
        }
    };

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController$SkylineEmptyView;", "Landroid/view/View;", "", "mode", "Ljz5/f0;", "setImportantForAccessibility", "viewId", "I", "getViewId", "()I", "Landroid/content/Context;", "context", "<init>", "(Lio/flutter/plugin/platform/SkylinePlatformViewsController;ILandroid/content/Context;)V", "skyline_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: io.flutter.plugin.platform.SkylinePlatformViewsController$SkylineEmptyView */
    /* loaded from: classes15.dex */
    public final class SkylineEmptyView extends android.view.View {
        private final int viewId;

        public SkylineEmptyView(int i17, android.content.Context context) {
            super(context);
            this.viewId = i17;
        }

        public final int getViewId() {
            return this.viewId;
        }

        @Override // android.view.View
        public void setImportantForAccessibility(int i17) {
        }
    }

    public C28736x4879bb82(int i17) {
        this.engineId = i17;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97
    /* renamed from: attach */
    public void mo138622xac1eee45(android.content.Context context, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 textureRegistry, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 dartExecutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRegistry, "textureRegistry");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dartExecutor, "dartExecutor");
        super.mo138622xac1eee45(context, textureRegistry, dartExecutor);
        ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) this).f71763x496caac8.m138251x6ecb7091(this.skylineChannelHandler);
    }

    public final int getEngineId() {
        return this.engineId;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: getPlatformViewById */
    public android.view.View mo138639xbd854120(int viewId) {
        return !io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138826x33979e90(this.engineId, viewId) ? super.mo138639xbd854120(viewId) : new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28736x4879bb82.SkylineEmptyView(viewId, ((io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6) this).f71752x38b735af);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28706xe28910e6, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97
    /* renamed from: onDetachedFromJNI */
    public void mo138644x3d3e7ea() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28739xd227fc18.m138822x5cd39ffa(this.engineId);
        int size = this.textureEntryList.size();
        for (int i17 = 0; i17 < size; i17++) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry surfaceTextureEntry = this.textureEntryList.get(this.textureEntryList.keyAt(i17));
            if (surfaceTextureEntry != null) {
                surfaceTextureEntry.mo138094x41012807();
            }
        }
        this.textureEntryList.clear();
        super.mo138644x3d3e7ea();
    }
}
