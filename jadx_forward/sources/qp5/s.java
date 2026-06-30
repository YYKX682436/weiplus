package qp5;

/* loaded from: classes9.dex */
public class s implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 f447383e;

    public s(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14, android.content.Context context) {
        this.f447383e = viewOnFocusChangeListenerC22906x9d30fd14;
        this.f447382d = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "after textchange");
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22906x9d30fd14 viewOnFocusChangeListenerC22906x9d30fd14 = this.f447383e;
        if (viewOnFocusChangeListenerC22906x9d30fd14.f295688s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditHintPasswdView", "afterTextChanged accessibilitySecuritySwitchSvrOpen");
            viewOnFocusChangeListenerC22906x9d30fd14.f295687r = viewOnFocusChangeListenerC22906x9d30fd14.f295676d.m121601xbad2461a();
        } else {
            viewOnFocusChangeListenerC22906x9d30fd14.setContentDescription(this.f447382d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l3p, viewOnFocusChangeListenerC22906x9d30fd14.f295676d.getText().toString().length() + ""));
        }
        qp5.t tVar = viewOnFocusChangeListenerC22906x9d30fd14.f295682m;
        if (tVar != null) {
            tVar.mo26603x194c4a1(viewOnFocusChangeListenerC22906x9d30fd14.c());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
