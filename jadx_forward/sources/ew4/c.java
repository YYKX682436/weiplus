package ew4;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    public static ew4.c f338607c;

    /* renamed from: a, reason: collision with root package name */
    public ew4.d f338608a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f338609b = new java.util.HashMap();

    public static ew4.c c() {
        if (f338607c == null) {
            f338607c = new ew4.c();
        }
        return f338607c;
    }

    public ew4.a a(java.lang.String str, java.lang.String str2) {
        ew4.d d17 = d();
        android.database.Cursor m145256x1d3f4980 = d17.m145256x1d3f4980(java.lang.String.format("select * from %s where %s=\"%s\"", "WebViewData", "appIdKey", d17.J0(str, str2)), new java.lang.String[0]);
        ew4.a aVar = new ew4.a();
        if (m145256x1d3f4980 != null) {
            if (m145256x1d3f4980.moveToFirst()) {
                aVar.mo9015xbf5d97fd(m145256x1d3f4980);
            }
            m145256x1d3f4980.close();
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "MicroMsg.WebViewDataCenter"
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = ew4.d.P0()
            r1.append(r5)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L44
            r1.<init>(r8)     // Catch: java.lang.Exception -> L44
            boolean r8 = r1.m()     // Catch: java.lang.Exception -> L44
            if (r8 != 0) goto L2d
            return r2
        L2d:
            java.io.InputStream r8 = com.p314xaae8f345.mm.vfs.w6.C(r1)     // Catch: java.lang.Exception -> L44
            long r5 = r1.C()     // Catch: java.lang.Exception -> L42
            int r1 = (int) r5     // Catch: java.lang.Exception -> L42
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L42
            r8.read(r1)     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L42
            r5.<init>(r1)     // Catch: java.lang.Exception -> L42
            r2 = r5
            goto L5b
        L42:
            r1 = move-exception
            goto L46
        L44:
            r1 = move-exception
            r8 = r2
        L46:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "read PageCache err: "
            r5.<init>(r6)
            java.lang.String r1 = r1.getMessage()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
        L5b:
            if (r8 == 0) goto L60
            r8.close()     // Catch: java.io.IOException -> L60
        L60:
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r1 = "PageCache getPageCache time:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ew4.c.b(java.lang.String):java.lang.String");
    }

    public ew4.d d() {
        if (this.f338608a == null) {
            gm0.j1.i();
            this.f338608a = new ew4.d(gm0.j1.u().f354686f);
        }
        return this.f338608a;
    }

    public final boolean e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, long j17, java.lang.String str6) {
        long j18;
        ew4.d d17 = d();
        android.database.Cursor m145256x1d3f4980 = d17.m145256x1d3f4980(java.lang.String.format("select %s from %s where %s=\"%s\"", "size", "WebViewData", "appIdKey", d17.J0(str, str2)), new java.lang.String[0]);
        if (m145256x1d3f4980 == null) {
            j18 = 0;
        } else {
            j18 = m145256x1d3f4980.moveToFirst() ? m145256x1d3f4980.getLong(0) : 0L;
            m145256x1d3f4980.close();
        }
        long j19 = j17 - j18;
        java.util.HashMap hashMap = (java.util.HashMap) this.f338609b;
        long longValue = (hashMap.containsKey(str) ? ((java.lang.Long) hashMap.get(str)).longValue() : d().L0(str)) + j19;
        long j27 = longValue - (str.equals("wx62d9035fd4fd2059") ? com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8 : 10485760L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDataCenter", "prevSize = %d, valueSize = %d, diffSize = %d, newAppSize = %d, expireSize = %d", java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(j27));
        if (j27 > 0 && !z17) {
            return false;
        }
        dw4.a.a(new ew4.b(this, j27, str, longValue, str3, str2, str4, str5, str6));
        return true;
    }
}
