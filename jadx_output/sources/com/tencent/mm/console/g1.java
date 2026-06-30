package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class g1 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        long currentTimeMillis;
        java.lang.String stringExtra = intent.getStringExtra("sql");
        if (stringExtra != null) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            d95.b0 a17 = ai4.m0.f5173a.a();
            android.database.Cursor cursor = null;
            try {
                try {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    cursor = a17.o(com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY, stringExtra, null, null, null);
                } catch (java.lang.RuntimeException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusFeatureService", "Failed to execute SQL '%s': %s", stringExtra, e17.getMessage());
                    if (cursor == null) {
                        return;
                    }
                }
                if (cursor == null) {
                    return;
                }
                java.lang.String[] columnNames = cursor.getColumnNames();
                int length = columnNames != null ? columnNames.length : 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "Executing SQL from shell: ".concat(stringExtra));
                if (length > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" > ");
                    kotlin.jvm.internal.o.d(columnNames);
                    sb6.append(android.text.TextUtils.join(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG, columnNames));
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb6.toString());
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(1024);
                while (cursor.moveToNext()) {
                    sb7.setLength(0);
                    sb7.append(" > ");
                    for (int i17 = 0; i17 < length; i17++) {
                        int type = cursor.getType(i17);
                        if (type == 0) {
                            sb7.append("(null)");
                        } else if (type != 4) {
                            sb7.append(cursor.getString(i17));
                        } else {
                            sb7.append("(blob)");
                        }
                        sb7.append(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb7.toString());
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "Finish executing SQL in %d ms: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), stringExtra);
                cursor.close();
            } catch (java.lang.Throwable th6) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th6;
            }
        }
    }
}
