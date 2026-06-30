package com.p314xaae8f345.p457x3304c6;

/* renamed from: com.tencent.maas.MJServiceManagerCallback */
/* loaded from: classes5.dex */
public class C3966xe2e2999a {

    /* renamed from: com.tencent.maas.MJServiceManagerCallback$CompleteCallback */
    /* loaded from: classes5.dex */
    public static class CompleteCallback extends com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.BaseCallback<com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.MJServiceManagerCallbackArg> {

        /* renamed from: onComplete */
        private final com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete f15763x815f5438;

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35, com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete onComplete) {
            super(c3965x4edb1a35);
            this.f15763x815f5438 = onComplete;
        }

        @Override // com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.BaseCallback
        /* renamed from: onInvoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public void mo32399x48671b37(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35, com.p314xaae8f345.p457x3304c6.C3966xe2e2999a.MJServiceManagerCallbackArg mJServiceManagerCallbackArg) {
            com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete onComplete = this.f15763x815f5438;
            if (onComplete == null || mJServiceManagerCallbackArg == null) {
                return;
            }
            onComplete.m32397x815f5438(mJServiceManagerCallbackArg.f15765xf28d398, mJServiceManagerCallbackArg.f15764x5c4d208);
        }

        public CompleteCallback(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35, com.p314xaae8f345.p457x3304c6.C3965x4edb1a35.OnComplete onComplete, boolean z17) {
            super(c3965x4edb1a35, z17);
            this.f15763x815f5438 = onComplete;
        }
    }

    /* renamed from: com.tencent.maas.MJServiceManagerCallback$MJServiceManagerCallbackArg */
    /* loaded from: classes5.dex */
    public static class MJServiceManagerCallbackArg extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs {

        /* renamed from: error */
        public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f15764x5c4d208;

        /* renamed from: templateCategory */
        public final com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755 f15765xf28d398;

        public MJServiceManagerCallbackArg(com.p314xaae8f345.p457x3304c6.p477x633fb29.C4120x4de84755 c4120x4de84755, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
            this.f15765xf28d398 = c4120x4de84755;
            this.f15764x5c4d208 = c4093x6b88526b;
        }
    }

    /* renamed from: com.tencent.maas.MJServiceManagerCallback$BaseCallback */
    /* loaded from: classes5.dex */
    public static abstract class BaseCallback<T> extends com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a {

        /* renamed from: mjServiceManagerRef */
        private final java.lang.ref.WeakReference<com.p314xaae8f345.p457x3304c6.C3965x4edb1a35> f15762xd2b87a1e;

        public BaseCallback(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35) {
            this.f15762xd2b87a1e = new java.lang.ref.WeakReference<>(c3965x4edb1a35);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.a
        /* renamed from: invoke */
        public final void mo32398xb9724478(com.p314xaae8f345.p457x3304c6.p474x21ffc6bd.C4099x76754671.CallbackArgs callbackArgs) {
            mo32399x48671b37(this.f15762xd2b87a1e.get(), callbackArgs);
        }

        /* renamed from: onInvoke */
        public abstract void mo32399x48671b37(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35, T t17);

        public BaseCallback(com.p314xaae8f345.p457x3304c6.C3965x4edb1a35 c3965x4edb1a35, boolean z17) {
            super(z17);
            this.f15762xd2b87a1e = new java.lang.ref.WeakReference<>(c3965x4edb1a35);
        }
    }
}
