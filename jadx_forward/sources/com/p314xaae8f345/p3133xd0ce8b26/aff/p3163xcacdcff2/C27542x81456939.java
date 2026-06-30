package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.StatusModuleReadManager */
/* loaded from: classes16.dex */
public class C27542x81456939 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27693x374ea533 {

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939 f60528x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939();

    /* renamed from: jniCaller */
    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27553xecf51036 f60529x3163df90 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27553xecf51036();

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleReadManager$getStatusReadListCallback */
    /* loaded from: classes16.dex */
    public interface getStatusReadListCallback {
        /* renamed from: complete */
        void m117440xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d c27512xba466e9d);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleReadManager$insertReadRecordCallback */
    /* loaded from: classes16.dex */
    public interface insertReadRecordCallback {
        /* renamed from: complete */
        void m117441xdc453139(boolean z17);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleReadManager$markStatusReadCallback */
    /* loaded from: classes8.dex */
    public interface markStatusReadCallback {
        /* renamed from: complete */
        void mo117442xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 c27514xcee7dad6);
    }

    /* renamed from: com.tencent.wechat.aff.status.StatusModuleReadManager$readReadRecordListFromDBCallback */
    /* loaded from: classes16.dex */
    public interface readReadRecordListFromDBCallback {
        /* renamed from: complete */
        void m117443xdc453139(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27512xba466e9d c27512xba466e9d);
    }

    private C27542x81456939() {
        this.f60636x11bb50fe = "status.StatusModuleReadManager@Get";
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27694xfbd655d7.m119551x9cf0d20b().m119552xeb57c8f5("iam_feat_status", "aff_biz");
        this.f60529x3163df90.m117536xecf5102e(this, this.f60636x11bb50fe, this.f60638xc2e4ffd6);
    }

    /* renamed from: buildZidlObjForHolder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939 m117434xa74f78c3(java.lang.String str, java.lang.String str2, long j17) {
        return m117435x9cf0d20b();
    }

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939 m117435x9cf0d20b() {
        return f60528x21169495;
    }

    /* renamed from: getStatusReadListAsync */
    public void m117436x8f6e7980(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27511x587cdcb3 c27511x587cdcb3, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.getStatusReadListCallback getstatusreadlistcallback) {
        this.f60529x3163df90.m117533x1964d19c(this.f60634xf042a733, getstatusreadlistcallback, c27511x587cdcb3.m75963xebb06ba0());
    }

    /* renamed from: insertReadRecordAsync */
    public void m117437xbb38513c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27544x21b1b2e4 c27544x21b1b2e4, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.insertReadRecordCallback insertreadrecordcallback) {
        this.f60529x3163df90.m117535x1964d1da(this.f60634xf042a733, insertreadrecordcallback, c27544x21b1b2e4.m75963xebb06ba0());
    }

    /* renamed from: markStatusReadAsync */
    public void m117438x94270427(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a c27513xfe50855a, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.markStatusReadCallback markstatusreadcallback) {
        this.f60529x3163df90.m117532x1964d17d(this.f60634xf042a733, markstatusreadcallback, c27513xfe50855a.m75963xebb06ba0());
    }

    /* renamed from: readReadRecordListFromDBAsync */
    public void m117439xf63350b9(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27511x587cdcb3 c27511x587cdcb3, com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27542x81456939.readReadRecordListFromDBCallback readreadrecordlistfromdbcallback) {
        this.f60529x3163df90.m117534x1964d1bb(this.f60634xf042a733, readreadrecordlistfromdbcallback, c27511x587cdcb3.m75963xebb06ba0());
    }
}
