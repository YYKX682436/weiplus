package bw1;

/* renamed from: bw1.a$$a */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC1348x2ca3e0 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ot1.j n17 = mt1.b0.f412724a.n();
        java.lang.String k17 = gm0.j1.b().k();
        n17.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("msgId", (java.lang.Integer) 0);
        contentValues.put(dm.i4.f66875xa013b0d5, k17);
        contentValues.put("msgType", (java.lang.Integer) 3);
        contentValues.put("msgSubType", (java.lang.Integer) Integer.MIN_VALUE);
        contentValues.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "wcf://notExist/notExist_" + java.lang.System.currentTimeMillis() + ".bin");
        contentValues.put("size", (java.lang.Long) 1000000000L);
        contentValues.put("msgtime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("diskSpace", (java.lang.Long) 1000000000L);
        n17.f430382d.l("WxFileIndex3", "msgId", contentValues);
    }
}
