package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.BinaryMessenger */
/* loaded from: classes15.dex */
public interface InterfaceC28679x1b8c77f2 {

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler */
    /* loaded from: classes15.dex */
    public interface BinaryMessageHandler {
        /* renamed from: onMessage */
        void mo137869x88910128(java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply);
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$BinaryReply */
    /* loaded from: classes15.dex */
    public interface BinaryReply {
        /* renamed from: reply */
        void mo137328x67612ea(java.nio.ByteBuffer byteBuffer);
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$TaskQueue */
    /* loaded from: classes11.dex */
    public interface TaskQueue {
    }

    /* renamed from: io.flutter.plugin.common.BinaryMessenger$TaskQueueOptions */
    /* loaded from: classes15.dex */
    public static class TaskQueueOptions {

        /* renamed from: isSerial */
        private boolean f71594xf22eefbe = true;

        /* renamed from: getIsSerial */
        public boolean m138410x6e092d34() {
            return this.f71594xf22eefbe;
        }

        /* renamed from: setIsSerial */
        public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions m138411x68c18e40(boolean z17) {
            this.f71594xf22eefbe = z17;
            return this;
        }
    }

    /* renamed from: disableBufferingIncomingMessages */
    default void mo137850x34f5054c() {
        throw new java.lang.UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    /* renamed from: enableBufferingIncomingMessages */
    default void mo137851xab199711() {
        throw new java.lang.UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    /* renamed from: makeBackgroundTaskQueue */
    default io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue m138409xc4e54c30() {
        return mo137861xc4e54c30(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions());
    }

    /* renamed from: send */
    void mo126981x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer);

    /* renamed from: send */
    void mo126982x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply);

    /* renamed from: setMessageHandler */
    void mo126983x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler);

    /* renamed from: setMessageHandler */
    default void mo137867x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        if (taskQueue == null) {
            mo126983x12ef5e45(str, binaryMessageHandler);
            return;
        }
        throw new java.lang.UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
    }

    /* renamed from: makeBackgroundTaskQueue */
    default io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue mo137861xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions) {
        throw new java.lang.UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }
}
