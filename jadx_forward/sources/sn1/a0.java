package sn1;

/* loaded from: classes12.dex */
public class a0 extends sn1.i {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public final wn1.v f491505u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.w f491506v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f491507w;

    /* renamed from: x, reason: collision with root package name */
    public int f491508x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 f491509y;

    /* renamed from: z, reason: collision with root package name */
    public final sn1.d0 f491510z;

    public a0(final sn1.e0 e0Var, java.lang.String str, sn1.d0 d0Var, byte[] bArr, byte[] bArr2, int i17, sn1.b0 b0Var) {
        wn1.v vVar = new wn1.v();
        this.f491505u = vVar;
        this.f491506v = new wn1.w();
        this.f491508x = 0;
        this.f491509y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        this.f491510z = null;
        vVar.f529024d = str;
        vVar.f529025e = 2;
        this.f491507w = new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: sn1.a0$$a
            @Override // com.p314xaae8f345.mm.p944x882e457a.u0
            /* renamed from: onSceneEnd */
            public final void mo815x76e0bfae(int i18, int i19, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                sn1.a0 a0Var = sn1.a0.this;
                a0Var.getClass();
                sn1.a0 a0Var2 = (sn1.a0) m1Var;
                java.util.HashSet hashSet = a0Var2.f491510z.f491536a;
                boolean contains = hashSet.contains(a0Var2);
                wn1.v vVar2 = a0Var2.f491505u;
                if (!contains && vVar2.f529025e == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupDataPushScene.BackFileOp", "checkSceneAllFinish Error!! media scene not in sceneHashSet");
                }
                hashSet.remove(a0Var2);
                boolean isEmpty = hashSet.isEmpty();
                java.lang.String str3 = vVar2.f529024d;
                byte[] bArr3 = a0Var2.f491509y.f38861x6ac9171;
                ((ln1.d0) e0Var).a(isEmpty, str3, bArr3 == null ? 0 : bArr3.length, a0Var.f491508x);
            }
        };
        this.f491510z = d0Var;
        d0Var.f491536a.add(this);
        if (bArr2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupDataPushScene", "BackupDataPushScene media backFileOp buff is null");
            vVar.f529030m = null;
            return;
        }
        int i18 = d0Var.f491538c;
        vVar.f529026f = i18;
        vVar.f529027g = i17;
        int length = i17 + bArr2.length;
        vVar.f529028h = length;
        vVar.f529030m = b0(bArr2, length == i18, bArr);
        c0();
    }

    @Override // sn1.i
    public boolean K() {
        wn1.v vVar = this.f491505u;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupDataPushScene", "BackupDataPushScene type:%d, msgid:%s, size:%d, scope:[%d,%d]", java.lang.Integer.valueOf(vVar.f529025e), vVar.f529024d, java.lang.Integer.valueOf(vVar.f529026f), java.lang.Integer.valueOf(vVar.f529027g), java.lang.Integer.valueOf(vVar.f529028h));
        byte[] bArr = this.f491509y.f38861x6ac9171;
        int i17 = this.f491508x;
        sn1.e eVar = sn1.i.f491549m;
        boolean z17 = eVar != null && ((ln1.g) eVar).d(i17, bArr, 6) == 0;
        if (!z17) {
            this.f491507w.mo815x76e0bfae(1, -2, "doScene failed", this);
        }
        return z17;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f M() {
        return this.f491505u;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f N() {
        return this.f491506v;
    }

    @Override // sn1.i
    public void P(int i17) {
        this.f491507w.mo815x76e0bfae(0, this.f491506v.f529036h, "", this);
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g b0(byte[] bArr, boolean z17, byte[] bArr2) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((bArr2 == null ? -1 : bArr2.length) > 0) {
            if ((bArr != null ? bArr.length : -1) > 0) {
                return new com.p314xaae8f345.mm.p2495xc50a8b8b.g(com.p314xaae8f345.mm.p803x79e81b34.C10776x74af9c55.m46312xf9aed125(bArr, bArr2, true, z17));
            }
        }
        return new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
    }

    public final void c0() {
        int i17 = sn1.i.f491555s;
        sn1.i.f491555s = i17 + 1;
        this.f491508x = i17;
        try {
            on1.f.a(this.f491505u.mo14344x5f01b1f6(), this.f491508x, (short) 6, this.f491509y, sn1.i.f491550n);
            int i18 = this.f491508x;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = this.f491509y;
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            this.f491558e = c19764x527bffc12;
            c19764x527bffc12.f38861x6ac9171 = c19764x527bffc1.f38861x6ac9171;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f491546g;
            synchronized (concurrentHashMap) {
                concurrentHashMap.put(java.lang.Integer.valueOf(i18), this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupDataPushScene", e17, "PacketBackupDataPush to buf fail:%s", e17.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6;
    }

    public a0(final sn1.e0 e0Var, java.lang.String str, java.util.LinkedList linkedList, byte[] bArr, sn1.b0 b0Var) {
        wn1.v vVar = new wn1.v();
        this.f491505u = vVar;
        this.f491506v = new wn1.w();
        this.f491508x = 0;
        this.f491509y = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        byte[] bArr2 = null;
        this.f491510z = null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        vVar.f529024d = str;
        vVar.f529025e = 1;
        this.f491507w = new com.p314xaae8f345.mm.p944x882e457a.u0() { // from class: sn1.a0$$b
            @Override // com.p314xaae8f345.mm.p944x882e457a.u0
            /* renamed from: onSceneEnd */
            public final void mo815x76e0bfae(int i17, int i18, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
                sn1.a0 a0Var = sn1.a0.this;
                a0Var.getClass();
                sn1.a0 a0Var2 = (sn1.a0) m1Var;
                java.lang.String str3 = a0Var2.f491505u.f529024d;
                byte[] bArr3 = a0Var2.f491509y.f38861x6ac9171;
                ((ln1.d0) e0Var).a(true, str3, bArr3 == null ? 0 : bArr3.length, a0Var.f491508x);
            }
        };
        try {
            r45.fd fdVar = new r45.fd();
            fdVar.f455752e = linkedList;
            fdVar.f455751d = linkedList.size();
            bArr2 = fdVar.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            objArr[1] = e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupDataPushScene", "BackupDataPushScene text, BakChatMsgList to buf error, list size[%d], errMsg:%s", objArr);
        }
        bArr2 = bArr2 == null ? new byte[0] : bArr2;
        wn1.v vVar2 = this.f491505u;
        vVar2.f529027g = 0;
        vVar2.f529028h = bArr2.length;
        vVar2.f529026f = bArr2.length;
        vVar2.f529030m = b0(bArr2, true, bArr);
        c0();
        int length = this.f491505u.f529030m.f273689a.length;
        java.lang.System.currentTimeMillis();
        linkedList.size();
    }
}
