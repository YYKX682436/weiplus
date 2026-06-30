package fn2;

/* loaded from: classes10.dex */
public final class s1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 {
    public final sf2.d3 F;
    public final fn2.t1 G;
    public final java.lang.String[] H;
    public final java.util.Map I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.content.Context context, sf2.d3 controller, fn2.t1 config) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.F = controller;
        this.G = config;
        this.H = new java.lang.String[]{context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnb), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnk)};
        this.I = new java.util.LinkedHashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0
    public void v() {
        java.util.LinkedList<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2> linkedList;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.A;
        if (y1Var != null && (linkedList = y1Var.D) != null) {
            for (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 g2Var : linkedList) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 x0Var = g2Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x0) g2Var : null;
                if (x0Var != null) {
                    x0Var.v();
                }
            }
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.C;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "onDismiss", null, 2, null);
        }
        sf2.j0.l(this.F.f7(), "", false, false, 4, null);
        x();
    }

    public final void x() {
        java.util.Map map = this.I;
        for (fn2.x1 x1Var : ((java.util.LinkedHashMap) map).values()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongTabView", "Cleaning up tab: " + x1Var.f345975g);
            int childCount = x1Var.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = x1Var.getChildAt(i17);
                if (childAt instanceof fn2.y1) {
                    ((fn2.y1) childAt).h();
                }
            }
            x1Var.removeAllViews();
            x1Var.f345978m = false;
        }
        ((java.util.LinkedHashMap) map).clear();
    }
}
