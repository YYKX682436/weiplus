package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class si extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {
    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        android.content.Intent intent = this.f280113d.g().getIntent();
        if (intent.getIntExtra("SendAppMessageWrapper_Scene", 0) != 3) {
            return;
        }
        intent.setClass(this.f280113d.g(), com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class);
        intent.putExtra("Select_Conv_User", this.f280113d.x());
        yb5.d dVar = this.f280113d;
        dVar.f542242d.a(intent, 228, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ri(this, intent));
    }
}
