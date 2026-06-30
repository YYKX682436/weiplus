package df2;

/* loaded from: classes3.dex */
public final class i7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f311916d;

    public i7(df2.s8 s8Var) {
        this.f311916d = s8Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        df2.s8 s8Var = this.f311916d;
        if (itemId == s8Var.f312846x0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancelTaskManual] taskId:");
            r45.e84 e84Var = s8Var.f312840s;
            sb6.append(e84Var != null ? e84Var.m75945x2fec8307(5) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, sb6.toString());
            if (zl2.r4.f555483a.y1(s8Var.getStore().getLiveRoomData())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(s8Var, null, null, new df2.m7(s8Var, null), 3, null);
            }
        }
    }
}
