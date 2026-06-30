package com.tencent.midas.jsbridge;

/* loaded from: classes13.dex */
public interface IAPWebPage {
    void initHead(android.app.Activity activity, java.lang.String str, java.lang.String str2);

    void initUI(android.app.Activity activity);

    void loadUrl(java.lang.String str);

    void toPureH5Pay(android.app.Activity activity, com.tencent.midas.api.request.APMidasBaseRequest aPMidasBaseRequest);

    void updateWebViewSize(java.lang.String str);
}
