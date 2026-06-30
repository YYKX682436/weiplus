package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.embedding.engine.dart.DartMessenger */
/* loaded from: classes15.dex */
public class C28605x66151a34 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd {
    private static final java.lang.String TAG = "DartMessenger";

    /* renamed from: bufferedMessages */
    private java.util.Map<java.lang.String, java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo>> f71025xfca3a74b;

    /* renamed from: createdTaskQueues */
    private java.util.WeakHashMap<io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue> f71026xa04d0c6f;

    /* renamed from: enableBufferingIncomingMessages */
    private final java.util.concurrent.atomic.AtomicBoolean f71027xab199711;

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71028x2014a1e9;

    /* renamed from: handlersLock */
    private final java.lang.Object f71029xe7f26f34;

    /* renamed from: messageHandlers */
    private final java.util.Map<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo> f71030x2fc3ff90;

    /* renamed from: nextReplyId */
    private int f71031x91d06f32;

    /* renamed from: pendingReplies */
    private final java.util.Map<java.lang.Integer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply> f71032xb9fa3771;

    /* renamed from: platformTaskQueue */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue f71033x94b2759;

    /* renamed from: sharedBinaryMessenger */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd f71034x4486d4ed;

    /* renamed from: taskQueueFactory */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueFactory f71035x2796f4de;

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$BufferedMessageInfo */
    /* loaded from: classes15.dex */
    public static class BufferedMessageInfo {

        /* renamed from: message */
        public final java.nio.ByteBuffer f71036x38eb0007;

        /* renamed from: messageData */
        long f71037xcbee0851;

        /* renamed from: replyId */
        int f71038x413d09a5;

