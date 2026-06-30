package f52;

/* loaded from: classes15.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r45.c2 a() {
        /*
            java.lang.String r0 = "hell_astackd_mmkv_key"
            byte[] r0 = c52.c.a(r0)
            if (r0 == 0) goto L20
            int r1 = r0.length
            if (r1 > 0) goto Lc
            goto L20
        Lc:
            r45.c2 r1 = new r45.c2
            r1.<init>()
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L15
            goto L21
        L15:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "HABBYGE-MALI.ActivityStackDao"
            java.lang.String r3 = "ActivityStackDao read"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L20:
            r1 = 0
        L21:
            if (r1 != 0) goto L2b
            r45.c2 r1 = new r45.c2
            r1.<init>()
            b(r1)
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f52.b.a():r45.c2");
    }

    public static void b(r45.c2 c2Var) {
        byte[] bArr;
        if (c2Var == null) {
            return;
        }
        try {
            bArr = c2Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.ActivityStackDao", e17, "ActivityStackDao write", new java.lang.Object[0]);
            bArr = null;
        }
        c52.c.d("hell_astackd_mmkv_key", bArr);
    }
}
