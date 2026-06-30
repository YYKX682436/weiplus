package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewlifeOnLoader */
/* loaded from: classes8.dex */
public class C27452xd2a94f6e {

    /* renamed from: initialized */
    private static java.util.concurrent.atomic.AtomicBoolean f60275x498da6d4 = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: instance */
    private static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27452xd2a94f6e f60276x21169495 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27452xd2a94f6e();

    /* renamed from: getInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27452xd2a94f6e m116187x9cf0d20b() {
        return f60276x21169495;
    }

    /* renamed from: jniOnLoader */
    private native void m116188xbfb69197();

    /* renamed from: onLoader */
    public void m116189x4d8a06d2() {
        if (f60275x498da6d4.compareAndSet(false, true)) {
            try {
                m116188xbfb69197();
            } catch (java.lang.UnsatisfiedLinkError unused) {
            }
        }
    }

    /* renamed from: registerAffNewLifeExtraInfoManager */
    public <T> void m116190xa8945cad(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeExtraInfoManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeExtraInfoManagerInvoker"), cls);
    }

    /* renamed from: registerAffNewLifeFeedJumpInfoSummaryManager */
    public <T> void m116191xa7ef63bf(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeFeedJumpInfoSummaryManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeFeedJumpInfoSummaryManagerInvoker"), cls);
    }

    /* renamed from: registerAffNewLifeJumpInfoManager */
    public <T> void m116192xcc8b0e93(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeJumpInfoManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeJumpInfoManagerInvoker"), cls);
    }

    /* renamed from: registerAffNewLifeMentionManager */
    public <T> void m116193x1c21f5a1(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeMentionManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeMentionManagerInvoker"), cls);
    }

    /* renamed from: registerAffNewLifeMmkvManager */
    public <T> void m116194x98a873a4(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeMmkvManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeMmkvManagerInvoker"), cls);
    }

    /* renamed from: registerAffNewLifeSyncManager */
    public <T> void m116195x908cea14(java.lang.Class<T> cls) {
        com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27689xf4e8cef3.m119522x9cf0d20b().m119527xed9c37b3("newlife.AffNewLifeSyncManager@Get", java.lang.Class.forName("com.tencent.wechat.aff.newlife.AffNewLifeSyncManagerInvoker"), cls);
    }
}
