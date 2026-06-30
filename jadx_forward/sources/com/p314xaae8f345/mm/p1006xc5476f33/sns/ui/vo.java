package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class vo extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f252231c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f252233e;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo f252238j;

    /* renamed from: l, reason: collision with root package name */
    public ca4.l f252240l;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f252232d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f252234f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f252235g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f252236h = "";

    /* renamed from: i, reason: collision with root package name */
    public boolean f252237i = false;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Comparator f252239k = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.to(this);

    public vo(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo uoVar, java.lang.String str, boolean z17) {
        this.f252231c = "";
        this.f252233e = false;
        this.f252238j = uoVar;
        this.f252231c = str;
        this.f252233e = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r2.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r4 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r4.mo9015xbf5d97fd(r2);
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r2.moveToNext() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r2.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            r14 = this;
            java.lang.String r0 = "loadData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r4 = r14.f252231c
            boolean r6 = r14.f252233e
            java.lang.String r7 = r14.f252236h
            boolean r2 = r14.f252237i
            int r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d
            java.lang.String r10 = "getSnsListByUserName"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r10, r11)
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            java.lang.String r13 = "getCursorByUserNameNotBuff"
            if (r2 == 0) goto L36
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj()
            r5 = 10
            r2.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r12)
            r3 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.K1(r3, r4, r5, r6, r7, r8, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r12)
            goto L4b
        L36:
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj()
            r2.getClass()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r12)
            r3 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.K1(r3, r4, r5, r6, r7, r8, r9)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r12)
        L4b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.getCount()
            if (r4 != 0) goto L5d
            r2.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r11)
            goto L7a
        L5d:
            boolean r4 = r2.moveToFirst()
            if (r4 == 0) goto L74
        L63:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r4.<init>()
            r4.mo9015xbf5d97fd(r2)
            r3.add(r4)
            boolean r4 = r2.moveToNext()
            if (r4 != 0) goto L63
        L74:
            r2.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r10, r11)
        L7a:
            com.tencent.mm.plugin.sns.ui.uo r2 = r14.f252238j
            r2.a()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r4 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "MicroMsg.SnsSelfHelper"
            java.lang.String r5 = "loadData thread: %d count: %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vo.b():java.util.List");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o
    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uo uoVar = this.f252238j;
        if (uoVar != null) {
            if (list != null) {
                d(true, list);
            }
            uoVar.c(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public final void d(boolean z17, java.util.List list) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i17;
        int i18;
        int i19;
        java.lang.String str2 = "initFixType";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initFixType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        this.f252240l = new ca4.l();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        boolean z18 = this.f252233e;
        int i27 = 0;
        if (z17) {
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226(0L);
                c17933xe8d1b226.f68891x29d1292e = 0L;
                c17933xe8d1b226.f38324x142bbdc6 = -1;
                c17933xe8d1b226.m70443x6e018feb((int) (java.lang.System.currentTimeMillis() / 1000));
                list.add(0, c17933xe8d1b226);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        }
        if (z17 && cc4.b.f122015a.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226(0L);
            c17933xe8d1b2262.f68891x29d1292e = 0L;
            c17933xe8d1b2262.f38324x142bbdc6 = -1;
            list.add(0, c17933xe8d1b2262);
        }
        int size = list.size();
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i28 < size) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            this.f252240l.b();
            int i39 = 1;
            if (i28 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            } else if (z18 && i28 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            } else {
                int i47 = i28 + 1;
                if (i47 < size) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    java.lang.Object obj = list.get(i47);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
                    str = str2;
                    hashMap = hashMap4;
                    this.f252240l.f121511b = c17933xe8d1b2263.m70359xfb803656();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2263.m70371x485d7();
                    i17 = i38;
                    this.f252240l.f121514e = m70371x485d7.f39013x4c306a8a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2263.m70362xf8db520e(), z18);
                    this.f252240l.f121512c = c17933xe8d1b2263.m70373x5384133c();
                    r45.a90 a90Var = m70371x485d7.f39014x86965dde;
                    if (a90Var != null) {
                        this.f252240l.f121513d = a90Var.f451373h.size();
                    } else {
                        this.f252240l.f121513d = 0;
                    }
                } else {
                    str = str2;
                    hashMap = hashMap4;
                    i17 = i38;
                }
                int i48 = i28 + 2;
                if (i48 < size) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    java.lang.Object obj2 = list.get(i48);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj2;
                    this.f252240l.f121519j = c17933xe8d1b2264.m70359xfb803656();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = c17933xe8d1b2264.m70371x485d7();
                    this.f252240l.f121515f = m70371x485d72.f39013x4c306a8a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2264.m70362xf8db520e(), z18);
                    this.f252240l.f121520k = c17933xe8d1b2264.m70373x5384133c();
                    r45.a90 a90Var2 = m70371x485d72.f39014x86965dde;
                    if (a90Var2 != null) {
                        this.f252240l.f121521l = a90Var2.f451373h.size();
                    } else {
                        this.f252240l.f121521l = 0;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                java.lang.Object obj3 = list.get(i28);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj3;
                this.f252240l.f121510a = c17933xe8d1b2265.m70359xfb803656();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d73 = c17933xe8d1b2265.m70371x485d7();
                ca4.l lVar = this.f252240l;
                lVar.f121516g = m70371x485d73.f39013x4c306a8a;
                lVar.f121517h = c17933xe8d1b2265.m70373x5384133c();
                ca4.l lVar2 = this.f252240l;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2265.m70362xf8db520e(), z18);
                lVar2.getClass();
                r45.a90 a90Var3 = m70371x485d73.f39014x86965dde;
                if (a90Var3 != null) {
                    this.f252240l.f121518i = a90Var3.f451373h.size();
                    i18 = 0;
                } else {
                    i18 = 0;
                    this.f252240l.f121518i = 0;
                }
                if (this.f252240l.d()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 1;
                } else if (this.f252240l.e()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 2;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 3;
                }
                hashMap2.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                hashMap3.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i39));
                i37 += i39;
                java.util.HashMap hashMap5 = hashMap;
                hashMap5.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                if (z18 || i28 != 0) {
                    i19 = (i39 >= 1 || !com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f252240l.f121517h)) ? i18 : 1;
                    if (i39 >= 2 && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f252240l.f121512c)) {
                        i19++;
                    }
                    if (i39 >= 3 && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226.m70336x13b21a82(this.f252240l.f121520k)) {
                        i19++;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i19 = i18;
                }
                int i49 = i17 + i19;
                i28 += i39;
                i29++;
                i27 = i18;
                hashMap4 = hashMap5;
                i38 = i49;
                str2 = str;
            }
            str = str2;
            hashMap = hashMap4;
            i18 = i27;
            i17 = i38;
            hashMap2.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
            hashMap3.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i39));
            i37 += i39;
            java.util.HashMap hashMap52 = hashMap;
            hashMap52.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            if (z18) {
            }
            if (i39 >= 1) {
            }
            if (i39 >= 2) {
                i19++;
            }
            if (i39 >= 3) {
                i19++;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            int i492 = i17 + i19;
            i28 += i39;
            i29++;
            i27 = i18;
            hashMap4 = hashMap52;
            i38 = i492;
            str2 = str;
        }
        this.f252234f = i29;
        this.f252235g = list.size();
        this.f252232d = list;
        android.os.Vibrator vibrator = ca4.z0.f121601a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        this.f252238j.b(this.f252232d, hashMap2, hashMap3, hashMap4, this.f252235g, this.f252234f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        d(false, this.f252232d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        java.util.Collections.sort(this.f252232d, this.f252239k);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }
}
