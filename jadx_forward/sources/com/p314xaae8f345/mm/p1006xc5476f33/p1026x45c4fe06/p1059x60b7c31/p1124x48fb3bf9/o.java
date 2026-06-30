package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public interface o extends ni1.f, gb1.l {
    @Override // gb1.l
    default void d(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("webviewId", hashCode());
        } catch (org.json.JSONException unused) {
        }
    }

    /* renamed from: getAndroidView */
    android.view.View mo51532x11b85c7e();

    /* renamed from: getCurrentUrl */
    java.lang.String mo51533xad58292c();

    /* renamed from: getWebView */
    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 mo51534x86b9ebe3();

    /* renamed from: post */
    boolean m51535x3498a0(java.lang.Runnable runnable);

    /* renamed from: setAndroidViewId */
    void mo51536x17e9a4ad(int i17);

    /* renamed from: setAudioMuted */
    void mo51537x77c16137(boolean z17);

    /* renamed from: setBizDomainList */
    void mo51538xe7e277b3(java.util.ArrayList arrayList);
}
