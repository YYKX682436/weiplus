package bg2;

/* loaded from: classes3.dex */
public final class l extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101788e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f101789f;

    /* renamed from: g, reason: collision with root package name */
    public mm2.v0 f101790g;

    /* renamed from: h, reason: collision with root package name */
    public mm2.w0 f101791h;

    /* renamed from: i, reason: collision with root package name */
    public long f101792i;

    /* renamed from: m, reason: collision with root package name */
    public long f101793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101788e = "Finder.LiveConvertCheerDataController";
        this.f101790g = new mm2.v0(false, null, null, 0, 0, 31, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H0(r45.r71 r9) {
        /*
            r8 = this;
            java.lang.String r0 = "resp"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            boolean r0 = r8.f101789f
            if (r0 != 0) goto La
            return
        La:
            r0 = 31
            com.tencent.mm.protobuf.f r0 = r9.m75936x14adae67(r0)
            r45.on1 r0 = (r45.on1) r0
            java.lang.String r1 = r8.f101788e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L7f
            r4 = 6
            boolean r5 = r0.m75933x41a8a7f2(r4)
            if (r5 == 0) goto L79
            mm2.w0 r5 = new mm2.w0
            r6 = 4
            java.lang.String r6 = r0.m75945x2fec8307(r6)
            r7 = 5
            int r7 = r0.m75939xb282bd08(r7)
            r5.<init>(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[canUpdateCheerInfo]  is_modified = "
            r6.<init>(r7)
            boolean r4 = r0.m75933x41a8a7f2(r4)
            r6.append(r4)
            java.lang.String r4 = ",localCheerInfoVersion = "
            r6.append(r4)
            mm2.w0 r4 = r8.f101791h
            r6.append(r4)
            java.lang.String r4 = ", newVersionInfo = "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            mm2.w0 r4 = r8.f101791h
            if (r4 == 0) goto L64
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L62
            r8.f101791h = r5
            goto L66
        L62:
            r4 = r3
            goto L67
        L64:
            r8.f101791h = r5
        L66:
            r4 = r2
        L67:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[canUpdateCheerInfo] result = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r5)
            goto L85
        L79:
            java.lang.String r4 = "[canUpdateCheerInfo] is_modified = false,  not need update"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
            goto L84
        L7f:
            java.lang.String r4 = "[canUpdateCheerInfo] newCheerInfo = null , not need update"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r4)
        L84:
            r4 = r3
        L85:
            if (r4 == 0) goto La0
            r4 = 0
            if (r0 == 0) goto L8f
            java.util.LinkedList r5 = r0.m75941xfb821914(r3)
            goto L90
        L8f:
            r5 = r4
        L90:
            if (r0 == 0) goto L96
            java.lang.String r4 = r0.m75945x2fec8307(r2)
        L96:
            if (r0 == 0) goto L9d
            r2 = 2
            int r3 = r0.m75939xb282bd08(r2)
        L9d:
            r8.Y6(r5, r4, r3)
        La0:
            long r2 = r8.f101792i
            r0 = 18
            long r4 = r9.m75942xfb822ef2(r0)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto Lad
            r2 = r4
        Lad:
            long r4 = r8.f101792i
            long r4 = r2 - r4
            r8.f101793m = r4
            r8.f101792i = r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "processLiveMsgResp curLikeCount:"
            r9.<init>(r0)
            long r2 = r8.f101792i
            r9.append(r2)
            java.lang.String r0 = ", diffLikes:"
            r9.append(r0)
            long r2 = r8.f101793m
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.l.H0(r45.r71):void");
    }

    @Override // tc2.c
    public void Q6() {
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = false;
        if (d2Var != null && d2Var.f101546i) {
            z17 = true;
        }
        this.f101789f = z17;
    }

    @Override // tc2.c
    public void U6() {
        this.f101789f = false;
        this.f101790g = new mm2.v0(false, null, null, 0, 0, 31, null);
        this.f101791h = null;
        this.f101792i = 0L;
        this.f101793m = 0L;
    }

    public final void Y6(java.util.LinkedList linkedList, java.lang.String str, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101788e, "updateCheerInfos. cheerInfos:" + linkedList + " iconBtnUrl:" + str + " enable:" + i17);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.String.valueOf(this.f101790g.f411004d));
        java.util.List list = this.f101790g.f411002b;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.h30 h30Var = (r45.h30) it.next();
                stringBuffer.append(h30Var.m75945x2fec8307(0));
                stringBuffer.append(h30Var.m75939xb282bd08(1));
            }
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(java.lang.String.valueOf(i17));
        if (linkedList != null) {
            synchronized (linkedList) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.h30 h30Var2 = (r45.h30) it6.next();
                    stringBuffer2.append(h30Var2.m75945x2fec8307(0));
                    stringBuffer2.append(h30Var2.m75939xb282bd08(1));
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.C0(stringBuffer, stringBuffer2)) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101788e, "updateCheerInfos. disable custom cheer info");
                this.f101790g.f411002b.clear();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101788e, "updateCheerInfos. new cheerInfo:" + linkedList);
                this.f101790g.f411002b.clear();
                if (!(linkedList == null || linkedList.isEmpty())) {
                    this.f101790g.f411002b.addAll(linkedList);
                }
            }
            this.f101790g.f411001a = true;
        } else {
            this.f101790g.f411001a = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101788e, "updateCheerInfos. skip by no differences");
        }
        mm2.v0 v0Var = this.f101790g;
        v0Var.f411003c = str;
        v0Var.f411004d = i17;
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList m75941xfb8219143;
        java.util.LinkedList m75941xfb8219144;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (this.f101789f) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.on1 on1Var = (r45.on1) resp.m75936x14adae67(29);
            int i17 = 0;
            java.util.LinkedList m75941xfb8219145 = on1Var != null ? on1Var.m75941xfb821914(0) : null;
            boolean z17 = m75941xfb8219145 == null || m75941xfb8219145.isEmpty();
            java.lang.String str = this.f101788e;
            if (z17) {
                r45.be1 be1Var = (r45.be1) resp.m75936x14adae67(19);
                java.util.LinkedList m75941xfb8219146 = be1Var != null ? be1Var.m75941xfb821914(0) : null;
                if (m75941xfb8219146 == null || m75941xfb8219146.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleCheerIconsInfo skip, no custom cheer info.");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleCheerIconsInfo custom ad cheer info:");
                    r45.be1 be1Var2 = (r45.be1) resp.m75936x14adae67(19);
                    sb6.append((be1Var2 == null || (m75941xfb8219142 = be1Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    r45.be1 be1Var3 = (r45.be1) resp.m75936x14adae67(19);
                    if (be1Var3 != null && (m75941xfb821914 = be1Var3.m75941xfb821914(0)) != null) {
                        linkedList.addAll(m75941xfb821914);
                        this.f101790g.f411005e = 1;
                        i17 = 1;
                    }
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleCheerIconsInfo custom cheer info:");
                r45.on1 on1Var2 = (r45.on1) resp.m75936x14adae67(29);
                sb7.append((on1Var2 == null || (m75941xfb8219144 = on1Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219144.size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                r45.on1 on1Var3 = (r45.on1) resp.m75936x14adae67(29);
                if (on1Var3 != null && (m75941xfb8219143 = on1Var3.m75941xfb821914(0)) != null) {
                    linkedList.addAll(m75941xfb8219143);
                    r45.on1 on1Var4 = (r45.on1) resp.m75936x14adae67(29);
                    int m75939xb282bd08 = on1Var4 != null ? on1Var4.m75939xb282bd08(2) : 0;
                    this.f101790g.f411005e = 0;
                    i17 = m75939xb282bd08;
                }
                r45.on1 on1Var5 = (r45.on1) resp.m75936x14adae67(29);
                if (on1Var5 != null) {
                    this.f101791h = new mm2.w0(on1Var5.m75945x2fec8307(4), on1Var5.m75939xb282bd08(5));
                }
            }
            r45.on1 on1Var6 = (r45.on1) resp.m75936x14adae67(29);
            Y6(linkedList, on1Var6 != null ? on1Var6.m75945x2fec8307(1) : null, i17);
            r45.nw1 nw1Var = (r45.nw1) resp.m75936x14adae67(3);
            this.f101792i = nw1Var != null ? nw1Var.m75942xfb822ef2(19) : 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "processJoinLiveResp curLikeCount:" + this.f101792i);
        }
    }
}
