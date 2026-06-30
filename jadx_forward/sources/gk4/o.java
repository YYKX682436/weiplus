package gk4;

/* loaded from: classes10.dex */
public final class o extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354125d;

    public o(gk4.r rVar) {
        this.f354125d = rVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        long j17;
        hk4.a aVar;
        gk4.s sVar;
        dk4.a aVar2;
        hk4.a aVar3;
        gk4.s sVar2;
        jk4.a aVar4;
        gk4.t tVar;
        java.util.ArrayList arrayList;
        int indexOf;
        if (this.f354125d.f354139k.isEmpty() && this.f354125d.f354140l.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354125d.f354135g, "finished play all player");
            this.f354125d.m();
        }
        if (this.f354125d.f354152x >= 0) {
            gk4.r rVar = this.f354125d;
            rVar.f354145q = rVar.f354152x;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354125d.f354135g, "onProgressUpdate set renderPts to seekTime:" + this.f354125d.f354152x);
            this.f354125d.f354152x = -1L;
        } else {
            gk4.r rVar2 = this.f354125d;
            long j18 = rVar2.f354145q;
            if (this.f354125d.f354149u > 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j17 = android.os.SystemClock.elapsedRealtime() - this.f354125d.f354149u;
            } else {
                j17 = gk4.r.E;
            }
            rVar2.f354145q = j18 + j17;
        }
        gk4.r rVar3 = this.f354125d;
        um5.i0 i0Var = rVar3.f354136h;
        long j19 = rVar3.f354145q;
        i0Var.getClass();
        i0Var.f(new um5.t(i0Var, j19));
        gk4.r rVar4 = this.f354125d;
        long j27 = rVar4.f354145q;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = rVar4.f354139k;
        java.lang.String str = null;
        if ((!concurrentLinkedDeque.isEmpty()) && (sVar2 = (aVar3 = (hk4.a) concurrentLinkedDeque.getFirst()).f363462h) != null && j27 >= (sVar2.f354157c + sVar2.f354161g.f479064c) - gk4.r.E) {
            rVar4.f354136h.k(aVar3.f363463i);
            aVar3.o();
            aVar3.g();
            hk4.x xVar = aVar3 instanceof hk4.x ? (hk4.x) aVar3 : null;
            if (xVar != null && (aVar4 = xVar.f363519l.L) != null && (tVar = rVar4.f354142n) != null && (arrayList = tVar.f354163a) != null && (indexOf = arrayList.indexOf(sVar2)) >= 0) {
                rVar4.B.a(indexOf, aVar4);
            }
            yz5.l lVar = aVar3.f363459e;
            if (lVar != null) {
                lVar.mo146xb9724478(aVar3);
            }
            concurrentLinkedDeque.remove(aVar3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar4.f354135g, "checkRemovePlayerTexture pts:" + j27 + ", remove player texture:" + aVar3.f363463i + ", type:" + aVar3.d() + ", playingPlayers.size:" + concurrentLinkedDeque.size());
        }
        gk4.r rVar5 = this.f354125d;
        long j28 = rVar5.f354145q;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = rVar5.f354140l;
        if ((!concurrentLinkedDeque2.isEmpty()) && (sVar = (aVar = (hk4.a) concurrentLinkedDeque2.getFirst()).f363462h) != null && j28 >= sVar.f354156b && !aVar.c()) {
            concurrentLinkedDeque2.removeFirst();
            aVar.n();
            java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque3 = rVar5.f354139k;
            concurrentLinkedDeque3.add(aVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkToPlayNext, now can play next media, pts:");
            sb6.append(j28);
            sb6.append(", key:");
            gk4.s sVar3 = aVar.f363462h;
            if (sVar3 != null && (aVar2 = sVar3.f354162h) != null) {
                str = aVar2.f316015s;
            }
            sb6.append(str);
            sb6.append(", type:");
            sb6.append(aVar.d());
            sb6.append(", track.startTime:");
            sb6.append(sVar.f354156b);
            sb6.append(", playingPlayers.size:");
            sb6.append(concurrentLinkedDeque3.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar5.f354135g, sb6.toString());
        }
        long j29 = this.f354125d.f354145q;
        long j37 = this.f354125d.f354151w;
        if ((1 <= j37 && j37 <= j29) && this.f354125d.f354150v >= 0) {
            pm0.v.X(new gk4.p(this.f354125d));
        }
        gk4.r rVar6 = this.f354125d;
        rVar6.getClass();
        pm0.v.X(new gk4.f(rVar6));
        gk4.r rVar7 = this.f354125d;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        rVar7.f354149u = android.os.SystemClock.elapsedRealtime();
    }
}
