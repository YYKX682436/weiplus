package com.google.gson;

/* loaded from: classes16.dex */
final class DefaultDateTypeAdapter extends com.google.gson.v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f44666a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f44667b;

    public DefaultDateTypeAdapter(java.lang.Class cls, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f44667b = arrayList;
        d(cls);
        this.f44666a = cls;
        java.util.Locale locale = java.util.Locale.US;
        arrayList.add(java.text.DateFormat.getDateTimeInstance(i17, i18, locale));
        if (!java.util.Locale.getDefault().equals(locale)) {
            arrayList.add(java.text.DateFormat.getDateTimeInstance(i17, i18));
        }
        if (com.google.gson.internal.s.f44823a >= 9) {
            arrayList.add(com.google.gson.internal.e0.a(i17, i18));
        }
    }

    public static java.lang.Class d(java.lang.Class cls) {
        if (cls == java.util.Date.class || cls == java.sql.Date.class || cls == java.sql.Timestamp.class) {
            return cls;
        }
        throw new java.lang.IllegalArgumentException("Date type must be one of " + java.util.Date.class + ", " + java.sql.Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002e, code lost:
    
        r4 = gb.a.b(r4, new java.text.ParsePosition(0));
     */
    @Override // com.google.gson.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(jb.b r4) {
        /*
            r3 = this;
            jb.c r0 = r4.K()
            jb.c r1 = jb.c.NULL
            if (r0 != r1) goto Ld
            r4.D()
            r4 = 0
            goto L5d
        Ld:
            java.lang.String r4 = r4.I()
            java.util.List r0 = r3.f44667b
            monitor-enter(r0)
            java.util.List r1 = r3.f44667b     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        L1c:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6b
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L6b
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1c java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            goto L39
        L2e:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L64 java.lang.Throwable -> L6b
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L64 java.lang.Throwable -> L6b
            java.util.Date r4 = gb.a.b(r4, r1)     // Catch: java.text.ParseException -> L64 java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
        L39:
            java.lang.Class r0 = r3.f44666a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L40
            goto L5d
        L40:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4f
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4d:
            r4 = r0
            goto L5d
        L4f:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5e
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4d
        L5d:
            return r4
        L5e:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L64:
            r1 = move-exception
            com.google.gson.r r2 = new com.google.gson.r     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L6b
            throw r2     // Catch: java.lang.Throwable -> L6b
        L6b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.DefaultDateTypeAdapter.b(jb.b):java.lang.Object");
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        java.util.Date date = (java.util.Date) obj;
        if (date == null) {
            dVar.p();
            return;
        }
        synchronized (this.f44667b) {
            dVar.A(((java.text.DateFormat) ((java.util.ArrayList) this.f44667b).get(0)).format(date));
        }
    }

    public java.lang.String toString() {
        java.text.DateFormat dateFormat = (java.text.DateFormat) this.f44667b.get(0);
        if (dateFormat instanceof java.text.SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((java.text.SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
