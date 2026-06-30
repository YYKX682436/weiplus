package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager */
/* loaded from: classes16.dex */
public class C27541x2afe7f26 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26 f60526x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26();

    /* renamed from: jniCaller */
    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27552xdcf974a9 f60527x3163df90 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27552xdcf974a9();

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager$UploadMediaToStatusCDNCallback */
    /* loaded from: classes16.dex */
    public interface UploadMediaToStatusCDNCallback {
        /* renamed from: complete */
        void m117428xdc453139(bw5.rr0 rr0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager$getRecommendIconsByImageCallback */
    /* loaded from: classes16.dex */
    public interface getRecommendIconsByImageCallback {
        /* renamed from: complete */
        void m117429xdc453139(bw5.qo0 qo0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager$getTextStatusReadListUsersCallback */
    /* loaded from: classes16.dex */
    public interface getTextStatusReadListUsersCallback {
        /* renamed from: complete */
        void m117430xdc453139(bw5.lo0 lo0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager$requestTextStatusDetailReadCallback */
    /* loaded from: classes16.dex */
    public interface requestTextStatusDetailReadCallback {
        /* renamed from: complete */
        void m117431xdc453139(bw5.no0 no0Var);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleCgiManager$uploadAndGetRecommendIconsCallback */
    /* loaded from: classes16.dex */
    public interface uploadAndGetRecommendIconsCallback {
        /* renamed from: complete */
        void m117432xdc453139(bw5.pr0 pr0Var);
    }

    private C27541x2afe7f26() {
        this.f60636x11bb50fe = "status.StatusModuleCgiManager@Get";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_feat_status", "aff_biz");
        this.f60527x3163df90.m117525xdcf974a1(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26 m117421xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return m117422x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26 m117422x9cf0d20b() {
        return f60526x21169495;
    }

    /* renamed from: getRecommendIconsByImageAsync */
    public void m117423x771cc6c(bw5.oo0 oo0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26.getRecommendIconsByImageCallback getrecommendiconsbyimagecallback) {
        this.f60527x3163df90.m117520x1964d17d(this.f60634xf042a733, getrecommendiconsbyimagecallback, oo0Var.m75963xebb06ba0());
    }

    /* renamed from: getTextStatusReadListUsersAsync */
    public void m117424x40089c1d(bw5.jo0 jo0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26.getTextStatusReadListUsersCallback gettextstatusreadlistuserscallback) {
        this.f60527x3163df90.m117524x1964d1f9(this.f60634xf042a733, gettextstatusreadlistuserscallback, jo0Var.m75963xebb06ba0());
    }

    /* renamed from: requestTextStatusDetailReadAsync */
    public void m117425xbd26f3e7(bw5.mo0 mo0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26.requestTextStatusDetailReadCallback requesttextstatusdetailreadcallback) {
        this.f60527x3163df90.m117523x1964d1da(this.f60634xf042a733, requesttextstatusdetailreadcallback, mo0Var.m75963xebb06ba0());
    }

    /* renamed from: uploadAndGetRecommendIconsAsync */
    public void m117426x2e3d2dde(bw5.or0 or0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26.uploadAndGetRecommendIconsCallback uploadandgetrecommendiconscallback) {
        this.f60527x3163df90.m117521x1964d19c(this.f60634xf042a733, uploadandgetrecommendiconscallback, or0Var.m75963xebb06ba0());
    }

    /* renamed from: uploadMediaToStatusCDNAsync */
    public void m117427x1753dc3f(bw5.qr0 qr0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27541x2afe7f26.UploadMediaToStatusCDNCallback uploadMediaToStatusCDNCallback) {
        this.f60527x3163df90.m117522x1964d1bb(this.f60634xf042a733, uploadMediaToStatusCDNCallback, qr0Var.m75963xebb06ba0());
    }
}
