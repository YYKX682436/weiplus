package com.tencent.midas.api;

/* loaded from: classes13.dex */
public interface APOnIabPurchaseFinished {
    void onIabPurchaseFinished(com.tencent.midas.api.request.APIabResult aPIabResult, com.tencent.midas.api.request.APPurchase aPPurchase);

    void onIabyNeedLogin();
}
