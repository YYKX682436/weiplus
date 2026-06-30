package wn;

/* loaded from: classes11.dex */
public class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements wn.q, wn.s {

    /* renamed from: d, reason: collision with root package name */
    public wn.t f528913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wn.q
    public void G4() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIEnter] ...");
    }

    public wn.t O6() {
        if (wn.p.f528912a == null) {
            return null;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new rb5.l((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
    }

    @Override // wn.q
    public boolean c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadyChattingCompatUI", "[onChattingUIExit] ...");
        return true;
    }

    @Override // wn.s
    public void d6() {
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).b();
        }
    }

    @Override // wn.s
    public void l6() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).f(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public final void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.Window window;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 != null && (window = m158354x19263085.getWindow()) != null) {
            window.setSoftInputMode(50);
        }
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).g();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    public void mo2277xb2f1ab1a(android.os.Bundle bundle) {
        super.mo2277xb2f1ab1a(bundle);
        wn.t O6 = O6();
        this.f528913d = O6;
        if (O6 != null) {
            ((rb5.l) O6).f475428v.add(this);
        }
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).h();
        }
        wn.t tVar2 = this.f528913d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).f475431y = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).f475428v.remove(this);
        }
        wn.t tVar2 = this.f528913d;
        if (tVar2 != null) {
            ((rb5.l) tVar2).i();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyDown */
    public boolean mo2278x1f03f0c2(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        wn.t tVar = this.f528913d;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(event)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.mo2278x1f03f0c2(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onKeyUp */
    public boolean mo2279xafd962bb(int i17, android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        wn.t tVar = this.f528913d;
        boolean z17 = false;
        if (tVar != null && ((rb5.l) tVar).c(event)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.mo2279xafd962bb(i17, event);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).f475426t = rb5.k.ACTIVITY_PAUSE;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onRequestPermissionsResult */
    public void mo2282x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo2282x953457f1(i17, permissions, grantResults);
        wn.t tVar = this.f528913d;
        if (tVar == null || (c21628xcedb13ea = ((rb5.l) tVar).f475415f) == null) {
            return;
        }
        c21628xcedb13ea.mo7516x953457f1(i17, permissions, grantResults);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        wn.t tVar = this.f528913d;
        if (tVar != null) {
            ((rb5.l) tVar).j();
        }
    }
}
