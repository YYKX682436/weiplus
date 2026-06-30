package com.tencent.mm.app;

/* loaded from: classes13.dex */
public class r2 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.s2 f53746d;

    public r2(com.tencent.mm.app.s2 s2Var) {
        this.f53746d = s2Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.app.s2 s2Var = this.f53746d;
        if (s2Var.getHandler() != null) {
            s2Var.getHandler().post(new com.tencent.mm.app.q2(this, str));
        } else {
            s2Var.onAppBackground(str);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.app.s2 s2Var = this.f53746d;
        if (s2Var.getHandler() != null) {
            s2Var.getHandler().post(new com.tencent.mm.app.p2(this, str));
        } else {
            s2Var.onAppForeground(str);
        }
    }
}
