package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class m7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad f268950d;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad c19492xd515f0ad) {
        this.f268950d = c19492xd515f0ad;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19492xd515f0ad c19492xd515f0ad = this.f268950d;
        if (!z17 && c19492xd515f0ad.f268622m != null) {
            android.content.Context context = view.getContext();
            if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53060x36654fab(c19492xd515f0ad.f268617e);
            }
        }
        c19492xd515f0ad.f268616d.setSelected(z17);
    }
}
