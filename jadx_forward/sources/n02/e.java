package n02;

/* loaded from: classes4.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.u {
    public void Z(int i17, long j17) {
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, event = %d, appId = %s", java.lang.Integer.valueOf(i17), c17.f68404x28d45f97);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.b(c17.f68404x28d45f97)) {
            if (i17 == 9) {
                java.lang.String str = c17.f68404x28d45f97;
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.d();
                java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178863b;
                if (linkedList.contains(str)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a.remove(str);
                linkedList.addFirst(str);
                q02.b.c(str, 1);
                return;
            }
            if (i17 == 1 || i17 == 7) {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str2 = c17.f68404x28d45f97;
                ((kt.c) i0Var).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str2);
                if (h17 != null && com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, h17.f67386xa1e9e82c)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadStatusChangeEventListener", "onDownloadStatusChange, hasInstall");
                    return;
                }
                java.lang.String str3 = c17.f68404x28d45f97;
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.d();
                java.util.LinkedList linkedList2 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178862a;
                if (linkedList2.contains(str3)) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.f178863b.remove(str3);
                linkedList2.addFirst(str3);
                q02.b.c(str3, 0);
            }
        }
    }
}
