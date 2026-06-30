package y33;

/* loaded from: classes8.dex */
public final class j extends l75.n0 implements y33.h {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f540712f;

    /* renamed from: d, reason: collision with root package name */
    public final d95.b0 f540713d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f540714e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.m145250x3fdc6f77(y33.g.f540711z, "GameSimpleUserInfo"));
        java.lang.String[] INDEX_CREATE = dm.w5.f322341o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f540712f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d95.b0 storage) {
        super(storage, y33.g.f540711z, "GameSimpleUserInfo", dm.w5.f322341o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f540713d = storage;
        this.f540714e = new y33.i(storage);
    }

    @Override // y33.h
    public java.util.List Q1(java.util.List userNameList, java.lang.String chatroomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = "SELECT * FROM GameSimpleUserInfo WHERE userName IN " + s33.y.d(userNameList) + " AND roomName = " + d95.b0.O(chatroomName) + " ORDER BY role ASC";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f540713d.f(str, null, 2);
        try {
            if (f17.moveToFirst()) {
                while (!f17.isAfterLast()) {
                    y33.g gVar = new y33.g();
                    gVar.mo9015xbf5d97fd(f17);
                    arrayList.add(gVar);
                    f17.moveToNext();
                }
            }
            vz5.b.a(f17, null);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "query cost time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " rawSize = " + userNameList.size() + "   result.size = " + arrayList.size() + ' ');
            return arrayList;
        } finally {
        }
    }

    @Override // y33.h
    public java.util.List Wd(java.lang.String keyword, java.lang.String chatroomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = "SELECT * FROM GameSimpleUserInfo WHERE roomName = " + d95.b0.O(chatroomName) + " AND nickName LIKE '%" + keyword + "%' ORDER BY role ASC";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f540713d.f(str, null, 2);
        try {
            if (f17.moveToFirst()) {
                while (!f17.isAfterLast()) {
                    y33.g gVar = new y33.g();
                    gVar.mo9015xbf5d97fd(f17);
                    arrayList.add(gVar);
                    f17.moveToNext();
                }
            }
            vz5.b.a(f17, null);
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "query cost time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " keyword = " + keyword + "  result.size = " + arrayList.size() + ' ');
            return arrayList;
        } finally {
        }
    }

    @Override // y33.h
    public java.util.List e(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        java.lang.String str = "SELECT * FROM GameSimpleUserInfo WHERE userName = " + d95.b0.O(userName);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f540713d.f(str, null, 2);
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    while (!f17.isAfterLast()) {
                        y33.g gVar = new y33.g();
                        gVar.mo9015xbf5d97fd(f17);
                        arrayList.add(gVar);
                        f17.moveToNext();
                    }
                }
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return arrayList;
    }

    @Override // y33.h
    public long e3(java.lang.String chatroomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        android.database.Cursor f17 = this.f540713d.f("SELECT count(*) FROM GameSimpleUserInfo WHERE roomName = " + d95.b0.O(chatroomName), null, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "rawQuery(...)");
        try {
            boolean z17 = true;
            if (!f17.moveToNext()) {
                z17 = false;
            }
            long j17 = z17 ? f17.getLong(0) : 0L;
            vz5.b.a(f17, null);
            return j17;
        } finally {
        }
    }

    @Override // y33.h
    public void jc(java.lang.String chatroomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "deleteAll By chatroomName = " + chatroomName + "  delete num = " + this.f540713d.mo70514xb06685ab("GameSimpleUserInfo", "roomName = ?", new java.lang.String[]{chatroomName}));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x002c, B:5:0x0032, B:7:0x0038, B:9:0x0044, B:14:0x0050, B:16:0x0053), top: B:2:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[SYNTHETIC] */
    @Override // y33.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List jd(java.lang.String r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "chatroomName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT * FROM GameSimpleUserInfo WHERE roomName = "
            r0.<init>(r1)
            java.lang.String r4 = d95.b0.O(r4)
            r0.append(r4)
            java.lang.String r4 = " ORDER BY role ASC LIMIT "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 2
            d95.b0 r1 = r3.f540713d
            r2 = 0
            android.database.Cursor r4 = r1.f(r4, r2, r0)
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L57
        L32:
            boolean r0 = r4.isAfterLast()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L57
            y33.g r0 = new y33.g     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            r0.mo9015xbf5d97fd(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r0.f68998x21eb2633     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L4d
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L4b
            goto L4d
        L4b:
            r1 = 0
            goto L4e
        L4d:
            r1 = 1
        L4e:
            if (r1 != 0) goto L53
            r5.add(r0)     // Catch: java.lang.Throwable -> L5b
        L53:
            r4.moveToNext()     // Catch: java.lang.Throwable -> L5b
            goto L32
        L57:
            vz5.b.a(r4, r2)
            return r5
        L5b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            vz5.b.a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y33.j.jd(java.lang.String, int):java.util.List");
    }

    @Override // y33.h
    public void q9(java.lang.String chatroomName, java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "deleteByUserName chatroomName = " + chatroomName + "  userName " + userName + "  result = " + this.f540713d.mo70514xb06685ab("GameSimpleUserInfo", "roomName = ? and userName=? ", new java.lang.String[]{chatroomName, userName}));
    }

    @Override // y33.h
    public void z2(java.util.List users, java.lang.String chatroomName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(users, "users");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomName, "chatroomName");
        if (users.isEmpty()) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "insertAll  size = " + users.size());
            return;
        }
        int size = users.size();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        d95.b0 b0Var = this.f540713d;
        long b17 = b0Var.b();
        try {
            this.f540714e.c(users);
            b0Var.w(java.lang.Long.valueOf(b17));
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ChatroomMemberPreloadManager.daoImpl", "insertAll insertDataSize = " + size + "  cost time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            b0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }
}
