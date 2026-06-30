package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class yb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w1 H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f201963J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d80.f199620e);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9s;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
    
        if (((mm2.n0) r1.a(mm2.n0.class)).f410809z6 == true) goto L18;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yb.N(android.view.View):void");
    }

    public final void e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d80 mode) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        this.H.getClass();
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.w1(mode);
        int ordinal = mode.ordinal();
        android.content.Context context = this.f199716e;
        if (ordinal == 0) {
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ooa);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oo_);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.widget.TextView textView = this.P;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("settlementValueTv");
            throw null;
        }
        textView.setText(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveSettingPanel", "updateSettlementModeDisplay: mode=" + mode + ", display=" + string);
    }
}
