package ez;

@j95.b
/* loaded from: classes12.dex */
public final class k1 extends i95.w implements pt0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f339284d = new java.util.concurrent.CopyOnWriteArraySet();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAccountInitialized, c2c img: ");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        sb6.append(e0Var.f());
        sb6.append(", video: ");
        sb6.append(e0Var.i());
        sb6.append(", voice: ");
        sb6.append(e0Var.j());
        sb6.append(", voice: ");
        sb6.append(e0Var.j());
        sb6.append(", file: ");
        sb6.append(((java.lang.Boolean) ((jz5.n) pt0.e0.f439738m).mo141623x754a37bb()).booleanValue());
        sb6.append(", emoji: ");
        sb6.append(e0Var.e());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgFeatureService", sb6.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 wi(java.lang.String str, long j17, java.lang.Boolean bool) {
        java.lang.String str2;
        pt0.e0 e0Var;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b m106493xb22e551e;
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae m106824x752de218;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        l75.k0 k0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f275522r;
        java.lang.String P8 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str);
        java.lang.Object[] objArr = P8 == null || P8.length() == 0;
        pt0.e0 e0Var2 = pt0.f0.f439742b1;
        if (objArr == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFeatureService", "getById table is null or empty, id: " + j17 + ", talker: " + str);
            ((ku5.t0) ku5.t0.f394148d).h(new ez.i1(e0Var2.p(new java.lang.Throwable()), this, j17, str), "msg_empty_table_report");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
            if ((k0Var.a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(P8, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7)) != true) {
                str2 = "MicroMsg.MsgFeatureService";
                e0Var = e0Var2;
                android.database.Cursor D = k0Var.D(P8, null, "msgId=?", new java.lang.String[]{"" + j17}, null, null, null, 2);
                if (D.moveToFirst()) {
                    f9Var2.mo9015xbf5d97fd(D);
                }
                D.close();
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE) && e0Var.d() && f9Var2.m124847x74d37ac6() > 0 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f9Var2.Q0(), str) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "talker-ignore")) {
                    java.lang.String p17 = e0Var.p(new java.lang.Throwable());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "found different msgId:" + j17 + ", createTime:" + f9Var2.mo78012x3fdd41df() + " talker[" + f9Var2.Q0() + " -> " + str + "], stack: " + p17);
                    ((ku5.t0) ku5.t0.f394148d).h(new ez.j1(f9Var2, p17, this, str), "msg_talker_error_report");
                }
                return f9Var2;
            }
            l75.k0 k0Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().f275522r;
            java.lang.String P82 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().P8(j17, str);
            if (P82 == null || P82.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgFeatureService", "getMsgById table is null or empty, id: " + j17 + ", talker: " + str);
                ((ku5.t0) ku5.t0.f394148d).h(new ez.i1(e0Var2.p(new java.lang.Throwable()), this, j17, str), "msg_empty_table_report");
                f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            } else {
                up5.w wVar = null;
                wVar = null;
                wVar = null;
                wVar = null;
                d95.z zVar = k0Var2 instanceof d95.z ? (d95.z) k0Var2 : null;
                if (zVar != null && (c26914xabb259c7 = zVar.f309251a) != null && (m106493xb22e551e = c26914xabb259c7.m106493xb22e551e()) != null && (m106824x752de218 = m106493xb22e551e.m106824x752de218(P82, up5.i.f511503b)) != null) {
                    com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.i.f511504c;
                    wVar = (up5.w) m106824x752de218.m107127x946de4d9(c26981x40bb0da != null ? c26981x40bb0da.eq(j17) : null);
                }
                f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                if (wVar != null) {
                    g95.e0.k(f9Var, wVar);
                }
            }
            f9Var2 = f9Var;
        }
        str2 = "MicroMsg.MsgFeatureService";
        e0Var = e0Var2;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
        }
        return f9Var2;
    }
}
