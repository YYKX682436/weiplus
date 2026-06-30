package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class u7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d f214693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d) {
        super(0);
        this.f214693d = c15272xcb1f133d;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d = this.f214693d;
        yz5.l countDownFinishCallback = c15272xcb1f133d.getCountDownFinishCallback();
        if (countDownFinishCallback != null) {
            if (c15272xcb1f133d.tempWordingResId != 0) {
                long j17 = c15272xcb1f133d.remainTimeMs;
                long j18 = c15272xcb1f133d.showTempWordingUntilTime;
                if (j17 > j18 && j18 != 0) {
                    z17 = true;
                    countDownFinishCallback.mo146xb9724478(java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            countDownFinishCallback.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        }
        c15272xcb1f133d.m61975xdf5f9861(0L);
        c15272xcb1f133d.c();
        return jz5.f0.f384359a;
    }
}
