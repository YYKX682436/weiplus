package mt1;

/* loaded from: classes12.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final mt1.m0 f412773d = new mt1.m0();

    public m0() {
        super(3);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Throwable th6;
        ((java.lang.Number) obj).intValue();
        ot1.j storage = (ot1.j) obj2;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        long b27 = storage.b2(7, -1L);
        long b28 = storage.b2(8, -1L);
        int i17 = 0;
        java.lang.Throwable th7 = null;
        if (b28 < 0) {
            android.database.Cursor f17 = storage.f430382d.f("SELECT max(rowId) FROM WxFileIndex3", null, 0);
            storage.f3(8, f17);
            if (f17.moveToFirst()) {
                b28 = f17.getLong(0);
            }
            f17.close();
        }
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue = new java.util.concurrent.ArrayBlockingQueue(32, true);
        java.util.concurrent.ArrayBlockingQueue arrayBlockingQueue2 = new java.util.concurrent.ArrayBlockingQueue(32, false);
        for (int i18 = 1; i18 < 33; i18++) {
            arrayBlockingQueue2.add(new mt1.k0(null, 0L, 0L, 7, null));
        }
        wu5.c a17 = ((ku5.t0) ku5.t0.f394148d).a(new mt1.l0(storage, arrayBlockingQueue, arrayBlockingQueue2));
        try {
            int i19 = 2;
            android.database.Cursor V = storage.f430382d.V("SELECT DISTINCT rowId, msgId, username FROM WxFileIndex3 WHERE rowId > ? AND rowId <= ? ORDER BY rowId", new java.lang.String[]{java.lang.String.valueOf(b27), java.lang.String.valueOf(b28)}, c26987xeef691ab);
            int i27 = 0;
            while (V.moveToNext()) {
                try {
                    long j17 = V.getLong(i17);
                    long j18 = V.getLong(1);
                    java.lang.String string = V.getString(i19);
                    i27++;
                    if (pt0.f0.f439742b1.n(string, j18).A0() == 1) {
                        java.lang.Object take = arrayBlockingQueue2.take();
                        mt1.k0 k0Var = (mt1.k0) take;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                        k0Var.getClass();
                        k0Var.f412766a = string;
                        k0Var.f412767b = j18;
                        k0Var.f412768c = j17;
                        arrayBlockingQueue.put(take);
                    }
                    if ((i27 & 127) == 0) {
                        try {
                            java.lang.Object take2 = arrayBlockingQueue2.take();
                            mt1.k0 k0Var2 = (mt1.k0) take2;
                            k0Var2.getClass();
                            k0Var2.f412766a = "";
                            k0Var2.f412767b = 0L;
                            k0Var2.f412768c = j17;
                            arrayBlockingQueue.put(take2);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            b27 = j17;
                            th6 = th;
                            try {
                                throw th6;
                            } finally {
                                vz5.b.a(V, th6);
                            }
                        }
                    }
                    b27 = j17;
                    i19 = 2;
                    i17 = 0;
                    th7 = null;
                } catch (java.lang.Throwable th9) {
                    th = th9;
                }
            }
            th6 = th7;
            java.lang.Object take3 = arrayBlockingQueue2.take();
            mt1.k0 k0Var3 = (mt1.k0) take3;
            k0Var3.getClass();
            k0Var3.f412766a = "";
            k0Var3.f412767b = 1L;
            k0Var3.f412768c = b27;
            arrayBlockingQueue.put(take3);
            a17.get();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th10) {
            java.lang.Object take4 = arrayBlockingQueue2.take();
            mt1.k0 k0Var4 = (mt1.k0) take4;
            k0Var4.getClass();
            k0Var4.f412766a = "";
            k0Var4.f412767b = 1L;
            k0Var4.f412768c = b27;
            arrayBlockingQueue.put(take4);
            a17.get();
            throw th10;
        }
    }
}
