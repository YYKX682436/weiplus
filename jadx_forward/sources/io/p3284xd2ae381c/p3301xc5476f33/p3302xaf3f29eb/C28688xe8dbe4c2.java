package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.MethodChannel */
/* loaded from: classes15.dex */
public class C28688xe8dbe4c2 {
    private static final java.lang.String TAG = "MethodChannel#";

    /* renamed from: codec */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 f71611x5a71016;

    /* renamed from: messenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71612xaa66bb13;

    /* renamed from: name */
    private final java.lang.String f71613x337a8b;

    /* renamed from: taskQueue */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue f71614xa039e8c;

    /* renamed from: io.flutter.plugin.common.MethodChannel$IncomingMethodCallHandler */
    /* loaded from: classes15.dex */
    public final class IncomingMethodCallHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler {

        /* renamed from: handler */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71615x294b574a;

        public IncomingMethodCallHandler(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler) {
            this.f71615x294b574a = methodCallHandler;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler
        /* renamed from: onMessage */
        public void mo137869x88910128(java.nio.ByteBuffer byteBuffer, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            try {
                this.f71615x294b574a.mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71611x5a71016.mo138425x5f71c36d(byteBuffer), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result() { // from class: io.flutter.plugin.common.MethodChannel.IncomingMethodCallHandler.1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                    /* renamed from: error */
                    public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                        binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71611x5a71016.mo138426x515fc382(str, str2, obj));
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                    /* renamed from: notImplemented */
                    public void mo65719xbc9fa82f() {
                        binaryReply.mo137328x67612ea(null);
                    }

                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                    /* renamed from: success */
                    public void mo65720x90b54003(java.lang.Object obj) {
                        binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71611x5a71016.mo138429xf780cbfd(obj));
                    }
                });
            } catch (java.lang.RuntimeException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71613x337a8b, "Failed to handle method call", e17);
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71611x5a71016.mo138427x435a9545("error", e17.getMessage(), null, io.p3284xd2ae381c.Log.m136959x2d915d84(e17)));
            }
        }
    }

    /* renamed from: io.flutter.plugin.common.MethodChannel$IncomingResultHandler */
    /* loaded from: classes13.dex */
    public final class IncomingResultHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply {

        /* renamed from: callback */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f71619xf5bc2045;

        public IncomingResultHandler(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            this.f71619xf5bc2045 = result;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply
        /* renamed from: reply */
        public void mo137328x67612ea(java.nio.ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f71619xf5bc2045.mo65719xbc9fa82f();
                } else {
                    try {
                        this.f71619xf5bc2045.mo65720x90b54003(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71611x5a71016.mo138424x529d37de(byteBuffer));
                    } catch (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28682xb75f5bb3 e17) {
                        this.f71619xf5bc2045.mo65718x5c4d208(e17.f71605x2eaded, e17.getMessage(), e17.f71606x5cd8f242);
                    }
                }
            } catch (java.lang.RuntimeException e18) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.this.f71613x337a8b, "Failed to handle method call result", e18);
            }
        }
    }

    /* renamed from: io.flutter.plugin.common.MethodChannel$MethodCallHandler */
    /* loaded from: classes13.dex */
    public interface MethodCallHandler {
        /* renamed from: onMethodCall */
        void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result);
    }

    /* renamed from: io.flutter.plugin.common.MethodChannel$Result */
    /* loaded from: classes8.dex */
    public interface Result {
        /* renamed from: error */
        void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj);

        /* renamed from: notImplemented */
        void mo65719xbc9fa82f();

        /* renamed from: success */
        void mo65720x90b54003(java.lang.Object obj);
    }

    public C28688xe8dbe4c2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str) {
        this(interfaceC28679x1b8c77f2, str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
    }

    /* renamed from: invokeMethod */
    public void m138438xd8c5c779(java.lang.String str, java.lang.Object obj) {
        m138439xd8c5c779(str, obj, null);
    }

    /* renamed from: resizeChannelBuffer */
    public void m138440x3bedc6cf(int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.m138399x3bedc6cf(this.f71612xaa66bb13, this.f71613x337a8b, i17);
    }

    /* renamed from: setMethodCallHandler */
    public void m138441xdf757329(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler) {
        if (this.f71614xa039e8c != null) {
            this.f71612xaa66bb13.mo137867x12ef5e45(this.f71613x337a8b, methodCallHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.IncomingMethodCallHandler(methodCallHandler) : null, this.f71614xa039e8c);
        } else {
            this.f71612xaa66bb13.mo126983x12ef5e45(this.f71613x337a8b, methodCallHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.IncomingMethodCallHandler(methodCallHandler) : null);
        }
    }

    /* renamed from: setWarnsOnChannelOverflow */
    public void m138442x8e24561b(boolean z17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.m138400x8e24561b(this.f71612xaa66bb13, this.f71613x337a8b, z17);
    }

    public C28688xe8dbe4c2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 interfaceC28689x2a9c5b95) {
        this(interfaceC28679x1b8c77f2, str, interfaceC28689x2a9c5b95, null);
    }

    /* renamed from: invokeMethod */
    public void m138439xd8c5c779(java.lang.String str, java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        this.f71612xaa66bb13.mo126982x35cf88(this.f71613x337a8b, this.f71611x5a71016.mo138428x69ba5d95(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff(str, obj)), result == null ? null : new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.IncomingResultHandler(result));
    }

    public C28688xe8dbe4c2(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 interfaceC28689x2a9c5b95, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        this.f71612xaa66bb13 = interfaceC28679x1b8c77f2;
        this.f71613x337a8b = str;
        this.f71611x5a71016 = interfaceC28689x2a9c5b95;
        this.f71614xa039e8c = taskQueue;
    }
}
