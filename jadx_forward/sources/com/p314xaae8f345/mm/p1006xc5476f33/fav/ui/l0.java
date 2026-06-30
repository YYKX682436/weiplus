package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182769d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182769d = abstractActivityC13548xbf543800;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 activity = this.f182769d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.b d76 = activity.d7();
        if (!d76.isEmpty() && android.os.SystemClock.elapsedRealtime() - activity.f181802g < 400) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), java.lang.Long.valueOf(activity.f181802g), 400);
            activity.f181808p.mo50297x7c4d7ca2(this, 200L);
            return;
        }
        activity.f181799d = false;
        activity.f181802g = android.os.SystemClock.elapsedRealtime();
        d76.notifyDataSetChanged();
        if (!activity.f181801f) {
            activity.i7(d76);
        }
        if (activity.f181800e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteBaseUI", "do scroll to first");
            activity.f181803h.setSelection(0);
            activity.f181800e = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da daVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.da.class);
        daVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchManager", "[refreshList] call");
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
