package he5;

/* loaded from: classes9.dex */
public class o implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f362494a;

    /* renamed from: b, reason: collision with root package name */
    public android.database.Cursor f362495b;

    /* renamed from: c, reason: collision with root package name */
    public final int f362496c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362497d;

    /* renamed from: e, reason: collision with root package name */
    public long f362498e;

    /* renamed from: f, reason: collision with root package name */
    public final long f362499f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f362500g;

    public o(java.lang.String str, int i17, int i18) {
        this.f362494a = str;
        this.f362496c = i17;
        this.f362497d = i18;
    }

    @Override // he5.t
    public int a() {
        return this.f362497d;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        try {
            this.f362495b.moveToFirst();
            while (!this.f362495b.isAfterLast()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                f9Var.mo9015xbf5d97fd(this.f362495b);
                list.add(f9Var);
                this.f362495b.moveToNext();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgDataSource", e17, "", new java.lang.Object[0]);
        }
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        android.database.Cursor cursor;
        android.database.Cursor cursor2;
        java.lang.StringBuilder sb6;
        java.lang.String str;
        android.database.Cursor B;
        android.database.Cursor cursor3;
        android.database.Cursor B2;
        boolean z17 = this.f362500g;
        java.lang.String str2 = "";
        java.lang.String str3 = this.f362494a;
        if (z17) {
            st0.e v17 = c01.d9.b().v();
            long j17 = this.f362498e;
            com.p314xaae8f345.mm.p2621x8fb0427b.z9 z9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.z9) v17;
            z9Var.getClass();
            try {
                sb6 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM message AS MESSAGE INNER JOIN NotifyMessageRecord AS NOTIFY_RECORD ON MESSAGE.msgId = NOTIFY_RECORD.msgId WHERE NOTIFY_RECORD.talker = '");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str3);
                sb6.append(str3);
                sb6.append("'");
                if (j17 > 0) {
                    str = " AND MESSAGE.createTime >= " + j17;
                } else {
                    str = "";
                }
                sb6.append(str);
                long j18 = this.f362499f;
                if (j18 > 0) {
                    str2 = " AND MESSAGE.createTime <= " + j18;
                }
                sb6.append(str2);
                sb6.append(" ORDER BY MESSAGE.createTime DESC ) ORDER BY createTime ASC");
                cursor = null;
            } catch (java.lang.Exception e17) {
                e = e17;
                cursor = null;
            }
            try {
                B = z9Var.f277942d.B(sb6.toString(), null);
            } catch (java.lang.Exception e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e.toString());
                cursor2 = cursor;
                this.f362495b = cursor2;
                oVar.mo133232x338af3();
            }
            if (B != null) {
                B.moveToFirst();
                cursor2 = B;
                this.f362495b = cursor2;
            }
            cursor2 = cursor;
            this.f362495b = cursor2;
        } else {
            long j19 = this.f362498e;
            st0.e v18 = c01.d9.b().v();
            int i17 = this.f362496c;
            com.p314xaae8f345.mm.p2621x8fb0427b.z9 z9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.z9) v18;
            z9Var2.getClass();
            try {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SELECT * FROM ( SELECT * FROM message AS MESSAGE INNER JOIN NotifyMessageRecord AS NOTIFY_RECORD ON MESSAGE.msgId = NOTIFY_RECORD.msgId WHERE NOTIFY_RECORD.talker = '");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n(str3);
                sb7.append(str3);
                sb7.append("'");
                if (j19 > 0) {
                    str2 = " AND MESSAGE.createTime >= " + j19;
                }
                sb7.append(str2);
                sb7.append(" ORDER BY MESSAGE.createTime DESC LIMIT ");
                sb7.append(i17);
                sb7.append(") ORDER BY createTime ASC");
                B2 = z9Var2.f277942d.B(sb7.toString(), null);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NotifyMessageRecordStorage", "dz[getCursor] exception %s", e19.toString());
            }
            if (B2 != null) {
                B2.moveToFirst();
                cursor3 = B2;
                this.f362495b = cursor3;
            }
            cursor3 = null;
            this.f362495b = cursor3;
        }
        oVar.mo133232x338af3();
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        this.f362495b.close();
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }

    public o(java.lang.String str, long j17, long j18, boolean z17) {
        this.f362494a = str;
        this.f362498e = j17;
        this.f362499f = j18;
        this.f362500g = z17;
    }
}
