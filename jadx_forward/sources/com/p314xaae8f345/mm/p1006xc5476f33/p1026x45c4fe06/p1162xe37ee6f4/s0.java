package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4;

/* loaded from: classes7.dex */
public enum s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 {
    INSTANCE;


    /* renamed from: e, reason: collision with root package name */
    public static final boolean f167661e;

    /* renamed from: f, reason: collision with root package name */
    public static final t65.g f167662f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.q0 f167663g;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        f167661e = z65.c.a();
        f167662f = new t65.g("MicroMsg.WxaCgiServiceWC");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.q0 q0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.q0(null);
        f167663g = q0Var;
        q0Var.put(-1327997639, 1714);
        q0Var.put(-1275324719, 1192);
        q0Var.put(933572841, 1345);
        q0Var.put(863922063, 1115);
        q0Var.put(-2066070349, 1862);
        q0Var.put(-1914617239, tj.d.f76812x366c91de);
        q0Var.put(-1866359436, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.n.f34699x366c91de);
        q0Var.put(-1785304773, bb1.d.f4183x366c91de);
        q0Var.put(1719564262, wc1.r.f77349x366c91de);
        q0Var.put(1410133958, 1157);
        q0Var.put(-1813933127, me1.a.f72878x366c91de);
        q0Var.put(1292008571, 2932);
        q0Var.put(127341741, 2695);
        q0Var.put(-150020997, 1024);
        q0Var.put(-86607985, 2775);
        q0Var.put(-94918271, 1010);
        q0Var.put(-735781660, 2536);
        q0Var.put(1292008571, 2932);
        q0Var.put(127341741, 2695);
        q0Var.put(-150020997, 1024);
        q0Var.put(-86607985, 2775);
        q0Var.put(-94918271, 1010);
        q0Var.put(-735781660, 2536);
        q0Var.put(865414636, 1133);
        q0Var.put(2087547335, 4602);
        q0Var.put(-397765444, 1912);
        q0Var.put(1410133958, 1157);
        q0Var.put(-1813933127, me1.a.f72878x366c91de);
        q0Var.put(-453030458, 1029);
        q0Var.put(865464761, 1117);
        q0Var.put(-306295037, 2920);
        q0Var.put(930481433, 2946);
        q0Var.put(-1772031937, 4428);
        q0Var.put(-946646219, 1009);
        q0Var.put(-917290477, 7056);
        q0Var.put(1063353410, 2955);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pq5.g e1(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, java.lang.Class cls) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.q0 q0Var = f167663g;
        q0Var.getClass();
        int i17 = q0Var.get(str.hashCode(), -1);
        boolean z17 = f167661e;
        if (i17 == -1) {
            iz5.a.b(java.lang.String.format(java.util.Locale.US, "Found invalid funcid, please register %s in this map.", str), java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
        }
        lVar.f152200d = i17;
        lVar.f152199c = str;
        lVar.f152197a = fVar;
        try {
            lVar.f152198b = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) cls.newInstance();
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCgiServiceWC", "new Response failed %s", cls.getName());
            if (z17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        pq5.g a17 = pq5.h.a();
        a17.D(f167662f);
        a17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p0(this, lVar, str));
        return a17;
    }
}
