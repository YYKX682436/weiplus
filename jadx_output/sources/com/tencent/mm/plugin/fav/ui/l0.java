package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f101236d;

    public l0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI) {
        this.f101236d = favBaseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.FavBaseUI activity = this.f101236d;
        com.tencent.mm.plugin.fav.ui.adapter.b d76 = activity.d7();
        if (!d76.isEmpty() && android.os.SystemClock.elapsedRealtime() - activity.f100269g < 400) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "try refresh, time limit, now %d last %d delay %d", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()), java.lang.Long.valueOf(activity.f100269g), 400);
            activity.f100275p.postDelayed(this, 200L);
            return;
        }
        activity.f100266d = false;
        activity.f100269g = android.os.SystemClock.elapsedRealtime();
        d76.notifyDataSetChanged();
        if (!activity.f100268f) {
            activity.i7(d76);
        }
        if (activity.f100267e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteBaseUI", "do scroll to first");
            activity.f100270h.setSelection(0);
            activity.f100267e = false;
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.fav.ui.da daVar = (com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.fav.ui.da.class);
        daVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchManager", "[refreshList] call");
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = daVar.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.c();
        com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = daVar.f100583n;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        } else {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
    }
}
