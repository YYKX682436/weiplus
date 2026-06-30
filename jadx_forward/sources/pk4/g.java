package pk4;

/* loaded from: classes10.dex */
public final class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c f438016d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c) {
        this.f438016d = c18689xd498e45c;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        dk4.a aVar;
        dk4.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what == this.f438016d.m71937x82eafa8f()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c c18689xd498e45c = this.f438016d;
            kk4.v currentPlayer = c18689xd498e45c.getCurrentPlayer();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "onCompletion " + currentPlayer + ' ' + c18689xd498e45c.c());
            java.lang.String str = c18689xd498e45c.f256045d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToNext ");
            sb6.append(c18689xd498e45c.c());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recreatePlayer currentPlayer:");
            sb7.append(c18689xd498e45c.currentPlayer);
            sb7.append(", playerSurface:");
            android.view.Surface surface = c18689xd498e45c.f256058t;
            sb7.append(surface != null ? surface.hashCode() : 0);
            java.lang.String sb8 = sb7.toString();
            java.lang.String str2 = c18689xd498e45c.f256045d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb8);
            kk4.v vVar = c18689xd498e45c.currentPlayer;
            if (vVar != null) {
                vVar.F(null);
                vVar.R();
                kk4.b.e(vVar, null, 1, null);
                vVar.P();
                vVar.mo143590x408b7293();
                c18689xd498e45c.reportInfo.a(c18689xd498e45c.currentPlayIndex, vVar.L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "removeCompleteTimer");
            kk4.v vVar2 = c18689xd498e45c.currentPlayer;
            if (vVar2 != null) {
                kk4.b.g(vVar2, null, 0L, 2, null);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c18689xd498e45c.playTimer;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
            android.content.Context context = c18689xd498e45c.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            kk4.v vVar3 = new kk4.v(context);
            gk4.h0 h0Var = c18689xd498e45c.effector;
            h0Var.getClass();
            vVar3.F(new gk4.w(h0Var));
            c18689xd498e45c.currentPlayer = vVar3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "recreatePlayer finished, cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            c18689xd498e45c.currentPlayIndex = c18689xd498e45c.currentPlayIndex + 1;
            java.util.List list = c18689xd498e45c.mediaInfoList;
            if ((list != null ? list.size() : 0) <= c18689xd498e45c.currentPlayIndex) {
                c18689xd498e45c.currentPlayIndex = 0;
            }
            java.util.List list2 = c18689xd498e45c.mediaInfoList;
            if (list2 != null && (aVar = (dk4.a) list2.get(c18689xd498e45c.currentPlayIndex)) != null) {
                kk4.v vVar4 = c18689xd498e45c.currentPlayer;
                if (vVar4 != null) {
                    vVar4.B(aVar);
                }
                kk4.v vVar5 = c18689xd498e45c.currentPlayer;
                long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                java.lang.String str3 = c18689xd498e45c.f256045d;
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("initPlayer ");
                sb9.append(c18689xd498e45c.c());
                sb9.append(", playerSurface:");
                android.view.Surface surface2 = c18689xd498e45c.f256058t;
                sb9.append(surface2 != null ? surface2.hashCode() : 0);
                sb9.append(", player:");
                sb9.append(vVar5 != null ? vVar5.hashCode() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb9.toString());
                if (vVar5 != null) {
                    vVar5.f390118j = true;
                }
                if (vVar5 != null) {
                    vVar5.C(true);
                }
                if (vVar5 != null) {
                    dk4.a aVar3 = vVar5.f390111c;
                    vVar5.A(aVar3 != null ? aVar3.f316008l : false);
                }
                if (vVar5 != null && (aVar2 = vVar5.f390111c) != null) {
                    vVar5.P = aVar2.f316012p;
                    pk4.u uVar = c18689xd498e45c.mediaChangeListener;
                    if (uVar != null) {
                        uVar.a(c18689xd498e45c.currentPlayIndex, aVar2);
                    }
                }
                if (vVar5 != null) {
                    vVar5.I(new pk4.k(c18689xd498e45c, vVar5), c18689xd498e45c.f256059u);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "start recreatePlayerSurface");
                long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
                android.view.Surface surface3 = c18689xd498e45c.f256058t;
                if (surface3 != null) {
                    surface3.release();
                }
                c18689xd498e45c.f256058t = null;
                c18689xd498e45c.f256057s = null;
                gk4.h0 h0Var2 = c18689xd498e45c.effector;
                pk4.l lVar = new pk4.l(c18689xd498e45c, vVar5, elapsedRealtime3);
                h0Var2.getClass();
                h0Var2.e(new gk4.b0(h0Var2, lVar));
                c18689xd498e45c.logFrameRender = false;
                if (vVar5 != null) {
                    vVar5.f390132x = c18689xd498e45c.playerActionListener;
                }
                java.lang.String str4 = c18689xd498e45c.f256045d;
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder("initPlayer ");
                sb10.append(vVar5 != null ? vVar5.w() : null);
                sb10.append(", currentPlayIndex:");
                sb10.append(c18689xd498e45c.currentPlayIndex);
                sb10.append(", cost:");
                sb10.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb10.toString());
                c18689xd498e45c.A = android.os.SystemClock.elapsedRealtime();
                kk4.v vVar6 = c18689xd498e45c.currentPlayer;
                if (vVar6 != null) {
                    vVar6.O();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18689xd498e45c.d(c18689xd498e45c, false, false, 2, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18689xd498e45c.f256045d, "start play " + c18689xd498e45c.c());
                jk4.e eVar = c18689xd498e45c.reportInfo;
                eVar.getClass();
                eVar.f381684b = android.os.SystemClock.elapsedRealtime();
            }
        }
        return false;
    }
}
