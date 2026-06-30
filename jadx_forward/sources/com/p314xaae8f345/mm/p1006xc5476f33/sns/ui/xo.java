package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class xo extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f253106c;

    /* renamed from: g, reason: collision with root package name */
    public ca4.l f253110g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo f253112i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f253107d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f253108e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f253109f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f253111h = false;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Comparator f253113j = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wo(this);

    public xo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo uoVar, java.lang.String str, boolean z17) {
        this.f253106c = false;
        this.f253112i = uoVar;
        this.f253106c = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r2.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserSearchList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r6 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r6.mo9015xbf5d97fd(r2);
        r3.add(r6);
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            r7 = this;
            java.lang.String r0 = "loadData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            long r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246206a
            java.lang.String r2 = ca4.z0.s0(r2)
            long r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246207b
            java.lang.String r3 = ca4.z0.s0(r3)
            java.lang.String r4 = "getUserSearchList"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r5)
            com.tencent.mm.plugin.sns.storage.f2 r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj()
            android.database.Cursor r2 = r6.P1(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r2.getCount()
            if (r6 != 0) goto L35
            r2.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
            goto L52
        L35:
            boolean r6 = r2.moveToFirst()
            if (r6 == 0) goto L4c
        L3b:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r6.<init>()
            r6.mo9015xbf5d97fd(r2)
            r3.add(r6)
            boolean r6 = r2.moveToNext()
            if (r6 != 0) goto L3b
        L4c:
            r2.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r5)
        L52:
            com.tencent.mm.plugin.sns.ui.uo r2 = r7.f253112i
            r2.a()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r2[r5] = r4
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "MicroMsg.SnsSelfAdapterSearchHelper"
            java.lang.String r5 = "loadData thread: %d count: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xo.b():java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo uoVar = this.f253112i;
        if (uoVar != null) {
            if (list != null) {
                d(this.f253111h, list);
            }
            uoVar.c(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }

    public final void d(boolean z17, java.util.List list) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i17;
        int i18;
        int i19;
        java.lang.String str2 = "initFixType";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFixType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        this.f253110g = new ca4.l();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        boolean z18 = this.f253106c;
        if (z17) {
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226(0L);
                c17933xe8d1b226.f68891x29d1292e = 0L;
                c17933xe8d1b226.f38324x142bbdc6 = -1;
                c17933xe8d1b226.m70443x6e018feb((int) (java.lang.System.currentTimeMillis() / 1000));
                list.add(0, c17933xe8d1b226);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        }
        int size = list.size();
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (i27 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            this.f253110g.b();
            int i38 = i27 + 1;
            if (i38 < size) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                java.lang.Object obj = list.get(i38);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
                str = str2;
                hashMap = hashMap4;
                this.f253110g.f121511b = c17933xe8d1b2262.m70359xfb803656();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
                i17 = i37;
                this.f253110g.f121514e = m70371x485d7.f39013x4c306a8a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2262.m70362xf8db520e(), z18);
                this.f253110g.f121512c = c17933xe8d1b2262.m70373x5384133c();
                r45.a90 a90Var = m70371x485d7.f39014x86965dde;
                if (a90Var != null) {
                    this.f253110g.f121513d = a90Var.f451373h.size();
                } else {
                    this.f253110g.f121513d = 0;
                }
            } else {
                str = str2;
                hashMap = hashMap4;
                i17 = i37;
            }
            int i39 = i27 + 2;
            if (i39 < size) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                java.lang.Object obj2 = list.get(i39);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2;
                this.f253110g.f121519j = c17933xe8d1b2263.m70359xfb803656();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = c17933xe8d1b2263.m70371x485d7();
                this.f253110g.f121515f = m70371x485d72.f39013x4c306a8a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2263.m70362xf8db520e(), z18);
                this.f253110g.f121520k = c17933xe8d1b2263.m70373x5384133c();
                r45.a90 a90Var2 = m70371x485d72.f39014x86965dde;
                if (a90Var2 != null) {
                    this.f253110g.f121521l = a90Var2.f451373h.size();
                } else {
                    this.f253110g.f121521l = 0;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            java.lang.Object obj3 = list.get(i27);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj3;
            this.f253110g.f121510a = c17933xe8d1b2264.m70359xfb803656();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d73 = c17933xe8d1b2264.m70371x485d7();
            ca4.l lVar = this.f253110g;
            lVar.f121516g = m70371x485d73.f39013x4c306a8a;
            lVar.f121517h = c17933xe8d1b2264.m70373x5384133c();
            ca4.l lVar2 = this.f253110g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2264.m70362xf8db520e(), z18);
            lVar2.getClass();
            r45.a90 a90Var3 = m70371x485d73.f39014x86965dde;
            if (a90Var3 != null) {
                this.f253110g.f121518i = a90Var3.f451373h.size();
            } else {
                this.f253110g.f121518i = 0;
            }
            if (this.f253110g.d()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 1;
            } else if (this.f253110g.e()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 2;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 3;
            }
            hashMap2.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            hashMap3.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i18));
            i29 += i18;
            java.util.HashMap hashMap5 = hashMap;
            hashMap5.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            if (z18 && i27 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i19 = 0;
            } else {
                int i47 = (i18 < 1 || !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f253110g.f121517h)) ? 0 : 1;
                if (i18 >= 2 && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f253110g.f121512c)) {
                    i47++;
                }
                if (i18 >= 3 && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f253110g.f121520k)) {
                    i47++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i19 = i47;
            }
            i37 = i17 + i19;
            i27 += i18;
            i28++;
            hashMap4 = hashMap5;
            str2 = str;
        }
        this.f253108e = i28;
        this.f253109f = list.size();
        this.f253107d = list;
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        this.f253112i.b(this.f253107d, hashMap2, hashMap3, hashMap4, this.f253109f, this.f253108e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }
}
