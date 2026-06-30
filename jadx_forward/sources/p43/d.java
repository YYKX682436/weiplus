package p43;

/* loaded from: classes8.dex */
public final class d extends l75.n0 implements p43.b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f433295f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f433296d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f433297e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.m145250x3fdc6f77(p43.a.f433293J, "GameLocalVideoInfo"));
        java.lang.String[] INDEX_CREATE = dm.p5.f320674t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f433295f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 storage) {
        super(storage, p43.a.f433293J, "GameLocalVideoInfo", dm.p5.f320674t);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f433296d = storage;
        this.f433297e = new p43.c(this, storage);
    }

    public static final void y0(p43.d dVar, p75.k kVar, int i17, java.lang.String str) {
        dVar.getClass();
        if (str != null) {
            ((p75.e0) kVar).m157941x35198eae(i17, str);
            return;
        }
        p75.e0 e0Var = (p75.e0) kVar;
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = e0Var.f434167d;
        if (c26970x63d6eaa3 != null) {
            c26970x63d6eaa3.m107800x37fcf764(i17);
            return;
        }
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = e0Var.f434168e;
        if (c26915x63d6eaa3 != null) {
            c26915x63d6eaa3.m106527x37fcf764(i17);
        }
    }

    public void D0(java.util.List videoFiles) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoFiles, "videoFiles");
        if (videoFiles.isEmpty()) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("GameLocalVideoInfoDaoImpl", "insertAll not   size = 0");
            return;
        }
        int size = videoFiles.size();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l75.k0 k0Var = this.f433296d;
        long b17 = k0Var.b();
        try {
            this.f433297e.c(videoFiles);
            k0Var.w(java.lang.Long.valueOf(b17));
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameLocalVideoInfoDaoImpl", "insertAll videoFiles insertDataSize = " + size + "  cost time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            k0Var.w(java.lang.Long.valueOf(b17));
            throw th6;
        }
    }

    public java.util.List J0(java.lang.String userId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userId, "userId");
        java.lang.String str = "SELECT * FROM GameLocalVideoInfo WHERE userId = " + d95.b0.O(userId) + " ORDER BY createTime DESC";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f433296d.f(str, null, 2);
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    while (!f17.isAfterLast()) {
                        p43.a aVar = new p43.a();
                        aVar.mo9015xbf5d97fd(f17);
                        arrayList.add(aVar);
                        f17.moveToNext();
                    }
                }
                vz5.b.a(f17, null);
            } finally {
            }
        }
        return arrayList;
    }

    public void z0(java.util.List fileIds) {
        java.lang.Iterable<p43.a> iterable;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileIds, "fileIds");
        if (!fileIds.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(fileIds, 10));
            java.util.Iterator it = fileIds.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                q33.c cVar = new q33.c();
                cVar.f441471d = str;
                arrayList.add(cVar);
            }
            q33.d dVar = new q33.d();
            dVar.f441474d = 2;
            dVar.f441475e = new java.util.LinkedList(arrayList);
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = dVar;
            lVar.f152198b = new q33.e();
            lVar.f152199c = "/cgi-bin/mmgame-bin/reportlocalwxagvideo";
            lVar.f152200d = 25686;
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new i53.j4(dVar));
        }
        boolean z17 = fileIds.isEmpty();
        l75.k0 k0Var = this.f433296d;
        if (z17) {
            iterable = kz5.p0.f395529d;
        } else {
            java.lang.String str2 = "SELECT * FROM GameLocalVideoInfo WHERE fileId IN " + s33.y.d(fileIds);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            android.database.Cursor f17 = k0Var.f(str2, null, 2);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        while (!f17.isAfterLast()) {
                            p43.a aVar = new p43.a();
                            aVar.mo9015xbf5d97fd(f17);
                            arrayList2.add(aVar);
                            f17.moveToNext();
                        }
                    }
                    vz5.b.a(f17, null);
                } finally {
                }
            }
            iterable = arrayList2;
        }
        for (p43.a aVar2 : iterable) {
            com.p314xaae8f345.mm.vfs.w6.h(aVar2.f67903xf1e9b966);
            com.p314xaae8f345.mm.vfs.w6.h(aVar2.f67897x109ca377);
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("GameLocalVideoInfoDaoImpl", "deleteByUserId fileIdsSize = " + fileIds.size() + "  result = " + k0Var.mo70514xb06685ab("GameLocalVideoInfo", "fileId IN " + s33.y.d(fileIds), new java.lang.String[0]));
    }
}
