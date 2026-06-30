package ny1;

/* loaded from: classes13.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f422941d;

    /* renamed from: e, reason: collision with root package name */
    public final ny1.a f422942e;

    /* renamed from: f, reason: collision with root package name */
    public final ny1.k f422943f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f422944g;

    /* renamed from: h, reason: collision with root package name */
    public long f422945h = 0;

    public j(ny1.a aVar, ny1.k kVar) {
        this.f422942e = aVar;
        this.f422943f = kVar;
        kVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f422949c;
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                linkedList.add((r45.pq5) it.next());
            }
        }
        this.f422944g = linkedList;
    }

    public final java.lang.String H() {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it = this.f422944g.iterator();
        while (it.hasNext()) {
            r45.pq5 pq5Var = (r45.pq5) it.next();
            int i17 = ny1.k.f422946k;
            try {
                java.lang.String optString = new org.json.JSONObject(pq5Var.f464849g).optString("feedid", "null");
                r45.nq5 nq5Var = pq5Var.f464846d;
                str = java.lang.String.format("%s_[%s]_[%s]_[%s]_[%s]", nq5Var.f463136e, pq5Var.f464847e, optString, nq5Var.f463140i, pq5Var.f464850h);
            } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                str = "";
            }
            stringBuffer.append(str);
            stringBuffer.append("||");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str2 = pq5Var.f464850h;
            try {
                n51.f.b(jSONObject, "item_type", java.lang.Integer.valueOf(pq5Var.f464846d.f463135d));
                n51.f.b(jSONObject, ya.b.f77482xa8eebdc7, pq5Var.f464846d.f463136e);
                n51.f.b(jSONObject, "sdk_session_id", pq5Var.f464846d.f463140i);
                jSONObject.put("curPageJson", new org.json.JSONObject(pq5Var.f464846d.f463137f));
                jSONObject.put("refPageJson", new org.json.JSONObject(pq5Var.f464846d.f463139h));
                jSONObject.put("sourcePageJson", new org.json.JSONObject(pq5Var.f464846d.f463138g));
                n51.f.b(jSONObject, "event_id", pq5Var.f464847e);
                n51.f.f416647a.d(jSONObject, "event_time", pq5Var.f464848f, false);
                jSONObject.toString();
            } catch (org.json.JSONException | java.lang.Exception unused2) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "simpleInfo %s", stringBuffer.toString());
        return stringBuffer2.toString();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        ny1.k kVar = this.f422943f;
        ny1.a aVar = this.f422942e;
        this.f422941d = u0Var;
        try {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f422945h = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = new r45.qq5();
            lVar.f152198b = new r45.rq5();
            lVar.f152199c = aVar.f422930c;
            lVar.f152200d = aVar.f422929b;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            r45.qq5 qq5Var = (r45.qq5) a17.f152243a.f152217a;
            qq5Var.f465739e = "3.1.1";
            qq5Var.f465738d = aVar.f422928a;
            java.util.LinkedList linkedList = this.f422944g;
            qq5Var.f465743i = linkedList;
            r45.uq5 uq5Var = new r45.uq5();
            qq5Var.f465740f = uq5Var;
            uq5Var.f469110d = java.lang.System.currentTimeMillis();
            qq5Var.f465740f.f469111e = c01.id.c();
            qq5Var.f465744m = kVar.f422956j;
            long j17 = qq5Var.f465740f.f469110d;
            android.os.SystemClock.elapsedRealtime();
            qq5Var.f465742h = sz1.a.d();
            qy1.g.m(qq5Var.mo75928xcd1e8d8(), kVar.f422948b);
            H();
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 0);
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = aVar;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[3] = java.lang.Integer.valueOf(qq5Var.mo75928xcd1e8d8());
            objArr[4] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f422945h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "NetSceneCliReportData doscene [%d] info[%s] dataList[%d] req[%d] cost[%d]", objArr);
            return mo9409x10f9447a(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKCGIReport.NetSceneCliReportData", "do scene error[%s]", e17.toString());
            return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return this.f422942e.f422929b;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        long j17 = this.f422945h;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y((int) (elapsedRealtime / 1000), new int[]{1, 2, 3, 4}, 6, 10));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "on gy end [%d]. errType[%d] erroCode[%d] errMsg[%s] cost[%d] res[%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(q17));
        if (i18 == 0 && i19 == 0) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 1);
            fVar.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, q17);
            r45.rq5 rq5Var = (r45.rq5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            if (rq5Var != null) {
                long j18 = rq5Var.f466657d;
                ny1.k kVar = this.f422943f;
                kVar.f422952f = j18;
                kVar.f422953g = rq5Var.f466658e;
                long j19 = kVar.f422956j;
                long j27 = rq5Var.f466660g;
                if (j19 != j27) {
                    kVar.f422956j = j27;
                    kVar.f422955i.addAll(rq5Var.f466659f);
                }
            }
        } else {
            jx3.f.INSTANCE.t(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8, 2);
        }
        this.f422941d.mo815x76e0bfae(i18, i19, str, this);
    }
}
