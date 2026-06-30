package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.aff.ZIDL_SoYkO8DQKE */
/* loaded from: classes15.dex */
public class C27118x24ce4d66 {
    private static final java.lang.String TAG = "IlinkAuthKeeperKE";

    /* renamed from: requireAuthCodeEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequireAuthCodeEvent> f59253x680222bc = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: uploadLogCompleteEventMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.UploadLogCompleteEvent> f59254x10f8785e = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: ZIDL_CI */
    private void m110610x1964d1ae() {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequireAuthCodeEvent size: " + this.f59253x680222bc.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequireAuthCodeEvent> entry : this.f59253x680222bc.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onRequireAuthCodeEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().mo109168x5c6729a();
        }
    }

    /* renamed from: ZIDL_KI */
    private void m110611x1964d2a6(int i17) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onUploadLogCompleteEvent size: " + this.f59254x10f8785e.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry<java.lang.String, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.UploadLogCompleteEvent> entry : this.f59254x10f8785e.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a(TAG, "onUploadLogCompleteEven name: " + entry.getKey(), new java.lang.Object[0]);
            entry.getValue().m109170x5c6729a(i17);
        }
    }

    /* renamed from: subscribeRequireAuthCodeEvent */
    public void m110612x3a3a82ea(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.RequireAuthCodeEvent requireAuthCodeEvent) {
        this.f59253x680222bc.put(str, requireAuthCodeEvent);
    }

    /* renamed from: subscribeUploadLogCompleteEvent */
    public void m110613xbc126e08(java.lang.String str, com.p314xaae8f345.p3133xd0ce8b26.aff.C27070x2602fedd.UploadLogCompleteEvent uploadLogCompleteEvent) {
        this.f59254x10f8785e.put(str, uploadLogCompleteEvent);
    }

    /* renamed from: unsubscribeRequireAuthCodeEvent */
    public void m110614x12cfc6f1(java.lang.String str) {
        this.f59253x680222bc.remove(str);
    }

    /* renamed from: unsubscribeUploadLogCompleteEvent */
    public void m110615xc466cc4f(java.lang.String str) {
        this.f59254x10f8785e.remove(str);
    }
}
