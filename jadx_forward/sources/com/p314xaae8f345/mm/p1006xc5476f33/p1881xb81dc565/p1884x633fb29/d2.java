package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

@j95.b
/* loaded from: classes14.dex */
public class d2 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y f231440e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f231441f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashSet f231442g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f231443h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f231444i = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f231439d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    public d2() {
        jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
        if (oVar == null || !oVar.ib()) {
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3.f231689g == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3.class) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3.f231689g == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3.f231689g = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3();
                }
            }
        }
        this.f231440e = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3.f231689g;
    }

    public java.util.LinkedList Ai() {
        if (this.f231444i == null) {
            this.f231444i = new java.util.LinkedList();
        }
        return this.f231444i;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void B2(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            yVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = this.f231443h;
        if (linkedList != null) {
            if (linkedList.contains(str)) {
                return;
            }
            this.f231443h.add(str);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            this.f231443h = linkedList2;
            if (linkedList2.contains(str)) {
                return;
            }
            this.f231443h.add(str);
        }
    }

    public final boolean Bi(java.lang.String str, r45.k07 k07Var) {
        boolean z17;
        java.lang.String[] strArr;
        if (k07Var == null) {
            return false;
        }
        p21.j jVar = new p21.j();
        jVar.f66530xacb0c0d4 = str;
        jVar.f66522x861009b5 = k07Var.f459811f;
        long j17 = k07Var.f459810e;
        jVar.f66526xeabee3b = (int) j17;
        jVar.f66527xc6d1e13f = 0L;
        jVar.f66528xc729faff = 0;
        jVar.f66524x922cf104 = k07Var.f459815m;
        jVar.f66523xadd3a154 = j17;
        java.util.LinkedList linkedList = k07Var.f459812g;
        jVar.f66525xbcb1bed0 = linkedList.size() > 0 ? linkedList.size() : 0;
        jVar.f66521xac3be4e = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().y0(str) == null) {
            pj3.b Ni = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni();
            Ni.getClass();
            java.lang.String str2 = jVar.f66530xacb0c0d4;
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. multiTalkInfo wxGroupId is empty!");
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d, ilinkroomid=%d", str2, jVar.f66522x861009b5, java.lang.Integer.valueOf(jVar.f66526xeabee3b), java.lang.Long.valueOf(jVar.f66527xc6d1e13f), java.lang.Integer.valueOf(jVar.f66528xc729faff), jVar.f66524x922cf104, java.lang.Integer.valueOf(jVar.f66525xbcb1bed0), java.lang.Long.valueOf(jVar.f66521xac3be4e), java.lang.Long.valueOf(jVar.f66523xadd3a154));
            try {
                boolean mo880xb970c2b9 = Ni.mo880xb970c2b9(jVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "insert ret " + mo880xb970c2b9 + " for id=%s" + str2);
                return mo880xb970c2b9;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e17.toString());
                return false;
            }
        }
        pj3.b Ni2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni();
        Ni2.getClass();
        java.lang.String str3 = jVar.f66530xacb0c0d4;
        if (android.text.TextUtils.isEmpty(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. multiTalkInfo wxGroupId is empty!");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update. wxGroupId=%s, groupId=%s, roomId =%d, roomKey =%d, routeId =%d, inviteUser=%s,memberCount=%d,createTime=%d,state=%d,ilinkroomid=%d", str3, jVar.f66522x861009b5, java.lang.Integer.valueOf(jVar.f66526xeabee3b), java.lang.Long.valueOf(jVar.f66527xc6d1e13f), java.lang.Integer.valueOf(jVar.f66528xc729faff), jVar.f66524x922cf104, java.lang.Integer.valueOf(jVar.f66525xbcb1bed0), java.lang.Long.valueOf(jVar.f66521xac3be4e), java.lang.Integer.valueOf(jVar.f66529x29d3a50c), java.lang.Long.valueOf(jVar.f66523xadd3a154));
        try {
            strArr = new java.lang.String[1];
            z17 = false;
        } catch (java.lang.Exception e18) {
            e = e18;
            z17 = false;
        }
        try {
            strArr[0] = "wxGroupId";
            boolean mo9952xce0038c9 = Ni2.mo9952xce0038c9(jVar, strArr);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "update ret " + mo9952xce0038c9 + " for id=%s" + str3);
            return mo9952xce0038c9;
        } catch (java.lang.Exception e19) {
            e = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalk.storage.MultiTalkInfoStorage", "save mulitalTalk failure!" + e.toString());
            return z17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public java.lang.String De(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).De(str, str2);
        }
        pj3.c z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().z0(str, str2);
        if (z07 != null) {
            return z07.f66661x922cf104;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0099, code lost:
    
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di() {
        /*
            r15 = this;
            pj3.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni()
            java.lang.String r1 = "MicroMsg.MultiTalk.storage.MultiTalkInfoStorage"
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r4 = "select wxGroupId, groupId, roomId, roomKey, routeId, createTime, ilinkRoomId from MultiTalkInfo"
            android.database.Cursor r0 = r0.m145256x1d3f4980(r4, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L14:
            r4 = 1
            if (r0 == 0) goto L99
            boolean r5 = r0.moveToNext()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            if (r5 == 0) goto L99
            p21.j r5 = new p21.j     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.<init>()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r6 = r0.getString(r2)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66530xacb0c0d4 = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r6 = r0.getString(r4)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66522x861009b5 = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r6 = 2
            int r7 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66526xeabee3b = r7     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r7 = 3
            long r8 = r0.getLong(r7)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66527xc6d1e13f = r8     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r8 = 4
            int r9 = r0.getInt(r8)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66528xc729faff = r9     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r9 = 5
            long r10 = r0.getLong(r9)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66521xac3be4e = r10     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r10 = 6
            long r11 = r0.getLong(r10)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.f66523xadd3a154 = r11     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r11 = "getMultiTalkInfoList got value for wxGroupId = %s, groupId=%s, roomId = %d, roomKey = %d, routeId = %d, createTime=%d, ilinkroomid = %d"
            r12 = 7
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r13 = r5.f66530xacb0c0d4     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r2] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r13 = r5.f66522x861009b5     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r4] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r13 = r5.f66526xeabee3b     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r6] = r13     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r13 = r5.f66527xc6d1e13f     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r7] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            int r6 = r5.f66528xc729faff     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r8] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r6 = r5.f66521xac3be4e     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r9] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            long r6 = r5.f66523xadd3a154     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r12[r10] = r6     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r11, r12)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r3.add(r5)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            goto L14
        L8d:
            r1 = move-exception
            goto L95
        L8f:
            java.lang.String r5 = "getMultiTalkInfoList error!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r5)     // Catch: java.lang.Throwable -> L8d
            goto L9b
        L95:
            r0.close()
            throw r1
        L99:
            if (r0 == 0) goto L9e
        L9b:
            r0.close()
        L9e:
            java.lang.String r0 = "MicroMsg.MultiTalkRoomListMsg"
            java.lang.String r1 = "setMultitalkingwxGroupIdMap reset!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r1 = r3.iterator()
        Lae:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r1.next()
            p21.j r3 = (p21.j) r3
            java.lang.String r3 = r3.f66530xacb0c0d4
            r0.add(r3)
            goto Lae
        Lc0:
            java.util.HashSet r1 = r15.f231442g
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto Ld2
            java.util.HashSet r1 = r15.f231442g
            if (r1 != 0) goto Ld3
            int r1 = r0.size()
            if (r1 != 0) goto Ld3
        Ld2:
            r2 = r4
        Ld3:
            r15.f231442g = r0
            if (r2 != 0) goto Le3
            com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent r0 = new com.tencent.mm.autogen.events.RefreshMainUIMultitalkIconEvent
            r0.<init>()
            am.mq r1 = r0.f136204g
            r1.f88891a = r4
            r0.e()
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.d2.Di():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Gf(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).getClass();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void I9(java.util.List list, java.util.List list2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).I9(list, list2);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void J4(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            yVar.J4(str);
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", str);
        d(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().d(str);
        wi(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void Ji(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Ji(str);
            return;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str) && zc(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t != null && com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153141f.equals(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f(false, false);
            }
            this.f231439d.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b2(this, str), 2000L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public void Ld(java.lang.String str, er4.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Ld(str, eVar);
        }
    }

    public void Ni(java.lang.String str, r45.k07 k07Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", str);
        if (k07Var != null && (linkedList = k07Var.f459812g) != null && linkedList.size() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().d(str);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.z07 z07Var = (r45.z07) it.next();
                pj3.c cVar = new pj3.c();
                cVar.f66666xacb0c0d4 = str;
                cVar.f66661x922cf104 = k07Var.f459815m;
                cVar.f66663x693749da = 0L;
                cVar.f66665xdde069b = z07Var.f473109d.f472222d;
                int i17 = z07Var.f473110e;
                cVar.f66664x10a0fed7 = 20;
                if (i17 == 1) {
                    cVar.f66664x10a0fed7 = 10;
                }
                if (i17 == 2 || i17 == 3) {
                    cVar.f66664x10a0fed7 = 1;
                }
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().J0(cVar)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var.f473109d.f472222d, java.lang.Long.valueOf(cVar.f66663x693749da), cVar.f66661x922cf104);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var.f473109d.f472222d, java.lang.Long.valueOf(cVar.f66663x693749da), cVar.f66661x922cf104, java.lang.Integer.valueOf(cVar.f66664x10a0fed7));
            }
        }
        if (Bi(str, k07Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:" + str);
            java.util.HashSet hashSet = this.f231442g;
            if (hashSet != null) {
                hashSet.add(str);
            } else {
                Di();
                java.util.HashSet hashSet2 = this.f231442g;
                if (hashSet2 != null) {
                    hashSet2.add(str);
                }
            }
        }
        wi(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public dm.f8 O7(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).O7(str) : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().y0(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public int Og(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Og(str, str2);
        }
        pj3.c z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().z0(str, str2);
        if (z07 != null) {
            return z07.f66664x10a0fed7;
        }
        return 30;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public java.util.List P6(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return yVar.P6(str);
        }
        java.util.LinkedList D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().D0(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = D0.iterator();
        while (it.hasNext()) {
            linkedList.add(((pj3.c) it.next()).f66665xdde069b);
        }
        return linkedList;
    }

    public void Ri(java.lang.String str, r45.k07 k07Var) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", str);
        p21.j y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().y0(str);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
            Ni(str, k07Var);
            return;
        }
        if (y07.f66523xadd3a154 != k07Var.f459810e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "roomid has changed! now return!multiTalkInfo.field_roomId:" + y07.f66526xeabee3b + "bannerinfo.roomid:" + k07Var.f459810e);
            return;
        }
        java.util.LinkedList linkedList = k07Var.f459812g;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((r45.z07) it.next()).f473109d.f472222d);
        }
        int i18 = 2;
        pj3.c cVar = null;
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(2, null);
        int i19 = 1;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
            Bi(str, k07Var);
        } else {
            java.util.LinkedList<pj3.c> D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().D0(str);
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            for (pj3.c cVar2 : D0) {
                linkedList3.add(cVar2.f66665xdde069b);
                if (cVar2.f66665xdde069b.equals(str2)) {
                    cVar = cVar2;
                }
            }
            long j17 = 0;
            int i27 = 3;
            if (cVar == null || !linkedList2.contains(str2)) {
                i17 = 1;
            } else {
                java.util.Iterator it6 = linkedList.iterator();
                i17 = 1;
                while (it6.hasNext()) {
                    r45.z07 z07Var = (r45.z07) it6.next();
                    int i28 = z07Var.f473110e;
                    int i29 = (i28 == i18 || i28 == i27) ? 1 : i28 == 1 ? 10 : 20;
                    java.lang.String str3 = z07Var.f473109d.f472222d;
                    if (str3 != null && str3.equals(str2) && z07Var.f473110e != cVar.f66664x10a0fed7) {
                        pj3.c cVar3 = new pj3.c();
                        cVar3.f66666xacb0c0d4 = str;
                        cVar3.f66661x922cf104 = k07Var.f459815m;
                        cVar3.f66663x693749da = j17;
                        cVar3.f66665xdde069b = z07Var.f473109d.f472222d;
                        cVar3.f66664x10a0fed7 = i29;
                        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().J0(cVar3)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var.f473109d.f472222d, java.lang.Long.valueOf(cVar3.f66663x693749da), cVar3.f66661x922cf104);
                            i17 = 0;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var.f473109d.f472222d, java.lang.Long.valueOf(cVar3.f66663x693749da), cVar3.f66661x922cf104, java.lang.Integer.valueOf(cVar3.f66664x10a0fed7));
                    }
                    i18 = 2;
                    j17 = 0;
                    i27 = 3;
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                r45.z07 z07Var2 = (r45.z07) it7.next();
                if (!linkedList3.contains(z07Var2.f473109d.f472222d)) {
                    pj3.c cVar4 = new pj3.c();
                    cVar4.f66666xacb0c0d4 = str;
                    cVar4.f66661x922cf104 = k07Var.f459815m;
                    cVar4.f66663x693749da = 0L;
                    cVar4.f66665xdde069b = z07Var2.f473109d.f472222d;
                    cVar4.f66664x10a0fed7 = 20;
                    int i37 = z07Var2.f473110e;
                    if (i37 == i19) {
                        cVar4.f66664x10a0fed7 = 10;
                    }
                    if (i37 == 2 || i37 == 3) {
                        cVar4.f66664x10a0fed7 = i19;
                    }
                    if (!com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().J0(cVar4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", str, z07Var2.f473109d.f472222d, java.lang.Long.valueOf(cVar4.f66663x693749da), cVar4.f66661x922cf104);
                        i17 = 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s, status=%d", str, z07Var2.f473109d.f472222d, java.lang.Long.valueOf(cVar4.f66663x693749da), cVar4.f66661x922cf104, java.lang.Integer.valueOf(cVar4.f66664x10a0fed7));
                    i19 = 1;
                }
            }
            java.util.Iterator it8 = linkedList3.iterator();
            i19 = i17;
            while (it8.hasNext()) {
                java.lang.String str4 = (java.lang.String) it8.next();
                if (!linkedList2.contains(str4)) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().y0(str, str4)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + str + ", username = " + str4);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + str + ", username = " + str4);
                        i19 = 0;
                    }
                }
            }
        }
        if (i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
        } else {
            wi(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Si() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Si() : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean Th(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Th(str, str2) : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ui().z0(str, str2) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public synchronized void Ud(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).Ud(xVar);
        } else {
            ((java.util.ArrayList) this.f231441f).add(xVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return yVar.d(str);
        }
        if (this.f231442g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:" + str);
            this.f231442g.remove(str);
        } else {
            Di();
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().d(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean e5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).e5() : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().x() && (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Starting || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231709s == sj3.e4.Creating);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean ff() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).ff() : vq4.p0.d() || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().z() || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().x() || com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    /* renamed from: getDisplayName */
    public java.lang.String mo67022x40021d37(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).mo67022x40021d37(str);
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        return c01.a2.e(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean kb(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).kb(str);
        }
        sj3.d4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi();
        if (str != null) {
            android.content.Intent intent = Zi.f490010f;
            if (intent != null) {
                java.lang.String stringExtra = intent.getStringExtra("enterMainUiWxGroupId");
                sj3.q3 q3Var = Zi.f490008d;
                if (!android.text.TextUtils.isEmpty(stringExtra) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, stringExtra) && q3Var != null && q3Var.getVisibility() == 0) {
                    return true;
                }
            }
        } else {
            sj3.q3 q3Var2 = Zi.f490008d;
            if (q3Var2 != null) {
                if (q3Var2.getVisibility() == 0) {
                    sj3.q3 q3Var3 = Zi.f490008d;
                    if (q3Var3 != null && q3Var3.isShown()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean mh(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).mh(str);
        }
        p21.j jVar = (p21.j) O7(str);
        if (jVar == null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk, roomid:" + jVar.f66526xeabee3b + " ilinkroomid:" + jVar.f66523xadd3a154 + " wxgroupid:" + str + " wifigateway:" + com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.w());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk:groupid:%s", jVar.f66522x861009b5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
        i4Var.N((long) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1)), c01.z1.r());
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().O(str, 2);
        java.lang.String str2 = jVar.f66522x861009b5;
        i4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Multitalk.ILinkService", "steve:  enter newMultiTalkJoinRoom. %s, %s", str2, str);
        i4Var.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.d2(i4Var, str, str2));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public synchronized void p2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).p2(xVar);
        } else {
            ((java.util.ArrayList) this.f231441f).remove(xVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean q4(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            return yVar.q4(str);
        }
        p21.j y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ni().y0(str);
        if (y07 == null || (str2 = y07.f66530xacb0c0d4) == null || !str2.equals(str)) {
            return false;
        }
        if (java.lang.System.currentTimeMillis() - y07.f66521xac3be4e <= 21600000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + str + ",is out of time 6 hours..");
        J4(str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean s4(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar == null) {
            return iq.b.C(context);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).getClass();
        return iq.b.C(context);
    }

    public final void wi(java.lang.String str) {
        java.util.Iterator it = this.f231441f.iterator();
        while (it.hasNext()) {
            this.f231439d.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c2(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.x) it.next(), str));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean y8() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        return yVar != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar).y8() : com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y
    public boolean zc(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y yVar = this.f231440e;
        if (yVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3 u3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u3) yVar;
            if (android.text.TextUtils.isEmpty(str)) {
                return false;
            }
            return u3Var.f231690d.containsKey(str);
        }
        if (this.f231442g == null) {
            Di();
        }
        java.util.HashSet hashSet = this.f231442g;
        return hashSet != null && hashSet.contains(str);
    }
}
