package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes16.dex */
public final class u80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra f201495d;

    public u80(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra raVar) {
        this.f201495d = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ra raVar = this.f201495d;
        int i17 = com.p314xaae8f345.mm.ui.bl.b(raVar.f199716e).y;
        int i18 = (int) (i17 * 0.75f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = raVar.B;
        int height = (y1Var == null || (view = y1Var.f293560f) == null) ? 0 : view.getHeight();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c5570 = raVar.f201146b2;
        if (c22843x6b8c5570 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        int height2 = height - c22843x6b8c5570.getHeight();
        if (height2 < 0) {
            height2 = 0;
        }
        int i19 = i18 - height2;
        int i27 = i19 >= 0 ? i19 : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyMaxHeightLimit: screenH=");
        sb6.append(i17);
        sb6.append(", panelH=");
        sb6.append(height);
        sb6.append(", rvH=");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55702 = raVar.f201146b2;
        if (c22843x6b8c55702 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
            throw null;
        }
        sb6.append(c22843x6b8c55702.getHeight());
        sb6.append(", nonRvH=");
        sb6.append(height2);
        sb6.append(", maxRvH=");
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        if (i27 > 0) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55703 = raVar.f201146b2;
            if (c22843x6b8c55703 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
                throw null;
            }
            if (c22843x6b8c55703.getMaxHeight() != i27) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55704 = raVar.f201146b2;
                if (c22843x6b8c55704 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
                    throw null;
                }
                c22843x6b8c55704.m82895x25bfb969(i27);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22843x6b8c5570 c22843x6b8c55705 = raVar.f201146b2;
                if (c22843x6b8c55705 != null) {
                    c22843x6b8c55705.requestLayout();
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hostListRv");
                    throw null;
                }
            }
        }
    }
}
