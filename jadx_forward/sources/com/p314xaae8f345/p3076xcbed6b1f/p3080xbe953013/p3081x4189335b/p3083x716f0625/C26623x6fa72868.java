package com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625;

/* renamed from: com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor */
/* loaded from: classes13.dex */
public class C26623x6fa72868 extends com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05<android.os.Handler.Callback> {

    /* renamed from: sMCallbackField */
    private static java.lang.reflect.Field f55585xd187839b;

    /* renamed from: mMessageHandler */
    private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler f55586x63143310;

    /* renamed from: mTarget */
    private final android.os.Handler f55587x1aea985e;

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor$CallbackWrapper */
    /* loaded from: classes13.dex */
    public static class CallbackWrapper implements android.os.Handler.Callback, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy {

        /* renamed from: mIsInHandleMethod */
        private volatile boolean f55588x9eef1145 = false;

        /* renamed from: mMessageHandler */
        private final com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler f55589x63143310;

        /* renamed from: mOrigCallback */
        private final android.os.Handler.Callback f55590xeb1fab3;

        public CallbackWrapper(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler messageHandler, android.os.Handler.Callback callback) {
            this.f55589x63143310 = messageHandler;
            this.f55590xeb1fab3 = callback;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (this.f55588x9eef1145) {
                return false;
            }
            boolean z17 = true;
            this.f55588x9eef1145 = true;
            if (!this.f55589x63143310.mo104593x5b586cbf(message)) {
                android.os.Handler.Callback callback = this.f55590xeb1fab3;
                z17 = callback != null ? callback.handleMessage(message) : false;
            }
            this.f55588x9eef1145 = false;
            return z17;
        }
    }

    /* renamed from: com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor$MessageHandler */
    /* loaded from: classes13.dex */
    public interface MessageHandler {
        /* renamed from: handleMessage */
        boolean mo104593x5b586cbf(android.os.Message message);
    }

    static {
        synchronized (com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.class) {
            if (f55585xd187839b == null) {
                try {
                    f55585xd187839b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1((java.lang.Class<?>) android.os.Handler.class, "mCallback");
                } catch (java.lang.Throwable unused) {
                }
            }
        }
    }

    public C26623x6fa72868(android.os.Handler handler, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.MessageHandler messageHandler) {
        this.f55587x1aea985e = handler;
        this.f55586x63143310 = messageHandler;
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: decorate, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public android.os.Handler.Callback mo104597x220c2b0d(android.os.Handler.Callback callback) {
        return (callback == null || !com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05.ITinkerHotplugProxy.class.isAssignableFrom(callback.getClass())) ? new com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.C26623x6fa72868.CallbackWrapper(this.f55586x63143310, callback) : callback;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: fetchTarget */
    public android.os.Handler.Callback mo104598x219af0eb() {
        return (android.os.Handler.Callback) f55585xd187839b.get(this.f55587x1aea985e);
    }

    @Override // com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.p3083x716f0625.AbstractC26625xd4d8ae05
    /* renamed from: inject, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo104599xb96ca991(android.os.Handler.Callback callback) {
        f55585xd187839b.set(this.f55587x1aea985e, callback);
    }
}
