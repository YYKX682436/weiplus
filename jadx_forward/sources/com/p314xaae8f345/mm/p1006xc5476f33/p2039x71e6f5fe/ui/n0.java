package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes8.dex */
public class n0 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o0 f241127a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o0 o0Var) {
        this.f241127a = o0Var;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.o0 o0Var = this.f241127a;
        long longExtra = o0Var.f241132a.getIntent().getLongExtra("key_favorite_local_id", -1L);
        am.w3 w3Var = c5296x2dd9a53.f135617g;
        w3Var.f89791a = longExtra;
        w3Var.f89793c = 10;
        c5296x2dd9a53.e();
        long j17 = w3Var.f89791a;
        am.x3 x3Var = c5296x2dd9a53.f135618h;
        boolean z17 = x3Var.f89876a;
        if (x3Var.f89876a) {
            o0Var.f241132a.finish();
        }
    }
}
