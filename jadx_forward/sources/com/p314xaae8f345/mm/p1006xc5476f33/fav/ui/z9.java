package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public final class z9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da f183208d;

    public z9(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar) {
        this.f183208d = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "do refresh job");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = this.f183208d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = daVar.f182116n;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
        cVar.c();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = daVar.f182116n;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResultAdapter");
            throw null;
        }
    }
}
