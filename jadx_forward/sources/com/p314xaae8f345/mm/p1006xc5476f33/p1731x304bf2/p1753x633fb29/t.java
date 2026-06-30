package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f222007d;

    public t(java.util.LinkedList linkedList) {
        this.f222007d = linkedList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r2.moveToFirst() != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        r5 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
        r5.mo9015xbf5d97fd(r2);
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r2.moveToNext() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r2.close();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = r7.f222007d
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.game.model.u r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.u) r2
            org.json.JSONObject r2 = r2.f221966a
            java.lang.String r3 = "items"
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            java.util.LinkedList r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.s.a(r2)
            java.util.Iterator r2 = r2.iterator()
        L27:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.game.model.b r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) r3
            java.lang.String r4 = r3.f67370x28d45f97
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r4 != 0) goto L27
            java.lang.String r3 = r3.f67370x28d45f97
            r0.add(r3)
            goto L27
        L41:
            boolean r1 = r53.f.f474186a
            java.lang.Class<lt.q0> r1 = lt.q0.class
            i95.m r2 = i95.n0.c(r1)
            lt.q0 r2 = (lt.q0) r2
            kt.q0 r2 = (kt.q0) r2
            r2.getClass()
            com.tencent.mm.pluginsdk.model.app.z r2 = zo3.p.Ri()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "select * from AppInfo where appType like '%1,%'"
            android.database.Cursor r2 = r2.m145256x1d3f4980(r5, r4)
            if (r2 != 0) goto L67
            java.lang.String r2 = "MicroMsg.AppInfoStorage"
            java.lang.String r4 = "getGameApp : cursor is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r4)
            r2 = 0
        L67:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            if (r2 != 0) goto L76
            java.lang.String r2 = "MicroMsg.GameCenterUtil"
            java.lang.String r5 = "getGameAppInfo failed: curosr is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5)
            goto L90
        L76:
            boolean r5 = r2.moveToFirst()
            if (r5 == 0) goto L8d
        L7c:
            com.tencent.mm.pluginsdk.model.app.m r5 = new com.tencent.mm.pluginsdk.model.app.m
            r5.<init>()
            r5.mo9015xbf5d97fd(r2)
            r4.add(r5)
            boolean r5 = r2.moveToNext()
            if (r5 != 0) goto L7c
        L8d:
            r2.close()
        L90:
            java.util.Iterator r2 = r4.iterator()
        L94:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Ld2
            java.lang.Object r4 = r2.next()
            com.tencent.mm.pluginsdk.model.app.m r4 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) r4
            java.lang.String r5 = r4.f67370x28d45f97
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L94
            i95.m r5 = i95.n0.c(r1)
            lt.q0 r5 = (lt.q0) r5
            kt.q0 r5 = (kt.q0) r5
            r5.getClass()
            com.tencent.mm.pluginsdk.model.app.z r5 = zo3.p.Ri()
            java.lang.String[] r6 = new java.lang.String[r3]
            r5.mo9951xb06685ab(r4, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "delete appid : "
            r5.<init>(r6)
            java.lang.String r4 = r4.f67370x28d45f97
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MicroMsg.GameDataSearchGameList"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
            goto L94
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t.run():void");
    }
}
