package com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.zrpc.ZIDL_c9_jRtgnKE */
/* loaded from: classes4.dex */
public class C27717x65d3290c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f301566a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_DI */
    private void m119678x1964d1cd(byte[] bArr, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f301566a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtChannelKE", "onReceiveEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("ExtChannelKE", "onReceiveEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(entry.getValue());
            throw null;
        }
    }
}
