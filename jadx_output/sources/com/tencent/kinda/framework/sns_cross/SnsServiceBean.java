package com.tencent.kinda.framework.sns_cross;

/* loaded from: classes9.dex */
public class SnsServiceBean {
    private java.lang.String mAppId;
    private int mChannel;
    private android.content.Context mContext;
    private com.tencent.mm.pluginsdk.wallet.PayInfo mPayInfo;
    private int mPayScene;
    private java.lang.String mReceiverName;
    private java.lang.String mReqKey;
    private java.lang.String mTrueName;

    public SnsServiceBean(android.content.Context context, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mReceiverName = "";
        this.mTrueName = "";
        this.mAppId = "";
        this.mPayInfo = payInfo;
        this.mContext = context;
        this.mReqKey = payInfo.f192114m;
        this.mChannel = payInfo.f192111g;
        this.mPayScene = payInfo.f192109e;
        android.os.Bundle bundle = payInfo.f192122u;
        if (bundle != null) {
            this.mReceiverName = bundle.getString("extinfo_key_1");
            this.mTrueName = payInfo.f192122u.getString("extinfo_key_2");
            this.mAppId = payInfo.f192122u.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        }
    }

    public java.lang.String getAppId() {
        return this.mAppId;
    }

    public int getChannel() {
        return this.mChannel;
    }

    public android.content.Context getContext() {
        return this.mContext;
    }

    public com.tencent.mm.pluginsdk.wallet.PayInfo getPayInfo() {
        return this.mPayInfo;
    }

    public int getPayScene() {
        return this.mPayScene;
    }

    public java.lang.String getReceiverName() {
        return this.mReceiverName;
    }

    public java.lang.String getReqKey() {
        return this.mReqKey;
    }

    public java.lang.String getTrueName() {
        return this.mTrueName;
    }

    public void setChannel(int i17) {
        this.mChannel = i17;
    }

    public void setContext(android.content.Context context) {
        this.mContext = context;
    }

    public void setPayInfo(com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this.mPayInfo = payInfo;
    }

    public void setPayScene(int i17) {
        this.mPayScene = i17;
    }

    public void setReceiverName(java.lang.String str) {
        this.mReceiverName = str;
    }

    public void setReqKey(java.lang.String str) {
        this.mReqKey = str;
    }

    public void setTrueName(java.lang.String str) {
        this.mTrueName = str;
    }
}
