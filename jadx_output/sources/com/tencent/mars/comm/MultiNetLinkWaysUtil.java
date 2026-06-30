package com.tencent.mars.comm;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 *2\u00020\u0001:\u0004+*,-B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\nJ\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0012\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010 ¨\u0006."}, d2 = {"Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "", "", "socketFd", "bindSocketToMobileImpl", "", "host", "resolveHostByCellularImpl", "Landroid/content/Context;", "context", "Ljz5/f0;", "delayUnregister", "reflectCallBind", "Landroid/net/Network;", "network", "onMobileNetworkReady", "onMobileUnAvailable", "activeMobileNetwork", "negativeMobileNetwork", "", "bindSocketToMobile", "hostDomain", "resolveHostByCellular", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil$BindAndDnsReturnKt;", "bindSocketToCellularAndDnsByCellular", "syncActiveMobileNetwork", "mMobileNetwork", "Landroid/net/Network;", "Landroid/net/ConnectivityManager$NetworkCallback;", "mMobileNetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "mMobileNetId", "I", "Ljava/lang/Object;", "mLock", "Ljava/lang/Object;", "kSuccess", "kNoCellularNetwork", "kDnsFail", "kBindFail", "<init>", "()V", "Companion", "BindAndDnsReturnKt", "DelayUnregister", "MobileNetworkCallback", "mars-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class MultiNetLinkWaysUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.mars.comm.MultiNetLinkWaysUtil.Companion INSTANCE = new com.tencent.mars.comm.MultiNetLinkWaysUtil.Companion(null);
    private static final java.lang.String TAG = "MultiNetLinkWaysUtil";
    private static com.tencent.mars.comm.MultiNetLinkWaysUtil mInstance;
    private final int kBindFail;
    private final int kDnsFail;
    private final int kNoCellularNetwork;
    private final int kSuccess;
    private java.lang.Object mLock;
    private int mMobileNetId;
    private android.net.Network mMobileNetwork;
    private android.net.ConnectivityManager.NetworkCallback mMobileNetworkCallback;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mars/comm/MultiNetLinkWaysUtil$BindAndDnsReturnKt;", "", "_hostIpStr", "", "_resultCode", "", "(Ljava/lang/String;I)V", "hostIpStr", "getHostIpStr", "()Ljava/lang/String;", "resultCode", "getResultCode", "()I", "mars-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class BindAndDnsReturnKt {
        private final java.lang.String hostIpStr;
        private final int resultCode;

        public BindAndDnsReturnKt(java.lang.String _hostIpStr, int i17) {
            kotlin.jvm.internal.o.g(_hostIpStr, "_hostIpStr");
            this.resultCode = i17;
            this.hostIpStr = _hostIpStr;
        }

        public final java.lang.String getHostIpStr() {
            return this.hostIpStr;
        }

        public final int getResultCode() {
            return this.resultCode;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tencent/mars/comm/MultiNetLinkWaysUtil$Companion;", "", "()V", "TAG", "", "mInstance", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "instance", "mars-common_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.mars.comm.MultiNetLinkWaysUtil instance() {
            if (com.tencent.mars.comm.MultiNetLinkWaysUtil.mInstance == null) {
                com.tencent.mars.comm.MultiNetLinkWaysUtil.mInstance = new com.tencent.mars.comm.MultiNetLinkWaysUtil(null);
            }
            com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = com.tencent.mars.comm.MultiNetLinkWaysUtil.mInstance;
            kotlin.jvm.internal.o.d(multiNetLinkWaysUtil);
            return multiNetLinkWaysUtil;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/tencent/mars/comm/MultiNetLinkWaysUtil$DelayUnregister;", "Ljava/util/TimerTask;", "Ljz5/f0;", "run", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "mReceiver", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "getMReceiver", "()Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "setMReceiver", "(Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;)V", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "<init>", "()V", "receiver", "context", "(Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;Landroid/content/Context;)V", "mars-common_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes13.dex */
    public static final class DelayUnregister extends java.util.TimerTask {
        private android.content.Context mContext;
        private com.tencent.mars.comm.MultiNetLinkWaysUtil mReceiver;

        public DelayUnregister() {
        }

        public final android.content.Context getMContext() {
            return this.mContext;
        }

        public final com.tencent.mars.comm.MultiNetLinkWaysUtil getMReceiver() {
            return this.mReceiver;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = this.mReceiver;
            if (multiNetLinkWaysUtil != null) {
                multiNetLinkWaysUtil.negativeMobileNetwork(this.mContext);
            }
        }

        public final void setMContext(android.content.Context context) {
            this.mContext = context;
        }

        public final void setMReceiver(com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil) {
            this.mReceiver = multiNetLinkWaysUtil;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DelayUnregister(com.tencent.mars.comm.MultiNetLinkWaysUtil receiver, android.content.Context context) {
            this();
            kotlin.jvm.internal.o.g(receiver, "receiver");
            this.mReceiver = receiver;
            this.mContext = context;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/tencent/mars/comm/MultiNetLinkWaysUtil$MobileNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Ljz5/f0;", "onAvailable", "onUnavailable", "onLost", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "mReceiver", "Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "getMReceiver", "()Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;", "setMReceiver", "(Lcom/tencent/mars/comm/MultiNetLinkWaysUtil;)V", "<init>", "()V", "receiver", "mars-common_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes13.dex */
    public static final class MobileNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        private com.tencent.mars.comm.MultiNetLinkWaysUtil mReceiver;

        public MobileNetworkCallback() {
        }

        public final com.tencent.mars.comm.MultiNetLinkWaysUtil getMReceiver() {
            return this.mReceiver;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network network) {
            kotlin.jvm.internal.o.g(network, "network");
            com.tencent.mars.xlog.Log.i(com.tencent.mars.comm.MultiNetLinkWaysUtil.TAG, "network available " + network);
            com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = this.mReceiver;
            if (multiNetLinkWaysUtil != null) {
                multiNetLinkWaysUtil.onMobileNetworkReady(network);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network network) {
            kotlin.jvm.internal.o.g(network, "network");
            com.tencent.mars.xlog.Log.i(com.tencent.mars.comm.MultiNetLinkWaysUtil.TAG, "network onLost");
            com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = this.mReceiver;
            if (multiNetLinkWaysUtil != null) {
                multiNetLinkWaysUtil.onMobileUnAvailable();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            com.tencent.mars.xlog.Log.i(com.tencent.mars.comm.MultiNetLinkWaysUtil.TAG, "network onUnavailable");
            com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = this.mReceiver;
            if (multiNetLinkWaysUtil != null) {
                multiNetLinkWaysUtil.onMobileUnAvailable();
            }
        }

        public final void setMReceiver(com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil) {
            this.mReceiver = multiNetLinkWaysUtil;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public MobileNetworkCallback(com.tencent.mars.comm.MultiNetLinkWaysUtil receiver) {
            this();
            kotlin.jvm.internal.o.g(receiver, "receiver");
            this.mReceiver = receiver;
        }
    }

    public /* synthetic */ MultiNetLinkWaysUtil(kotlin.jvm.internal.i iVar) {
        this();
    }

    private final int bindSocketToMobileImpl(int socketFd) {
        com.tencent.mars.xlog.Log.i(TAG, "Build.VERSION.SDK_INT: " + android.os.Build.VERSION.SDK_INT);
        try {
            java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, socketFd);
            android.net.Network network = this.mMobileNetwork;
            if (network != null) {
                network.bindSocket(fileDescriptor);
            }
            com.tencent.mars.xlog.Log.i(TAG, "bind socket success, fd: " + socketFd);
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "bind socket failed: " + e17.getMessage() + ", fd: " + socketFd);
            return -1;
        }
    }

    private final void delayUnregister(android.content.Context context) {
        java.util.Timer timer = new java.util.Timer();
        com.tencent.mars.comm.MultiNetLinkWaysUtil multiNetLinkWaysUtil = mInstance;
        kotlin.jvm.internal.o.d(multiNetLinkWaysUtil);
        timer.schedule(new com.tencent.mars.comm.MultiNetLinkWaysUtil.DelayUnregister(multiNetLinkWaysUtil, context), 30000L);
    }

    private final int reflectCallBind(int socketFd) {
        com.tencent.mars.xlog.Log.i(TAG, "try to call reflection version");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.net.NetworkUtils");
            java.lang.Object newInstance = cls.newInstance();
            java.lang.Class<?> cls2 = java.lang.Integer.TYPE;
            java.lang.Object invoke = cls.getDeclaredMethod("bindSocketToNetwork", cls2, cls2).invoke(newInstance, java.lang.Integer.valueOf(socketFd), java.lang.Integer.valueOf(this.mMobileNetId));
            kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) invoke).intValue();
            com.tencent.mars.xlog.Log.i(TAG, "call reflection bind ret: " + intValue);
            return intValue;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "call reflection bind error: " + e17.getMessage());
            return -1;
        }
    }

    private final java.lang.String resolveHostByCellularImpl(java.lang.String host) {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new java.lang.String();
        java.lang.Object obj = new java.lang.Object();
        synchronized (obj) {
            nz5.b.a(false, false, null, null, 0, new com.tencent.mars.comm.MultiNetLinkWaysUtil$resolveHostByCellularImpl$1$1(this, host, h0Var, obj), 31, null);
            try {
                obj.wait(2000L);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(TAG, "dns by cellular fail: " + e17);
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "host:" + host + ", ip:" + ((java.lang.String) h0Var.f310123d));
        return (java.lang.String) h0Var.f310123d;
    }

    public final void activeMobileNetwork(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.w(TAG, "activeMobileNetwork context is null");
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "start active mobile network");
        if (this.mMobileNetworkCallback == null) {
            this.mMobileNetworkCallback = new com.tencent.mars.comm.MultiNetLinkWaysUtil.MobileNetworkCallback(this);
        }
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        builder.addCapability(12);
        builder.addTransportType(0);
        android.net.NetworkRequest build = builder.build();
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.mMobileNetworkCallback;
        kotlin.jvm.internal.o.d(networkCallback);
        ((android.net.ConnectivityManager) systemService).requestNetwork(build, networkCallback);
    }

    public final com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular(int socketFd, java.lang.String hostDomain, android.content.Context context) {
        kotlin.jvm.internal.o.g(hostDomain, "hostDomain");
        if (!syncActiveMobileNetwork(context)) {
            return new com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt(new java.lang.String(), this.kNoCellularNetwork);
        }
        java.lang.String resolveHostByCellularImpl = resolveHostByCellularImpl(hostDomain);
        return resolveHostByCellularImpl.length() == 0 ? new com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt(new java.lang.String(), this.kDnsFail) : bindSocketToMobileImpl(socketFd) != 0 ? new com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt(new java.lang.String(), this.kBindFail) : new com.tencent.mars.comm.MultiNetLinkWaysUtil.BindAndDnsReturnKt(resolveHostByCellularImpl, this.kSuccess);
    }

    public final boolean bindSocketToMobile(int socketFd, android.content.Context context) {
        return syncActiveMobileNetwork(context) && bindSocketToMobileImpl(socketFd) == 0;
    }

    public final void negativeMobileNetwork(android.content.Context context) {
        com.tencent.mars.xlog.Log.i(TAG, "cronet negativeMobileNetwork");
        if (context == null) {
            com.tencent.mars.xlog.Log.w(TAG, "negativeMobileNetwork context == null");
            return;
        }
        java.lang.Object systemService = context.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        synchronized (this.mLock) {
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.mMobileNetworkCallback;
            if (networkCallback == null) {
                com.tencent.mars.xlog.Log.i(TAG, "cronet already negativeMobileNetwork");
                return;
            }
            try {
                kotlin.jvm.internal.o.d(networkCallback);
                connectivityManager.unregisterNetworkCallback(networkCallback);
                this.mMobileNetworkCallback = null;
                this.mMobileNetwork = null;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public final void onMobileNetworkReady(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        this.mMobileNetwork = network;
        this.mMobileNetId = network.hashCode() / 11;
        com.tencent.mars.xlog.Log.i(TAG, "receive net id is " + this.mMobileNetId);
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    public final void onMobileUnAvailable() {
        this.mMobileNetwork = null;
        this.mMobileNetworkCallback = null;
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    public final java.lang.String resolveHostByCellular(java.lang.String hostDomain, android.content.Context context) {
        kotlin.jvm.internal.o.g(hostDomain, "hostDomain");
        return !syncActiveMobileNetwork(context) ? "" : resolveHostByCellularImpl(hostDomain);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r5.mMobileNetwork != null) goto L10;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean syncActiveMobileNetwork(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "cronet activeMobileNetwork error: "
            java.lang.Object r1 = r5.mLock
            monitor-enter(r1)
            android.net.Network r2 = r5.mMobileNetwork     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L3c
            r5.activeMobileNetwork(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r2 = r5.mLock     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r3 = 1000(0x3e8, double:4.94E-321)
            r2.wait(r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            android.net.Network r0 = r5.mMobileNetwork     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L3c
        L17:
            r5.delayUnregister(r6)     // Catch: java.lang.Throwable -> L60
            goto L3c
        L1b:
            r0 = move-exception
            goto L34
        L1d:
            r2 = move-exception
            java.lang.String r3 = "MultiNetLinkWaysUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            r4.append(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L1b
            com.tencent.mars.xlog.Log.e(r3, r0)     // Catch: java.lang.Throwable -> L1b
            android.net.Network r0 = r5.mMobileNetwork     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L3c
            goto L17
        L34:
            android.net.Network r2 = r5.mMobileNetwork     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L3b
            r5.delayUnregister(r6)     // Catch: java.lang.Throwable -> L60
        L3b:
            throw r0     // Catch: java.lang.Throwable -> L60
        L3c:
            monitor-exit(r1)
            java.lang.String r6 = "MultiNetLinkWaysUtil"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "get mobile network success: "
            r0.<init>(r1)
            android.net.Network r1 = r5.mMobileNetwork
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4e
            r1 = r2
            goto L4f
        L4e:
            r1 = r3
        L4f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r6, r0)
            android.net.Network r6 = r5.mMobileNetwork
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r3
        L5f:
            return r2
        L60:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.comm.MultiNetLinkWaysUtil.syncActiveMobileNetwork(android.content.Context):boolean");
    }

    private MultiNetLinkWaysUtil() {
        this.mMobileNetId = -1;
        this.mLock = new java.lang.Object();
        this.kNoCellularNetwork = 1;
        this.kDnsFail = 2;
        this.kBindFail = 3;
    }
}
