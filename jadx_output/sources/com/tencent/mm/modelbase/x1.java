package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class x1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f70837d;

    public x1(com.tencent.mm.modelbase.r1 r1Var) {
        this.f70837d = r1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 r1Var = this.f70837d;
        boolean z17 = false;
        if (r1Var.f70777t == null) {
            return false;
        }
        r1Var.f70767g.size();
        r1Var.f70768h.size();
        boolean z18 = r1Var.f70771n;
        com.tencent.mm.modelbase.h2 h2Var = r1Var.f70777t;
        if (r1Var.f70779v && r1Var.f70767g.isEmpty() && r1Var.f70768h.isEmpty()) {
            z17 = true;
        }
        h2Var.o(r1Var, z17);
        return true;
    }
}
