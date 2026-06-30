package n62;

/* loaded from: classes11.dex */
public class f extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n62.k f416724a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n62.k kVar, android.os.Looper looper) {
        super(looper);
        this.f416724a = kVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a == null || !gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong status");
            return;
        }
        android.database.Cursor m145256x1d3f4980 = n62.k.Ri().m145256x1d3f4980("select * from OpenMsgListener where (status = ?) ", "1");
        if (m145256x1d3f4980 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler getValidOpenMsgListener cu == null");
            return;
        }
        m145256x1d3f4980.getCount();
        if (m145256x1d3f4980.getCount() <= 0) {
            m145256x1d3f4980.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler cu.getCount() <= 0");
            return;
        }
        try {
            if (m145256x1d3f4980.moveToFirst()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                synchronized (this.f416724a) {
                    hashMap.putAll(this.f416724a.f416734h);
                    this.f416724a.f416734h.clear();
                }
                do {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                    if (hashMap.entrySet() == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler waitForNotify.entrySet() == null");
                        return;
                    }
                    com.p314xaae8f345.mm.p2621x8fb0427b.aa aaVar = new com.p314xaae8f345.mm.p2621x8fb0427b.aa();
                    aaVar.mo9015xbf5d97fd(m145256x1d3f4980);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69143x28d45f97) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69146xa1e9e82c)) {
                        for (java.util.Map.Entry entry : hashMap.entrySet()) {
                            java.lang.String str = (java.lang.String) entry.getKey();
                            if (str == null) {
                                str = "";
                            }
                            java.lang.Integer num = (java.lang.Integer) entry.getValue();
                            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).p(str);
                            if (p17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p17.h1()) && p17.d1() <= 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler no unread in conversation");
                            } else if (!c01.e2.U(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && !c01.e2.G(str)) {
                                com.p314xaae8f345.mm.p2621x8fb0427b.eb y07 = n62.k.Ui().y0(aaVar.f69143x28d45f97, str);
                                if (y07 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67852x996f3ea) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f67853xdec927b)) {
                                    arrayList.add(java.lang.String.format("%s,%s,%s", y07.f67852x996f3ea, num, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - 1600)));
                                }
                                java.lang.Integer num2 = (java.lang.Integer) this.f416724a.f416734h.get(str);
                                if (num2 == null) {
                                    this.f416724a.f416734h.put(str, num);
                                } else {
                                    this.f416724a.f416734h.put(str, java.lang.Integer.valueOf(num2.intValue() + num.intValue()));
                                }
                                linkedList.add(str);
                            }
                        }
                        if (linkedList.size() > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler doGetGetUserInfoInApp");
                            this.f416724a.wi(aaVar.f69143x28d45f97, linkedList);
                        }
                        if (arrayList.size() <= 0) {
                            m145256x1d3f4980.close();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notifyMsgChangeHandler userDataList.size() <= 0");
                            return;
                        }
                        if (!(aaVar.f69148x10a0fed7 == 1)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreExt", "invalid msgListener, appid = %s, package = %s", aaVar.f69143x28d45f97, aaVar.f69146xa1e9e82c);
                        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69143x28d45f97) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aaVar.f69146xa1e9e82c)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreExt", "notify app, appId = %s, package = %s", aaVar.f69143x28d45f97, aaVar.f69146xa1e9e82c);
                            android.content.Intent intent = new android.content.Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_NOTIFY_MSG");
                            intent.addCategory("com.tencent.mm.category." + aaVar.f69146xa1e9e82c);
                            if (fp.h.c(12)) {
                                intent.setFlags(32);
                            }
                            intent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "NEW_MESSAGE");
                            intent.putStringArrayListExtra("EXTRA_EXT_OPEN_USER_DATA", arrayList);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SubCoreExt", "notifyMsgChangeHandler wrong msgListener, appid = %s, package = %s", aaVar.f69143x28d45f97, aaVar.f69146xa1e9e82c);
                } while (m145256x1d3f4980.moveToNext());
            }
            m145256x1d3f4980.close();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SubCoreExt", "Exception in handleMessage, %s", e17.getMessage());
            m145256x1d3f4980.close();
        }
    }
}
