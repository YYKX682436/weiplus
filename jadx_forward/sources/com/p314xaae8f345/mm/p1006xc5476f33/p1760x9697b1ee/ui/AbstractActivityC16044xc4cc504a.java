package com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/gamelife/ui/GameLifeChattingCompatUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lwn/q;", "Lwn/s;", "Lwn/r;", "<init>", "()V", "plugin-gamelife_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelife.ui.GameLifeChattingCompatUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC16044xc4cc504a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements wn.q, wn.s, wn.r {

    /* renamed from: d, reason: collision with root package name */
    public wn.t f223520d;

    @Override // wn.q
    public void G4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ChattingCompatUI", "[onChattingUIEnter] ...");
    }

    @Override // wn.q
    public boolean c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    @Override // wn.s
    public void d6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ChattingCompatUI", "[onChattingFinishEnd] ...");
        wn.t tVar = this.f223520d;
        if (tVar != null) {
            ((rb5.l) tVar).b();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        wn.t tVar = this.f223520d;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(keyEvent)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // wn.s
    public void l6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ChattingCompatUI", "[onChattingFinishBegin] ...");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        rb5.l lVar = wn.p.f528912a != null ? new rb5.l(this) : null;
        this.f223520d = lVar;
        if (lVar != null) {
            lVar.f475428v.add(this);
        }
        wn.t tVar = this.f223520d;
        if (tVar != null) {
            ((rb5.l) tVar).f475429w = this;
        }
        if (tVar != null) {
            ((rb5.l) tVar).h();
        }
        super.onCreate(bundle);
        wn.t tVar2 = this.f223520d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).g();
        }
        getWindow().setSoftInputMode(50);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        wn.t tVar = this.f223520d;
        if (tVar != null) {
            ((rb5.l) tVar).f475428v.remove(this);
        }
        wn.t tVar2 = this.f223520d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).i();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        wn.t tVar = this.f223520d;
        if (tVar != null) {
            ((rb5.l) tVar).f475426t = rb5.k.ACTIVITY_PAUSE;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        wn.t tVar = this.f223520d;
        if (tVar != null) {
            ((rb5.l) tVar).j();
        }
    }
}
