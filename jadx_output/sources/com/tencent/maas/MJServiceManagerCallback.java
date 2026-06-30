package com.tencent.maas;

/* loaded from: classes5.dex */
public class MJServiceManagerCallback {

    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.tencent.maas.MJServiceManagerCallback.BaseCallback<com.tencent.maas.MJServiceManagerCallback.MJServiceManagerCallbackArg> {
        private final com.tencent.maas.MJServiceManager.OnComplete onComplete;

        public CompleteCallback(com.tencent.maas.MJServiceManager mJServiceManager, com.tencent.maas.MJServiceManager.OnComplete onComplete) {
            super(mJServiceManager);
            this.onComplete = onComplete;
        }

        @Override // com.tencent.maas.MJServiceManagerCallback.BaseCallback
        public void onInvoke(com.tencent.maas.MJServiceManager mJServiceManager, com.tencent.maas.MJServiceManagerCallback.MJServiceManagerCallbackArg mJServiceManagerCallbackArg) {
            com.tencent.maas.MJServiceManager.OnComplete onComplete = this.onComplete;
            if (onComplete == null || mJServiceManagerCallbackArg == null) {
                return;
            }
            onComplete.onComplete(mJServiceManagerCallbackArg.templateCategory, mJServiceManagerCallbackArg.error);
        }

        public CompleteCallback(com.tencent.maas.MJServiceManager mJServiceManager, com.tencent.maas.MJServiceManager.OnComplete onComplete, boolean z17) {
            super(mJServiceManager, z17);
            this.onComplete = onComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class MJServiceManagerCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {
        public final com.tencent.maas.instamovie.base.MJError error;
        public final com.tencent.maas.model.MJTemplateCategory templateCategory;

        public MJServiceManagerCallbackArg(com.tencent.maas.model.MJTemplateCategory mJTemplateCategory, com.tencent.maas.instamovie.base.MJError mJError) {
            this.templateCategory = mJTemplateCategory;
            this.error = mJError;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.tencent.maas.internal.a {
        private final java.lang.ref.WeakReference<com.tencent.maas.MJServiceManager> mjServiceManagerRef;

        public BaseCallback(com.tencent.maas.MJServiceManager mJServiceManager) {
            this.mjServiceManagerRef = new java.lang.ref.WeakReference<>(mJServiceManager);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.maas.internal.a
        public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjServiceManagerRef.get(), callbackArgs);
        }

        public abstract void onInvoke(com.tencent.maas.MJServiceManager mJServiceManager, T t17);

        public BaseCallback(com.tencent.maas.MJServiceManager mJServiceManager, boolean z17) {
            super(z17);
            this.mjServiceManagerRef = new java.lang.ref.WeakReference<>(mJServiceManager);
        }
    }
}
