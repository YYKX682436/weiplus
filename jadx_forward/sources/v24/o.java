package v24;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.o f514473a = new v24.o();

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        throw new jz5.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0194, code lost:
    
        r18 = r3;
        r19 = r5;
        r3 = kz5.c0.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019d, code lost:
    
        if ((-1) >= r3) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019f, code lost:
    
        r5 = (v24.j) r8.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ac, code lost:
    
        if ((r5.f514463c + r5.f514464d) <= 8) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ae, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ListFile", r26.i0.s("  ", r3) + '[' + r5.f514462b + " bytes, " + r5.f514464d + " dirs, " + r5.f514463c + " files | " + r5.f514461a + ']');
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ed, code lost:
    
        r8.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01f0, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01f3, code lost:
    
        r3 = r18;
        r5 = r19;
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(android.os.CancellationSignal r28) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v24.o.b(android.os.CancellationSignal):boolean");
    }

    public final void a() {
        int i17;
        int i18;
        android.database.Cursor B = gm0.j1.u().f354686f.B("SELECT name,sum(pgsize) FROM dbstat GROUP BY name ORDER BY sum(pgsize) DESC", null);
        if (B == null) {
            return;
        }
        while (true) {
            i17 = 1;
            i18 = 0;
            if (!B.moveToNext()) {
                break;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ListFile", "name = " + B.getString(0) + ", size = " + B.getLong(1));
        }
        B.close();
        android.database.Cursor Ai = ((ot0.g3) ((com.p314xaae8f345.mm.app.w2) i95.n0.c(com.p314xaae8f345.mm.app.w2.class))).Ai();
        while (Ai.moveToNext()) {
            long j17 = Ai.getLong(i18);
            long j18 = Ai.getLong(i17);
            long j19 = Ai.getLong(2);
            long j27 = Ai.getLong(3);
            long j28 = Ai.getLong(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ListFile", "type = " + j17 + ", count = " + j18 + ", contentSize = " + j19 + ", lvbufferSize = " + j27 + ", reservedSize = " + j28 + ", sumSize = " + (j19 + j27 + j28));
            i17 = 1;
            i18 = 0;
        }
        Ai.close();
    }
}
