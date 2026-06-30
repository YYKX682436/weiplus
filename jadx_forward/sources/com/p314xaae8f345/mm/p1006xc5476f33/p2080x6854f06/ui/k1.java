package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j34.i f243823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 f243824e;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4, j34.i iVar) {
        this.f243824e = activityC17681x5e0a88e4;
        this.f243823d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar;
        java.util.LinkedList linkedList2;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4.f243756q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17681x5e0a88e4 activityC17681x5e0a88e4 = this.f243824e;
        activityC17681x5e0a88e4.getClass();
        j34.i iVar = this.f243823d;
        if (iVar != null && (linkedList = iVar.f379027a) != null && linkedList.size() != 0 && (rVar = activityC17681x5e0a88e4.f243757d) != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).t();
            for (int i18 = 0; i18 < iVar.f379027a.size(); i18++) {
                j34.g gVar = (j34.g) iVar.f379027a.get(i18);
                if (gVar != null && (linkedList2 = gVar.f379024a) != null && linkedList2.size() != 0) {
                    for (int i19 = 0; i19 < gVar.f379024a.size(); i19++) {
                        java.lang.String str = "" + ((i18 * 100) + i19);
                        j34.f fVar = (j34.f) gVar.f379024a.get(i19);
                        if (fVar.f379017a == 2) {
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC17681x5e0a88e4);
                            c21560x1fce98fb.C(str);
                            c21560x1fce98fb.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.d2h;
                            c21560x1fce98fb.L(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f379018b) ? activityC17681x5e0a88e4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3s) : fVar.f379018b);
                            c21560x1fce98fb.H(java.lang.String.format(activityC17681x5e0a88e4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j3r), 108));
                        } else {
                            java.util.List list = fVar.f379021e;
                            if (list != null) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                                if (arrayList.size() > 0) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    for (int i27 = 0; i27 < arrayList.size() && i27 < 3 && (i27 != 2 || fVar.f379018b.length() <= 4); i27++) {
                                        arrayList2.add((java.lang.String) arrayList.get(i27));
                                    }
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17682xe4b6906f c17682xe4b6906f = new com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17682xe4b6906f(activityC17681x5e0a88e4, null);
                                    c17682xe4b6906f.C(str);
                                    c17682xe4b6906f.Q = arrayList2;
                                    c17682xe4b6906f.L(fVar.f379018b);
                                    com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = activityC17681x5e0a88e4.f243757d;
                                    c17682xe4b6906f.P = rVar2;
                                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).d(c17682xe4b6906f, -1);
                                }
                            }
                            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(activityC17681x5e0a88e4);
                            c21560x1fce98fb2.C(str);
                            c21560x1fce98fb2.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.d2h;
                            c21560x1fce98fb2.L(fVar.f379018b);
                            c21560x1fce98fb2.H(fVar.f379019c);
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17681x5e0a88e4.f243757d).d(c21560x1fce98fb2, -1);
                        }
                    }
                }
            }
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17681x5e0a88e4.f243757d).notifyDataSetChanged();
        }
        activityC17681x5e0a88e4.getClass();
        if (iVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f72370x7b28c57e)) {
            return;
        }
        j34.h hVar = new j34.h(iVar);
        activityC17681x5e0a88e4.f243765o = hVar;
        activityC17681x5e0a88e4.f243759f = hVar.c();
        y60.f fVar2 = (y60.f) i95.n0.c(y60.f.class);
        j34.h hVar2 = activityC17681x5e0a88e4.f243765o;
        ((x60.e) fVar2).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(hVar2);
        if (d17 == null) {
            activityC17681x5e0a88e4.f243758e.setImageDrawable(activityC17681x5e0a88e4.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f81261xaaafbbe4));
            return;
        }
        activityC17681x5e0a88e4.f243758e.setImageBitmap(d17);
        activityC17681x5e0a88e4.f243766p = true;
        activityC17681x5e0a88e4.X6();
    }
}
