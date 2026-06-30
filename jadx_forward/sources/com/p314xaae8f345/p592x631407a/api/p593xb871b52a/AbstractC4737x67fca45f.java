package com.p314xaae8f345.p592x631407a.api.p593xb871b52a;

/* renamed from: com.tencent.midas.api.ability.MidasBaseAbility */
/* loaded from: classes13.dex */
public abstract class AbstractC4737x67fca45f extends com.p314xaae8f345.p592x631407a.api.p594x414ef28f.AbstractC4741xef9abf3 implements com.p314xaae8f345.p592x631407a.api.p593xb871b52a.InterfaceC4735xc6089e39 {

    /* renamed from: BUNDLE_PREFIX */
    public static final java.lang.String f20152x7f8dc8ef = "__midas_ability_baseReq__";

    /* renamed from: configs */
    public java.lang.String f20153x38b0e571;

    /* renamed from: offerId */
    public java.lang.String f20154xa3aefc97;

    /* renamed from: openId */
    public java.lang.String f20155xc3c3c505;

    /* renamed from: openKey */
    public java.lang.String f20156xb4b4e3b5;

    /* renamed from: others */
    public java.lang.String f20157xc3fd6363;

    /* renamed from: pf, reason: collision with root package name */
    public java.lang.String f134672pf;

    /* renamed from: pfKey */
    public java.lang.String f20158x659cc89;

    /* renamed from: postBack */
    public java.lang.String f20159x2d16c1a7;

    /* renamed from: sessionId */
    public java.lang.String f20160x243a3e51;

    /* renamed from: sessionType */
    public java.lang.String f20161xfea94af0;

    /* renamed from: fromBundle */
    public void mo41424x63aa4ccc(android.os.Bundle bundle) {
        this.f20154xa3aefc97 = bundle.getString("__midas_ability_baseReq__offerId");
        this.f20155xc3c3c505 = bundle.getString("__midas_ability_baseReq__openId");
        this.f20156xb4b4e3b5 = bundle.getString("__midas_ability_baseReq__openKey");
        this.f20160x243a3e51 = bundle.getString("__midas_ability_baseReq__sessionId");
        this.f20161xfea94af0 = bundle.getString("__midas_ability_baseReq__sessionType");
        this.f134672pf = bundle.getString("__midas_ability_baseReq__pf");
        this.f20158x659cc89 = bundle.getString("__midas_ability_baseReq__pfKey");
        this.f20153x38b0e571 = bundle.getString("__midas_ability_baseReq__configs");
        this.f20159x2d16c1a7 = bundle.getString("__midas_ability_baseReq__postBack");
        this.f20157xc3fd6363 = bundle.getString("__midas_ability_baseReq__others");
    }

    /* renamed from: toBundle */
    public android.os.Bundle mo41425x792022dd() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("__midas_ability_baseReq__ClassSimpleName", getClass().getSimpleName());
        bundle.putString("__midas_ability_baseReq__offerId", this.f20154xa3aefc97);
        bundle.putString("__midas_ability_baseReq__openId", this.f20155xc3c3c505);
        bundle.putString("__midas_ability_baseReq__openKey", this.f20156xb4b4e3b5);
        bundle.putString("__midas_ability_baseReq__sessionId", this.f20160x243a3e51);
        bundle.putString("__midas_ability_baseReq__sessionType", this.f20161xfea94af0);
        bundle.putString("__midas_ability_baseReq__pf", this.f134672pf);
        bundle.putString("__midas_ability_baseReq__pfKey", this.f20158x659cc89);
        bundle.putString("__midas_ability_baseReq__configs", this.f20153x38b0e571);
        bundle.putString("__midas_ability_baseReq__postBack", this.f20159x2d16c1a7);
        bundle.putString("__midas_ability_baseReq__others", this.f20157xc3fd6363);
        return bundle;
    }

    /* renamed from: toString */
    public java.lang.String mo41426x9616526c() {
        return "offerId=" + this.f20154xa3aefc97 + "|openKey=******|openKey=" + this.f20156xb4b4e3b5 + "|sessionId=" + this.f20160x243a3e51 + "|sessionType=" + this.f20161xfea94af0 + "|pf=" + this.f134672pf + "|pfKey=" + this.f20158x659cc89 + "|configs=" + this.f20153x38b0e571 + "|postBack=" + this.f20159x2d16c1a7 + "|others=" + this.f20157xc3fd6363;
    }
}
