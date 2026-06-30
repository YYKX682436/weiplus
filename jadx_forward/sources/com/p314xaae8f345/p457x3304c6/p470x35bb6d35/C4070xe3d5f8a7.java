package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback */
/* loaded from: classes5.dex */
public class C4070xe3d5f8a7 {

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$BoolCompleteCallback */
    /* loaded from: classes5.dex */
    public static class BoolCompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg.BoolCompleteArg> {

        /* renamed from: onBoolComplete */
        private final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete f15941x4f43d1c2;

        public BoolCompleteCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete onBoolComplete) {
            super(c3962x4bd0d642);
            this.f15941x4f43d1c2 = onBoolComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33192x48671b37(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg.BoolCompleteArg boolCompleteArg) {
            com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete onBoolComplete = this.f15941x4f43d1c2;
            if (onBoolComplete == null || boolCompleteArg == null) {
                return;
            }
            onBoolComplete.mo9333x815f5438(boolCompleteArg.f15944x6ac9171);
        }

        public BoolCompleteCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnBoolComplete onBoolComplete, boolean z17) {
            super(c3962x4bd0d642, z17);
            this.f15941x4f43d1c2 = onBoolComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$CompleteCallback */
    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallback<com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg.CompleteArg> {

        /* renamed from: onComplete */
        private final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete f15942x815f5438;

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete) {
            super(c3962x4bd0d642);
            this.f15942x815f5438 = onComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo33192x48671b37(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg.CompleteArg completeArg) {
            com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete = this.f15942x815f5438;
            if (onComplete == null || completeArg == null) {
                return;
            }
            onComplete.mo9351x815f5438(completeArg.f15945x5c4d208);
        }

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.OnComplete onComplete, boolean z17) {
            super(c3962x4bd0d642, z17);
            this.f15942x815f5438 = onComplete;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$ILinkLoginParamCallback */
    /* loaded from: classes5.dex */
    public static class ILinkLoginParamCallback extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallbackWithReturnValue<com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs> {

        /* renamed from: loginParamsCallback */
        private final com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback f15943xf8e7a7b4;

        public ILinkLoginParamCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback) {
            super(c3962x4bd0d642);
            this.f15943xf8e7a7b4 = loginParamsCallback;
        }

        @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.BaseCallbackWithReturnValue
        /* renamed from: onInvokeWithReturnValue, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public java.lang.Object mo33194x40d4e944(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            return this.f15943xf8e7a7b4.mo9337x50d8d0d8();
        }

        public ILinkLoginParamCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, com.p314xaae8f345.p457x3304c6.C3962x4bd0d642.LoginParamsCallback loginParamsCallback, boolean z17) {
            super(c3962x4bd0d642, z17);
            this.f15943xf8e7a7b4 = loginParamsCallback;
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$MJMaasCoreCallbackArg */
    /* loaded from: classes5.dex */
    public static class MJMaasCoreCallbackArg extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

        /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$MJMaasCoreCallbackArg$BoolCompleteArg */
        /* loaded from: classes5.dex */
        public static class BoolCompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg {

            /* renamed from: value */
            public final boolean f15944x6ac9171;

            public BoolCompleteArg(boolean z17) {
                this.f15944x6ac9171 = z17;
            }
        }

        /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$MJMaasCoreCallbackArg$CompleteArg */
        /* loaded from: classes5.dex */
        public static class CompleteArg extends com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4070xe3d5f8a7.MJMaasCoreCallbackArg {

            /* renamed from: error */
            public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f15945x5c4d208;

            public CompleteArg(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
                this.f15945x5c4d208 = c4093x6b88526b;
            }
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$BaseCallback */
    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

        /* renamed from: maasCoreRef */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.C3962x4bd0d642> f15939x696a40ce;

        public BaseCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642) {
            this.f15939x696a40ce = new java.lang.ref.WeakReference<>(c3962x4bd0d642);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
        /* renamed from: invoke */
        public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            mo33192x48671b37(this.f15939x696a40ce.get(), callbackArgs);
        }

        /* renamed from: onInvoke */
        public abstract void mo33192x48671b37(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, T t17);

        public BaseCallback(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, boolean z17) {
            super(z17);
            this.f15939x696a40ce = new java.lang.ref.WeakReference<>(c3962x4bd0d642);
        }
    }

    /* renamed from: com.tencent.maas.instamovie.MJMaasCoreCallback$BaseCallbackWithReturnValue */
    /* loaded from: classes5.dex */
    public static abstract class BaseCallbackWithReturnValue<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b {

        /* renamed from: maasCoreRef */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.C3962x4bd0d642> f15940x696a40ce;

        public BaseCallbackWithReturnValue(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642) {
            this.f15940x696a40ce = new java.lang.ref.WeakReference<>(c3962x4bd0d642);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.b
        /* renamed from: invoke */
        public final java.lang.Object mo33193xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            return mo33194x40d4e944(this.f15940x696a40ce.get(), callbackArgs);
        }

        /* renamed from: onInvokeWithReturnValue */
        public abstract java.lang.Object mo33194x40d4e944(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, T t17);

        public BaseCallbackWithReturnValue(com.p314xaae8f345.p457x3304c6.C3962x4bd0d642 c3962x4bd0d642, boolean z17) {
            super(z17);
            this.f15940x696a40ce = new java.lang.ref.WeakReference<>(c3962x4bd0d642);
        }
    }
}
