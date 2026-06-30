package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class o7 extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 f289478b;

    public o7(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q7 q7Var) {
        this.f289478b = q7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 a(android.database.Cursor cursor, int i17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7 w7Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w7();
        w7Var.f289754d = cursor.getLong(c(cursor, "lastMsgTime"));
        if ((cursor.getLong(c(cursor, "flag")) & 4611686018427387904L) != 0) {
            w7Var.f289755e = 1;
        } else {
            w7Var.f289755e = 0;
        }
        return w7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.t7
    public android.database.Cursor d() {
        return this.f289478b.f289557r.j();
    }
}
