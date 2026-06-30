package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class e20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f193895p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f193896q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f193895p = rootView;
        this.f193896q = statusMonitor;
        K0(8);
        rootView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a20(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (((mm2.e1) P0(mm2.e1.class)).b7()) {
            super.K0(8);
        } else {
            super.K0(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.b20.f193497a[status.ordinal()] == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] statusChange: START_LIVE received");
            boolean M = zl2.r4.f555483a.M();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveOldSongBannerPlugin", "[OldSongBanner] initPlugin: enableSingSong=" + M);
            if (M) {
                ((mm2.m6) P0(mm2.m6.class)).f410778m.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c20(this));
                ((mm2.m6) P0(mm2.m6.class)).f410776h.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.d20(this));
                t1(null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    public final void t1(java.lang.String str) {
        android.view.ViewGroup viewGroup = this.f193895p;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.mxt);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568473my3);
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.setVisibility(8);
        }
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79511xd7c96faf);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14363xcdb31e8e c14363xcdb31e8e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14363xcdb31e8e) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568475my4);
        c14363xcdb31e8e.setMaxWidth((int) (c14363xcdb31e8e.getTextSize() * 6));
        if (str == null || str.length() == 0) {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            c14363xcdb31e8e.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8j));
            c14363xcdb31e8e.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        } else {
            c22699x3dcdb352.m82040x7541828(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            c14363xcdb31e8e.setText(str);
            c14363xcdb31e8e.setTextColor(viewGroup.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        }
        c22699x3dcdb352.setVisibility(0);
        c14363xcdb31e8e.setSelected(true);
    }
}