        public BufferedMessageInfo(java.nio.ByteBuffer byteBuffer, int i17, long j17) {
            this.f71036x38eb0007 = byteBuffer;
            this.f71038x413d09a5 = i17;
            this.f71037xcbee0851 = j17;
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$ConcurrentTaskQueue */
    /* loaded from: classes15.dex */
    public static class ConcurrentTaskQueue implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue {

        /* renamed from: executor */
        private final java.util.concurrent.ExecutorService f71039x79c5f8d3;

        public ConcurrentTaskQueue(java.util.concurrent.ExecutorService executorService) {
            this.f71039x79c5f8d3 = executorService;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue
        /* renamed from: dispatch */
        public void mo137884x10f9447a(java.lang.Runnable runnable) {
            this.f71039x79c5f8d3.execute(runnable);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$DartMessengerTaskQueue */
    /* loaded from: classes15.dex */
    public interface DartMessengerTaskQueue {
        /* renamed from: dispatch */
        void mo137884x10f9447a(java.lang.Runnable runnable);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$DefaultTaskQueueFactory */
    /* loaded from: classes15.dex */
    public static class DefaultTaskQueueFactory implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueFactory {

        /* renamed from: executorService */
        java.util.concurrent.ExecutorService f71040x8a276262 = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136950x8a276262();

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueFactory
        /* renamed from: makeBackgroundTaskQueue */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue mo137885xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions) {
            return taskQueueOptions.m138410x6e092d34() ? new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.SerialTaskQueue(this.f71040x8a276262) : new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.ConcurrentTaskQueue(this.f71040x8a276262);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$HandlerInfo */
    /* loaded from: classes15.dex */
    public static class HandlerInfo {

        /* renamed from: handler */
        public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler f71041x294b574a;

        /* renamed from: taskQueue */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue f71042xa039e8c;

        public HandlerInfo(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue dartMessengerTaskQueue) {
            this.f71041x294b574a = binaryMessageHandler;
            this.f71042xa039e8c = dartMessengerTaskQueue;
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$Reply */
    /* loaded from: classes15.dex */
    public static class Reply implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply {

        /* renamed from: done */
        private final java.util.concurrent.atomic.AtomicBoolean f71043x2f2382 = new java.util.concurrent.atomic.AtomicBoolean(false);

        /* renamed from: flutterJNI */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71044x2014a1e9;

        /* renamed from: replyId */
        private final int f71045x413d09a5;

        public Reply(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, int i17) {
            this.f71044x2014a1e9 = c28586x96e67e09;
            this.f71045x413d09a5 = i17;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply
        /* renamed from: reply */
        public void mo137328x67612ea(java.nio.ByteBuffer byteBuffer) {
            if (this.f71043x2f2382.getAndSet(true)) {
                throw new java.lang.IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f71044x2014a1e9.m137684x39053ff7(this.f71045x413d09a5);
            } else {
                this.f71044x2014a1e9.m137685xa0a5e042(this.f71045x413d09a5, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue */
    /* loaded from: classes15.dex */
    public static class SerialTaskQueue implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue {

        /* renamed from: executor */
        private final java.util.concurrent.ExecutorService f71046x79c5f8d3;

        /* renamed from: queue */
        private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> f71048x66f1911 = new java.util.concurrent.ConcurrentLinkedQueue<>();

        /* renamed from: isRunning */
        private final java.util.concurrent.atomic.AtomicBoolean f71047x39e05d35 = new java.util.concurrent.atomic.AtomicBoolean(false);

        public SerialTaskQueue(java.util.concurrent.ExecutorService executorService) {
            this.f71046x79c5f8d3 = executorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: flush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public void m137888xf85c7ab4() {
            if (this.f71047x39e05d35.compareAndSet(false, true)) {
                try {
                    java.lang.Runnable poll = this.f71048x66f1911.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f71047x39e05d35.set(false);
                    if (!this.f71048x66f1911.isEmpty()) {
                        this.f71046x79c5f8d3.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.SerialTaskQueue.this.m137888xf85c7ab4();
                            }
                        });
                    }
                }
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue
        /* renamed from: dispatch */
        public void mo137884x10f9447a(java.lang.Runnable runnable) {
            this.f71048x66f1911.add(runnable);
            this.f71046x79c5f8d3.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$SerialTaskQueue$$b
                @Override // java.lang.Runnable
                public final void run() {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.SerialTaskQueue.this.m137887xf6a38f83();
                }
            });
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$TaskQueueFactory */
    /* loaded from: classes15.dex */
    public interface TaskQueueFactory {
        /* renamed from: makeBackgroundTaskQueue */
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue mo137885xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartMessenger$TaskQueueToken */
    /* loaded from: classes15.dex */
    public static class TaskQueueToken implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue {
        private TaskQueueToken() {
        }
    }

    public C28605x66151a34(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueFactory taskQueueFactory) {
        this.f71030x2fc3ff90 = new java.util.HashMap();
        this.f71025xfca3a74b = new java.util.HashMap();
        this.f71029xe7f26f34 = new java.lang.Object();
        this.f71027xab199711 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f71032xb9fa3771 = new java.util.HashMap();
        this.f71031x91d06f32 = 1;
        this.f71033x94b2759 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28610xf40f6739();
        this.f71026xa04d0c6f = new java.util.WeakHashMap<>();
        this.f71028x2014a1e9 = c28586x96e67e09;
        this.f71035x2796f4de = taskQueueFactory;
    }

    /* renamed from: dispatchMessageToQueue */
    private void m137876x35c87469(final java.lang.String str, final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo handlerInfo, final java.nio.ByteBuffer byteBuffer, final int i17, final long j17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue dartMessengerTaskQueue = handlerInfo != null ? handlerInfo.f71042xa039e8c : null;
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139420x2ed1a812("PlatformChannel ScheduleHandler on " + str, i17);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.dart.DartMessenger$$a
            @Override // java.lang.Runnable
            public final void run() {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.this.m137879x6df580f2(str, i17, handlerInfo, byteBuffer, j17);
            }
        };
        if (dartMessengerTaskQueue == null) {
            dartMessengerTaskQueue = this.f71033x94b2759;
        }
        dartMessengerTaskQueue.mo137884x10f9447a(runnable);
    }

    /* renamed from: handleError */
    private static void m137877x57960cc0(java.lang.Error error) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    /* renamed from: invokeHandler */
    private void m137878x304a33b2(java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo handlerInfo, java.nio.ByteBuffer byteBuffer, int i17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd interfaceC28601xb16824cd;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler mo137827x4af8f639;
        if (handlerInfo == null && (interfaceC28601xb16824cd = this.f71034x4486d4ed) != null && (mo137827x4af8f639 = interfaceC28601xb16824cd.mo137827x4af8f639(str)) != null) {
            mo137827x4af8f639.mo137869x88910128(byteBuffer, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.Reply(this.f71028x2014a1e9, i17));
            return;
        }
        if (handlerInfo == null) {
            io.p3284xd2ae381c.Log.v(TAG, "No registered handler for message. Responding to Dart with empty reply message.");
            this.f71028x2014a1e9.m137684x39053ff7(i17);
            return;
        }
        try {
            io.p3284xd2ae381c.Log.v(TAG, "Deferring to registered handler to process message.");
            handlerInfo.f71041x294b574a.mo137869x88910128(byteBuffer, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.Reply(this.f71028x2014a1e9, i17));
        } catch (java.lang.Error e17) {
            m137877x57960cc0(e17);
        } catch (java.lang.Exception e18) {
            io.p3284xd2ae381c.Log.e(TAG, "Uncaught exception in binary message listener", e18);
            this.f71028x2014a1e9.m137684x39053ff7(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$dispatchMessageToQueue$0 */
    public /* synthetic */ void m137879x6df580f2(java.lang.String str, int i17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo handlerInfo, java.nio.ByteBuffer byteBuffer, long j17) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139422xb3bdfd44("PlatformChannel ScheduleHandler on " + str, i17);
        try {
            io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("DartMessenger#handleMessageFromDart on " + str);
            try {
                m137878x304a33b2(str, handlerInfo, byteBuffer, i17);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (m139423xc9e48c90 != null) {
                    m139423xc9e48c90.close();
                }
            } finally {
            }
        } finally {
            this.f71028x2014a1e9.m137654xb3028b0d(j17);
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: disableBufferingIncomingMessages */
    public void mo137850x34f5054c() {
        java.util.Map<java.lang.String, java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo>> map;
        synchronized (this.f71029xe7f26f34) {
            this.f71027xab199711.set(false);
            map = this.f71025xfca3a74b;
            this.f71025xfca3a74b = new java.util.HashMap();
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo>> entry : map.entrySet()) {
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo bufferedMessageInfo : entry.getValue()) {
                m137876x35c87469(entry.getKey(), null, bufferedMessageInfo.f71036x38eb0007, bufferedMessageInfo.f71038x413d09a5, bufferedMessageInfo.f71037xcbee0851);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: enableBufferingIncomingMessages */
    public void mo137851xab199711() {
        this.f71027xab199711.set(true);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd
    /* renamed from: getMessageHandler */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler mo137827x4af8f639(java.lang.String str) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo handlerInfo = this.f71030x2fc3ff90.get(str);
        if (handlerInfo != null) {
            return handlerInfo.f71041x294b574a;
        }
        return null;
    }

    /* renamed from: getPendingChannelResponseCount */
    public int m137880x6c287c0c() {
        return this.f71032xb9fa3771.size();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6
    /* renamed from: handleMessageFromDart */
    public void mo137881xbade3828(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, long j17) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo handlerInfo;
        boolean z17;
        io.p3284xd2ae381c.Log.v(TAG, "Received message from Dart over channel '" + str + "'");
        synchronized (this.f71029xe7f26f34) {
            handlerInfo = this.f71030x2fc3ff90.get(str);
            z17 = this.f71027xab199711.get() && handlerInfo == null;
            if (z17) {
                if (!this.f71025xfca3a74b.containsKey(str)) {
                    this.f71025xfca3a74b.put(str, new java.util.LinkedList());
                }
                this.f71025xfca3a74b.get(str).add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo(byteBuffer, i17, j17));
            }
        }
        if (z17) {
            return;
        }
        m137876x35c87469(str, handlerInfo, byteBuffer, i17, j17);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.InterfaceC28609x71a8c4b6
    /* renamed from: handlePlatformMessageResponse */
    public void mo137882x4167792d(int i17, java.nio.ByteBuffer byteBuffer) {
        io.p3284xd2ae381c.Log.v(TAG, "Received message reply from Dart.");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply remove = this.f71032xb9fa3771.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            try {
                io.p3284xd2ae381c.Log.v(TAG, "Invoking registered callback for reply from Dart.");
                remove.mo137328x67612ea(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (java.lang.Error e17) {
                m137877x57960cc0(e17);
            } catch (java.lang.Exception e18) {
                io.p3284xd2ae381c.Log.e(TAG, "Uncaught exception in binary message reply handler", e18);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: makeBackgroundTaskQueue */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue mo137861xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue mo137885xc4e54c30 = this.f71035x2796f4de.mo137885xc4e54c30(taskQueueOptions);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueToken taskQueueToken = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.TaskQueueToken();
        this.f71026xa04d0c6f.put(taskQueueToken, mo137885xc4e54c30);
        return taskQueueToken;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: send */
    public void mo126981x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message over channel '" + str + "'");
        mo126982x35cf88(str, byteBuffer, null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: setMessageHandler */
    public void mo126983x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler) {
        mo137867x12ef5e45(str, binaryMessageHandler, null);
    }

    /* renamed from: setSharedBinaryMessenger */
    public void m137883x204559ab(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd interfaceC28601xb16824cd) {
        if (interfaceC28601xb16824cd == this) {
            return;
        }
        this.f71034x4486d4ed = interfaceC28601xb16824cd;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: setMessageHandler */
    public void mo137867x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DartMessengerTaskQueue dartMessengerTaskQueue;
        if (binaryMessageHandler == null) {
            io.p3284xd2ae381c.Log.v(TAG, "Removing handler for channel '" + str + "'");
            synchronized (this.f71029xe7f26f34) {
                this.f71030x2fc3ff90.remove(str);
            }
            return;
        }
        if (taskQueue != null) {
            dartMessengerTaskQueue = this.f71026xa04d0c6f.get(taskQueue);
            if (dartMessengerTaskQueue == null) {
                throw new java.lang.IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dartMessengerTaskQueue = null;
        }
        io.p3284xd2ae381c.Log.v(TAG, "Setting handler for channel '" + str + "'");
        synchronized (this.f71029xe7f26f34) {
            this.f71030x2fc3ff90.put(str, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.HandlerInfo(binaryMessageHandler, dartMessengerTaskQueue));
            java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo> remove = this.f71025xfca3a74b.remove(str);
            if (remove == null) {
                return;
            }
            for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.BufferedMessageInfo bufferedMessageInfo : remove) {
                m137876x35c87469(str, this.f71030x2fc3ff90.get(str), bufferedMessageInfo.f71036x38eb0007, bufferedMessageInfo.f71038x413d09a5, bufferedMessageInfo.f71037xcbee0851);
            }
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: send */
    public void mo126982x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("DartMessenger#send on " + str);
        try {
            io.p3284xd2ae381c.Log.v(TAG, "Sending message with callback over channel '" + str + "'");
            int i17 = this.f71031x91d06f32;
            this.f71031x91d06f32 = i17 + 1;
            if (binaryReply != null) {
                this.f71032xb9fa3771.put(java.lang.Integer.valueOf(i17), binaryReply);
            }
            if (byteBuffer == null) {
                this.f71028x2014a1e9.m137667xfe371ea1(str, i17);
            } else {
                this.f71028x2014a1e9.m137668x5315083a(str, byteBuffer, byteBuffer.position(), i17);
            }
            if (m139423xc9e48c90 != null) {
                m139423xc9e48c90.close();
            }
        } catch (java.lang.Throwable th6) {
            if (m139423xc9e48c90 != null) {
                try {
                    m139423xc9e48c90.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    public C28605x66151a34(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this(c28586x96e67e09, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34.DefaultTaskQueueFactory());
    }
}
