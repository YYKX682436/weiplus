package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class w1 implements al5.q1 {

    /* renamed from: a, reason: collision with root package name */
    public long f272235a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f272236b;

    public w1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f272236b = c19666xfd6e2f33;
    }

    public boolean a(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 66 || c01.id.c() - this.f272235a <= 1000 || !com.p314xaae8f345.mm.ui.bk.v0() || !com.p314xaae8f345.mm.ui.bk.y() || keyEvent.isAltPressed() || keyEvent.isCtrlPressed()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "KeyCode Enter");
        this.f272235a = c01.id.c();
        this.f272236b.f271560n.performClick();
        return true;
    }
}
