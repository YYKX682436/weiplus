package eu0;

/* loaded from: classes5.dex */
public final class k extends com.p314xaae8f345.mm.app.s2 {
    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "onAppForeground: app returned to foreground, opening preview page");
        m43072x2efc64();
        eu0.l.f338251b = null;
        eu0.l.f338250a.a();
    }
}
