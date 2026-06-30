package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90;

/* renamed from: com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant */
/* loaded from: classes13.dex */
public class C26701x53b1f632 {

    /* renamed from: ACTION_TYPE_APP_DETAIL */
    public static final int f56280xd733fa6b = 2;

    /* renamed from: ACTION_TYPE_AUTHORIZED */
    public static final int f56281xaed763b7 = 3;

    /* renamed from: ACTION_TYPE_DOWNLOAD_TASKLIST */
    public static final int f56282x9e4043de = 1;

    /* renamed from: ACTION_TYPE_RELATE */
    public static final int f56283x322b3375 = 4;

    /* renamed from: ACTION_TYPE_WEBVIEW */
    public static final int f56284x1b36db3d = 5;

    /* renamed from: BATCH_REQUEST_TYPE_GET_STATE */
    public static final int f56285x2892c9f8 = 3;

    /* renamed from: BATCH_REQUEST_TYPE_PAUSE_ALL */
    public static final int f56286xdf21c768 = 6;

    /* renamed from: BATCH_REQUEST_TYPE_PAUSE_SPECIFIED_APPS */
    public static final int f56287x35e8f77a = 8;

    /* renamed from: BATCH_REQUEST_TYPE_RESUME_ALL */
    public static final int f56288xe50bbc9f = 5;

    /* renamed from: BATCH_REQUEST_TYPE_RESUME_SPECIFIED_APPS */
    public static final int f56289x3ece69e3 = 7;

    /* renamed from: BATCH_REQUEST_TYPE_SHOW_ALL */
    public static final int f56290xc830b76f = 2;

    /* renamed from: BATCH_REQUEST_TYPE_START_ALL */
    public static final int f56291x2ec74fd4 = 1;

    /* renamed from: BATCH_REQUEST_TYPE_START_SPECIFIED_APPS */
    public static final int f56292xbbf0338e = 4;

    /* renamed from: CRYPT_KEY */
    protected static final java.lang.String f56293x563bfce = "ji*9^&43U0X-~./(";

    /* renamed from: DOWNLOADSTATECHANGED_RECEIVERPERMISSION */
    public static final java.lang.String f56294xf6e1c32 = "com.tencent.qqdownloader.stateChangedReceiverPermission";

    /* renamed from: EXTRA_ERROR_CODE */
    public static final java.lang.String f56295xe7a05993 = "errorCode";

    /* renamed from: EXTRA_ERROR_MSG */
    public static final java.lang.String f56296xc5686afb = "errorMsg";

    /* renamed from: EXTRA_HOST_PAGECKAGENAME */
    public static final java.lang.String f56297x2269af2b = "hostPackageName";

    /* renamed from: EXTRA_HOST_VERSION */
    public static final java.lang.String f56298x20e8c910 = "hostVersion";

    /* renamed from: EXTRA_SNGAPPID */
    public static final java.lang.String f56299x6a713c7f = "sngAppId";

    /* renamed from: EXTRA_STATE */
    public static final java.lang.String f56300x1cc21762 = "state";

    /* renamed from: EXTRA_TASK_APKID */
    public static final java.lang.String f56301x838f48c = "taskApkId";

    /* renamed from: EXTRA_TASK_APPID */
    public static final java.lang.String f56302x8390751 = "taskAppId";

    /* renamed from: EXTRA_TASK_ID */
    public static final java.lang.String f56303xa0de8c6 = "taskId";

    /* renamed from: EXTRA_TASK_PACKAGENAME */
    public static final java.lang.String f56304xd1b84066 = "taskPackageName";

    /* renamed from: EXTRA_TASK_VERSION */
    public static final java.lang.String f56305x2252dbed = "taskVersion";

    /* renamed from: EXTRA_UIN */
    public static final java.lang.String f56306x97129b6b = "uin";

    /* renamed from: EXTRA_UINTYPE */
    public static final java.lang.String f56307x4c587525 = "uinType";

    /* renamed from: EXTRA_VIA */
    public static final java.lang.String f56308x97129f1f = "via";

    /* renamed from: OPENSDK_ACTION_NAME */
    public static final java.lang.String f56309x1a3b36c5 = "com.tencent.assistantOpenSDK.downloadStateChange.action";

    /* renamed from: STATE_CHANGED_PARAM */
    public static final java.lang.String f56310x5bb4b7b4 = "stateChangedParam";

    /* renamed from: decryptUri */
    public static java.lang.String m105047x7b256c9f(java.lang.String str) {
        return new java.lang.String(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105153x5bf1598d(com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.m105458xb06291ee(str, 0), f56293x563bfce.getBytes()));
    }

    /* renamed from: encryptUri */
    public static java.lang.String m105048xa5d6c4c7(java.lang.String str) {
        return com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26775x762c896f.m105463xa74a7ea2(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105154xa0333265(str.getBytes(), f56293x563bfce.getBytes()), 0);
    }

    /* renamed from: sendDownloadStateChanged */
    public static void m105049x1034a133(android.content.Context context, java.util.Map<java.lang.String, java.lang.String> map) {
        android.content.Intent intent = new android.content.Intent(f56309x1a3b36c5);
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            intent.putExtra(entry.getKey(), entry.getValue());
        }
        context.sendBroadcast(intent);
    }
}
