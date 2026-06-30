package ns4;

/* loaded from: classes8.dex */
public final class d1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421034d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421034d = activityC19066x54c41420;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        java.lang.String obj = s17.toString();
        boolean A = r26.i0.A(obj, ".", false, 2, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421034d;
        if (A) {
            s17.insert(0, "0");
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = activityC19066x54c41420.f260684f;
            if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
                throw null;
            }
            if (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.f(obj, viewOnFocusChangeListenerC22907xe18534c2.m83169xe7297452())) {
                return;
            }
        }
        java.lang.String obj2 = s17.toString();
        int L = r26.n0.L(obj2, ".", 0, false, 6, null);
        int length = obj2.length();
        if (L >= 0 && length - L > 3) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = activityC19066x54c41420.f260684f;
            if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
                throw null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(viewOnFocusChangeListenerC22907xe18534c22.m83169xe7297452(), obj2, L + 3, length);
        } else if (L > 12) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c23 = activityC19066x54c41420.f260684f;
            if (viewOnFocusChangeListenerC22907xe18534c23 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
                throw null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(viewOnFocusChangeListenerC22907xe18534c23.m83169xe7297452(), obj2, 12, L);
        } else if (L == -1 && length > 12) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c24 = activityC19066x54c41420.f260684f;
            if (viewOnFocusChangeListenerC22907xe18534c24 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mInputMoneyText");
                throw null;
            }
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(viewOnFocusChangeListenerC22907xe18534c24.m83169xe7297452(), obj2, 12, length);
        }
        java.lang.String obj3 = s17.toString();
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v;
        activityC19066x54c41420.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashView", "update tips: %s", obj3);
        long j07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(obj3 + "", "100");
        int i17 = activityC19066x54c41420.f260690o;
        if (j07 <= 0) {
            android.widget.TextView textView = activityC19066x54c41420.f260685g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView.setText(activityC19066x54c41420.f260688m);
            android.widget.TextView textView2 = activityC19066x54c41420.f260685g;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView2.setTextColor(i17);
            activityC19066x54c41420.f260689n = false;
            activityC19066x54c41420.V6(false);
            return;
        }
        long longExtra = activityC19066x54c41420.getIntent().getLongExtra("wecoin_income_balance", 0L);
        if (j07 >= 200000000) {
            android.widget.TextView textView3 = activityC19066x54c41420.f260685g;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView3.setText(activityC19066x54c41420.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9l));
            android.widget.TextView textView4 = activityC19066x54c41420.f260685g;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView4.setTextColor(activityC19066x54c41420.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            activityC19066x54c41420.f260689n = false;
            activityC19066x54c41420.V6(false);
            return;
        }
        if (j07 > longExtra) {
            android.widget.TextView textView5 = activityC19066x54c41420.f260685g;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView5.setText(activityC19066x54c41420.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9k));
            android.widget.TextView textView6 = activityC19066x54c41420.f260685g;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                throw null;
            }
            textView6.setTextColor(activityC19066x54c41420.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
            activityC19066x54c41420.f260689n = false;
            activityC19066x54c41420.V6(false);
            return;
        }
        if (j07 == 1) {
            ms4.n nVar = activityC19066x54c41420.f260687i;
            if (nVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            if (nVar.f412602f == 2) {
                android.widget.TextView textView7 = activityC19066x54c41420.f260685g;
                if (textView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                    throw null;
                }
                textView7.setText(activityC19066x54c41420.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpt));
                android.widget.TextView textView8 = activityC19066x54c41420.f260685g;
                if (textView8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
                    throw null;
                }
                textView8.setTextColor(activityC19066x54c41420.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                activityC19066x54c41420.f260689n = false;
                activityC19066x54c41420.V6(false);
                return;
            }
        }
        android.widget.TextView textView9 = activityC19066x54c41420.f260685g;
        if (textView9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView9.setText(activityC19066x54c41420.f260688m);
        android.widget.TextView textView10 = activityC19066x54c41420.f260685g;
        if (textView10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTotalBalanceWithdrawTip");
            throw null;
        }
        textView10.setTextColor(i17);
        activityC19066x54c41420.f260689n = true;
        activityC19066x54c41420.V6(true);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }
}
