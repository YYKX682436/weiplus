package ns4;

/* loaded from: classes8.dex */
public final class w1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421204d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421204d = activityC19067xb53aa1de;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.i50 i50Var = (r45.i50) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421204d;
        android.widget.LinearLayout linearLayout = activityC19067xb53aa1de.f260706p;
        if (linearLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIncomeBalanceLL");
            throw null;
        }
        linearLayout.setVisibility(8);
        if (i50Var != null) {
            java.lang.String str = i50Var.f458271d;
            boolean z17 = true;
            if (str == null || str.length() == 0) {
                return;
            }
            ms4.t tVar = activityC19067xb53aa1de.f260709s;
            if (tVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            tVar.R6(8);
            android.widget.LinearLayout linearLayout2 = activityC19067xb53aa1de.f260706p;
            if (linearLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIncomeBalanceLL");
                throw null;
            }
            linearLayout2.setVisibility(0);
            android.widget.LinearLayout linearLayout3 = activityC19067xb53aa1de.f260706p;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIncomeBalanceLL");
                throw null;
            }
            ((android.widget.TextView) linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.pke)).setText(i50Var.f458271d);
            android.widget.LinearLayout linearLayout4 = activityC19067xb53aa1de.f260706p;
            if (linearLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIncomeBalanceLL");
                throw null;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.pkd);
            java.lang.String str2 = i50Var.f458272e;
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                c22699x3dcdb352.setVisibility(8);
                return;
            }
            c22699x3dcdb352.setVisibility(0);
            android.widget.LinearLayout linearLayout5 = activityC19067xb53aa1de.f260706p;
            if (linearLayout5 != null) {
                linearLayout5.setOnClickListener(new ns4.m2(activityC19067xb53aa1de, i50Var));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mIncomeBalanceLL");
                throw null;
            }
        }
    }
}
