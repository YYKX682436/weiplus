package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class z5 implements mp3.k {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f287814a;

    public z5(yb5.d dVar) {
        this.f287814a = dVar;
    }

    @Override // mp3.k
    public boolean a(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AvatarDoubleClickListener", "onDoubleClick tag null");
            return true;
        }
        java.lang.String str = erVar.f285439b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarDoubleClickListener", "onDoubleClick: %s", str);
        if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
            if (((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).wi(1, this.f287814a.x(), str)) {
                return false;
            }
        }
        return true;
    }
}
