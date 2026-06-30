package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f;

/* renamed from: io.flutter.embedding.engine.dart.DartExecutor */
/* loaded from: classes15.dex */
public class C28604xeb2eb192 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 {
    private static final java.lang.String TAG = "DartExecutor";

    /* renamed from: assetManager */
    private final android.content.res.AssetManager f71008xb0138e9d;

    /* renamed from: binaryMessenger */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f71009x56f9c012;

    /* renamed from: dartMessenger */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34 f71010x3675ea54;

    /* renamed from: engineId */
    private final long f71011x6c827afd;

    /* renamed from: flutterJNI */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71012x2014a1e9;

    /* renamed from: isApplicationRunning */
    private boolean f71013x5170a119;

    /* renamed from: isolateChannelMessageHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler f71014xbf5d893b;

    /* renamed from: isolateServiceId */
    private java.lang.String f71015x9f9f4645;

    /* renamed from: isolateServiceIdListener */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.IsolateServiceIdListener f71016x91825a19;

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DartCallback */
    /* loaded from: classes15.dex */
    public static class DartCallback {

        /* renamed from: androidAssetManager */
        public final android.content.res.AssetManager f71018xd8b5eaac;

        /* renamed from: callbackHandle */
        public final io.p3284xd2ae381c.p3320x373aa5.C28978xebc52e0b f71019x429972cd;

        /* renamed from: pathToBundle */
        public final java.lang.String f71020x326ef622;

        public DartCallback(android.content.res.AssetManager assetManager, java.lang.String str, io.p3284xd2ae381c.p3320x373aa5.C28978xebc52e0b c28978xebc52e0b) {
            this.f71018xd8b5eaac = assetManager;
            this.f71020x326ef622 = str;
            this.f71019x429972cd = c28978xebc52e0b;
        }

