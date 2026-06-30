package ju1;

/* loaded from: classes9.dex */
public final class o1 extends ju1.k {

    /* renamed from: n, reason: collision with root package name */
    public int f383318n;

    /* renamed from: o, reason: collision with root package name */
    public r45.li3 f383319o;

    /* renamed from: i, reason: collision with root package name */
    public final int f383316i = 10;

    /* renamed from: m, reason: collision with root package name */
    public final int f383317m = 5;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f383320p = new java.util.ArrayList();

    public o1() {
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
        int i17 = this.f383318n;
        java.util.ArrayList arrayList = this.f383320p;
        if (i17 <= 0) {
            i17 = arrayList.size() > 0 ? arrayList.size() + 0 : 0;
        }
        int i18 = this.f383316i;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = i17 + this.f383317m;
        arrayList.clear();
        cu1.d dVar = new cu1.d(0L, i19);
        dVar.f152182i = true;
        pq5.g l17 = dVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.l1(this)).f(keeper);
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
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_MEMBER_CARD_HISTORY_STRING_SYNC
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
            r45.li3 r3 = new r45.li3
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
            java.util.LinkedList r2 = r3.f461036i
            r0.mo7808x76db6cb1(r2)
            java.util.LinkedList r0 = r3.f461037m
            java.lang.String r2 = "items"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)
            java.util.ArrayList r0 = r5.S6(r0, r1)
            if (r0 == 0) goto L5c
            int r1 = r0.size()
        L5c:
            r5.f383318n = r1
            androidx.lifecycle.j0 r1 = r5.f383284f
            r1.mo7808x76db6cb1(r0)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.o1.O6():void");
    }

    @Override // ju1.k
    public void P6(ju1.a cardDataModel) {
        ju1.o0 o0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardDataModel, "cardDataModel");
        r45.tt ttVar = cardDataModel.f383223c;
        if (ttVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemberHistoryCardListViewModel", "do delete card: %s", ttVar.f468298d);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f383285g;
            ju1.o0 o0Var2 = (ju1.o0) j0Var.mo3195x754a37bb();
            if (o0Var2 == ju1.o0.f383309f || o0Var2 == (o0Var = ju1.o0.f383310g)) {
                return;
            }
            this.f383286h.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            j0Var.mo7808x76db6cb1(o0Var);
            java.lang.String user_card_id = ttVar.f468298d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            new au1.i(user_card_id).l().h(new ju1.m1(this, o0Var2, cardDataModel));
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
        int i17 = this.f383318n;
        long j17 = 0;
        int i18 = this.f383316i;
        if (i17 > 0) {
            if (i17 >= i18) {
                i18 = i17;
            }
            i18 += i17;
        } else {
            r45.li3 li3Var = this.f383319o;
            if (li3Var != null) {
                j17 = li3Var.f461034g;
            }
        }
        cu1.d dVar = new cu1.d(j17, i18);
        dVar.f152182i = true;
        pq5.g l17 = dVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.n1(this)).f(keeper);
    }

    @Override // ju1.k
    public void R6() {
        r45.li3 li3Var = this.f383319o;
        if (li3Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList arrayList = this.f383320p;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = ((ju1.a) it.next()).f383223c;
                    if (ttVar != null) {
                        linkedList.add(ttVar);
                    }
                }
            }
            li3Var.f461037m = linkedList;
            pm0.v.K(null, new au1.f(li3Var));
        }
    }

    public final java.util.ArrayList S6(java.util.List list, boolean z17) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = !z17 ? new java.util.ArrayList() : this.f383320p;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.tt ttVar = (r45.tt) it.next();
            ju1.a aVar = new ju1.a();
            aVar.f383223c = ttVar;
            aVar.f383221a = 4;
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
