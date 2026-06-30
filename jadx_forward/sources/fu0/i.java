package fu0;

/* loaded from: classes5.dex */
public final class i extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fu0.l f348317d;

    public i(fu0.l lVar) {
        this.f348317d = lVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        fu0.l lVar = this.f348317d;
        if (lVar.f348322c) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "onAppBackground: pause music picker");
        lVar.f348329j = true;
        fu0.q qVar = lVar.f348323d;
        if (qVar != null) {
            ev0.t.c(qVar.f303886c, false, null, 3, null);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        fu0.l lVar = this.f348317d;
        if (lVar.f348322c || !lVar.f348329j) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "onAppForeground: resume music picker");
        lVar.f348329j = false;
        fu0.q qVar = lVar.f348323d;
        if (qVar != null) {
            qVar.f303886c.d();
        }
    }
}
