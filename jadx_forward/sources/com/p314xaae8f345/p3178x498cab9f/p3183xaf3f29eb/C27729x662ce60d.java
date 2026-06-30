package com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H\u0083 J\u0006\u0010\u000f\u001a\u00020\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\nJ\u0011\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0083 J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\"J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/tencent/wemagic/common/MBInitializer;", "", "<init>", "()V", "TAG", "", "initialized", "", "zidlInitialized", "initialize", "", "assetManager", "Landroid/content/res/AssetManager;", "dataPath", "enableJSInspector", "isInitialized", "initializeIfNeeded", "Lcom/tencent/wemagic/common/MBInitializer$InitializeResult;", "context", "Landroid/content/Context;", "config", "Lcom/tencent/wemagic/common/MBGlobalConfig;", "initZidl", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "mHandler$delegate", "Lkotlin/Lazy;", "executeMainThreadTask", "task", "", "runOnMainThread", "r", "Ljava/lang/Runnable;", "postToMainThread", "addConfigChangedListener", "InitializeResult", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wemagic.common.MBInitializer */
/* loaded from: classes8.dex */
public final class C27729x662ce60d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f301598b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d f301597a = new com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f301599c = jz5.h.b(new uw5.C30641x2e755c());

    public static void a(long j17) {
        m119754xddd1841d(j17);
    }

    /* renamed from: executeMainThreadTask */
    private static final native void m119754xddd1841d(long task);

    /* renamed from: initialize */
    private static final native void m119755x33ebcb90(android.content.res.AssetManager assetManager, java.lang.String dataPath, boolean enableJSInspector);

    /* renamed from: runOnMainThread */
    public static final void m119756xa80a068d(final long task) {
        ((android.os.Handler) ((jz5.n) f301599c).mo141623x754a37bb()).post(new java.lang.Runnable() { // from class: uw5.e$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p3178x498cab9f.p3183xaf3f29eb.C27729x662ce60d.a(task);
            }
        });
    }

    public final void b(java.lang.Runnable r17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            r17.run();
        } else {
            ((android.os.Handler) ((jz5.n) f301599c).mo141623x754a37bb()).post(r17);
        }
    }
}
