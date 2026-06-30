package he0;

/* loaded from: classes4.dex */
public class k extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str = "callback";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        if (gm0.j1.a()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Y;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "dumptable");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            long b27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b2();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.m2 Hj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Hj();
            Hj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.database.Cursor f17 = Hj.f247598d.f("select count(*) from SnsMedia", null, 2);
            int i18 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.snsMediaStorage", "media table count %d passed %d", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsMediaStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 Ej = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej();
            Ej.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            android.database.Cursor f18 = Ej.f247504e.f("select count(*) from snsExtInfo3", null, 2);
            int i19 = f18.moveToFirst() ? f18.getInt(0) : 0;
            f18.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExtStorage", "ext table count %d passed %d", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTableCount", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            stringBuffer.append(" snscount " + b27);
            stringBuffer.append(" mediacount " + i18);
            stringBuffer.append(" extcount " + i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCore", "dump table " + stringBuffer.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dumpTable", "com.tencent.mm.plugin.sns.model.SnsCore");
            str = "callback";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DumpSnsTableInfoListener", "DumpSnsTableInfoEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.feature.sns.listener.DumpSnsTableInfoListener");
        return false;
    }
}
