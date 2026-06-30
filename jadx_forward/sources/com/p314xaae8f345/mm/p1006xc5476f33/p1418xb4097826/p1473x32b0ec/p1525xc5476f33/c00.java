package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class c00 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 f193625d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var) {
        super(1);
        this.f193625d = w00Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w00 w00Var = this.f193625d;
        w00Var.getClass();
        if (!(str == null || str.length() == 0)) {
            boolean x07 = w00Var.x0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(w00Var.f196376q, "goToFinderProfile finderUsername:" + str + ",isLandscape:" + x07);
            if (!x07 || ((mm2.c1) w00Var.P0(mm2.c1.class)).O7()) {
                dk2.q4 q4Var = dk2.q4.f315471a;
                android.view.ViewGroup viewGroup = w00Var.f446856d;
                android.content.Context context = viewGroup.getContext();
                gk2.e S0 = w00Var.S0();
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context, S0, false, str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6(), false, null, 96, null);
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PORTRAIT_ACTION_KEY_FINDER_USERNAME", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.s1(w00Var, "PORTRAIT_ACTION_GOTO_PROFILE_NEW_MEMBER_PROFILE", bundle, 0, 4, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
