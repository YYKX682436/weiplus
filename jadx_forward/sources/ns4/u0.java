package ns4;

/* loaded from: classes8.dex */
public final class u0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f421193d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f421193d = activityC19066x54c41420;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.na7 na7Var;
        ms4.a aVar = (ms4.a) obj;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420.f260681v;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f421193d;
        activityC19066x54c41420.getClass();
        if ((aVar != null ? aVar.f412531d : null) != null) {
            r45.js5 js5Var = aVar.f412531d;
            boolean z17 = js5Var instanceof r45.ck0;
            if (z17) {
                r45.ie ieVar = js5Var.f76492x92037252;
                if ((ieVar != null && ieVar.f458492d == 10006) && (na7Var = ((r45.ck0) js5Var).f453149e) != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19066x54c41420, 1, 0);
                    java.lang.String cancel_button_wording = activityC19066x54c41420.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l9a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cancel_button_wording, "getString(...)");
                    java.lang.String confirm_button_wording = activityC19066x54c41420.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8s);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confirm_button_wording, "getString(...)");
                    java.lang.String str = na7Var.f462750i;
                    if (str != null && str.length() > 0) {
                        cancel_button_wording = na7Var.f462750i;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cancel_button_wording, "cancel_button_wording");
                    }
                    java.lang.String str2 = na7Var.f462749h;
                    if (str2 != null && str2.length() > 0) {
                        confirm_button_wording = na7Var.f462749h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confirm_button_wording, "confirm_button_wording");
                    }
                    z2Var.m(cancel_button_wording, confirm_button_wording);
                    ns4.h1 h1Var = new ns4.h1(z2Var, activityC19066x54c41420, na7Var);
                    ns4.i1 i1Var = new ns4.i1(z2Var, activityC19066x54c41420, na7Var);
                    z2Var.D = h1Var;
                    z2Var.E = i1Var;
                    android.view.View inflate = android.view.View.inflate(activityC19066x54c41420, com.p314xaae8f345.mm.R.C30864xbddafb2a.d9g, null);
                    ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bys)).setOnClickListener(new ns4.j1(z2Var));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
                    java.lang.String str3 = na7Var.f462745d;
                    if (str3 != null) {
                        textView.setText(str3);
                        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
                    java.lang.String str4 = na7Var.f462746e;
                    if (str4 != null) {
                        textView2.setText(str4);
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.w0(textView2, str4, 0, str4.length(), new com.p314xaae8f345.mm.p2802xd031a825.ui.a0((com.p314xaae8f345.mm.p2802xd031a825.ui.z) new ns4.k1(na7Var, activityC19066x54c41420), true), activityC19066x54c41420);
                    }
                    z2Var.j(inflate);
                    z2Var.C();
                    return;
                }
            }
            if (z17) {
                r45.ie ieVar2 = js5Var.f76492x92037252;
                if (ieVar2 != null && ieVar2.f458492d == 10008) {
                    return;
                }
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19066x54c41420.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        os4.h.e(mo55332x76847179, aVar, null);
    }
}
