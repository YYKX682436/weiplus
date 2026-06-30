package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class bb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f280034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar) {
        super(1);
        this.f280034d = dbVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar = this.f280034d;
        boolean z17 = false;
        if (dbVar.T6()) {
            if (it.getAction() == 0) {
                dbVar.f281973w = dbVar.l7(dbVar.W6().B, (int) it.getRawX(), (int) it.getRawY());
            }
            if (dbVar.f281973w) {
                dbVar.W6();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea W6 = dbVar.W6();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = W6.B;
                if (c21897x17252689 != null && c21897x17252689.E0() && W6.B.m79076x2e45158f()) {
                    z17 = true;
                }
            } else {
                z17 = dbVar.U6(it);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenChattingUIC", "dialogCanPullDown:   isDownInListViewArea:" + dbVar.f281973w + "  result:" + z17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenChattingUIC", "[+] dialogCanPullDown: pull down to dismiss was disabled by " + dbVar.getClass().getName() + '.');
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
