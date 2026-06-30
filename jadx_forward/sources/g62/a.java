package g62;

/* loaded from: classes12.dex */
public class a implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5668xbf8f173b f350605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g62.b f350606e;

    public a(g62.b bVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5668xbf8f173b c5668xbf8f173b) {
        this.f350606e = bVar;
        this.f350605d = c5668xbf8f173b;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "callbackOfKvReportEvent_tasks";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap;
        boolean z17;
        q42.l lVar = g42.f.Bi().f350254d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5668xbf8f173b c5668xbf8f173b = this.f350605d;
        am.ji jiVar = c5668xbf8f173b.f135993g;
        java.lang.String str = jiVar.f88567b;
        int i17 = (int) jiVar.f88566a;
        lVar.getClass();
        if (g42.i.h()) {
            if (((java.util.HashMap) l42.n.Ai().f397534f).containsKey(java.lang.String.valueOf(i17))) {
                if (i17 <= 0 || u46.l.e(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV data or reportID isEmpty!");
                } else {
                    g42.i.a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendKV reportID : " + i17 + ", data : " + str);
                    lVar.f441614b.mo50293x3498a0(new q42.c(lVar, i17, java.lang.System.currentTimeMillis(), str));
                }
            }
        }
        am.ji jiVar2 = c5668xbf8f173b.f135993g;
        long j17 = jiVar2.f88566a;
        java.lang.String str2 = jiVar2.f88567b;
        g62.b bVar = this.f350606e;
        bVar.getClass();
        if (j17 != 11110 && j17 != 11108 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar.f350607d))) {
            g62.i iVar = new g62.i();
            iVar.f350624h = str2;
            iVar.f350621e = 10001;
            iVar.f350623g = (int) j17;
            gm0.j1.d().g(iVar);
        }
        long j18 = jiVar2.f88566a;
        java.lang.String str3 = jiVar2.f88567b;
        if (!bVar.f350608e || (hashMap = bVar.f350609f) == null) {
            return;
        }
        java.util.List list = (java.util.List) hashMap.get(j18 + "");
        if (list == null) {
            list = new java.util.LinkedList();
            z17 = false;
        } else {
            g62.h hVar = (g62.h) list.get(list.size() - 1);
            hVar.getClass();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            boolean z19 = java.lang.System.currentTimeMillis() - hVar.f350617b < 1000;
            if (z19) {
                hVar.f350619d = true;
            }
            z17 = z19;
        }
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        list.add(0, new g62.h(j18, str3, java.lang.System.currentTimeMillis(), z17));
        hashMap.put(j18 + "", list);
    }
}
