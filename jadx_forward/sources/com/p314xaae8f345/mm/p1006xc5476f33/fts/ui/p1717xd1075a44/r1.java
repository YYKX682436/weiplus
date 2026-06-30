package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class r1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 f219853a;

    public r1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722) {
        this.f219853a = abstractC15625xeb0f7722;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219853a;
        if (i17 == 0) {
            if (abstractC15625xeb0f7722.f219766f != 2) {
                return;
            }
            abstractC15625xeb0f7722.f219766f = 3;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = abstractC15625xeb0f7722.f219771n;
            n3Var.mo50303x856b99f0(0);
            n3Var.mo50307xb9e94560(0, abstractC15625xeb0f7722.f219768h);
            n3Var.mo50307xb9e94560(1, abstractC15625xeb0f7722.f219769i);
            abstractC15625xeb0f7722.e(false);
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.os.Bundle data = message.getData();
        int i18 = data.getInt("localCode");
        int i19 = data.getInt("errType");
        int i27 = data.getInt("errCode");
        abstractC15625xeb0f7722.f219766f = 1;
        abstractC15625xeb0f7722.j();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var = abstractC15625xeb0f7722.f219764d;
        if (u1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) u1Var).a(i18, i19, i27);
        }
    }
}
