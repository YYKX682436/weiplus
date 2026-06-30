package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class n0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 f260571d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9) {
        super(false);
        this.f260571d = viewOnLayoutChangeListenerC19048x56ebf0e9;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9 = this.f260571d;
        java.lang.String m83183xfb85ada3 = viewOnLayoutChangeListenerC19048x56ebf0e9.f260419g.m83183xfb85ada3();
        int o17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().o();
        java.lang.String obj = viewOnLayoutChangeListenerC19048x56ebf0e9.f260416d.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m83183xfb85ada3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            return;
        }
        viewOnLayoutChangeListenerC19048x56ebf0e9.m83105x7498fe14().putString("key_identity", m83183xfb85ada3);
        viewOnLayoutChangeListenerC19048x56ebf0e9.m83105x7498fe14().putInt("key_id_type", o17);
        viewOnLayoutChangeListenerC19048x56ebf0e9.m83105x7498fe14().putString("key_true_name", obj);
        if (viewOnLayoutChangeListenerC19048x56ebf0e9.m83108x2b5a5a39() != null) {
            viewOnLayoutChangeListenerC19048x56ebf0e9.m83108x2b5a5a39().f295334c.putString("key_identity", m83183xfb85ada3);
            viewOnLayoutChangeListenerC19048x56ebf0e9.m83108x2b5a5a39().f295334c.putInt("key_id_type", o17);
            viewOnLayoutChangeListenerC19048x56ebf0e9.m83108x2b5a5a39().f295334c.putString("key_true_name", obj);
        }
        viewOnLayoutChangeListenerC19048x56ebf0e9.m83106x57340563().d(m83183xfb85ada3, java.lang.Integer.valueOf(o17), obj);
    }
}
