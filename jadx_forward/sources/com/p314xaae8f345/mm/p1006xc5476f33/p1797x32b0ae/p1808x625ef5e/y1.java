package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class y1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 f225624a;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var) {
        this.f225624a = g1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225624a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib fail.errCode: %d, checkItem: %s.", java.lang.Integer.valueOf(i17), k2Var);
        if (k2Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).remove(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = k2Var.f225530b;
        if (currentTimeMillis - j17 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d || currentTimeMillis - j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception succ errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var.f225530b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var2 = this.f225624a;
        long j18 = k2Var.f225530b;
        long j19 = k2Var.f225533e;
        long j27 = k2Var.f225534f;
        g1Var2.O(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, currentTimeMillis - j18, j19 - j18, j27 - j19, currentTimeMillis - j27, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.f
    public void b(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef c3710x879b31ef, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var = this.f225624a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2) ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).get(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "checkLiteAppBaselib success.info: %s, checkItem: %s.", c3710x879b31ef, k2Var);
        if (k2Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) g1Var.f225484e).remove(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = k2Var.f225530b;
        if (currentTimeMillis - j17 > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d || currentTimeMillis - j17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteApp.LiteAppLogic", "Download liteapp exception succ errCode=%d start=%d now=%d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(k2Var.f225530b), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 g1Var2 = this.f225624a;
        long j18 = k2Var.f225530b;
        long j19 = k2Var.f225533e;
        long j27 = k2Var.f225534f;
        g1Var2.O(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466, currentTimeMillis - j18, j19 - j18, j27 - j19, currentTimeMillis - j27, 2);
        if (c3710x879b31ef == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.C16188x97149d60.class);
        intent.addFlags(268435456);
        intent.putExtra("task", "updateBaseLibPath");
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c3710x879b31ef.f14330x346425);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
    }
}
