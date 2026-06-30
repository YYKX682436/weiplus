package com.tencent.mm.modelgetchatroommsg;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f71233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelgetchatroommsg.b f71234e;

    public a(com.tencent.mm.modelgetchatroommsg.b bVar, java.lang.String str) {
        this.f71234e = bVar;
        this.f71233d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71234e.getClass();
        java.lang.String str = this.f71233d;
        java.lang.String str2 = "MicroMsg.GetChatroomMsgChecker";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgChecker", "[checkDirtyBlock] username is null!");
            return;
        }
        long a17 = c01.id.a();
        long j17 = a17 - 259200000;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgChecker", "[checkDirtyBlock] serverTime:" + a17 + " beforeTime:" + j17 + " beforeTime format:" + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, j17 / 1000) + "username:" + str);
        com.tencent.mm.storage.d3 d3Var = (com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi();
        com.tencent.mm.storage.c3 i17 = d3Var.i(str);
        if (i17.field_seqBlockInfo != null) {
            java.util.LinkedList<mo.c> linkedList = new java.util.LinkedList();
            mo.d dVar = i17.field_seqBlockInfo;
            if (dVar != null) {
                java.util.Iterator it = dVar.f330255d.iterator();
                while (it.hasNext()) {
                    mo.c cVar = (mo.c) it.next();
                    if (cVar.f330254g <= j17) {
                        linkedList.add(cVar);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear:");
            for (mo.c cVar2 : linkedList) {
                sb6.append("[" + cVar2.f330251d);
                sb6.append(":");
                sb6.append(cVar2.f330252e + "] time:");
                sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, cVar2.f330254g / 1000));
                sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                i17.field_seqBlockInfo.f330255d.remove(cVar2);
                str = str;
            }
            java.lang.String str3 = str;
            sb6.append("\nafter:");
            java.util.Iterator it6 = i17.field_seqBlockInfo.f330255d.iterator();
            while (it6.hasNext()) {
                mo.c cVar3 = (mo.c) it6.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[");
                sb7.append(cVar3.f330251d);
                sb6.append(sb7.toString());
                sb6.append(":");
                sb6.append(cVar3.f330252e + "] time:");
                sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, cVar3.f330254g / 1000));
                sb6.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                str2 = str2;
                d3Var = d3Var;
            }
            com.tencent.mm.storage.d3 d3Var2 = d3Var;
            java.lang.String str4 = str2;
            if (linkedList.size() > 0) {
                com.tencent.mars.xlog.Log.i(str4, "[checkDirtyBlock] ret:" + d3Var2.o(i17) + " result:" + sb6.toString());
            }
            int size = linkedList.size();
            int size2 = i17.field_seqBlockInfo.f330255d.size();
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomReporter", "[report] chatroomId:%s cleanCount:%s count:%s ", str3, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(size2));
            if (size > 0) {
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.idkeyStat(403L, 67L, 1L, true);
                fVar.idkeyStat(403L, 68L, size, true);
            }
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.idkeyStat(403L, 70L, size2, true);
            if (size2 <= 5) {
                fVar2.idkeyStat(403L, 71L, 1L, true);
                return;
            }
            if (size2 <= 10) {
                fVar2.idkeyStat(403L, 72L, 1L, true);
                return;
            }
            if (size2 <= 20) {
                fVar2.idkeyStat(403L, 73L, 1L, true);
                return;
            }
            if (size2 <= 30) {
                fVar2.idkeyStat(403L, 74L, 1L, true);
            } else if (size2 <= 50) {
                fVar2.idkeyStat(403L, 75L, 1L, true);
            } else {
                fVar2.idkeyStat(403L, 76L, 1L, true);
            }
        }
    }
}
