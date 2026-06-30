package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class w7 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d f214819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15272xcb1f133d c15272xcb1f133d) {
        super(j17, 1000L);
        this.f214819a = c15272xcb1f133d;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u7(this.f214819a));
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v7(this.f214819a, j17));
    }
}
