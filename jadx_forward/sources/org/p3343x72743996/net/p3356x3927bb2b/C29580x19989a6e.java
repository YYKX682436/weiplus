package org.p3343x72743996.net.p3356x3927bb2b;

/* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks */
/* loaded from: classes16.dex */
public class C29580x19989a6e {

    /* renamed from: org.chromium.net.apihelpers.UrlRequestCallbacks$CallbackAndResponseFuturePair */
    /* loaded from: classes16.dex */
    public static class CallbackAndResponseFuturePair<ResponseBodyT, CallbackT extends org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028<ResponseBodyT>> {

        /* renamed from: mCallback */
        private final CallbackT f74382x1ab9c7d2;

        /* renamed from: mFuture */
        private final java.util.concurrent.Future<org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e<ResponseBodyT>> f74383x421b490;

        public CallbackAndResponseFuturePair(java.util.concurrent.Future<org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e<ResponseBodyT>> future, CallbackT callbackt) {
            this.f74383x421b490 = future;
            this.f74382x1ab9c7d2 = callbackt;
        }

        /* renamed from: getCallback */
        public CallbackT m153757x71965dbb() {
            return this.f74382x1ab9c7d2;
        }

        /* renamed from: getFuture */
        public java.util.concurrent.Future<org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e<ResponseBodyT>> m153758x19ccb0b9() {
            return this.f74383x421b490;
        }
    }

    private C29580x19989a6e() {
    }

    /* renamed from: addResponseFutureListener */
    private static <T> java.util.concurrent.Future<org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e<T>> m153747x2f62a439(org.p3343x72743996.net.p3356x3927bb2b.AbstractC29572xfe57f028<T> abstractC29572xfe57f028) {
        final java.util.concurrent.CompletableFuture completableFuture = new java.util.concurrent.CompletableFuture();
        abstractC29572xfe57f028.mo153714x45901f31(new org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<T>() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4
            @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
            /* renamed from: onCanceled */
            public void mo49258x9dc2a798(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e) {
                completableFuture.completeExceptionally(new org.p3343x72743996.net.AbstractC29501x119930f2("The request was canceled!", null) { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.4.1
                });
            }

            @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
            /* renamed from: onFailed */
            public void mo49259x428b6afc(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, org.p3343x72743996.net.AbstractC29501x119930f2 abstractC29501x119930f2) {
                completableFuture.completeExceptionally(abstractC29501x119930f2);
            }

            @Override // org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442
            /* renamed from: onSucceeded */
            public void mo49260x3688ff42(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, T t17) {
                completableFuture.complete(new org.p3343x72743996.net.p3356x3927bb2b.C29570x233d933e(abstractC29564x6974077e, t17));
            }
        });
        return completableFuture;
    }

    /* renamed from: forByteArrayBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29567x9942d393 m153748x86da252a(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae, org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<byte[]> interfaceC29569x80e9f442) {
        return m153754x313753d6(interfaceC29574xdba85fae).mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super byte[]>) interfaceC29569x80e9f442);
    }

    /* renamed from: forJsonBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a m153750xd38bfe93(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae, org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<org.json.JSONObject> interfaceC29569x80e9f442) {
        return m153755x4e9c970d(interfaceC29574xdba85fae).mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super org.json.JSONObject>) interfaceC29569x80e9f442);
    }

    /* renamed from: forStringBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3 m153752xc5195efc(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae, org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<java.lang.String> interfaceC29569x80e9f442) {
        return m153756xd2666136(interfaceC29574xdba85fae).mo153714x45901f31((org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29569x80e9f442<? super java.lang.String>) interfaceC29569x80e9f442);
    }

    /* renamed from: newByteArrayCallback */
    private static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29567x9942d393 m153754x313753d6(final org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        return new org.p3343x72743996.net.p3356x3927bb2b.AbstractC29567x9942d393() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.1
            @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
            /* renamed from: shouldFollowRedirect */
            public boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
                return org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae.this.mo153734xe12ec340(abstractC29564x6974077e, str);
            }
        };
    }

    /* renamed from: newJsonCallback */
    private static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a m153755x4e9c970d(final org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        return new org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.3
            @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
            /* renamed from: shouldFollowRedirect */
            public boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
                return org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae.this.mo153734xe12ec340(abstractC29564x6974077e, str);
            }
        };
    }

    /* renamed from: newStringCallback */
    private static org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3 m153756xd2666136(final org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        return new org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3() { // from class: org.chromium.net.apihelpers.UrlRequestCallbacks.2
            @Override // org.p3343x72743996.net.p3356x3927bb2b.AbstractC29571x6b0776f
            /* renamed from: shouldFollowRedirect */
            public boolean mo49553xe12ec340(org.p3343x72743996.net.AbstractC29564x6974077e abstractC29564x6974077e, java.lang.String str) {
                return org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae.this.mo153734xe12ec340(abstractC29564x6974077e, str);
            }
        };
    }

    /* renamed from: forByteArrayBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<byte[], org.p3343x72743996.net.p3356x3927bb2b.AbstractC29567x9942d393> m153749x86da252a(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        org.p3343x72743996.net.p3356x3927bb2b.AbstractC29567x9942d393 m153754x313753d6 = m153754x313753d6(interfaceC29574xdba85fae);
        return new org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<>(m153747x2f62a439(m153754x313753d6), m153754x313753d6);
    }

    /* renamed from: forJsonBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<org.json.JSONObject, org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a> m153751xd38bfe93(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        org.p3343x72743996.net.p3356x3927bb2b.AbstractC29573xa643924a m153755x4e9c970d = m153755x4e9c970d(interfaceC29574xdba85fae);
        return new org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<>(m153747x2f62a439(m153755x4e9c970d), m153755x4e9c970d);
    }

    /* renamed from: forStringBody */
    public static org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<java.lang.String, org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3> m153753xc5195efc(org.p3343x72743996.net.p3356x3927bb2b.InterfaceC29574xdba85fae interfaceC29574xdba85fae) {
        org.p3343x72743996.net.p3356x3927bb2b.AbstractC29578x2a8741b3 m153756xd2666136 = m153756xd2666136(interfaceC29574xdba85fae);
        return new org.p3343x72743996.net.p3356x3927bb2b.C29580x19989a6e.CallbackAndResponseFuturePair<>(m153747x2f62a439(m153756xd2666136), m153756xd2666136);
    }
}
