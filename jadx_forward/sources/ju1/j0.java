package ju1;

/* loaded from: classes9.dex */
public final class j0 extends ju1.k {

    /* renamed from: n, reason: collision with root package name */
    public int f383277n;

    /* renamed from: o, reason: collision with root package name */
    public r45.sd3 f383278o;

    /* renamed from: i, reason: collision with root package name */
    public final int f383275i = 10;

    /* renamed from: m, reason: collision with root package name */
    public final int f383276m = 5;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f383279p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f383280q = new java.util.ArrayList();

    public j0() {
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
        int i17 = this.f383277n;
        java.util.ArrayList arrayList = this.f383280q;
        java.util.ArrayList arrayList2 = this.f383279p;
        if (i17 <= 0) {
            i17 = arrayList2.size() > 0 ? arrayList2.size() + 0 : 0;
            if (arrayList.size() > 0) {
                i17 += arrayList.size();
            }
        }
        int i18 = this.f383275i;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = i17 + this.f383276m;
        arrayList2.clear();
        arrayList.clear();
        cu1.c cVar = new cu1.c(0L, i19, 1);
        cVar.f152182i = true;
        pq5.g l17 = cVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.g0(this)).f(keeper);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
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
            com.tencent.mm.storage.u3 r1 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_COUPON_GIFT_LIST_STRING_SYNC
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
            r45.sd3 r3 = new r45.sd3
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
            if (r3 != 0) goto L45
            return
        L45:
            androidx.lifecycle.j0 r0 = r5.f383282d
            java.util.LinkedList r2 = r3.f467173i
            r0.mo7808x76db6cb1(r2)
            java.util.ArrayList r0 = r5.S6(r3, r1)
            if (r0 == 0) goto L56
            int r1 = r0.size()
        L56:
            r5.f383277n = r1
            androidx.lifecycle.j0 r1 = r5.f383284f
            r1.mo7808x76db6cb1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.j0.O6():void");
    }

    @Override // ju1.k
    public void P6(ju1.a cardDataModel) {
        ju1.o0 o0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardDataModel, "cardDataModel");
        r45.tt ttVar = cardDataModel.f383223c;
        if (ttVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card: %s", ttVar.f468298d);
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f383285g;
            ju1.o0 o0Var2 = (ju1.o0) j0Var.mo3195x754a37bb();
            if (o0Var2 == ju1.o0.f383309f || o0Var2 == (o0Var = ju1.o0.f383310g)) {
                return;
            }
            this.f383286h.mo7808x76db6cb1(java.lang.Boolean.TRUE);
            j0Var.mo7808x76db6cb1(o0Var);
            java.lang.String user_card_id = ttVar.f468298d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(user_card_id, "user_card_id");
            new cu1.a(user_card_id).l().h(new ju1.h0(this, o0Var2, cardDataModel));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 3, 4);
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
        int i17 = this.f383277n;
        long j17 = 0;
        int i18 = this.f383275i;
        if (i17 > 0) {
            if (i17 >= i18) {
                i18 = i17;
            }
            i18 += i17;
        } else {
            r45.sd3 sd3Var = this.f383278o;
            if (sd3Var != null) {
                j17 = sd3Var.f467171g;
            }
        }
        cu1.c cVar = new cu1.c(j17, i18, 1);
        cVar.f152182i = true;
        pq5.g l17 = cVar.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.i0(this)).f(keeper);
    }

    @Override // ju1.k
    public void R6() {
        r45.sd3 sd3Var = this.f383278o;
        if (sd3Var != null) {
            r45.k90 k90Var = new r45.k90();
            java.util.ArrayList arrayList = this.f383279p;
            if (!arrayList.isEmpty()) {
                java.lang.Object remove = arrayList.remove(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                java.lang.String str = ((ju1.a) remove).f383222b;
                if (str == null) {
                    str = "";
                }
                k90Var.f460042d = str;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = ((ju1.a) it.next()).f383223c;
                    if (ttVar != null) {
                        k90Var.f460043e.add(ttVar);
                    }
                }
            }
            sd3Var.f467174m = k90Var;
            r45.k90 k90Var2 = new r45.k90();
            java.util.ArrayList arrayList2 = this.f383280q;
            if (!arrayList2.isEmpty()) {
                java.lang.Object remove2 = arrayList2.remove(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove2, "removeAt(...)");
                java.lang.String str2 = ((ju1.a) remove2).f383222b;
                k90Var2.f460042d = str2 != null ? str2 : "";
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    r45.tt ttVar2 = ((ju1.a) it6.next()).f383223c;
                    if (ttVar2 != null) {
                        k90Var2.f460043e.add(ttVar2);
                    }
                }
            }
            sd3Var.f467175n = k90Var2;
            pm0.v.K(null, new au1.a(sd3Var));
        }
    }

    public final java.util.ArrayList S6(r45.sd3 sd3Var, boolean z17) {
        if (sd3Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = !z17 ? new java.util.ArrayList() : this.f383279p;
        java.util.ArrayList arrayList3 = !z17 ? new java.util.ArrayList() : this.f383280q;
        r45.k90 k90Var = sd3Var.f467174m;
        if (k90Var != null) {
            java.util.LinkedList items = k90Var.f460043e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items, "items");
            if (!items.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    ju1.a aVar = new ju1.a();
                    aVar.f383221a = 0;
                    aVar.f383222b = k90Var.f460042d;
                    arrayList2.add(aVar);
                }
                java.util.Iterator it = items.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = (r45.tt) it.next();
                    ju1.a aVar2 = new ju1.a();
                    aVar2.f383223c = ttVar;
                    aVar2.f383221a = 2;
                    arrayList2.add(aVar2);
                }
            }
        }
        arrayList.addAll(arrayList2);
        r45.k90 k90Var2 = sd3Var.f467175n;
        if (k90Var2 != null) {
            java.util.LinkedList items2 = k90Var2.f460043e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items2, "items");
            if (!items2.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    ju1.a aVar3 = new ju1.a();
                    aVar3.f383221a = 0;
                    aVar3.f383222b = k90Var2.f460042d;
                    arrayList3.add(aVar3);
                }
                java.util.Iterator it6 = items2.iterator();
                while (it6.hasNext()) {
                    r45.tt ttVar2 = (r45.tt) it6.next();
                    ju1.a aVar4 = new ju1.a();
                    aVar4.f383223c = ttVar2;
                    aVar4.f383221a = 1;
                    arrayList3.add(aVar4);
                }
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
