package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.EventChannel */
/* loaded from: classes15.dex */
public final class C28681x6bf9b529 {
    private static final java.lang.String TAG = "EventChannel#";

    /* renamed from: codec */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 f71596x5a71016;

    /* renamed from: messenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71597xaa66bb13;

    /* renamed from: name */
    private final java.lang.String f71598x337a8b;

    /* renamed from: taskQueue */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue f71599xa039e8c;

    /* renamed from: io.flutter.plugin.common.EventChannel$EventSink */
    /* loaded from: classes15.dex */
    public interface EventSink {
        /* renamed from: endOfStream */
        void mo138416x56f72e32();

        /* renamed from: error */
        void mo138417x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj);

        /* renamed from: success */
        void mo138418x90b54003(java.lang.Object obj);
    }

    /* renamed from: io.flutter.plugin.common.EventChannel$IncomingStreamRequestHandler */
    /* loaded from: classes15.dex */
    public final class IncomingStreamRequestHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler {

        /* renamed from: activeSink */
        private final java.util.concurrent.atomic.AtomicReference<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink> f71600x79d3deb9 = new java.util.concurrent.atomic.AtomicReference<>(null);

        /* renamed from: handler */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler f71601x294b574a;

        /* renamed from: io.flutter.plugin.common.EventChannel$IncomingStreamRequestHandler$EventSinkImplementation */
        /* loaded from: classes15.dex */
        public final class EventSinkImplementation implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink {

            /* renamed from: hasEnded */
            final java.util.concurrent.atomic.AtomicBoolean f71603x6f3d840;

            private EventSinkImplementation() {
                this.f71603x6f3d840 = new java.util.concurrent.atomic.AtomicBoolean(false);
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
            /* renamed from: endOfStream */
            public void mo138416x56f72e32() {
                if (this.f71603x6f3d840.getAndSet(true) || io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler.this.f71600x79d3deb9.get() != this) {
                    return;
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71597xaa66bb13.mo126981x35cf88(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, null);
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
            /* renamed from: error */
            public void mo138417x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                if (this.f71603x6f3d840.get() || io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler.this.f71600x79d3deb9.get() != this) {
                    return;
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71597xaa66bb13.mo126981x35cf88(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138426x515fc382(str, str2, obj));
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink
            /* renamed from: success */
            public void mo138418x90b54003(java.lang.Object obj) {
                if (this.f71603x6f3d840.get() || io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler.this.f71600x79d3deb9.get() != this) {
                    return;
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71597xaa66bb13.mo126981x35cf88(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138429xf780cbfd(obj));
            }
        }

        public IncomingStreamRequestHandler(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler streamHandler) {
            this.f71601x294b574a = streamHandler;
        }

        /* renamed from: onCancel */
        private void m138420x3d6f0539(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            if (this.f71600x79d3deb9.getAndSet(null) == null) {
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138426x515fc382("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.f71601x294b574a.mo14279x3d6f0539(obj);
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138429xf780cbfd(null));
            } catch (java.lang.RuntimeException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, "Failed to close event stream", e17);
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138426x515fc382("error", e17.getMessage(), null));
            }
        }

        /* renamed from: onListen */
        private void m138421x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler.EventSinkImplementation eventSinkImplementation = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler.EventSinkImplementation();
            if (this.f71600x79d3deb9.getAndSet(eventSinkImplementation) != null) {
                try {
                    this.f71601x294b574a.mo14279x3d6f0539(null);
                } catch (java.lang.RuntimeException e17) {
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, "Failed to close existing event stream", e17);
                }
            }
            try {
                this.f71601x294b574a.mo14280x4d3de486(obj, eventSinkImplementation);
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138429xf780cbfd(null));
            } catch (java.lang.RuntimeException e18) {
                this.f71600x79d3deb9.set(null);
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71598x337a8b, "Failed to open event stream", e18);
                binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138426x515fc382("error", e18.getMessage(), null));
            }
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler
        /* renamed from: onMessage */
        public void mo137869x88910128(java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff mo138425x5f71c36d = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.this.f71596x5a71016.mo138425x5f71c36d(byteBuffer);
            if (mo138425x5f71c36d.f71610xbfc5d0e1.equals("listen")) {
                m138421x4d3de486(mo138425x5f71c36d.f71609x86ac7956, binaryReply);
            } else if (mo138425x5f71c36d.f71610xbfc5d0e1.equals("cancel")) {
                m138420x3d6f0539(mo138425x5f71c36d.f71609x86ac7956, binaryReply);
            } else {
                binaryReply.mo137328x67612ea(null);
            }
        }
    }

    /* renamed from: io.flutter.plugin.common.EventChannel$StreamHandler */
    /* loaded from: classes11.dex */
    public interface StreamHandler {
        /* renamed from: onCancel */
        void mo14279x3d6f0539(java.lang.Object obj);

        /* renamed from: onListen */
        void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink);
    }

    public C28681x6bf9b529(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str) {
        this(interfaceC28679x1b8c77f2, str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
    }

    /* renamed from: setStreamHandler */
    public void m138415x95b45268(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler streamHandler) {
        if (this.f71599xa039e8c != null) {
            this.f71597xaa66bb13.mo137867x12ef5e45(this.f71598x337a8b, streamHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler(streamHandler) : null, this.f71599xa039e8c);
        } else {
            this.f71597xaa66bb13.mo126983x12ef5e45(this.f71598x337a8b, streamHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.IncomingStreamRequestHandler(streamHandler) : null);
        }
    }

    public C28681x6bf9b529(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 interfaceC28689x2a9c5b95) {
        this(interfaceC28679x1b8c77f2, str, interfaceC28689x2a9c5b95, null);
    }

    public C28681x6bf9b529(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28689x2a9c5b95 interfaceC28689x2a9c5b95, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        this.f71597xaa66bb13 = interfaceC28679x1b8c77f2;
        this.f71598x337a8b = str;
        this.f71596x5a71016 = interfaceC28689x2a9c5b95;
        this.f71599xa039e8c = taskQueue;
    }
}
