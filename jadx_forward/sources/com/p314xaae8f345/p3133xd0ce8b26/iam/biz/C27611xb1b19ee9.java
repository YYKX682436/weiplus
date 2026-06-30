package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eKE */
/* loaded from: classes11.dex */
public class C27611xb1b19ee9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299267a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299268b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_NI */
    private void m118194x1964d303(byte[][] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEvent size: " + this.f299267a.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f299267a.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.n1 n1Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.n1) entry.getValue();
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.o(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p) n1Var).f236038a, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.e6.f454570f, bArr)));
        }
    }

    /* renamed from: ZIDL_PI */
    private void m118195x1964d341(byte[][] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEvent size: " + this.f299268b.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : this.f299268b.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o1 o1Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o1) entry.getValue();
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.q(((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.r) o1Var).f236058a, com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119629xd40dd8d(r45.s5.f467041o, bArr)));
        }
    }
}
