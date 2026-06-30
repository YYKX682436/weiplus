package iy2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a f377442d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a) {
        this.f377442d = c15489x5c3b8a7a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = this.f377442d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15489x5c3b8a7a.f218304o;
        if (c22621x7603e017 == null || c22621x7603e017.getText() == null) {
            if (c15489x5c3b8a7a.f218305p == null || (!r0.isShowing())) {
                c15489x5c3b8a7a.f218305p = db5.e1.i(c15489x5c3b8a7a.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f573030np4, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c15489x5c3b8a7a.f218304o;
            java.lang.String valueOf = java.lang.String.valueOf(c22621x7603e0172 != null ? c22621x7603e0172.getText() : null);
            int length = valueOf.length() - 1;
            int i17 = 0;
            boolean z17 = false;
            while (i17 <= length) {
                boolean z18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.i(valueOf.charAt(!z17 ? i17 : length), 32) <= 0;
                if (z17) {
                    if (!z18) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z18) {
                    i17++;
                } else {
                    z17 = true;
                }
            }
            if (valueOf.subSequence(i17, length + 1).toString().length() == 0) {
                if (valueOf.length() == 0) {
                    if (c15489x5c3b8a7a.f218305p == null || (!r0.isShowing())) {
                        c15489x5c3b8a7a.f218305p = db5.e1.i(c15489x5c3b8a7a.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f573030np4, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    }
                }
            }
            if (c15489x5c3b8a7a.f218303n != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15489x5c3b8a7a.f218296d, "sendMsg onSendMsg");
                iy2.r rVar = c15489x5c3b8a7a.f218303n;
                if (rVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wr) rVar).f196524a.f193997z.performClick();
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((ml2.r0) c17).ak(2, 14, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
