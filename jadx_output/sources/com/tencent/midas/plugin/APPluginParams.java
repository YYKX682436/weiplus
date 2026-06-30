package com.tencent.midas.plugin;

/* loaded from: classes3.dex */
public class APPluginParams {
    public java.lang.String mApkFilePath;
    public java.lang.String mConponentName;
    public android.app.Dialog mDialog;
    public android.content.Intent mIntent;
    public java.lang.String mPluginName;
    int mPluginType;
    public java.lang.String mProgressTips;
    public java.lang.Class<?> mProxyActivityClass;
    public int mRequestCode = -1;
    public boolean mDialogDismissBySDK = true;
    public int mTimeOut = 10000;

    public APPluginParams(int i17) {
        this.mPluginType = i17;
    }
}
