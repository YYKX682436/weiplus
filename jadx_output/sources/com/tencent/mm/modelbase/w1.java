package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class w1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public long f70834d = 10;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70835e;

    public w1(com.tencent.mm.modelbase.r1 r1Var) {
        this.f70835e = r1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 r1Var = this.f70835e;
        if (r1Var.f70764d == null) {
            long j17 = this.f70834d;
            this.f70834d = j17 - 1;
            if (j17 > 0) {
                return true;
            }
        }
        r1Var.w(3);
        return false;
    }
}
