package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes4.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.u f276817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.p2621x8fb0427b.u uVar) {
        super(0);
        this.f276817d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.u uVar = this.f276817d;
        uVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l75.k0 k0Var = uVar.f276877d;
        android.database.Cursor B = k0Var.B("SELECT count(*) FROM BizAdInfo", null);
        if (B != null) {
            r4 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        if (r4 > 100) {
            java.lang.String format = java.lang.String.format("DELETE FROM %s WHERE %s IN ( SELECT %s FROM %s ORDER BY %s LIMIT %d )", java.util.Arrays.copyOf(new java.lang.Object[]{"BizAdInfo", "aId", "aId", "BizAdInfo", "exposeTime", 50}, 6));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            k0Var.A("BizAdInfo", format);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizAdInfoStorage", "deleteTooOldData delete cost: %d, count: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(r4));
        }
        return jz5.f0.f384359a;
    }
}
