package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class q1 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 f219850a;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722) {
        this.f219850a = abstractC15625xeb0f7722;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219850a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0 y0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) abstractC15625xeb0f7722.f219764d;
        y0Var.getClass();
        if (strArr != null && strArr.length > 0 && strArr[0].length() > 0) {
            y0Var.f219897a = strArr[0];
            y0Var.b();
        }
        if (list != null && !list.isEmpty() && list.iterator().hasNext()) {
            y0Var.f219898b = (java.lang.String) list.iterator().next();
        }
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(0);
        abstractC15625xeb0f7722.f219771n.mo50307xb9e94560(0, abstractC15625xeb0f7722.f219768h);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219850a;
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(0);
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(1);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0 y0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y0) abstractC15625xeb0f7722.f219764d;
        y0Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = y0Var.f219899c;
        b1Var.f219781c = false;
        y0Var.b();
        b1Var.f219784f.setVisibility(8);
        b1Var.f219780b.a(y0Var.f219898b, y0Var.f219897a);
        y0Var.f219897a = "";
        y0Var.f219898b = "";
        abstractC15625xeb0f7722.k(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219850a;
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(0);
        abstractC15625xeb0f7722.f219771n.mo50303x856b99f0(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        abstractC15625xeb0f7722.f219772o.mo50308x2936bf5f(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.AbstractC15625xeb0f7722 abstractC15625xeb0f7722 = this.f219850a;
        int i17 = abstractC15625xeb0f7722.f219766f;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = abstractC15625xeb0f7722.f219773p;
        if (b4Var != null) {
            b4Var.d();
        }
        abstractC15625xeb0f7722.f219772o.mo50305x3d8a09a2(0);
    }
}
