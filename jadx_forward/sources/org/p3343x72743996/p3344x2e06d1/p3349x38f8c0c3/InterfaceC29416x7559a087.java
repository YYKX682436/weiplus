package org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3;

@com.google.errorprone.annotations.DoNotMock("Use HistogramWatcher for histograms or UserActionTester for user actions instead.")
/* renamed from: org.chromium.base.metrics.UmaRecorder */
/* loaded from: classes16.dex */
public interface InterfaceC29416x7559a087 {
    /* renamed from: addUserActionCallbackForTesting */
    void mo152889xc22bdc2e(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465);

    /* renamed from: getHistogramSamplesForTesting */
    java.util.List<org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29405xc3d0544e> mo152890xfa151ce2(java.lang.String str);

    /* renamed from: getHistogramTotalCountForTesting */
    int mo152891x4ed4f60(java.lang.String str);

    /* renamed from: getHistogramValueCountForTesting */
    int mo152892x9298d993(java.lang.String str, int i17);

    /* renamed from: recordBooleanHistogram */
    void mo152893xa16fd08d(java.lang.String str, boolean z17);

    /* renamed from: recordExponentialHistogram */
    void mo152894x3de52390(java.lang.String str, int i17, int i18, int i19, int i27);

    /* renamed from: recordLinearHistogram */
    void mo152895xb3dbcb2e(java.lang.String str, int i17, int i18, int i19, int i27);

    /* renamed from: recordSparseHistogram */
    void mo152896xada41a93(java.lang.String str, int i17);

    /* renamed from: recordUserAction */
    void mo152897xf69de912(java.lang.String str, long j17);

    /* renamed from: removeUserActionCallbackForTesting */
    void mo152898xf7287991(org.p3343x72743996.p3344x2e06d1.InterfaceC29287xf9968465<java.lang.String> interfaceC29287xf9968465);
}
