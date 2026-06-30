package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes13.dex */
public abstract class r0 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(android.content.Context r10, android.net.Uri r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "date_added"
            r1 = 0
            r2 = 0
            if (r11 != 0) goto Ld
            goto L3e
        Ld:
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L40
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r11
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L3e
            boolean r4 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L30
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L37
            if (r0 < 0) goto L30
            long r4 = r11.getLong(r0)     // Catch: java.lang.Throwable -> L37
            goto L31
        L30:
            r4 = r2
        L31:
            vz5.b.a(r11, r1)     // Catch: java.lang.Throwable -> L35
            goto L4c
        L35:
            r11 = move-exception
            goto L42
        L37:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r4 = move-exception
            vz5.b.a(r11, r0)     // Catch: java.lang.Throwable -> L40
            throw r4     // Catch: java.lang.Throwable -> L40
        L3e:
            r4 = r2
            goto L4c
        L40:
            r11 = move-exception
            r4 = r2
        L42:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r6 = "MicroMsg.AlbumDateQuery"
            java.lang.String r7 = "queryDateAddedByUri fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r6, r11, r7, r0)
        L4c:
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r11 <= 0) goto L53
            goto L6b
        L53:
            boolean r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r12)
            if (r11 != 0) goto L6a
            boolean r11 = com.p314xaae8f345.mm.vfs.w6.j(r12)
            if (r11 == 0) goto L6a
            long r11 = com.p314xaae8f345.mm.vfs.w6.l(r12)
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6a
            long r4 = r11 / r6
            goto L6b
        L6a:
            r4 = r2
        L6b:
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 > 0) goto L70
            return r1
        L70:
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            long r4 = r4 * r6
            r11.setTimeInMillis(r4)
            r12 = 1
            int r0 = r11.get(r12)
            r1 = 2
            int r1 = r11.get(r1)
            int r1 = r1 + r12
            r12 = 5
            int r11 = r11.get(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r12, r0, r11}
            r12 = 2131782082(0x7f1069c2, float:1.9195796E38)
            java.lang.String r10 = r10.getString(r12, r11)
            java.lang.String r11 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.r0.a(android.content.Context, android.net.Uri, java.lang.String):java.lang.String");
    }

    public static final void b(android.content.Context context, long j17, com.p314xaae8f345.mm.ui.p2740x696c9db.k0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (j17 <= 0) {
            callback.a(null);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2740x696c9db.m0(context, j17, callback));
    }

    public static final void c(android.content.Context context, android.net.Uri uri, java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.k0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (uri == null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            callback.a(null);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2740x696c9db.q0(context, uri, str, callback));
    }

    public static final void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.p2740x696c9db.k0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            callback.a(null);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2740x696c9db.o0(context, str, callback));
    }
}
