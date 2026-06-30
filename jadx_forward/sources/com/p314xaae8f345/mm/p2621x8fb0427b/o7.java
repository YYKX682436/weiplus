package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes11.dex */
public class o7 extends l75.n0 implements l75.q0, xg3.y {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f276734f = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p2621x8fb0427b.m7.f276659y0, "fmessage_conversation")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f276735g = {"CREATE INDEX IF NOT EXISTS  fmessageConversationTalkerIndex ON fmessage_conversation ( talker )", "CREATE INDEX IF NOT EXISTS  fmconversation_isnew_Index ON fmessage_conversation ( isNew )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f276736d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f276737e;

    public o7(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p2621x8fb0427b.m7.f276659y0, "fmessage_conversation", f276735g);
        this.f276737e = new com.p314xaae8f345.mm.p2621x8fb0427b.n7(this);
        this.f276736d = k0Var;
    }

    public static long J0() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2533xb4860a9e.C20201x1856328f()) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r3.mo70514xb06685ab("fmessage_conversation", "talker = ?", new java.lang.String[]{r11}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r3.mo70514xb06685ab("fmessage_conversation", "fmsgSysRowId = ?", new java.lang.String[]{java.lang.String.valueOf(r9)}) > 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0(long r9, java.lang.String r11) {
        /*
            r8 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            com.tencent.mm.sdk.platformtools.z3 r1 = new com.tencent.mm.sdk.platformtools.z3
            r1.<init>()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r11, r1}
            java.lang.String r1 = "MicroMsg.FMessageConversationStorage"
            java.lang.String r2 = "deleteByTalker rowId: %d, talker: %s, stack = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r11)
            java.lang.String r2 = "fmessage_conversation"
            l75.k0 r3 = r8.f276736d
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L3d
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L3c
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.lang.String r6 = "fmsgSysRowId = ?"
            int r0 = r3.mo70514xb06685ab(r2, r6, r0)
            if (r0 <= 0) goto L3a
        L38:
            r0 = r4
            goto L4b
        L3a:
            r0 = r5
            goto L4b
        L3c:
            return r5
        L3d:
            java.lang.String r0 = "talker = ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}
            int r0 = r3.mo70514xb06685ab(r2, r0, r6)
            if (r0 <= 0) goto L3a
            goto L38
        L4b:
            if (r0 == 0) goto L5e
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r11}
            java.lang.String r10 = "deleteByTalker success, rowId: %d, talker: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r10, r9)
            r8.mo145247xf35bbb4(r11)
            return r4
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.o7.D0(long, java.lang.String):boolean");
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.m7 L0(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = null;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "get fail, encryptTalker is null");
            return null;
        }
        android.database.Cursor f17 = this.f276736d.f("select * from fmessage_conversation  where encryptTalker=" + d95.b0.O(str), null, 2);
        if (f17.moveToFirst()) {
            m7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.m7();
            m7Var.mo9015xbf5d97fd(f17);
        }
        f17.close();
        return m7Var;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.m7 P0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "get fail, talker is null");
            return null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 m7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.m7();
        m7Var.f66376x114ef53e = str;
        if (super.get(m7Var, new java.lang.String[0])) {
            return m7Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageConversationStorage", "get fail, maybe not exist, talker = ".concat(str));
        return null;
    }

    public int W0() {
        android.database.Cursor f17 = this.f276736d.f(java.lang.String.format("select count(*) from %s where %s = 1 and %s < 2", "fmessage_conversation", "isNew", "fmsgIsSend"), null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public int b1() {
        p75.n0 n0Var = dm.e3.f318128y;
        p75.d dVar = dm.e3.f318129z;
        p75.i0 h17 = n0Var.h(dVar.h());
        p75.y yVar = (p75.y) dm.e3.B.i(1).c(new p75.z0(dVar.z()));
        yVar.f(dm.e3.D.x(2));
        yVar.f(dm.e3.E.q(1));
        yVar.f(dm.e3.C.i(30));
        h17.f434190d = yVar;
        p75.l0 a17 = h17.a();
        android.database.Cursor B = this.f276736d.B(a17.f434169a, a17.f434170b);
        int i17 = B.moveToFirst() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public java.util.List d1(int i17) {
        p75.i0 i18 = dm.e3.f318128y.i();
        p75.y yVar = (p75.y) dm.e3.B.i(1).c(new p75.z0(dm.e3.f318129z.z()));
        yVar.f(dm.e3.D.x(2));
        yVar.f(dm.e3.E.q(1));
        yVar.f(dm.e3.C.i(30));
        i18.f434190d = yVar;
        i18.e(dm.e3.A.u());
        i18.c(i17, 0);
        return i18.a().k(this.f276736d, com.p314xaae8f345.mm.p2621x8fb0427b.m7.class);
    }

    public boolean f1(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 P0 = P0(str);
        if (P0 == null || !str.equals(P0.f66376x114ef53e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = ".concat(str));
            return false;
        }
        P0.f66368xc6ce9c67 = 1;
        return super.mo9952xce0038c9(P0, new java.lang.String[0]);
    }

    @Override // l75.n0
    /* renamed from: getAll */
    public android.database.Cursor mo78085xb5882a6b() {
        return this.f276736d.B("select * from fmessage_conversation  ORDER BY lastModifiedTime DESC", null);
    }

    @Override // l75.n0
    /* renamed from: getCount */
    public int mo78086x7444f759() {
        android.database.Cursor f17 = this.f276736d.f("select count(*) from fmessage_conversation", null, 2);
        int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
        f17.close();
        return i17;
    }

    public boolean i1(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, talker is null");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 P0 = P0(str);
        if (P0 == null || !str.equals(P0.f66376x114ef53e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "unsetNew fail, conversation does not exist, talker = ".concat(str));
            return false;
        }
        P0.f66372x2945fc91 = 0;
        P0.f66368xc6ce9c67 = 1;
        return super.mo9952xce0038c9(P0, new java.lang.String[0]);
    }

    public boolean k1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "updateState fail, talker is null");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m7 P0 = P0(str);
        if (P0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationStorage", "updateState fail, get fail, talker = ".concat(str));
            return false;
        }
        if (i17 == P0.f66375x29d3a50c) {
            return true;
        }
        P0.f66375x29d3a50c = i17;
        P0.f66373x46f58791 = c01.id.c();
        if (!super.mo9952xce0038c9(P0, new java.lang.String[0])) {
            return false;
        }
        mo145247xf35bbb4(str);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0215, code lost:
    
        if (r0.f66494x2262335f == 2) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04b8  */
    @Override // l75.q0
    /* renamed from: onNotifyChange */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo735xb0dfc7d8(java.lang.String r20, l75.w0 r21) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2621x8fb0427b.o7.mo735xb0dfc7d8(java.lang.String, l75.w0):void");
    }

    public boolean y0() {
        if (this.f276736d.A("fmessage_conversation", "update fmessage_conversation set isNew = 0")) {
            m145262xf35bbb4();
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationStorage", "clearAllNew fail");
        return false;
    }

    public boolean z0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker fail, encryptTalker is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker() called with: encryptTalker = [%s]", str);
        if (!(this.f276736d.mo70514xb06685ab("fmessage_conversation", "encryptTalker = ?", new java.lang.String[]{str}) > 0)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FMessageConversationStorage", "deleteByEncryptTalker success, encryptTalker: %s", str);
        mo145247xf35bbb4(str);
        return true;
    }
}
