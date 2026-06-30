package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes15.dex */
public class y0 implements com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.j1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f219897a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f219898b = "";

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 f219899c;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var) {
        this.f219899c = b1Var;
    }

    public void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = this.f219899c;
        b1Var.f219781c = false;
        c();
        if (i17 == 12) {
            b1Var.f219780b.c(false, true, this.f219897a);
        } else {
            b1Var.f219780b.c(false, false, this.f219897a);
        }
    }

    public final void b() {
        if (this.f219897a.length() > 0) {
            this.f219897a = this.f219897a.replaceAll("。", " ").replaceAll("\\.", " ").replaceAll("，", " ").replaceAll(",", " ").trim();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = this.f219899c;
        b1Var.f219783e.setText(this.f219897a);
        b1Var.f219784f.setVisibility(0);
        b1Var.f219780b.b(this.f219897a);
    }

    public final void c() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.b1 b1Var = this.f219899c;
        b1Var.f219787i = currentTimeMillis;
        long j17 = b1Var.f219786h;
        if (j17 <= 0) {
            j17 = b1Var.f219787i;
        }
        b1Var.f219786h = j17;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219897a) ? 2 : 1;
        long j18 = b1Var.f219786h;
        long j19 = b1Var.f219785g;
        long j27 = j18 - j19;
        long j28 = b1Var.f219787i - j19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16346, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(o13.p.f423783c), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSVoiceInputHelper", "16346 actionType:%s, searchId:%s, voiceTime:%s, tranTime:%s", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(o13.p.f423783c), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28));
        b1Var.f219785g = 0L;
        b1Var.f219786h = 0L;
        b1Var.f219787i = 0L;
    }
}
