package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class q1 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        final l75.k0 k0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            final java.lang.String stringExtra = intent.getStringExtra("sql");
            final java.lang.String stringExtra2 = intent.getStringExtra("file");
            java.lang.String stringExtra3 = intent.getStringExtra("dbName");
            if (stringExtra3 != null && stringExtra3.equals(ya.b.f77479x42930b2)) {
                k0Var = mt1.b0.f412724a.n().f430382d;
            } else if (stringExtra3 != null && stringExtra3.equals("backup")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a;
                k0Var = new d95.b0(d95.f.t(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174453g, false));
            } else if (stringExtra3 == null || !stringExtra3.equals("dupcheck")) {
                k0Var = gm0.j1.u().f354686f;
            } else {
                k0Var = new d95.b0(d95.f.t(gm0.j1.u().h() + "DupCheck-1.db", false));
            }
            if (stringExtra != null && !stringExtra.isEmpty()) {
                ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.console.q1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        l75.k0 k0Var2 = l75.k0.this;
                        java.lang.String str = stringExtra;
                        android.database.Cursor cursor = null;
                        try {
                            try {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                cursor = k0Var2.B(str, null);
                                java.lang.String[] columnNames = cursor.getColumnNames();
                                int length = columnNames == null ? 0 : columnNames.length;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Executing SQL from shell: " + str);
                                if (length > 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", " > " + android.text.TextUtils.join(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa, columnNames));
                                }
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(1024);
                                while (cursor.moveToNext()) {
                                    sb6.setLength(0);
                                    sb6.append(" > ");
                                    for (int i17 = 0; i17 < length; i17++) {
                                        int type = cursor.getType(i17);
                                        if (type == 0) {
                                            sb6.append("(null)");
                                        } else if (type != 4) {
                                            sb6.append(cursor.getString(i17));
                                        } else {
                                            sb6.append("(blob)");
                                        }
                                        sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa);
                                    }
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", sb6.toString());
                                }
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "Finish executing SQL in %d ms: %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), str);
                            } catch (java.lang.RuntimeException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Failed to execute SQL '%s': %s", str, e17.getMessage());
                                if (cursor == null) {
                                    return;
                                }
                            }
                            cursor.close();
                        } catch (java.lang.Throwable th6) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th6;
                        }
                    }
                });
            } else {
                if (stringExtra2 == null || stringExtra2.isEmpty()) {
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.console.q1$$b
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
                    
                        if (r3.G() != false) goto L32;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
                    
                        r3.w(java.lang.Long.valueOf(r4));
                        r7 = r7;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
                    
                        return;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
                    
                        if (r3.G() == false) goto L50;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
                    
                        if (r3.G() == false) goto L50;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r13 = this;
                            java.lang.String r0 = r2
                            java.lang.String r1 = "MicroMsg.Shell"
                            java.lang.String r2 = "Executing SQL from file: "
                            l75.k0 r3 = l75.k0.this
                            long r4 = r3.b()
                            r6 = 0
                            r7 = 0
                            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b java.io.FileNotFoundException -> L7e
                            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b java.io.FileNotFoundException -> L7e
                            com.tencent.mm.vfs.z6 r11 = new com.tencent.mm.vfs.z6     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b java.io.FileNotFoundException -> L7e
                            r11.<init>(r0)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b java.io.FileNotFoundException -> L7e
                            r10.<init>(r11)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b java.io.FileNotFoundException -> L7e
                            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            r11.<init>(r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            r11.append(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                        L2b:
                            java.lang.String r2 = r10.readLine()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            if (r2 == 0) goto L35
                            r3.A(r7, r2)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            goto L2b
                        L35:
                            java.lang.String r2 = "Finish executing SQL in %d ms"
                            r7 = 1
                            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            long r11 = r11 - r8
                            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            r7[r6] = r8     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r7)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54 java.io.FileNotFoundException -> L57
                            r10.close()     // Catch: java.io.IOException -> L4b
                        L4b:
                            boolean r0 = r3.G()
                            if (r0 == 0) goto La4
                            goto L9d
                        L52:
                            r0 = move-exception
                            goto La6
                        L54:
                            r2 = move-exception
                            r7 = r10
                            goto L5c
                        L57:
                            r7 = r10
                            goto L7e
                        L59:
                            r0 = move-exception
                            goto La5
                        L5b:
                            r2 = move-exception
                        L5c:
                            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
                            r8.<init>()     // Catch: java.lang.Throwable -> L59
                            java.lang.String r9 = "Failed to execute file: "
                            r8.append(r9)     // Catch: java.lang.Throwable -> L59
                            r8.append(r0)     // Catch: java.lang.Throwable -> L59
                            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L59
                            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L59
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r2, r0, r6)     // Catch: java.lang.Throwable -> L59
                            if (r7 == 0) goto L77
                            r7.close()     // Catch: java.io.IOException -> L77
                        L77:
                            boolean r0 = r3.G()
                            if (r0 == 0) goto La4
                            goto L9d
                        L7e:
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
                            r2.<init>()     // Catch: java.lang.Throwable -> L59
                            java.lang.String r6 = "Cannot find file to execute: "
                            r2.append(r6)     // Catch: java.lang.Throwable -> L59
                            r2.append(r0)     // Catch: java.lang.Throwable -> L59
                            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L59
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L59
                            if (r7 == 0) goto L97
                            r7.close()     // Catch: java.io.IOException -> L97
                        L97:
                            boolean r0 = r3.G()
                            if (r0 == 0) goto La4
                        L9d:
                            java.lang.Long r0 = java.lang.Long.valueOf(r4)
                            r3.w(r0)
                        La4:
                            return
                        La5:
                            r10 = r7
                        La6:
                            if (r10 == 0) goto Lab
                            r10.close()     // Catch: java.io.IOException -> Lab
                        Lab:
                            boolean r1 = r3.G()
                            if (r1 == 0) goto Lb8
                            java.lang.Long r1 = java.lang.Long.valueOf(r4)
                            r3.w(r1)
                        Lb8:
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p669x38b6e557.RunnableC10422x64f3202.run():void");
                    }
                });
            }
        }
    }
}
