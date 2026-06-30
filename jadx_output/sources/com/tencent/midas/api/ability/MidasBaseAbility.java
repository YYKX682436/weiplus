package com.tencent.midas.api.ability;

/* loaded from: classes13.dex */
public abstract class MidasBaseAbility extends com.tencent.midas.api.request.APMidasBaseRequest implements com.tencent.midas.api.ability.IMidasAbility {
    public static final java.lang.String BUNDLE_PREFIX = "__midas_ability_baseReq__";
    public java.lang.String configs;
    public java.lang.String offerId;
    public java.lang.String openId;
    public java.lang.String openKey;
    public java.lang.String others;

    /* renamed from: pf, reason: collision with root package name */
    public java.lang.String f53139pf;
    public java.lang.String pfKey;
    public java.lang.String postBack;
    public java.lang.String sessionId;
    public java.lang.String sessionType;

    public void fromBundle(android.os.Bundle bundle) {
        this.offerId = bundle.getString("__midas_ability_baseReq__offerId");
        this.openId = bundle.getString("__midas_ability_baseReq__openId");
        this.openKey = bundle.getString("__midas_ability_baseReq__openKey");
        this.sessionId = bundle.getString("__midas_ability_baseReq__sessionId");
        this.sessionType = bundle.getString("__midas_ability_baseReq__sessionType");
        this.f53139pf = bundle.getString("__midas_ability_baseReq__pf");
        this.pfKey = bundle.getString("__midas_ability_baseReq__pfKey");
        this.configs = bundle.getString("__midas_ability_baseReq__configs");
        this.postBack = bundle.getString("__midas_ability_baseReq__postBack");
        this.others = bundle.getString("__midas_ability_baseReq__others");
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("__midas_ability_baseReq__ClassSimpleName", getClass().getSimpleName());
        bundle.putString("__midas_ability_baseReq__offerId", this.offerId);
        bundle.putString("__midas_ability_baseReq__openId", this.openId);
        bundle.putString("__midas_ability_baseReq__openKey", this.openKey);
        bundle.putString("__midas_ability_baseReq__sessionId", this.sessionId);
        bundle.putString("__midas_ability_baseReq__sessionType", this.sessionType);
        bundle.putString("__midas_ability_baseReq__pf", this.f53139pf);
        bundle.putString("__midas_ability_baseReq__pfKey", this.pfKey);
        bundle.putString("__midas_ability_baseReq__configs", this.configs);
        bundle.putString("__midas_ability_baseReq__postBack", this.postBack);
        bundle.putString("__midas_ability_baseReq__others", this.others);
        return bundle;
    }

    public java.lang.String toString() {
        return "offerId=" + this.offerId + "|openKey=******|openKey=" + this.openKey + "|sessionId=" + this.sessionId + "|sessionType=" + this.sessionType + "|pf=" + this.f53139pf + "|pfKey=" + this.pfKey + "|configs=" + this.configs + "|postBack=" + this.postBack + "|others=" + this.others;
    }
}
