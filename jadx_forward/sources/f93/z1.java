package f93;

/* loaded from: classes11.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f342059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d f342060e;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d, boolean z17) {
        this.f342060e = viewOnCreateContextMenuListenerC16169x37a19e8d;
        this.f342059d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList f17 = b93.r.wi().f1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d viewOnCreateContextMenuListenerC16169x37a19e8d = this.f342060e;
        viewOnCreateContextMenuListenerC16169x37a19e8d.B = f17;
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.B == null) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.B = new java.util.ArrayList();
        }
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x && viewOnCreateContextMenuListenerC16169x37a19e8d.f224792z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < viewOnCreateContextMenuListenerC16169x37a19e8d.B.size(); i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d4) viewOnCreateContextMenuListenerC16169x37a19e8d.B.get(i17);
                int i18 = d4Var.f66585x70ce48ca;
                java.util.ArrayList P1 = b93.r.wi().P1(i18 + "");
                if (P1 == null || P1.size() <= 0) {
                    arrayList.add(d4Var);
                }
            }
            if (arrayList.size() > 0) {
                viewOnCreateContextMenuListenerC16169x37a19e8d.B.removeAll(arrayList);
            }
        }
        viewOnCreateContextMenuListenerC16169x37a19e8d.G.clear();
        java.util.ArrayList arrayList2 = viewOnCreateContextMenuListenerC16169x37a19e8d.B;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Empty");
            if (viewOnCreateContextMenuListenerC16169x37a19e8d.H) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 1, 0);
                viewOnCreateContextMenuListenerC16169x37a19e8d.H = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.W6(viewOnCreateContextMenuListenerC16169x37a19e8d);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.x1(this));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.ContactLabelManagerUI", "cpan[updateData] Normal");
        if (viewOnCreateContextMenuListenerC16169x37a19e8d.H) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11346, 1, 1);
            viewOnCreateContextMenuListenerC16169x37a19e8d.H = false;
        }
        java.util.ArrayList arrayList3 = viewOnCreateContextMenuListenerC16169x37a19e8d.B;
        if (arrayList3 != null && arrayList3.size() > 0) {
            int size = viewOnCreateContextMenuListenerC16169x37a19e8d.B.size();
            b93.r.wi().D0();
            for (int i19 = 0; i19 < size; i19++) {
                int i27 = ((com.p314xaae8f345.mm.p2621x8fb0427b.d4) viewOnCreateContextMenuListenerC16169x37a19e8d.B.get(i19)).f66585x70ce48ca;
                java.util.ArrayList P12 = b93.r.wi().P1(i27 + "");
                if (P12 == null || P12.size() <= 0) {
                    viewOnCreateContextMenuListenerC16169x37a19e8d.F.put(java.lang.Integer.valueOf(i27), 0);
                } else {
                    viewOnCreateContextMenuListenerC16169x37a19e8d.G.addAll(P12);
                    viewOnCreateContextMenuListenerC16169x37a19e8d.F.put(java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(P12.size()));
                }
            }
        }
        if (!viewOnCreateContextMenuListenerC16169x37a19e8d.f224790x && !viewOnCreateContextMenuListenerC16169x37a19e8d.f224788v) {
            viewOnCreateContextMenuListenerC16169x37a19e8d.B.add(0, viewOnCreateContextMenuListenerC16169x37a19e8d.A.f387440v);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16169x37a19e8d.W6(viewOnCreateContextMenuListenerC16169x37a19e8d);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f93.y1(this));
    }

    /* renamed from: toString */
    public java.lang.String m129234x9616526c() {
        return super.toString() + "|updateData";
    }
}
