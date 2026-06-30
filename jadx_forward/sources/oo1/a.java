package oo1;

/* loaded from: classes12.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.Object a(final java.lang.String str, final long j17, final long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.database.Cursor B;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.lang.String X8 = cj6.X8(str);
        int i17 = 0;
        if (cj6.Da(X8)) {
            B = ot0.c3.l().c("getAllMediaMsgFromMsgTable", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.k(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str, j17, j18, java.util.Arrays.asList(3, 43, 62, 44, 49));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$v0
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    java.lang.System.currentTimeMillis();
                    android.database.Cursor B2 = g9Var.f275522r.B("select * from message where talker=? AND createTime>=" + j17 + " AND createTime<=" + j18 + " AND (type IN (3,43,62,44) OR type & 65535 = 49)", new java.lang.String[]{str});
                    java.lang.System.currentTimeMillis();
                    return B2;
                }
            });
        } else if (cj6.Pb(X8)) {
            B = ot0.z2.f430355a.k(cj6.f275522r, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str, j17, j18, java.util.Arrays.asList(3, 43, 62, 44, 49));
        } else {
            java.lang.System.currentTimeMillis();
            B = cj6.f275522r.B("select * from message where talker=? AND createTime>=" + j17 + " AND createTime<=" + j18 + " AND (type IN (3,43,62,44) OR type & 65535 = 49)", new java.lang.String[]{str});
            java.lang.System.currentTimeMillis();
        }
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(B);
                    do1.b a17 = co1.d.f125295a.a(f9Var.mo78013xfb85f7b0());
                    if (a17 != null) {
                        i17++;
                        if (a17.a(f9Var, j18)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupConvCalcV2", "Find a modified media, count=" + i17 + ", talker=" + str + ", msgType=" + f9Var.mo78013xfb85f7b0() + ", createTime=" + f9Var.mo78012x3fdd41df());
                            java.lang.Long l17 = new java.lang.Long(f9Var.mo78012x3fdd41df());
                            vz5.b.a(B, null);
                            return l17;
                        }
                    }
                } finally {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupConvCalcV2", "[getConvMediaTimeMap] Query completed. Process item count=" + i17);
            vz5.b.a(B, null);
        }
        return new java.lang.Long(j18);
    }
}
