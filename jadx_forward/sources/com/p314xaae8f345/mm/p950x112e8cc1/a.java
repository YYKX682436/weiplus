package com.p314xaae8f345.mm.p950x112e8cc1;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p950x112e8cc1.b f152767e;

    public a(com.p314xaae8f345.mm.p950x112e8cc1.b bVar, java.lang.String str) {
        this.f152767e = bVar;
        this.f152766d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f152767e.getClass();
        java.lang.String str = this.f152766d;
        java.lang.String str2 = "MicroMsg.GetChatroomMsgChecker";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgChecker", "[checkDirtyBlock] username is null!");
            return;
        }
        long a17 = c01.id.a();
        long j17 = a17 - 259200000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgChecker", "[checkDirtyBlock] serverTime:" + a17 + " beforeTime:" + j17 + " beforeTime format:" + k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, j17 / 1000) + "username:" + str);
        com.p314xaae8f345.mm.p2621x8fb0427b.d3 d3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        com.p314xaae8f345.mm.p2621x8fb0427b.c3 i17 = d3Var.i(str);
        if (i17.f69294xbf0c1c61 != null) {
            java.util.LinkedList<mo.c> linkedList = new java.util.LinkedList();
            mo.d dVar = i17.f69294xbf0c1c61;
            if (dVar != null) {
                java.util.Iterator it = dVar.f411788d.iterator();
                while (it.hasNext()) {
                    mo.c cVar = (mo.c) it.next();
                    if (cVar.f411787g <= j17) {
                        linkedList.add(cVar);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear:");
            for (mo.c cVar2 : linkedList) {
                sb6.append("[" + cVar2.f411784d);
                sb6.append(":");
                sb6.append(cVar2.f411785e + "] time:");
                sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, cVar2.f411787g / 1000));
                sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                i17.f69294xbf0c1c61.f411788d.remove(cVar2);
                str = str;
            }
            java.lang.String str3 = str;
            sb6.append("\nafter:");
            java.util.Iterator it6 = i17.f69294xbf0c1c61.f411788d.iterator();
            while (it6.hasNext()) {
                mo.c cVar3 = (mo.c) it6.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
                sb7.append(cVar3.f411784d);
                sb6.append(sb7.toString());
                sb6.append(":");
                sb6.append(cVar3.f411785e + "] time:");
                sb6.append(k35.m1.d(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, cVar3.f411787g / 1000));
                sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                str2 = str2;
                d3Var = d3Var;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.d3 d3Var2 = d3Var;
            java.lang.String str4 = str2;
            if (linkedList.size() > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "[checkDirtyBlock] ret:" + d3Var2.o(i17) + " result:" + sb6.toString());
            }
            int size = linkedList.size();
            int size2 = i17.f69294xbf0c1c61.f411788d.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s cleanCount:%s count:%s ", str3, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
            if (size > 0) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.mo68477x336bdfd8(403L, 67L, 1L, true);
                fVar.mo68477x336bdfd8(403L, 68L, size, true);
            }
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.mo68477x336bdfd8(403L, 70L, size2, true);
            if (size2 <= 5) {
                fVar2.mo68477x336bdfd8(403L, 71L, 1L, true);
                return;
            }
            if (size2 <= 10) {
                fVar2.mo68477x336bdfd8(403L, 72L, 1L, true);
                return;
            }
            if (size2 <= 20) {
                fVar2.mo68477x336bdfd8(403L, 73L, 1L, true);
                return;
            }
            if (size2 <= 30) {
                fVar2.mo68477x336bdfd8(403L, 74L, 1L, true);
            } else if (size2 <= 50) {
                fVar2.mo68477x336bdfd8(403L, 75L, 1L, true);
            } else {
                fVar2.mo68477x336bdfd8(403L, 76L, 1L, true);
            }
        }
    }
}
