package qp5;

/* loaded from: classes9.dex */
public class r implements com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IPasswdInputChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f447381b;

    public r(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14, android.content.Context context) {
        this.f447381b = viewOnFocusChangeListenerC22906x9d30fd14;
        this.f447380a = context;
    }

    @Override // com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359.IPasswdInputChangeListener
    /* renamed from: onInputChanged */
    public void mo915xdc18b709() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "secureEditText input change callback");
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f447381b;
        if (viewOnFocusChangeListenerC22906x9d30fd14.f295688s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "onInputChanged accessibilitySecuritySwitchSvrOpen");
            viewOnFocusChangeListenerC22906x9d30fd14.f295687r = viewOnFocusChangeListenerC22906x9d30fd14.f295676d.m121601xbad2461a();
        } else {
            viewOnFocusChangeListenerC22906x9d30fd14.setContentDescription(this.f447380a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3p, viewOnFocusChangeListenerC22906x9d30fd14.f295676d.m121601xbad2461a() + ""));
        }
        qp5.t tVar = viewOnFocusChangeListenerC22906x9d30fd14.f295682m;
        if (tVar != null) {
            tVar.mo26603x194c4a1(viewOnFocusChangeListenerC22906x9d30fd14.c());
        }
    }
}
