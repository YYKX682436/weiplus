package gt4;

/* loaded from: classes9.dex */
public class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a f356978d;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a) {
        this.f356978d = c19148x59bc9c3a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(editable.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19148x59bc9c3a c19148x59bc9c3a = this.f356978d;
        if (K0) {
            c19148x59bc9c3a.f262250d.m83213x765074af("");
            c19148x59bc9c3a.f262250d.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            c19148x59bc9c3a.f262252f.setTextColor(c19148x59bc9c3a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            return;
        }
        if (!c19148x59bc9c3a.f262258o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPhoneInputView", "manual pick don't search");
            c19148x59bc9c3a.f262250d.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            c19148x59bc9c3a.f262252f.setTextColor(c19148x59bc9c3a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            c19148x59bc9c3a.f262258o = true;
            return;
        }
        u11.a aVar = (u11.a) ((java.util.HashMap) c19148x59bc9c3a.f262255i).get(editable.toString());
        editable.toString();
        if (aVar != null) {
            c19148x59bc9c3a.f262257n = aVar.f505261b;
            java.lang.String str = aVar.f505262c;
            c19148x59bc9c3a.f262256m = str;
            c19148x59bc9c3a.f262250d.m83213x765074af(str);
            c19148x59bc9c3a.f262250d.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            c19148x59bc9c3a.f262252f.setTextColor(c19148x59bc9c3a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            c19148x59bc9c3a.f262257n = "";
            c19148x59bc9c3a.f262256m = "";
            c19148x59bc9c3a.f262250d.m83213x765074af(c19148x59bc9c3a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwl));
        }
        c19148x59bc9c3a.f262251e.m83175x3bf408ec().mo9068x194c4a1(c19148x59bc9c3a.f262251e.n());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
