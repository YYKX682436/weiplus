package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class w1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f152367d = 10;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.r1 f152368e;

    public w1(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var) {
        this.f152368e = r1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = this.f152368e;
        if (r1Var.f152297d == null) {
            long j17 = this.f152367d;
            this.f152367d = j17 - 1;
            if (j17 > 0) {
                return true;
            }
        }
        r1Var.w(3);
        return false;
    }
}