        /* renamed from: toString */
        public java.lang.String m137870x9616526c() {
            return "DartCallback( bundle path: " + this.f71020x326ef622 + ", library path: " + this.f71019x429972cd.f72328xe36241fb + ", function: " + this.f71019x429972cd.f72329x7e9d6470 + " )";
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DefaultBinaryMessenger */
    /* loaded from: classes15.dex */
    public static class DefaultBinaryMessenger implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 {

        /* renamed from: messenger */
        private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34 f71024xaa66bb13;

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: disableBufferingIncomingMessages */
        public void mo137850x34f5054c() {
            this.f71024xaa66bb13.mo137850x34f5054c();
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: enableBufferingIncomingMessages */
        public void mo137851xab199711() {
            this.f71024xaa66bb13.mo137851xab199711();
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: makeBackgroundTaskQueue */
        public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue mo137861xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions) {
            return this.f71024xaa66bb13.mo137861xc4e54c30(taskQueueOptions);
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: send */
        public void mo126981x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
            this.f71024xaa66bb13.mo126982x35cf88(str, byteBuffer, null);
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: setMessageHandler */
        public void mo126983x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler) {
            this.f71024xaa66bb13.mo126983x12ef5e45(str, binaryMessageHandler);
        }

        private DefaultBinaryMessenger(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34 c28605x66151a34) {
            this.f71024xaa66bb13 = c28605x66151a34;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: send */
        public void mo126982x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
            this.f71024xaa66bb13.mo126982x35cf88(str, byteBuffer, binaryReply);
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
        /* renamed from: setMessageHandler */
        public void mo137867x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
            this.f71024xaa66bb13.mo137867x12ef5e45(str, binaryMessageHandler, taskQueue);
        }
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$IsolateServiceIdListener */
    /* loaded from: classes15.dex */
    public interface IsolateServiceIdListener {
        /* renamed from: onIsolateServiceIdAvailable */
        void m137875xdb2cfce5(java.lang.String str);
    }

    public C28604xeb2eb192(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, android.content.res.AssetManager assetManager) {
        this(c28586x96e67e09, assetManager, 0L);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: disableBufferingIncomingMessages */
    public void mo137850x34f5054c() {
        this.f71010x3675ea54.mo137850x34f5054c();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: enableBufferingIncomingMessages */
    public void mo137851xab199711() {
        this.f71010x3675ea54.mo137851xab199711();
    }

    /* renamed from: executeDartCallback */
    public void m137852x41a548f9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartCallback dartCallback) {
        if (this.f71013x5170a119) {
            io.p3284xd2ae381c.Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("DartExecutor#executeDartCallback");
        try {
            io.p3284xd2ae381c.Log.v(TAG, "Executing Dart callback: " + dartCallback);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09 = this.f71012x2014a1e9;
            java.lang.String str = dartCallback.f71020x326ef622;
            io.p3284xd2ae381c.p3320x373aa5.C28978xebc52e0b c28978xebc52e0b = dartCallback.f71019x429972cd;
            c28586x96e67e09.m137731x95362943(str, c28978xebc52e0b.f72329x7e9d6470, c28978xebc52e0b.f72328xe36241fb, dartCallback.f71018xd8b5eaac, null, this.f71011x6c827afd);
            this.f71013x5170a119 = true;
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

    /* renamed from: executeDartEntrypoint */
    public void m137853x820a9012(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint) {
        m137854x820a9012(dartEntrypoint, null);
    }

    /* renamed from: executeDartEntrypointForce */
    public void m137855x10d545f9(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.util.List<java.lang.String> list) {
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139419x59478a9("DartExecutor#executeDartEntrypointForce");
        io.p3284xd2ae381c.Log.v(TAG, "Executing Dart entrypoint force: " + dartEntrypoint);
        try {
            this.f71012x2014a1e9.m137731x95362943(dartEntrypoint.f71023x326ef622, dartEntrypoint.f71021xd7b69460, dartEntrypoint.f71022x5e3250be, this.f71008xb0138e9d, list, this.f71011x6c827afd);
            this.f71013x5170a119 = true;
        } finally {
            io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.end();
        }
    }

    /* renamed from: getBinaryMessenger */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137856x3b5b91dc() {
        return this.f71009x56f9c012;
    }

    /* renamed from: getIsolateServiceId */
    public java.lang.String m137857x4777adbb() {
        return this.f71015x9f9f4645;
    }

    /* renamed from: getPendingChannelResponseCount */
    public int m137858x6c287c0c() {
        return this.f71010x3675ea54.m137880x6c287c0c();
    }

    /* renamed from: getSharedBinaryMessenger */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd m137859x5032a737() {
        return this.f71010x3675ea54;
    }

    /* renamed from: isExecutingDart */
    public boolean m137860xb615fc87() {
        return this.f71013x5170a119;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: makeBackgroundTaskQueue */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue mo137861xc4e54c30(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueueOptions taskQueueOptions) {
        return this.f71009x56f9c012.mo137861xc4e54c30(taskQueueOptions);
    }

    /* renamed from: notifyLowMemoryWarning */
    public void m137862xcfd0d5d0() {
        if (this.f71012x2014a1e9.m137686xf0d424ee()) {
            this.f71012x2014a1e9.m137696xcfd0d5d0();
        }
    }

    /* renamed from: onAttachedToJNI */
    public void m137863x2ee69847() {
        io.p3284xd2ae381c.Log.v(TAG, "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.f71012x2014a1e9.m137743xde722b98(this.f71010x3675ea54);
        } else {
            this.f71012x2014a1e9.m137744xc112d3e3(this.f71010x3675ea54);
        }
    }

    /* renamed from: onDetachFromJNINotInMainThread */
    public void m137864x660b5a72() {
        io.p3284xd2ae381c.Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f71012x2014a1e9.m137744xc112d3e3(null);
    }

    /* renamed from: onDetachedFromJNI */
    public void m137865x3d3e7ea() {
        io.p3284xd2ae381c.Log.v(TAG, "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f71012x2014a1e9.m137743xde722b98(null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: send */
    public void mo126981x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        this.f71009x56f9c012.mo126981x35cf88(str, byteBuffer);
    }

    /* renamed from: setIsolateServiceIdListener */
    public void m137866x715bb49b(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.IsolateServiceIdListener isolateServiceIdListener) {
        java.lang.String str;
        this.f71016x91825a19 = isolateServiceIdListener;
        if (isolateServiceIdListener == null || (str = this.f71015x9f9f4645) == null) {
            return;
        }
        isolateServiceIdListener.m137875xdb2cfce5(str);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: setMessageHandler */
    public void mo126983x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler) {
        this.f71009x56f9c012.mo126983x12ef5e45(str, binaryMessageHandler);
    }

    /* renamed from: setSharedBinaryMessenger */
    public void m137868x204559ab(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.InterfaceC28601xb16824cd interfaceC28601xb16824cd) {
        this.f71010x3675ea54.m137883x204559ab(interfaceC28601xb16824cd);
    }

    public C28604xeb2eb192(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09, android.content.res.AssetManager assetManager, long j17) {
        this.f71013x5170a119 = false;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler() { // from class: io.flutter.embedding.engine.dart.DartExecutor.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler
            /* renamed from: onMessage */
            public void mo137869x88910128(java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.this.f71015x9f9f4645 = io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495.mo138407x37439e39(byteBuffer);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.this.f71016x91825a19 != null) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.this.f71016x91825a19.m137875xdb2cfce5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.this.f71015x9f9f4645);
                }
            }
        };
        this.f71014xbf5d893b = binaryMessageHandler;
        this.f71012x2014a1e9 = c28586x96e67e09;
        this.f71008xb0138e9d = assetManager;
        this.f71011x6c827afd = j17;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34 c28605x66151a34 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28605x66151a34(c28586x96e67e09);
        this.f71010x3675ea54 = c28605x66151a34;
        c28605x66151a34.mo126983x12ef5e45("flutter/isolate", binaryMessageHandler);
        this.f71009x56f9c012 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DefaultBinaryMessenger(c28605x66151a34);
        if (c28586x96e67e09.m137686xf0d424ee()) {
            this.f71013x5170a119 = true;
        }
    }

    /* renamed from: executeDartEntrypoint */
    public void m137854x820a9012(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.util.List<java.lang.String> list) {
        if (this.f71013x5170a119) {
            io.p3284xd2ae381c.Log.w(TAG, "Attempted to run a DartExecutor that is already running.");
            return;
        }
        this.f71012x2014a1e9.m137716xc9039c56("java_execute_dart_entrypoint_start");
        io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200 m139423xc9e48c90 = io.p3284xd2ae381c.p3319x36f002.C28972x8eeb7200.m139423xc9e48c90("DartExecutor#executeDartEntrypoint");
        try {
            io.p3284xd2ae381c.Log.v(TAG, "Executing Dart entrypoint: " + dartEntrypoint);
            this.f71012x2014a1e9.m137731x95362943(dartEntrypoint.f71023x326ef622, dartEntrypoint.f71021xd7b69460, dartEntrypoint.f71022x5e3250be, this.f71008xb0138e9d, list, this.f71011x6c827afd);
            this.f71013x5170a119 = true;
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

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: send */
    public void mo126982x35cf88(java.lang.String str, java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
        this.f71009x56f9c012.mo126982x35cf88(str, byteBuffer, binaryReply);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    @java.lang.Deprecated
    /* renamed from: setMessageHandler */
    public void mo137867x12ef5e45(java.lang.String str, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.TaskQueue taskQueue) {
        this.f71009x56f9c012.mo137867x12ef5e45(str, binaryMessageHandler, taskQueue);
    }

    /* renamed from: io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint */
    /* loaded from: classes11.dex */
    public static class DartEntrypoint {

        /* renamed from: dartEntrypointFunctionName */
        public final java.lang.String f71021xd7b69460;

        /* renamed from: dartEntrypointLibrary */
        public final java.lang.String f71022x5e3250be;

        /* renamed from: pathToBundle */
        public final java.lang.String f71023x326ef622;

        public DartEntrypoint(java.lang.String str, java.lang.String str2) {
            this.f71023x326ef622 = str;
            this.f71022x5e3250be = null;
            this.f71021xd7b69460 = str2;
        }

        /* renamed from: createDefault */
        public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint m137871xe1faf9a5() {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f();
            if (m136951x464ccf4f.m137937x498da6d4()) {
                return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint(m136951x464ccf4f.m137934x595ee78f(), com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29);
            }
            throw new java.lang.AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        /* renamed from: equals */
        public boolean m137872xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint) obj;
            if (this.f71023x326ef622.equals(dartEntrypoint.f71023x326ef622)) {
                return this.f71021xd7b69460.equals(dartEntrypoint.f71021xd7b69460);
            }
            return false;
        }

        /* renamed from: hashCode */
        public int m137873x8cdac1b() {
            return (this.f71023x326ef622.hashCode() * 31) + this.f71021xd7b69460.hashCode();
        }

        /* renamed from: toString */
        public java.lang.String m137874x9616526c() {
            return "DartEntrypoint( bundle path: " + this.f71023x326ef622 + ", function: " + this.f71021xd7b69460 + " )";
        }

        public DartEntrypoint(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f71023x326ef622 = str;
            this.f71022x5e3250be = str2;
            this.f71021xd7b69460 = str3;
        }
    }
}
