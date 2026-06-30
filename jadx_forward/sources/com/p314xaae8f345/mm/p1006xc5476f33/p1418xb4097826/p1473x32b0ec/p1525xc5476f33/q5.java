package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195494p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 f195495q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195494p = statusMonitor;
        root.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l5.f194881d);
    }

    @Override // qo0.a
    public boolean B0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2;
        if (w0() != 0 || (c14396x9309a8f2 = this.f195495q) == null || c14396x9309a8f2.getVisibility() != 0) {
            return false;
        }
        c14396x9309a8f2.a();
        yz5.a aVar = c14396x9309a8f2.f199140g;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.m5.f194997a[status.ordinal()] == 1) {
            if (bundle == null) {
                u1(null, "");
                return;
            }
            byte[] byteArray = bundle.getByteArray("PARAM_LIVE_AI_ASSISTANT_INFO");
            java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_AI_ASSISTANT_ID");
            r45.u84 u84Var = new r45.u84();
            if (byteArray != null) {
                try {
                    u84Var.mo11468x92b714fd(byteArray);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            u1(u84Var, string);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        ((mm2.c1) P0(mm2.c1.class)).N1 = z17;
        qo0.b bVar = qo0.b.Z2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) P0(mm2.c1.class)).N1);
        this.f195494p.mo46557x60d69242(bVar, bundle);
    }

    public final void u1(r45.u84 u84Var, java.lang.String str) {
        java.lang.String str2;
        t1(true);
        java.lang.String str3 = ((mm2.c1) S0().a(mm2.c1.class)).V1;
        java.lang.String str4 = ((mm2.c1) S0().a(mm2.c1.class)).W1;
        if (u84Var != null) {
            r45.v84 v84Var = new r45.v84();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = u84Var.m75934xbce7f2f(1);
            byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
            if (g17 != null) {
                try {
                    v84Var.mo11468x92b714fd(g17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            java.lang.String m75945x2fec8307 = v84Var.m75945x2fec8307(0);
            str4 = v84Var.m75945x2fec8307(1);
            str2 = m75945x2fec8307;
        } else {
            str2 = str3;
        }
        java.lang.String str5 = str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = this.f195495q;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (c14396x9309a8f2 == null) {
            android.content.Context context = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f22 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2(context);
            this.f195495q = c14396x9309a8f22;
            viewGroup.addView(c14396x9309a8f22);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f23 = this.f195495q;
        if (c14396x9309a8f23 != null) {
            c14396x9309a8f23.c(((mm2.c1) P0(mm2.c1.class)).X1, str2, str5, ((mm2.c1) P0(mm2.c1.class)).T, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p5(this), true, str);
        }
        java.lang.Object systemService = viewGroup.getContext().getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f195495q, 1);
        K0(0);
    }
}
