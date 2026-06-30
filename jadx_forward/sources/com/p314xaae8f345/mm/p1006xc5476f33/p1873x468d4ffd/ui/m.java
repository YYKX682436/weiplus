package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public final class m implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 f230898a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908) {
        this.f230898a = c16548x9f1d7908;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b2
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMMSightRecordButton", "onProgressFinish >> progress is reach maxProgress");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16548x9f1d7908 c16548x9f1d7908 = this.f230898a;
        c16548x9f1d7908.H = currentTimeMillis;
        if (!(c16548x9f1d7908.f230695u && currentTimeMillis - c16548x9f1d7908.G >= 1500)) {
            c16548x9f1d7908.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.l(c16548x9f1d7908, z17));
            return;
        }
        c16548x9f1d7908.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.b2 b2Var = c16548x9f1d7908.F;
        if (b2Var != null) {
            b2Var.a(z17);
        }
    }
}
