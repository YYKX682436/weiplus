package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public class MJMaasCoreCallback {

    /* loaded from: classes5.dex */
    public static class BoolCompleteCallback extends com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallback<com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg.BoolCompleteArg> {
        private final com.tencent.maas.MJMaasCore.OnBoolComplete onBoolComplete;

        public BoolCompleteCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.OnBoolComplete onBoolComplete) {
            super(mJMaasCore);
            this.onBoolComplete = onBoolComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallback
        public void onInvoke(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg.BoolCompleteArg boolCompleteArg) {
            com.tencent.maas.MJMaasCore.OnBoolComplete onBoolComplete = this.onBoolComplete;
            if (onBoolComplete == null || boolCompleteArg == null) {
                return;
            }
            onBoolComplete.onComplete(boolCompleteArg.value);
        }

        public BoolCompleteCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.OnBoolComplete onBoolComplete, boolean z17) {
            super(mJMaasCore, z17);
            this.onBoolComplete = onBoolComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallback<com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg.CompleteArg> {
        private final com.tencent.maas.MJMaasCore.OnComplete onComplete;

        public CompleteCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.OnComplete onComplete) {
            super(mJMaasCore);
            this.onComplete = onComplete;
        }

        @Override // com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallback
        public void onInvoke(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg.CompleteArg completeArg) {
            com.tencent.maas.MJMaasCore.OnComplete onComplete = this.onComplete;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.onComplete(completeArg.error);
        }

        public CompleteCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.OnComplete onComplete, boolean z17) {
            super(mJMaasCore, z17);
            this.onComplete = onComplete;
        }
    }

    /* loaded from: classes5.dex */
    public static class ILinkLoginParamCallback extends com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallbackWithReturnValue<com.tencent.maas.internal.NativeCallbackManager.CallbackArgs> {
        private final com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback;

        public ILinkLoginParamCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback) {
            super(mJMaasCore);
            this.loginParamsCallback = loginParamsCallback;
        }

        @Override // com.tencent.maas.instamovie.MJMaasCoreCallback.BaseCallbackWithReturnValue
        public java.lang.Object onInvokeWithReturnValue(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            return this.loginParamsCallback.onGetLoginParams();
        }

        public ILinkLoginParamCallback(com.tencent.maas.MJMaasCore mJMaasCore, com.tencent.maas.MJMaasCore.LoginParamsCallback loginParamsCallback, boolean z17) {
            super(mJMaasCore, z17);
            this.loginParamsCallback = loginParamsCallback;
        }
    }

    /* loaded from: classes5.dex */
    public static class MJMaasCoreCallbackArg extends com.tencent.maas.internal.NativeCallbackManager.CallbackArgs {

        /* loaded from: classes5.dex */
        public static class BoolCompleteArg extends com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg {
            public final boolean value;

            public BoolCompleteArg(boolean z17) {
                this.value = z17;
            }
        }

        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.tencent.maas.instamovie.MJMaasCoreCallback.MJMaasCoreCallbackArg {
            public final com.tencent.maas.instamovie.base.MJError error;

            public CompleteArg(com.tencent.maas.instamovie.base.MJError mJError) {
                this.error = mJError;
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.tencent.maas.internal.a {
        private final java.lang.ref.WeakReference<com.tencent.maas.MJMaasCore> maasCoreRef;

        public BaseCallback(com.tencent.maas.MJMaasCore mJMaasCore) {
            this.maasCoreRef = new java.lang.ref.WeakReference<>(mJMaasCore);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.maas.internal.a
        public final void invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.maasCoreRef.get(), callbackArgs);
        }

        public abstract void onInvoke(com.tencent.maas.MJMaasCore mJMaasCore, T t17);

        public BaseCallback(com.tencent.maas.MJMaasCore mJMaasCore, boolean z17) {
            super(z17);
            this.maasCoreRef = new java.lang.ref.WeakReference<>(mJMaasCore);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class BaseCallbackWithReturnValue<T> extends com.tencent.maas.internal.b {
        private final java.lang.ref.WeakReference<com.tencent.maas.MJMaasCore> maasCoreRef;

        public BaseCallbackWithReturnValue(com.tencent.maas.MJMaasCore mJMaasCore) {
            this.maasCoreRef = new java.lang.ref.WeakReference<>(mJMaasCore);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.tencent.maas.internal.b
        public final java.lang.Object invoke(com.tencent.maas.internal.NativeCallbackManager.CallbackArgs callbackArgs) {
            return onInvokeWithReturnValue(this.maasCoreRef.get(), callbackArgs);
        }

        public abstract java.lang.Object onInvokeWithReturnValue(com.tencent.maas.MJMaasCore mJMaasCore, T t17);

        public BaseCallbackWithReturnValue(com.tencent.maas.MJMaasCore mJMaasCore, boolean z17) {
            super(z17);
            this.maasCoreRef = new java.lang.ref.WeakReference<>(mJMaasCore);
        }
    }
}
