package com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper;", "", "<init>", "()V", "Companion", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wechat.aff.common.ThreadHelper */
/* loaded from: classes16.dex */
public final class C27232xd1c72e78 {
    public static final java.lang.String TAG = "MicroMessage.Ting.ThreadHelper";

    /* renamed from: delegate */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.InterfaceC27234x1b7d781d f59605x30d5dd85;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.Companion INSTANCE = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.Companion(null);

    /* renamed from: mainThreadHandle$delegate */
    private static final jz5.g f59606xa20654de = jz5.h.b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27233x622a6e5d.f59607x4fbc8495);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/wechat/aff/common/ThreadHelper$Companion;", "", "<init>", "()V", "TAG", "", "delegate", "Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "getDelegate", "()Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;", "setDelegate", "(Lcom/tencent/wechat/aff/common/ThreadHelperDelegate;)V", "mainThreadHandle", "Landroid/os/Handler;", "getMainThreadHandle", "()Landroid/os/Handler;", "mainThreadHandle$delegate", "Lkotlin/Lazy;", "isMainThread", "", "runInMainThread", "", "runnablePtr", "", "delayMs", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.tencent.wechat.aff.common.ThreadHelper$Companion, reason: from kotlin metadata */
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: getMainThreadHandle */
        private final android.os.Handler m112247xb0eb2ca1() {
            return (android.os.Handler) com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.f59606xa20654de.mo141623x754a37bb();
        }

        /* renamed from: getDelegate */
        public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.InterfaceC27234x1b7d781d m112248xacb01afb() {
            return com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.f59605x30d5dd85;
        }

        /* renamed from: isMainThread */
        public final boolean m112249x9e2d0ded() {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.InterfaceC27234x1b7d781d m112248xacb01afb = m112248xacb01afb();
            return m112248xacb01afb != null ? m112248xacb01afb.m112253x9e2d0ded() : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        }

        /* renamed from: runInMainThread */
        public final void m112250x79e02653(long runnablePtr, long delayMs) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.TAG, "runInMainThread ptr:" + runnablePtr, new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.RunnableC27231x6df89735 runnableC27231x6df89735 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.RunnableC27231x6df89735();
            runnableC27231x6df89735.m112240xff4cb0e4(runnablePtr);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.InterfaceC27234x1b7d781d m112248xacb01afb = m112248xacb01afb();
            if (m112248xacb01afb != null) {
                m112248xacb01afb.m112254x79e02653(runnableC27231x6df89735, delayMs);
            } else if (delayMs > 0 || !m112249x9e2d0ded()) {
                m112247xb0eb2ca1().postDelayed(runnableC27231x6df89735, delayMs);
            } else {
                runnableC27231x6df89735.run();
            }
        }

        /* renamed from: setDelegate */
        public final void m112251xa7687c07(com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.InterfaceC27234x1b7d781d interfaceC27234x1b7d781d) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27232xd1c72e78.f59605x30d5dd85 = interfaceC27234x1b7d781d;
        }
    }

    /* renamed from: isMainThread */
    public static final boolean m112245x9e2d0ded() {
        return INSTANCE.m112249x9e2d0ded();
    }

    /* renamed from: runInMainThread */
    public static final void m112246x79e02653(long j17, long j18) {
        INSTANCE.m112250x79e02653(j17, j18);
    }
}
