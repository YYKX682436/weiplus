package ni5;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 f419322d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 activityC22459x1ac69192) {
        super(1);
        this.f419322d = activityC22459x1ac69192;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        j75.e eVar;
        j75.e eVar2;
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.h0 h0Var = (wi5.h0) state.a(wi5.h0.class);
        com.p314xaae8f345.mm.ui.p2724x335620.ActivityC22459x1ac69192 activityC22459x1ac69192 = this.f419322d;
        if (h0Var != null) {
            if (state.R) {
                activityC22459x1ac69192.mo54450xbf7c1df6("");
                activityC22459x1ac69192.mo78530x8b45058f();
                activityC22459x1ac69192.mo78529xe76c1b79();
                p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = activityC22459x1ac69192.mo2533x106ab264();
                if (mo2533x106ab264 != null) {
                    mo2533x106ab264.o();
                }
                int dimensionPixelSize = activityC22459x1ac69192.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                android.view.View findViewById = ((em.l2) ((jz5.n) activityC22459x1ac69192.f290786d).mo141623x754a37bb()).b().findViewById(com.p314xaae8f345.mm.R.id.m7g);
                if (findViewById != null) {
                    findViewById.setPadding(dimensionPixelSize, findViewById.getPaddingTop(), dimensionPixelSize, findViewById.getPaddingBottom());
                }
            } else {
                activityC22459x1ac69192.mo54450xbf7c1df6(state.f527846f);
            }
        }
        j75.d dVar = state.f379599d;
        j75.e eVar3 = null;
        if (dVar != null && (dVar instanceof wi5.t0) && (eVar2 = ((wi5.t0) dVar).f379600a) != null && (eVar2 instanceof wi5.w0)) {
            wi5.w0 w0Var = (wi5.w0) eVar2;
            if (w0Var.f527890a == wi5.v0.f527884d) {
                if (w0Var.f527891b == wi5.u0.f527879e) {
                    java.lang.String stringExtra = activityC22459x1ac69192.getIntent().getStringExtra("too_many_member_tip_string");
                    if (stringExtra == null) {
                        stringExtra = activityC22459x1ac69192.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifp, java.lang.Integer.valueOf(state.f527849i));
                    }
                    java.lang.String str = stringExtra;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.lang.String stringExtra2 = activityC22459x1ac69192.getIntent().getStringExtra("too_many_member_tip_ok_string");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                        db5.e1.t(activityC22459x1ac69192.mo55332x76847179(), str, "", null);
                    } else {
                        db5.e1.E(activityC22459x1ac69192.mo55332x76847179(), str, "", stringExtra2, true, ni5.c.f419320d);
                    }
                }
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof wi5.j0) && (eVar = ((wi5.j0) dVar2).f379600a) != null && (eVar instanceof wi5.w0)) {
            wi5.w0 w0Var2 = (wi5.w0) eVar;
            if (w0Var2.f527890a == wi5.v0.f527884d) {
                if (w0Var2.f527891b == wi5.u0.f527879e) {
                    java.lang.String stringExtra3 = activityC22459x1ac69192.getIntent().getStringExtra("too_many_member_tip_string");
                    if (stringExtra3 == null) {
                        stringExtra3 = activityC22459x1ac69192.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifp, java.lang.Integer.valueOf(state.f527849i));
                    }
                    java.lang.String str2 = stringExtra3;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    java.lang.String stringExtra4 = activityC22459x1ac69192.getIntent().getStringExtra("too_many_member_tip_ok_string");
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
                        db5.e1.t(activityC22459x1ac69192.mo55332x76847179(), str2, "", null);
                    } else {
                        db5.e1.E(activityC22459x1ac69192.mo55332x76847179(), str2, "", stringExtra4, true, ni5.d.f419321d);
                    }
                }
            }
        }
        wi5.c cVar = (wi5.c) state.a(wi5.c.class);
        if (cVar != null) {
            j75.e eVar4 = cVar.f379600a;
            java.util.LinkedList linkedList = state.f527852o;
            if (eVar4 != null && (eVar4 instanceof wi5.d)) {
                if (!((wi5.d) eVar4).f527817a && (m67437x4bd53102 = activityC22459x1ac69192.m67437x4bd5310()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) it.next());
                    }
                    m67437x4bd53102.B3(new wi5.c0(arrayList, -1));
                }
                eVar3 = eVar4;
            }
            if (((wi5.d) eVar3) == null && (m67437x4bd5310 = activityC22459x1ac69192.m67437x4bd5310()) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    arrayList2.add((java.lang.String) it6.next());
                }
                m67437x4bd5310.B3(new wi5.c0(arrayList2, -1));
            }
        }
        return jz5.f0.f384359a;
    }
}
