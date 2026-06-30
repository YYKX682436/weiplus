package ke2;

/* loaded from: classes3.dex */
public final class g extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f388479x = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f388480t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.f f388481u;

    /* renamed from: v, reason: collision with root package name */
    public final long f388482v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.il4 f388483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, long j18, long j19, java.lang.String finderUserName, int i17, r45.il4 il4Var, r45.o63 o63Var, r45.a94 a94Var, r45.v94 v94Var, long j27, ke2.f fVar, r45.rw2 rw2Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, null, 3, null);
        java.lang.String str;
        int i19;
        r45.il4 il4Var2;
        r45.j73 j73Var;
        r45.j73 j73Var2;
        byte[] bArr;
        int i27 = (i18 & 16) != 0 ? 0 : i17;
        r45.il4 il4Var3 = (i18 & 32) != 0 ? null : il4Var;
        r45.o63 o63Var2 = (i18 & 64) != 0 ? null : o63Var;
        r45.a94 a94Var2 = (i18 & 128) != 0 ? null : a94Var;
        r45.v94 v94Var2 = (i18 & 256) != 0 ? null : v94Var;
        long j28 = (i18 & 512) != 0 ? -1L : j27;
        r45.rw2 rw2Var2 = (i18 & 2048) != 0 ? null : rw2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        this.f388480t = "Finder.CgiFinderLiveAnchorStatus";
        this.f388481u = fVar;
        r45.bv2 bv2Var = new r45.bv2();
        this.f388482v = j19;
        this.f388483w = il4Var3;
        bv2Var.set(2, java.lang.Long.valueOf(j17));
        bv2Var.set(4, java.lang.Long.valueOf(j18));
        bv2Var.set(5, finderUserName);
        bv2Var.set(1, db2.t4.f309704a.a(6443));
        bv2Var.set(6, java.lang.Integer.valueOf(i27));
        bv2Var.set(10, rw2Var2);
        r45.t74 t74Var = new r45.t74();
        t74Var.f467729e = j19;
        t74Var.f467728d = c01.id.c();
        if (il4Var3 != null) {
            t74Var.f467731g = il4Var3;
            str = "Finder.CgiFinderLiveAnchorStatus";
            bv2Var.set(9, java.lang.Long.valueOf(bv2Var.m75942xfb822ef2(9) | 2));
        } else {
            str = "Finder.CgiFinderLiveAnchorStatus";
        }
        if (o63Var2 != null) {
            t74Var.f467730f = o63Var2;
            i19 = 9;
            bv2Var.set(9, java.lang.Long.valueOf(1 | bv2Var.m75942xfb822ef2(9)));
        } else {
            i19 = 9;
        }
        if (a94Var2 != null) {
            t74Var.f467732h = a94Var2;
            il4Var2 = il4Var3;
            bv2Var.set(i19, java.lang.Long.valueOf(4 | bv2Var.m75942xfb822ef2(i19)));
        } else {
            il4Var2 = il4Var3;
        }
        if (v94Var2 != null) {
            t74Var.f467734m = v94Var2;
            bv2Var.set(i19, java.lang.Long.valueOf(bv2Var.m75942xfb822ef2(i19) | 8));
        }
        bv2Var.set(3, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(t74Var.mo14344x5f01b1f6()));
        bv2Var.set(8, java.lang.Long.valueOf(j28));
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f314905a.i(mm2.g1.class);
        if (g1Var != null && (bArr = g1Var.f410614v) != null) {
            bv2Var.set(11, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length));
        }
        java.lang.String str2 = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "opFlag:".concat(pm0.v.u(j28)));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = bv2Var;
        r45.cv2 cv2Var = new r45.cv2();
        cv2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) cv2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = cv2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersetanchorstatus";
        lVar.f152200d = 6443;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(bv2Var.m75942xfb822ef2(2));
        sb6.append(',');
        sb6.append(bv2Var.m75945x2fec8307(5));
        sb6.append(',');
        sb6.append(j19);
        sb6.append(',');
        sb6.append(il4Var2 != null ? java.lang.Long.valueOf(il4Var2.f458662d) : null);
        sb6.append(",LiveLotterySetting:[");
        sb6.append(a94Var2 != null ? java.lang.Integer.valueOf(a94Var2.f451391e) : null);
        sb6.append(',');
        sb6.append(a94Var2 != null ? java.lang.Long.valueOf(a94Var2.f451390d) : null);
        sb6.append("],GameTeamSetting:[");
        sb6.append((o63Var2 == null || (j73Var2 = o63Var2.f463514e) == null) ? null : java.lang.Integer.valueOf(j73Var2.m75939xb282bd08(1)));
        sb6.append(',');
        sb6.append((o63Var2 == null || (j73Var = o63Var2.f463514e) == null) ? null : java.lang.Integer.valueOf(j73Var.m75939xb282bd08(0)));
        sb6.append(',');
        sb6.append(o63Var2 != null ? java.lang.Integer.valueOf(o63Var2.f463513d) : null);
        sb6.append("]，ReplaySetting:[");
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.m75933x41a8a7f2(0)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.m75933x41a8a7f2(1)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.m75933x41a8a7f2(2)) : null);
        sb6.append(',');
        sb6.append(v94Var2 != null ? java.lang.Boolean.valueOf(v94Var2.m75933x41a8a7f2(3)) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.cv2 resp = (r45.cv2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f388480t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.f fVar2 = this.f388481u;
        if (i17 != 0 || i18 != 0) {
            if (fVar2 != null) {
                fVar2.a(i17, i18, str, this.f388482v, resp);
            }
        } else if (fVar2 != null) {
            long j17 = this.f388482v;
            r45.il4 il4Var = this.f388483w;
            fVar2.b(j17, il4Var != null ? il4Var.f458662d : 0L, resp);
        }
    }
}
