package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.BasicMessageChannel */
/* loaded from: classes15.dex */
public final class C28677x2598ceaa<T> {

    /* renamed from: CHANNEL_BUFFERS_CHANNEL */
    public static final java.lang.String f71580x25e5a55b = "dev.flutter/channel-buffers";
    private static final java.lang.String TAG = "BasicMessageChannel#";

    /* renamed from: codec */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<T> f71581x5a71016;

    /* renamed from: messenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71582xaa66bb13;

    /* renamed from: name */
    private final java.lang.String f71583x337a8b;

    /* renamed from: taskQueue */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue f71584xa039e8c;

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$IncomingMessageHandler */
    /* loaded from: classes15.dex */
    public final class IncomingMessageHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler {

        /* renamed from: handler */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<T> f71585x294b574a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler
        /* renamed from: onMessage */
        public void mo137869x88910128(java.nio.ByteBuffer byteBuffer, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            try {
                this.f71585x294b574a.mo84686x88910128(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.this.f71581x5a71016.mo138407x37439e39(byteBuffer), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<T>() { // from class: io.flutter.plugin.common.BasicMessageChannel.IncomingMessageHandler.1
                    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply
                    /* renamed from: reply */
                    public void mo84787x67612ea(T t17) {
                        binaryReply.mo137328x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.this.f71581x5a71016.mo138408x6b057511(t17));
                    }
                });
            } catch (java.lang.Exception e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.this.f71583x337a8b, "Failed to handle message", e17);
                binaryReply.mo137328x67612ea(null);
            }
        }

        private IncomingMessageHandler(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<T> messageHandler) {
            this.f71585x294b574a = messageHandler;
        }
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$IncomingReplyHandler */
    /* loaded from: classes15.dex */
    public final class IncomingReplyHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply {

        /* renamed from: callback */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<T> f71589xf5bc2045;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply
        /* renamed from: reply */
        public void mo137328x67612ea(java.nio.ByteBuffer byteBuffer) {
            try {
                this.f71589xf5bc2045.mo84787x67612ea(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.this.f71581x5a71016.mo138407x37439e39(byteBuffer));
            } catch (java.lang.RuntimeException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.TAG + io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.this.f71583x337a8b, "Failed to handle message reply", e17);
            }
        }

        private IncomingReplyHandler(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<T> reply) {
            this.f71589xf5bc2045 = reply;
        }
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$MessageHandler */
    /* loaded from: classes11.dex */
    public interface MessageHandler<T> {
        /* renamed from: onMessage */
        void mo84686x88910128(T t17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<T> reply);
    }

    /* renamed from: io.flutter.plugin.common.BasicMessageChannel$Reply */
    /* loaded from: classes11.dex */
    public interface Reply<T> {
        /* renamed from: reply */
        void mo84787x67612ea(T t17);
    }

    public C28677x2598ceaa(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<T> interfaceC28686xbb96606f) {
        this(interfaceC28679x1b8c77f2, str, interfaceC28686xbb96606f, null);
    }

    /* renamed from: packetFromEncodedMessage */
    private static java.nio.ByteBuffer m138398xf91b100b(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.flip();
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(remaining);
        allocateDirect.put(bArr);
        return allocateDirect;
    }

    /* renamed from: resizeChannelBuffer */
    public void m138401x3bedc6cf(int i17) {
        m138399x3bedc6cf(this.f71582xaa66bb13, this.f71583x337a8b, i17);
    }

    /* renamed from: send */
    public void m138402x35cf88(T t17) {
        m138403x35cf88(t17, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.flutter.plugin.common.BinaryMessenger] */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.plugin.common.BasicMessageChannel$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* renamed from: setMessageHandler */
    public void m138404x12ef5e45(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.MessageHandler<T> messageHandler) {
        if (this.f71584xa039e8c != null) {
            this.f71582xaa66bb13.mo137867x12ef5e45(this.f71583x337a8b, messageHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.IncomingMessageHandler(messageHandler) : null, this.f71584xa039e8c);
        } else {
            this.f71582xaa66bb13.mo126983x12ef5e45(this.f71583x337a8b, messageHandler != null ? new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.IncomingMessageHandler(messageHandler) : 0);
        }
    }

    /* renamed from: setWarnsOnChannelOverflow */
    public void m138405x8e24561b(boolean z17) {
        m138400x8e24561b(this.f71582xaa66bb13, this.f71583x337a8b, z17);
    }

    public C28677x2598ceaa(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28686xbb96606f<T> interfaceC28686xbb96606f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        this.f71582xaa66bb13 = interfaceC28679x1b8c77f2;
        this.f71583x337a8b = str;
        this.f71581x5a71016 = interfaceC28686xbb96606f;
        this.f71584xa039e8c = taskQueue;
    }

    /* renamed from: resizeChannelBuffer */
    public static void m138399x3bedc6cf(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, int i17) {
        interfaceC28679x1b8c77f2.mo126981x35cf88(f71580x25e5a55b, m138398xf91b100b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495.mo138428x69ba5d95(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff("resize", java.util.Arrays.asList(str, java.lang.Integer.valueOf(i17))))));
    }

    /* renamed from: setWarnsOnChannelOverflow */
    public static void m138400x8e24561b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2, java.lang.String str, boolean z17) {
        interfaceC28679x1b8c77f2.mo126981x35cf88(f71580x25e5a55b, m138398xf91b100b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495.mo138428x69ba5d95(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff("overflow", java.util.Arrays.asList(str, java.lang.Boolean.valueOf(!z17))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: send */
    public void m138403x35cf88(T t17, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.Reply<T> reply) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f71582xaa66bb13;
        java.lang.String str = this.f71583x337a8b;
        java.nio.ByteBuffer mo138408x6b057511 = this.f71581x5a71016.mo138408x6b057511(t17);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply = null;
        java.lang.Object[] objArr = 0;
        if (reply != null) {
            binaryReply = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa.IncomingReplyHandler(reply);
        }
        interfaceC28679x1b8c77f2.mo126982x35cf88(str, mo138408x6b057511, binaryReply);
    }
}
