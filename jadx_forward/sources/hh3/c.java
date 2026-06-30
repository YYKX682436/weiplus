package hh3;

/* loaded from: classes4.dex */
public class c implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hh3.d f362995a;

    public c(hh3.d dVar) {
        this.f362995a = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "click %s", java.lang.Boolean.valueOf(z17));
        hh3.d dVar = this.f362995a;
        if (!z17) {
            jh3.n.i(dVar.f362999h, 10);
            return;
        }
        java.lang.ref.WeakReference weakReference = dVar.f362998g;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "onDialogClick context == null");
            return;
        }
        android.content.Context context = (android.content.Context) dVar.f362998g.get();
        dVar.f362997f = new fh3.a(dVar.f363003o, dVar.f363004p, dVar.f363005q, 2);
        gm0.j1.d().g(dVar.f362997f);
        dVar.e(context);
        jh3.n.i(dVar.f362999h, 9);
    }
}
