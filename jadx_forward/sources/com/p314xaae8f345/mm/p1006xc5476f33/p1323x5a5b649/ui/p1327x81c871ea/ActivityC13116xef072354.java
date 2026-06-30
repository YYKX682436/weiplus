package com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea;

@gm0.a2
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13116xef072354 extends com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194 {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f177271p0 = 0;
    public java.lang.String N;
    public int[] Q;
    public int[] R;
    public long[] S;
    public cw1.q4 W;
    public cw1.c4 X;
    public long Z;
    public final boolean M = !"0".equals(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_clean_new_filters", "0"));
    public boolean P = true;
    public final long[] T = new long[4];
    public final int[] U = new int[4];
    public long V = 0;
    public long Y = 0;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void U6(boolean z17, cw1.b3 b3Var, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        char c17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("LATEST_STORAGE_DATA", gm0.j1.b().h(), 1).putLong("latest_clean_chat_log_time", java.lang.System.currentTimeMillis());
        mt1.b0 b0Var = mt1.b0.f412724a;
        mt1.b0.f412734k = false;
        java.util.List y17 = this.W.y();
        java.util.Iterator it = ((java.util.ArrayList) y17).iterator();
        long j17 = 0;
        while (it.hasNext()) {
            bw1.l lVar = (bw1.l) it.next();
            int i17 = lVar.f106343b;
            if (i17 != 1) {
                c17 = 3;
                if (i17 == 3) {
                    c17 = 1;
                } else if (i17 == 4) {
                    c17 = 2;
                }
            } else {
                c17 = 0;
            }
            long[] jArr = this.T;
            long j18 = jArr[c17];
            long j19 = lVar.f106342a;
            jArr[c17] = j18 + j19;
            j17 += j19;
            int[] iArr = this.U;
            iArr[c17] = iArr[c17] + 1;
        }
        ((ku5.t0) ku5.t0.f394148d).a(aw1.n0.b(y17, ot1.h.Q, Long.MIN_VALUE, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, true, new cw1.v4(this, c26987xeef691ab, b3Var, java.lang.System.currentTimeMillis(), j17), c26987xeef691ab));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d j76 = j7();
        setResult(-1, new android.content.Intent().putExtra("u", this.N).putExtra("select", j76));
        finish();
        mt1.b0.s(31, 0L, java.lang.Long.valueOf(j76.b()), java.lang.Long.valueOf(j76.a()));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void e7(int[] iArr) {
        for (int i17 : iArr) {
            if (i17 == 1) {
                this.S = Z6();
            } else if (i17 == 2) {
                this.Q = Y6(true);
            }
        }
        boolean d76 = d7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d j76 = d76 ? j7() : null;
        X6();
        this.W.I(this.N, this.Q, this.R, this.S, this.f177250y, this.f177251z, this.A, this.P, d76, this.B, this.X, j76);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f177239n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "onFilterChanged", "([I)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingDetailUI", "onFilterChanged", "([I)V", "Undefined", "scrollToPosition", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194
    public void f7(boolean z17) {
        cw1.q4 q4Var = this.W;
        if (z17) {
            q4Var.f304802h.set(0, q4Var.f304799e.size());
            q4Var.f304804m = q4Var.f304799e.size();
            q4Var.f304803i = 0L;
            java.util.Iterator it = q4Var.f304799e.iterator();
            while (it.hasNext()) {
                q4Var.f304803i += ((bw1.l) it.next()).f106342a;
            }
        } else {
            q4Var.f304802h.clear();
            q4Var.f304803i = 0L;
            q4Var.f304804m = 0;
            java.util.Iterator it6 = q4Var.f304801g.values().iterator();
            while (it6.hasNext()) {
                ((cw1.j4) it6.next()).getClass();
            }
        }
        q4Var.m8152xc67946d3(0, q4Var.mo1894x7e414b06(), "");
        q4Var.f304798d.h7(q4Var.f304803i, q4Var.f304799e.size(), q4Var.f304804m);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return this.M ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e2p : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570154ys;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d j7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d();
        java.util.Iterator it = ((java.util.ArrayList) this.W.y()).iterator();
        while (it.hasNext()) {
            bw1.l lVar = (bw1.l) it.next();
            int i17 = lVar.f106354m;
            if (i17 == 0) {
                i17 = 1;
            }
            long j17 = lVar.f106342a / i17;
            c13100x4dbf8b6d.e(lVar.f106346e, lVar.f106347f, j17);
            java.util.List list = lVar.f106357p;
            if (list != null) {
                java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
                while (it6.hasNext()) {
                    android.util.Pair pair = (android.util.Pair) it6.next();
                    c13100x4dbf8b6d.e((java.lang.String) pair.first, ((java.lang.Long) pair.second).longValue(), j17);
                }
            }
        }
        return c13100x4dbf8b6d;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        cw1.q4 q4Var;
        if (i17 == 1 && i18 == -1 && intent != null && (q4Var = this.W) != null) {
            q4Var.f304804m = 0;
            q4Var.f304803i = 0L;
            int size = q4Var.f304799e.size();
            for (int i19 = 0; i19 < size; i19++) {
                if (q4Var.f304802h.get(i19)) {
                    q4Var.f304804m++;
                    q4Var.f304803i += ((bw1.l) q4Var.f304799e.get(i19)).f106342a;
                }
            }
            q4Var.f304798d.h7(q4Var.f304803i, q4Var.f304799e.size(), q4Var.f304804m);
            cw1.q4 q4Var2 = this.W;
            q4Var2.m8152xc67946d3(0, q4Var2.mo1894x7e414b06(), "");
        }
        if (i17 == 1) {
            mt1.b0 b0Var = mt1.b0.f412724a;
            if (mt1.b0.f412735l > this.Z) {
                bw1.u wi6 = bw1.u.wi();
                wi6.f106380f.d();
                wi6.f106381g.d();
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.AbstractActivityC13112xefd3d194, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d;
        super.onCreate(bundle);
        boolean d76 = d7();
        this.Y = java.lang.System.currentTimeMillis();
        android.content.Intent intent = getIntent();
        this.N = intent.getStringExtra("u");
        this.f177251z = intent.hasExtra("isSent") ? java.lang.Boolean.valueOf(intent.getBooleanExtra("isSent", false)) : null;
        this.B = intent.getBooleanExtra("onlyInSys", false);
        this.P = intent.getBooleanExtra("withOrigin", true);
        if (d76) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d c13100x4dbf8b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.C13100x4dbf8b6d) intent.getParcelableExtra("select");
            this.R = ot1.h.R;
            this.X = new cw1.C28141x67ad5a1();
            c13100x4dbf8b6d = c13100x4dbf8b6d2;
        } else {
            this.R = ot1.h.Q;
            this.X = null;
            c13100x4dbf8b6d = null;
        }
        java.lang.String str = this.N;
        boolean z17 = this.M;
        if (str == null) {
            if (z17) {
                c7(true, this.f177251z == null, true);
            } else {
                b7(true, true);
            }
            this.Q = Y6(true);
            this.S = Z6();
            if (d76) {
                mo56582xbf7c1df6(this.f177251z == java.lang.Boolean.TRUE ? com.p314xaae8f345.mm.R.C30867xcad56011.n8j : com.p314xaae8f345.mm.R.C30867xcad56011.n8i);
            } else {
                mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.a_5);
            }
        } else {
            if (z17) {
                c7(false, this.f177251z == null, false);
            } else {
                b7(false, false);
            }
            this.Q = intent.getIntArrayExtra("st");
            this.S = new long[]{intent.getLongExtra("min", Long.MIN_VALUE), intent.getLongExtra("max", com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697)};
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.N)) {
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str2 = this.N;
                ((sg3.a) v0Var).getClass();
                mo54450xbf7c1df6(c01.a2.f(str2, str2));
            } else {
                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str3 = this.N;
                ((sg3.a) v0Var2).getClass();
                mo54450xbf7c1df6(c01.a2.e(str3));
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) this.f177239n;
        this.W = new cw1.q4(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this, 4);
        c1161x57298f5d.B = new cw1.u4(this);
        c1163xf1deaba4.mo7960x6cab2c8d(this.W);
        c1163xf1deaba4.mo7967x900dcbe1(c1161x57298f5d);
        c1163xf1deaba4.P(this.W.f304809r);
        X6();
        this.W.I(this.N, this.Q, this.R, this.S, this.f177250y, this.f177251z, this.A, this.P, d76, this.B, this.X, c13100x4dbf8b6d);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        cw1.q4 q4Var = this.W;
        if (q4Var != null) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = q4Var.f304805n;
            if (c26987xeef691ab != null) {
                c26987xeef691ab.m108007xae7a2e7a();
            }
            q4Var.f304805n = null;
        }
        synchronized (yh5.a.f543952a) {
            yh5.a.f543953b = kz5.p0.f395529d;
            yh5.a.f543954c = new java.util.BitSet();
        }
        super.onDestroy();
    }
}
