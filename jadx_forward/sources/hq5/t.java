package hq5;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.w f364803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hq5.w wVar) {
        super(1);
        this.f364803d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h state = (eq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        eq5.i iVar = (eq5.i) state.a(eq5.i.class);
        if (iVar != null) {
            hq5.w wVar = this.f364803d;
            android.widget.TextView T6 = wVar.T6();
            if (T6 != null) {
                T6.setVisibility(8);
            }
            int i17 = iVar.f337455b;
            if (i17 != 15) {
                switch (i17) {
                    case 9:
                        android.widget.TextView T62 = wVar.T6();
                        if (T62 != null) {
                            T62.setVisibility(0);
                        }
                        android.widget.TextView T63 = wVar.T6();
                        if (T63 != null) {
                            T63.setText(wVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyw, wVar.U6()));
                            break;
                        }
                        break;
                    case 10:
                        android.widget.TextView T64 = wVar.T6();
                        if (T64 != null) {
                            T64.setVisibility(0);
                            T64.setTextColor(wVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c));
                            com.p314xaae8f345.mm.ui.bk.s0(T64.getPaint());
                        }
                        j75.f Q6 = wVar.Q6();
                        if (!(((Q6 == null || (hVar = (eq5.h) Q6.mo140437x75286adb()) == null) ? 0 : hVar.f337452m) > 0)) {
                            android.widget.TextView T65 = wVar.T6();
                            if (T65 != null) {
                                T65.setText(wVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsm));
                            }
                            android.widget.TextView T66 = wVar.T6();
                            if (T66 != null) {
                                T66.setOnClickListener(new hq5.v(wVar));
                                break;
                            }
                        } else {
                            java.lang.String string = wVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nxz);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                            java.lang.String string2 = wVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nsn);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string + '\n' + string2);
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(wVar.m80379x76847179().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84)), 0, string.length(), 33);
                            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(wVar.m158355x7444d5ad(com.p314xaae8f345.mm.R.C30859x5a72f63.f77827x4b0c744c)), string.length() + 1, spannableStringBuilder.length(), 33);
                            android.widget.TextView T67 = wVar.T6();
                            if (T67 != null) {
                                T67.setText(spannableStringBuilder);
                            }
                            android.widget.TextView T68 = wVar.T6();
                            if (T68 != null) {
                                T68.setOnClickListener(new hq5.u(wVar));
                                break;
                            }
                        }
                        break;
                }
            }
            android.widget.TextView T69 = wVar.T6();
            if (T69 != null) {
                T69.setVisibility(0);
            }
            android.widget.TextView T610 = wVar.T6();
            if (T610 != null) {
                T610.setText(wVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyw, wVar.U6()));
            }
        }
        return jz5.f0.f384359a;
    }
}
