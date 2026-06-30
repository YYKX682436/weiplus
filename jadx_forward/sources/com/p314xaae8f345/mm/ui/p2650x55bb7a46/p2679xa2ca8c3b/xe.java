package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public abstract class xe {
    public static boolean a(yb5.d dVar, db5.g4 g4Var, android.view.View view, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        ot0.q v17 = ot0.q.v(c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0()));
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, content is null");
            return true;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        if (!((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false)) || com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.k(f9Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, do not show transmit menu");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgWeishiVideo", "createContextMenu, show transmit menu");
        g4Var.c(d17, 111, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        return true;
    }
}
