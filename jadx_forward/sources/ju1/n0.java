package ju1;

/* loaded from: classes9.dex */
public final class n0 extends ju1.k {

    /* renamed from: n, reason: collision with root package name */
    public int f383303n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qd3 f383304o;

    /* renamed from: i, reason: collision with root package name */
    public final int f383301i = 10;

    /* renamed from: m, reason: collision with root package name */
    public final int f383302m = 5;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f383305p = new java.util.ArrayList();

    public n0() {
        this.f383285g.mo7808x76db6cb1(ju1.o0.f383308e);
    }

    @Override // ju1.k
    public void N6(im5.b keeper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper, "keeper");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f383285g;
        ju1.o0 o0Var = (ju1.o0) j0Var.mo3195x754a37bb();
        ju1.o0 o0Var2 = ju1.o0.f383309f;
        if (o0Var == o0Var2 || o0Var == ju1.o0.f383310g) {
            return;
        }
        j0Var.mo7808x76db6cb1(o0Var2);
        int i17 = this.f383303n;
        java.util.ArrayList arrayList = this.f383305p;
        if (i17 <= 0) {
            i17 = arrayList.size() > 0 ? arrayList.size() + 0 : 0;
        }
        int i18 = this.f383301i;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = i17 + this.f383302m;
        arrayList.clear();
        cu1.b bVar = new cu1.b(0L, i19, 1);
        bVar.f152182i = true;
        pq5.g l17 = bVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.k0(this)).f(keeper);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // ju1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6() {
        /*
            r5 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_COUPON_HISTORY_LIST_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.m(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L1e
            int r3 = r0.length()
            if (r3 != 0) goto L1c
            goto L1e
        L1c:
            r3 = r1
            goto L1f
        L1e:
            r3 = 1
        L1f:
            if (r3 == 0) goto L22
            goto L41
        L22:
            r45.qd3 r3 = new r45.qd3
            r3.<init>()
            java.nio.charset.Charset r4 = r26.c.f450400c
            byte[] r0 = r0.getBytes(r4)
            java.lang.String r4 = "getBytes(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r4)
            r3.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L36
            goto L42
        L36:
            r0 = move-exception
            java.lang.String r3 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r2, r0)
        L41:
            r3 = 0
        L42:
            if (r3 == 0) goto L63
            androidx.lifecycle.j0 r0 = r5.f383282d
            java.util.LinkedList r2 = r3.f465388i
            r0.mo7808x76db6cb1(r2)
            r45.k90 r0 = r3.f465389m
            java.lang.String r2 = "items_list"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            java.util.ArrayList r0 = r5.S6(r0, r1)
            if (r0 == 0) goto L5c
            int r1 = r0.size()
        L5c:
            r5.f383303n = r1
            androidx.lifecycle.j0 r1 = r5.f383284f
            r1.mo7808x76db6cb1(r0)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.n0.O6():void");
    }

    @Override // ju1.k
    public void P6(ju1.a cardDataModel) {
        ju1.o0 o0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardDataModel, "cardDataModel");
        r45.tt ttVar = cardDataModel.f383223c;
        if (ttVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card: %s", ttVar.f468298d);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f383285g;
            ju1.o0 o0Var2 = (ju1.o0) j0Var.mo3195x754a37bb();
            if (o0Var2 == ju1.o0.f383309f || o0Var2 == (o0Var = ju1.o0.f383310g)) {
                return;
            }
            this.f383286h.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            j0Var.mo7808x76db6cb1(o0Var);
            java.lang.String user_card_id = ttVar.f468298d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            new cu1.e(user_card_id).l().h(new ju1.l0(this, o0Var2, cardDataModel));
        }
    }

    @Override // ju1.k
    public void Q6(im5.b keeper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper, "keeper");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f383285g;
        ju1.o0 o0Var = (ju1.o0) j0Var.mo3195x754a37bb();
        ju1.o0 o0Var2 = ju1.o0.f383309f;
        if (o0Var == o0Var2 || o0Var == ju1.o0.f383310g || o0Var == ju1.o0.f383312i) {
            return;
        }
        j0Var.mo7808x76db6cb1(o0Var2);
        int i17 = this.f383303n;
        long j17 = 0;
        int i18 = this.f383301i;
        if (i17 > 0) {
            if (i17 >= i18) {
                i18 = i17;
            }
            i18 += i17;
        } else {
            r45.qd3 qd3Var = this.f383304o;
            if (qd3Var != null) {
                j17 = qd3Var.f465386g;
            }
        }
        cu1.b bVar = new cu1.b(j17, i18, 1);
        bVar.f152182i = true;
        pq5.g l17 = bVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.m0(this)).f(keeper);
    }

    @Override // ju1.k
    public void R6() {
        r45.qd3 qd3Var = this.f383304o;
        if (qd3Var != null) {
            r45.k90 k90Var = new r45.k90();
            java.util.ArrayList arrayList = this.f383305p;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = ((ju1.a) it.next()).f383223c;
                    if (ttVar != null) {
                        k90Var.f460043e.add(ttVar);
                    }
                }
            }
            qd3Var.f465389m = k90Var;
            pm0.v.K(null, new au1.c(qd3Var));
        }
    }

    public final java.util.ArrayList S6(r45.k90 k90Var, boolean z17) {
        if (k90Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = !z17 ? new java.util.ArrayList() : this.f383305p;
        java.util.Iterator it = k90Var.f460043e.iterator();
        while (it.hasNext()) {
            r45.tt ttVar = (r45.tt) it.next();
            ju1.a aVar = new ju1.a();
            aVar.f383223c = ttVar;
            if (ttVar.f468305n == 1) {
                aVar.f383221a = 5;
            } else {
                aVar.f383221a = 3;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
