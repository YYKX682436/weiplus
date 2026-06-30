package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class n7 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 f289434b;

    public n7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var) {
        this.f289434b = q7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 a(android.database.Cursor cursor, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 w7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7();
        java.lang.String string = cursor.getString(c(cursor, dm.i4.f66875xa013b0d5));
        long j17 = cursor.getLong(c(cursor, "conversationTime"));
        w7Var.f289754d = j17;
        if (j17 == 0) {
            w7Var.f289754d = cursor.getLong(c(cursor, "flag")) & 72057594037927935L;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(string)) {
            w7Var.f289755e = 1;
        } else {
            w7Var.f289755e = 0;
        }
        return w7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7
    public android.database.Cursor d() {
        return this.f289434b.f289556q.j();
    }
}
