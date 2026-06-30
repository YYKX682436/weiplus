package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public class ri implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b f243044d;

    public ri(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b activityC17442xea4ad84b) {
        this.f243044d = activityC17442xea4ad84b;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17442xea4ad84b activityC17442xea4ad84b = this.f243044d;
        activityC17442xea4ad84b.f242084f.removeTextChangedListener(activityC17442xea4ad84b.f242091p);
        h12.m mVar = new h12.m(editable.toString(), (int) activityC17442xea4ad84b.f242084f.getPaint().getTextSize());
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        editable.toString();
        int i17 = activityC17442xea4ad84b.f242089n;
        if (a17 > i17) {
            java.lang.String b17 = mVar.b(i17, t4Var);
            activityC17442xea4ad84b.f242086h.setText(activityC17442xea4ad84b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ikd, java.lang.Integer.valueOf(activityC17442xea4ad84b.f242089n / 2)));
            activityC17442xea4ad84b.f242086h.setTextColor(activityC17442xea4ad84b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
            activityC17442xea4ad84b.f242086h.performHapticFeedback(3, 2);
            if (activityC17442xea4ad84b.f242088m.e()) {
                activityC17442xea4ad84b.f242088m.c(5000L, 5000L);
            }
            activityC17442xea4ad84b.f242084f.setText(pg5.d.a(activityC17442xea4ad84b, b17));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = activityC17442xea4ad84b.f242084f;
            c22618x59d05a04.mo81549xf579a34a(c22618x59d05a04.getText().length());
        } else if (a17 < i17) {
            activityC17442xea4ad84b.f242088m.d();
            activityC17442xea4ad84b.f242086h.setText(activityC17442xea4ad84b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ike));
            activityC17442xea4ad84b.f242086h.setTextColor(activityC17442xea4ad84b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
        }
        activityC17442xea4ad84b.f242085g.setEnabled(true);
        activityC17442xea4ad84b.f242084f.addTextChangedListener(activityC17442xea4ad84b.f242091p);
        if (a17 > 0) {
            activityC17442xea4ad84b.f242083e.m43725xd2dca690(true);
        } else {
            activityC17442xea4ad84b.f242083e.m43725xd2dca690(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
