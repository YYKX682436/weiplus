package bg2;

/* loaded from: classes3.dex */
public final class l extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20255e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20256f;

    /* renamed from: g, reason: collision with root package name */
    public mm2.v0 f20257g;

    /* renamed from: h, reason: collision with root package name */
    public mm2.w0 f20258h;

    /* renamed from: i, reason: collision with root package name */
    public long f20259i;

    /* renamed from: m, reason: collision with root package name */
    public long f20260m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20255e = "Finder.LiveConvertCheerDataController";
        this.f20257g = new mm2.v0(false, null, null, 0, 0, 31, null);
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
            kotlin.jvm.internal.o.g(r9, r0)
            boolean r0 = r8.f20256f
            if (r0 != 0) goto La
            return
        La:
            r0 = 31
            com.tencent.mm.protobuf.f r0 = r9.getCustom(r0)
            r45.on1 r0 = (r45.on1) r0
            java.lang.String r1 = r8.f20255e
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L7f
            r4 = 6
            boolean r5 = r0.getBoolean(r4)
            if (r5 == 0) goto L79
            mm2.w0 r5 = new mm2.w0
            r6 = 4
            java.lang.String r6 = r0.getString(r6)
            r7 = 5
            int r7 = r0.getInteger(r7)
            r5.<init>(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[canUpdateCheerInfo]  is_modified = "
            r6.<init>(r7)
            boolean r4 = r0.getBoolean(r4)
            r6.append(r4)
            java.lang.String r4 = ",localCheerInfoVersion = "
            r6.append(r4)
            mm2.w0 r4 = r8.f20258h
            r6.append(r4)
            java.lang.String r4 = ", newVersionInfo = "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            com.tencent.mars.xlog.Log.i(r1, r4)
            mm2.w0 r4 = r8.f20258h
            if (r4 == 0) goto L64
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L62
            r8.f20258h = r5
            goto L66
        L62:
            r4 = r3
            goto L67
        L64:
            r8.f20258h = r5
        L66:
            r4 = r2
        L67:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[canUpdateCheerInfo] result = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r1, r5)
            goto L85
        L79:
            java.lang.String r4 = "[canUpdateCheerInfo] is_modified = false,  not need update"
            com.tencent.mars.xlog.Log.i(r1, r4)
            goto L84
        L7f:
            java.lang.String r4 = "[canUpdateCheerInfo] newCheerInfo = null , not need update"
            com.tencent.mars.xlog.Log.i(r1, r4)
        L84:
            r4 = r3
        L85:
            if (r4 == 0) goto La0
            r4 = 0
            if (r0 == 0) goto L8f
            java.util.LinkedList r5 = r0.getList(r3)
            goto L90
        L8f:
            r5 = r4
        L90:
            if (r0 == 0) goto L96
            java.lang.String r4 = r0.getString(r2)
        L96:
            if (r0 == 0) goto L9d
            r2 = 2
            int r3 = r0.getInteger(r2)
        L9d:
            r8.Y6(r5, r4, r3)
        La0:
            long r2 = r8.f20259i
            r0 = 18
            long r4 = r9.getLong(r0)
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto Lad
            r2 = r4
        Lad:
            long r4 = r8.f20259i
            long r4 = r2 - r4
            r8.f20260m = r4
            r8.f20259i = r2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "processLiveMsgResp curLikeCount:"
            r9.<init>(r0)
            long r2 = r8.f20259i
            r9.append(r2)
            java.lang.String r0 = ", diffLikes:"
            r9.append(r0)
            long r2 = r8.f20260m
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.l.H0(r45.r71):void");
    }

    @Override // tc2.c
    public void Q6() {
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = false;
        if (d2Var != null && d2Var.f20013i) {
            z17 = true;
        }
        this.f20256f = z17;
    }

    @Override // tc2.c
    public void U6() {
        this.f20256f = false;
        this.f20257g = new mm2.v0(false, null, null, 0, 0, 31, null);
        this.f20258h = null;
        this.f20259i = 0L;
        this.f20260m = 0L;
    }

    public final void Y6(java.util.LinkedList linkedList, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i(this.f20255e, "updateCheerInfos. cheerInfos:" + linkedList + " iconBtnUrl:" + str + " enable:" + i17);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(java.lang.String.valueOf(this.f20257g.f329471d));
        java.util.List list = this.f20257g.f329469b;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.h30 h30Var = (r45.h30) it.next();
                stringBuffer.append(h30Var.getString(0));
                stringBuffer.append(h30Var.getInteger(1));
            }
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(java.lang.String.valueOf(i17));
        if (linkedList != null) {
            synchronized (linkedList) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.h30 h30Var2 = (r45.h30) it6.next();
                    stringBuffer2.append(h30Var2.getString(0));
                    stringBuffer2.append(h30Var2.getInteger(1));
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.C0(stringBuffer, stringBuffer2)) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i(this.f20255e, "updateCheerInfos. disable custom cheer info");
                this.f20257g.f329469b.clear();
            } else {
                com.tencent.mars.xlog.Log.i(this.f20255e, "updateCheerInfos. new cheerInfo:" + linkedList);
                this.f20257g.f329469b.clear();
                if (!(linkedList == null || linkedList.isEmpty())) {
                    this.f20257g.f329469b.addAll(linkedList);
                }
            }
            this.f20257g.f329468a = true;
        } else {
            this.f20257g.f329468a = false;
            com.tencent.mars.xlog.Log.i(this.f20255e, "updateCheerInfos. skip by no differences");
        }
        mm2.v0 v0Var = this.f20257g;
        v0Var.f329470c = str;
        v0Var.f329471d = i17;
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (this.f20256f) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.on1 on1Var = (r45.on1) resp.getCustom(29);
            int i17 = 0;
            java.util.LinkedList list5 = on1Var != null ? on1Var.getList(0) : null;
            boolean z17 = list5 == null || list5.isEmpty();
            java.lang.String str = this.f20255e;
            if (z17) {
                r45.be1 be1Var = (r45.be1) resp.getCustom(19);
                java.util.LinkedList list6 = be1Var != null ? be1Var.getList(0) : null;
                if (list6 == null || list6.isEmpty()) {
                    com.tencent.mars.xlog.Log.i(str, "handleCheerIconsInfo skip, no custom cheer info.");
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleCheerIconsInfo custom ad cheer info:");
                    r45.be1 be1Var2 = (r45.be1) resp.getCustom(19);
                    sb6.append((be1Var2 == null || (list2 = be1Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    r45.be1 be1Var3 = (r45.be1) resp.getCustom(19);
                    if (be1Var3 != null && (list = be1Var3.getList(0)) != null) {
                        linkedList.addAll(list);
                        this.f20257g.f329472e = 1;
                        i17 = 1;
                    }
                }
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleCheerIconsInfo custom cheer info:");
                r45.on1 on1Var2 = (r45.on1) resp.getCustom(29);
                sb7.append((on1Var2 == null || (list4 = on1Var2.getList(0)) == null) ? null : java.lang.Integer.valueOf(list4.size()));
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
                r45.on1 on1Var3 = (r45.on1) resp.getCustom(29);
                if (on1Var3 != null && (list3 = on1Var3.getList(0)) != null) {
                    linkedList.addAll(list3);
                    r45.on1 on1Var4 = (r45.on1) resp.getCustom(29);
                    int integer = on1Var4 != null ? on1Var4.getInteger(2) : 0;
                    this.f20257g.f329472e = 0;
                    i17 = integer;
                }
                r45.on1 on1Var5 = (r45.on1) resp.getCustom(29);
                if (on1Var5 != null) {
                    this.f20258h = new mm2.w0(on1Var5.getString(4), on1Var5.getInteger(5));
                }
            }
            r45.on1 on1Var6 = (r45.on1) resp.getCustom(29);
            Y6(linkedList, on1Var6 != null ? on1Var6.getString(1) : null, i17);
            r45.nw1 nw1Var = (r45.nw1) resp.getCustom(3);
            this.f20259i = nw1Var != null ? nw1Var.getLong(19) : 0L;
            com.tencent.mars.xlog.Log.i(str, "processJoinLiveResp curLikeCount:" + this.f20259i);
        }
    }
}
