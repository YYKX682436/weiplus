package eu1;

/* loaded from: classes15.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f338283e;

    public d(java.lang.String str, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f338282d = str;
        this.f338283e = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "begin to getShareUserInfo()");
        fu1.i nj6 = xt1.t0.nj();
        nj6.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo()");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" where ( status=0) ");
        sb6.append(" AND (card_tp_id = '" + this.f338282d + "' )");
        sb6.append(" order by share_time desc ");
        java.util.ArrayList arrayList = null;
        android.database.Cursor f17 = nj6.f348378d.f("select * from ShareCardInfo" + sb6.toString(), null, 2);
        if (f17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardInfoStorage", "getShareUserInfo(), cursor == null");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            while (f17.moveToNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd c13039x2a59e0bd = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.p1313x633fb29.C13039x2a59e0bd();
                c13039x2a59e0bd.mo9015xbf5d97fd(f17);
                if (arrayList3.contains(c13039x2a59e0bd.f66681x7697d746)) {
                    int i17 = 0;
                    fu1.p pVar = null;
                    while (true) {
                        if (i17 >= arrayList2.size()) {
                            i17 = 0;
                            break;
                        }
                        pVar = (fu1.p) arrayList2.get(i17);
                        java.lang.String str = c13039x2a59e0bd.f66681x7697d746;
                        if (str != null && str.equals(pVar.f348399a)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (pVar != null) {
                        pVar.f348402d.add(0, c13039x2a59e0bd.f66675x95970a65);
                        pVar.f348401c++;
                        arrayList2.set(i17, pVar);
                    }
                } else {
                    fu1.p pVar2 = new fu1.p();
                    pVar2.f348400b = c13039x2a59e0bd.f66676xf4648834;
                    pVar2.f348399a = c13039x2a59e0bd.f66681x7697d746;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    pVar2.f348402d = arrayList4;
                    arrayList4.add(c13039x2a59e0bd.f66675x95970a65);
                    pVar2.f348401c = 1;
                    arrayList2.add(pVar2);
                    arrayList3.add(c13039x2a59e0bd.f66681x7697d746);
                }
            }
            f17.close();
            arrayList = arrayList2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 1");
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareCardDataMgr", "getShareUserInfo(), share_user_list is null");
            return;
        }
        if (arrayList.get(0) != null) {
            ((fu1.p) arrayList.get(0)).f348403e = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardDataMgr", "end to getShareUserInfo(), 2");
        this.f338283e.mo50293x3498a0(new eu1.c(this, arrayList));
    }
}
