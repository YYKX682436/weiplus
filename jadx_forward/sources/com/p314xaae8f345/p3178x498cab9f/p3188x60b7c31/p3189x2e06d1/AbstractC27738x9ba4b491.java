package com.p314xaae8f345.p3178x498cab9f.p3188x60b7c31.p3189x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0011\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0082 J!\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0082 J1\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0082 ¨\u0006\""}, d2 = {"Lcom/tencent/wemagic/jsapi/base/MBBizContext;", "Lcom/tencent/wemagic/common/api/IMBBizContext;", "<init>", "()V", "getPhysicalPath", "", com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "getInternalByte", "Landroid/graphics/Bitmap;", "internalPath", "isForeground", "", "provideActivity", "Landroid/app/Activity;", "sendEvent", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "onCallback", "callbackId", "", "errCode", "", "errMsg", "dataStr", "testEvaluateScript", "script", "callback", "Lcom/tencent/wemagic/common/api/IMBBizContext$EvaluateCallback;", "getIsForeground", "envId", "doSendEvent", "doCallback", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.tencent.wemagic.jsapi.base.MBBizContext */
/* loaded from: classes8.dex */
public abstract class AbstractC27738x9ba4b491 implements vw5.a {
    /* renamed from: doCallback */
    private final native void m119824xaff2d5f0(long envId, long callbackId, int errCode, java.lang.String errMsg, java.lang.String dataStr);

    /* renamed from: doSendEvent */
    private final native void m119825x8cca27a7(long envId, java.lang.String name, java.lang.String data);

    /* renamed from: getIsForeground */
    private final native boolean m119826x58a5f883(long envId);

    public void b(long j17, int i17, java.lang.String errMsg, java.lang.String dataStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataStr, "dataStr");
        m119824xaff2d5f0(a(), j17, i17, errMsg, dataStr);
    }
}
