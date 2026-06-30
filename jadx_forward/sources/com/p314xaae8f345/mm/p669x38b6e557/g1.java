package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes11.dex */
public class g1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        long currentTimeMillis;
        java.lang.String stringExtra = intent.getStringExtra("sql");
        if (stringExtra != null) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            d95.b0 a17 = ai4.m0.f86706a.a();
            android.database.Cursor cursor = null;
            try {
                try {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                    cursor = a17.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, stringExtra, null, null, null);
                } catch (java.lang.RuntimeException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.TextStatusFeatureService", "Failed to execute SQL '%s': %s", stringExtra, e17.getMessage());
                    if (cursor == null) {
                        return;
                    }
                }
                if (cursor == null) {
                    return;
                }
                java.lang.String[] columnNames = cursor.getColumnNames();
                int length = columnNames != null ? columnNames.length : 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "Executing SQL from shell: ".concat(stringExtra));
                if (length > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" > ");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(columnNames);
                    sb6.append(android.text.TextUtils.join(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa, columnNames));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb6.toString());
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
                        sb7.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", sb7.toString());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "Finish executing SQL in %d ms: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), stringExtra);
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
