package bw1;

/* loaded from: classes10.dex */
public final /* synthetic */ class a$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ot1.j n17 = mt1.b0.f331191a.n();
        java.lang.String k17 = gm0.j1.b().k();
        n17.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgId", (java.lang.Integer) 0);
        contentValues.put(dm.i4.COL_USERNAME, k17);
        contentValues.put("msgType", (java.lang.Integer) 3);
        contentValues.put("msgSubType", (java.lang.Integer) Integer.MIN_VALUE);
        contentValues.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "wcf://notExist/notExist_" + java.lang.System.currentTimeMillis() + ".bin");
        contentValues.put("size", (java.lang.Long) 1000000000L);
        contentValues.put("msgtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("diskSpace", (java.lang.Long) 1000000000L);
        n17.f348849d.l("WxFileIndex3", "msgId", contentValues);
    }
}
