package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "base::android")
@org.p3343x72743996.p3353x59bc66e.p3354xc6ad7b24.InterfaceC29461x94c0977e
/* renamed from: org.chromium.base.metrics.NativeUmaRecorder */
/* loaded from: classes16.dex */
final class C29407xd63f6bf0 implements org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73539x7118e671 = false;

    /* renamed from: mNativeHints */
    private final java.util.Map<java.lang.String, java.lang.Long> f73540x11243a48 = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: mUserActionTestingCallbackNativePtrs */
    private java.util.Map<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String>, java.lang.Long> f73541xf297c5c3;

    /* renamed from: org.chromium.base.metrics.NativeUmaRecorder$Natives */
    /* loaded from: classes16.dex */
    public interface Natives {
        /* renamed from: addActionCallbackForTesting */
        long mo152906x35b785c3(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465);

        /* renamed from: createHistogramSnapshotForTesting */
        long mo152907xf9037bd3();

        /* renamed from: destroyHistogramSnapshotForTesting */
        void mo152908xa42c0e15(long j17);

        /* renamed from: getHistogramSamplesForTesting */
        long[] mo152909xfa151ce2(java.lang.String str);

        /* renamed from: getHistogramTotalCountForTesting */
        int mo152910x4ed4f60(java.lang.String str, long j17);

        /* renamed from: getHistogramValueCountForTesting */
        int mo152911x9298d993(java.lang.String str, int i17, long j17);

        /* renamed from: recordBooleanHistogram */
        long mo152912xa16fd08d(java.lang.String str, long j17, boolean z17);

        /* renamed from: recordExponentialHistogram */
        long mo152913x3de52390(java.lang.String str, long j17, int i17, int i18, int i19, int i27);

        /* renamed from: recordLinearHistogram */
        long mo152914xb3dbcb2e(java.lang.String str, long j17, int i17, int i18, int i19, int i27);

        /* renamed from: recordSparseHistogram */
        long mo152915xada41a93(java.lang.String str, long j17, int i17);

        /* renamed from: recordUserAction */
        void mo152916xf69de912(java.lang.String str, long j17);

        /* renamed from: removeActionCallbackForTesting */
        void mo152917x20084ca6(long j17);
    }

    /* renamed from: getNativeHint */
    private long m152904xa7417734(java.lang.String str) {
        java.lang.Long l17 = this.f73540x11243a48.get(str);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    /* renamed from: maybeUpdateNativeHint */
    private void m152905xa4198d6f(java.lang.String str, long j17, long j18) {
        if (j17 != j18) {
            this.f73540x11243a48.put(str, java.lang.Long.valueOf(j18));
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: addUserActionCallbackForTesting */
    public void mo152889xc22bdc2e(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465) {
        long mo152906x35b785c3 = org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152906x35b785c3(interfaceC29287xf9968465);
        if (this.f73541xf297c5c3 == null) {
            this.f73541xf297c5c3 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        }
        this.f73541xf297c5c3.put(interfaceC29287xf9968465, java.lang.Long.valueOf(mo152906x35b785c3));
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramSamplesForTesting */
    public java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e> mo152890xfa151ce2(java.lang.String str) {
        long[] mo152909xfa151ce2 = org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152909xfa151ce2(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(mo152909xfa151ce2.length);
        for (int i17 = 0; i17 < mo152909xfa151ce2.length; i17 += 3) {
            arrayList.add(new org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e((int) mo152909xfa151ce2[i17], mo152909xfa151ce2[i17 + 1], (int) mo152909xfa151ce2[i17 + 2]));
        }
        return arrayList;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramTotalCountForTesting */
    public int mo152891x4ed4f60(java.lang.String str) {
        return org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152910x4ed4f60(str, 0L);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: getHistogramValueCountForTesting */
    public int mo152892x9298d993(java.lang.String str, int i17) {
        return org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152911x9298d993(str, i17, 0L);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordBooleanHistogram */
    public void mo152893xa16fd08d(java.lang.String str, boolean z17) {
        long m152904xa7417734 = m152904xa7417734(str);
        m152905xa4198d6f(str, m152904xa7417734, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152912xa16fd08d(str, m152904xa7417734, z17));
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordExponentialHistogram */
    public void mo152894x3de52390(java.lang.String str, int i17, int i18, int i19, int i27) {
        long m152904xa7417734 = m152904xa7417734(str);
        m152905xa4198d6f(str, m152904xa7417734, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152913x3de52390(str, m152904xa7417734, i17, i18, i19, i27));
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordLinearHistogram */
    public void mo152895xb3dbcb2e(java.lang.String str, int i17, int i18, int i19, int i27) {
        long m152904xa7417734 = m152904xa7417734(str);
        m152905xa4198d6f(str, m152904xa7417734, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152914xb3dbcb2e(str, m152904xa7417734, i17, i18, i19, i27));
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordSparseHistogram */
    public void mo152896xada41a93(java.lang.String str, int i17) {
        long m152904xa7417734 = m152904xa7417734(str);
        m152905xa4198d6f(str, m152904xa7417734, org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152915xada41a93(str, m152904xa7417734, i17));
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: recordUserAction */
    public void mo152897xf69de912(java.lang.String str, long j17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152916xf69de912(str, org.p3343x72743996.p3344x2e06d1.C29369x7914a5c4.m152675x44870c2d() - j17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.InterfaceC29416x7559a087
    /* renamed from: removeUserActionCallbackForTesting */
    public void mo152898xf7287991(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465) {
        java.lang.Long remove;
        java.util.Map<org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String>, java.lang.Long> map = this.f73541xf297c5c3;
        if (map == null || (remove = map.remove(interfaceC29287xf9968465)) == null) {
            return;
        }
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29408x3e72f195.get().mo152917x20084ca6(remove.longValue());
    }
}
