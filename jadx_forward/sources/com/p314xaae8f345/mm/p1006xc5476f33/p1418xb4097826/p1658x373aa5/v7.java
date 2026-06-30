package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class v7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d f214762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f214763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d, long j17) {
        super(0);
        this.f214762d = c15272xcb1f133d;
        this.f214763e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = this.f214762d;
        if (c15272xcb1f133d.getTotalCountDownMs() != 0) {
            c15272xcb1f133d.m61975xdf5f9861(this.f214763e);
            if (c15272xcb1f133d.getRemainTimeMs() < c15272xcb1f133d.getPreloadRemainMs()) {
                yz5.a countDownPreloadCallback = c15272xcb1f133d.getCountDownPreloadCallback();
                if (countDownPreloadCallback != null) {
                    countDownPreloadCallback.mo152xb9724478();
                }
                c15272xcb1f133d.m61974x46d50599(0L);
            }
            c15272xcb1f133d.c();
            if (c15272xcb1f133d.getTempWordingResId() != 0 && c15272xcb1f133d.getShowTempWordingUntilTime() != 0 && c15272xcb1f133d.getRemainTimeMs() < c15272xcb1f133d.getShowTempWordingUntilTime()) {
                yz5.a tempWordingFinishCallback = c15272xcb1f133d.getTempWordingFinishCallback();
                if (tempWordingFinishCallback != null) {
                    tempWordingFinishCallback.mo152xb9724478();
                }
                c15272xcb1f133d.m61976xe2f39ea6(0L);
            }
        }
        return jz5.f0.f384359a;
    }
}
