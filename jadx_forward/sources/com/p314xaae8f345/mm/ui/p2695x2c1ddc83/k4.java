package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class k4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI f289338d;

    public k4(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI) {
        this.f289338d = enterpriseConversationFmUI;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22371xa262f838.EnterpriseConversationFmUI enterpriseConversationFmUI = this.f289338d;
        if (enterpriseConversationFmUI.f288880f != null) {
            r01.q3.bj().y0(enterpriseConversationFmUI.f288884m);
            android.widget.TextView textView = (android.widget.TextView) enterpriseConversationFmUI.f288880f.findViewById(com.p314xaae8f345.mm.R.id.odf);
            r01.q bj6 = r01.q3.bj();
            r01.q3.bj();
            java.lang.String z07 = bj6.z0(0);
            if (textView != null && z07 != null && z07.length() > 0 && !textView.getText().equals(z07)) {
                textView.setText(z07);
            }
            int D0 = r01.q3.bj().D0();
            if (textView != null && D0 != 0) {
                textView.setTextColor(D0);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) enterpriseConversationFmUI.f288880f.findViewById(com.p314xaae8f345.mm.R.id.h6y);
            r01.q3.bj().getClass();
            if (r01.q.f449719g == null) {
                r01.q.f449719g = new r45.ud();
            }
            java.lang.String str2 = r01.q.f449719g.f468784g;
            if (c19659x677e0913 == null || str2 == null || str2.length() <= 0) {
                return;
            }
            c19659x677e0913.m75396xca029dad(str2);
        }
    }
}
