package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class qe implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df f191988d;

    public qe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df viewOnClickListenerC14041xe266c5df) {
        this.f191988d = viewOnClickListenerC14041xe266c5df;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd vdVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd vdVar2;
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ud udVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ud.f192137d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ViewOnClickListenerC14041xe266c5df viewOnClickListenerC14041xe266c5df = this.f191988d;
        if (itemId != 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ud udVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ud.f192138e;
            if (itemId != 2 || viewOnClickListenerC14041xe266c5df.Y == udVar2) {
                return;
            }
            viewOnClickListenerC14041xe266c5df.f7();
            java.lang.String str = viewOnClickListenerC14041xe266c5df.f190966y0;
            viewOnClickListenerC14041xe266c5df.q7(!(str == null || str.length() == 0) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192183e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192187i);
            viewOnClickListenerC14041xe266c5df.p7(udVar2);
            viewOnClickListenerC14041xe266c5df.s7(viewOnClickListenerC14041xe266c5df.X, viewOnClickListenerC14041xe266c5df.Y);
            if (viewOnClickListenerC14041xe266c5df.m7() && (vdVar = viewOnClickListenerC14041xe266c5df.X) == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192183e) {
                viewOnClickListenerC14041xe266c5df.r7(vdVar);
                return;
            }
            return;
        }
        if (viewOnClickListenerC14041xe266c5df.Y == udVar) {
            return;
        }
        viewOnClickListenerC14041xe266c5df.f7();
        java.lang.String str2 = viewOnClickListenerC14041xe266c5df.f190966y0;
        if (!(str2 == null || str2.length() == 0) || (!viewOnClickListenerC14041xe266c5df.f190957l1.isEmpty())) {
            viewOnClickListenerC14041xe266c5df.d7();
            viewOnClickListenerC14041xe266c5df.q7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192183e);
        } else {
            viewOnClickListenerC14041xe266c5df.q7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192182d);
        }
        viewOnClickListenerC14041xe266c5df.p7(udVar);
        viewOnClickListenerC14041xe266c5df.o7(0);
        viewOnClickListenerC14041xe266c5df.s7(viewOnClickListenerC14041xe266c5df.X, viewOnClickListenerC14041xe266c5df.Y);
        if (!viewOnClickListenerC14041xe266c5df.m7() || (vdVar2 = viewOnClickListenerC14041xe266c5df.X) == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192182d || vdVar2 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vd.f192185g) {
            return;
        }
        viewOnClickListenerC14041xe266c5df.r7(vdVar2);
    }
}
