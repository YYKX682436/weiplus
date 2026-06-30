package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o f182447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f182448e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar, boolean z17) {
        this.f182447d = oVar;
        this.f182448e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o oVar = this.f182447d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a aVar = oVar.f182554e;
        int i17 = oVar.f182558i.get();
        int i18 = oVar.f182559m;
        java.util.List list = oVar.f182557h;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.u0) aVar;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BatchSave] Complete: success=");
        sb6.append(this.f182448e);
        sb6.append(", saved=");
        sb6.append(i17);
        sb6.append("/");
        sb6.append(i18);
        sb6.append(", failed=");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", sb6.toString());
        boolean isEmpty = arrayList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = u0Var.f182617a;
        if (isEmpty) {
            java.lang.String string = h0Var.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573452nx5);
            int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(h0Var.f182485l);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            java.lang.String string2 = h0Var.f182485l.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573447nx4);
            android.app.Activity activity = h0Var.f182485l;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
            u1Var.g(string2);
            u1Var.n(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_g));
            u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.C13602x6871ba6());
            u1Var.q(false);
        }
        if (h0Var.f182474a == null || !com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.f182452b) {
            return;
        }
        h0Var.i();
    }
}
