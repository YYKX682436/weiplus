package pp3;

/* loaded from: classes5.dex */
public final class m implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f439023d;

    public m(pp3.u uVar) {
        this.f439023d = uVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        android.text.TextPaint paint;
        pp3.u uVar = this.f439023d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = uVar.f439037n;
        if (c22618x59d05a04 != null) {
            c22618x59d05a04.removeTextChangedListener(uVar.f439039p);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a042 = uVar.f439037n;
        h12.m mVar = new h12.m(valueOf, (c22618x59d05a042 == null || (paint = c22618x59d05a042.getPaint()) == null) ? 0 : (int) paint.getTextSize());
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar.f439033g, "afterTextChanged inputCount:" + a17);
        java.lang.String valueOf2 = java.lang.String.valueOf(editable);
        int i17 = uVar.f439034h;
        if (a17 > i17) {
            valueOf2 = mVar.b(i17, t4Var);
            android.widget.TextView textView = uVar.f439038o;
            if (textView != null) {
                textView.setText(uVar.f439032f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hg7, java.lang.Integer.valueOf(uVar.f439034h / 2)));
            }
            android.widget.TextView textView2 = uVar.f439038o;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(uVar.f439032f, com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
            }
            android.widget.TextView textView3 = uVar.f439038o;
            if (textView3 != null) {
                textView3.performHapticFeedback(3, 2);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a043 = uVar.f439037n;
            if (c22618x59d05a043 != null) {
                c22618x59d05a043.setText(pg5.d.a(uVar.f439032f, valueOf2));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a044 = uVar.f439037n;
            if (c22618x59d05a044 != null) {
                c22618x59d05a044.mo81549xf579a34a((c22618x59d05a044 == null || (text = c22618x59d05a044.getText()) == null) ? 0 : text.length());
            }
            if (uVar.f439041r.e()) {
                uVar.f439041r.c(3000L, 3000L);
            }
        } else if (a17 < i17) {
            uVar.f439041r.d();
            valueOf2 = java.lang.String.valueOf(editable);
            android.widget.TextView textView4 = uVar.f439038o;
            if (textView4 != null) {
                textView4.setText(uVar.f439032f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hg8));
            }
            android.widget.TextView textView5 = uVar.f439038o;
            if (textView5 != null) {
                textView5.setTextColor(i65.a.d(uVar.f439032f, com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a045 = uVar.f439037n;
        if (c22618x59d05a045 != null) {
            c22618x59d05a045.addTextChangedListener(uVar.f439039p);
        }
        android.view.View findViewById = uVar.findViewById(com.p314xaae8f345.mm.R.id.khs);
        if (findViewById != null) {
            findViewById.setEnabled(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf2, uVar.f439036m));
        }
        if (a17 > 0) {
            com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = uVar.f439035i;
            if (c10449x84ee1171 != null) {
                c10449x84ee1171.m43725xd2dca690(true);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee11712 = uVar.f439035i;
        if (c10449x84ee11712 != null) {
            c10449x84ee11712.m43725xd2dca690(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
