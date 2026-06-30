package db2;

/* loaded from: classes2.dex */
public final class a3 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final r45.mx2 f309420t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f309421u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f309422v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(db2.n3 n3Var, r45.mx2 mx2Var, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(n3Var.f309615g, null, 2, null);
        this.f309422v = n3Var;
        this.f309420t = mx2Var;
        this.f309421u = new org.json.JSONObject();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u61 u61Var = new r45.u61();
        n3Var.B.getClass();
        u61Var.set(1, xy2.c.f(this.f97668n));
        u61Var.set(4, java.lang.Integer.valueOf(n3Var.f309612d));
        u61Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f309704a;
        u61Var.set(5, t4Var.n());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[request#historyCgi] isPreload=");
        sb6.append(n3Var.f309617i);
        sb6.append(" tabType=");
        sb6.append(n3Var.f309612d);
        sb6.append(" pullType=");
        sb6.append(n3Var.f309613e);
        sb6.append(" lastBuffer=");
        sb6.append(gVar == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar.f273689a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", sb6.toString());
        u61Var.set(3, t4Var.b(3814, this.f97668n));
        lVar.f152197a = u61Var;
        r45.v61 v61Var = new r45.v61();
        v61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = v61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergethistory";
        lVar.f152200d = 3814;
        p(lVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r29v0, types: [az2.o, az2.j, db2.a3] */
    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        db2.c3 c3Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.util.LinkedList m75941xfb8219142;
        r45.sq2 sq2Var;
        java.util.LinkedList m75941xfb8219143;
        int i19;
        int i27;
        long j17;
        java.util.Iterator it;
        r45.v61 resp = (r45.v61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.h(this.f309422v.f309612d, false);
        this.f309421u.put("size", resp.m75941xfb821914(1).size());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList m75941xfb8219144 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getObject(...)");
        db2.n3 n3Var = this.f309422v;
        java.util.Iterator it6 = m75941xfb8219144.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
            if (hc2.o0.D(c19792x256d27252, z17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.m1.f216642d.a();
                r45.qt2 qt2Var = this.f97668n;
                ?? m75939xb282bd08 = qt2Var != null ? qt2Var.m75939xb282bd08(5) : z17;
                int i28 = n3Var.f309612d;
                boolean z18 = n3Var.f309617i;
                it = it6;
                java.lang.String m75945x2fec8307 = n3Var.B.m75945x2fec8307(7);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                a17.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1(c19792x256d27252, m75939xb282bd08, i28, z18, m75945x2fec8307, 1, currentTimeMillis, 0L, 0L, 0L, ce1.h.f4368x366c91de, null));
            } else {
                it = it6;
            }
            it6 = it;
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        v1Var.n(this.f309422v.f309612d, false);
        db2.d3 d3Var = this.f309422v.f309625t;
        r45.rq2 rq2Var = null;
        if (d3Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("config");
            throw null;
        }
        boolean mo11122x83d23815 = d3Var.mo11122x83d23815(i17, i18, resp);
        if (mo11122x83d23815) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedCgi", "[onCgiBack#historyCgi] return! isPreload=" + this.f309422v.f309617i + " tabType=" + this.f309422v.f309612d + " pullType=" + this.f309422v.f309613e + " errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " isConsume=" + mo11122x83d23815);
            db2.e3 e3Var = this.f309422v.f309626u;
            if (e3Var != null) {
                ((db2.k3) e3Var).a(i17, i18, str, resp);
                return;
            }
            return;
        }
        db2.n3 n3Var2 = this.f309422v;
        r45.mx2 mx2Var = this.f309420t;
        if (mx2Var != null) {
            c3Var = n3Var2.f(mx2Var);
        } else {
            n3Var2.getClass();
            c3Var = new db2.c3();
        }
        db2.b3 b3Var = n3Var2.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(b3Var, "<set-?>");
        c3Var.f309454i = b3Var;
        c3Var.m75941xfb821914(1).addAll(resp.m75941xfb821914(1));
        c3Var.f309449d = resp.m75939xb282bd08(3);
        c3Var.set(2, resp.m75934xbce7f2f(2));
        r45.sq2 sq2Var2 = (r45.sq2) c3Var.m75936x14adae67(9);
        if (sq2Var2 == null) {
            sq2Var2 = new r45.sq2();
        }
        c3Var.set(9, sq2Var2);
        r45.sq2 sq2Var3 = (r45.sq2) c3Var.m75936x14adae67(9);
        if (sq2Var3 != null) {
            r45.sq2 sq2Var4 = (r45.sq2) resp.m75936x14adae67(4);
            if (sq2Var4 != null) {
                i27 = 0;
                j17 = sq2Var4.m75942xfb822ef2(0);
            } else {
                i27 = 0;
                j17 = 0;
            }
            sq2Var3.set(i27, java.lang.Long.valueOf(j17));
        }
        r45.sq2 sq2Var5 = (r45.sq2) c3Var.m75936x14adae67(9);
        if (sq2Var5 != null) {
            r45.sq2 sq2Var6 = (r45.sq2) resp.m75936x14adae67(4);
            if (sq2Var6 != null) {
                i19 = 1;
                rq2Var = (r45.rq2) sq2Var6.m75936x14adae67(1);
            } else {
                i19 = 1;
            }
            sq2Var5.set(i19, rq2Var);
        }
        r45.sq2 sq2Var7 = (r45.sq2) resp.m75936x14adae67(4);
        if (sq2Var7 != null && (m75941xfb8219142 = sq2Var7.m75941xfb821914(2)) != null && (sq2Var = (r45.sq2) c3Var.m75936x14adae67(9)) != null && (m75941xfb8219143 = sq2Var.m75941xfb821914(2)) != null) {
            m75941xfb8219143.addAll(m75941xfb8219142);
        }
        if (!this.f309422v.B.f309441d) {
            r45.mx2 mx2Var2 = this.f309420t;
            c3Var.f309451f = (mx2Var2 == null || (m75941xfb821914 = mx2Var2.m75941xfb821914(1)) == null || (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) kz5.n0.k0(m75941xfb821914)) == null) ? -1L : c19792x256d2725.m76784x5db1b11();
        }
        int size = resp.m75941xfb821914(1).size();
        c3Var.f309452g = size;
        v1Var.a(this.f309422v.f309612d, size);
        c3Var.f309453h = true;
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 153L, 1L, false);
            so2.h3.f491925d.k(this.f309422v.B.m75941xfb821914(9));
        } else if (i17 == 4) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 154L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 155L, 1L, false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedCgi", "[onCgiBack#historyCgi] errCode=" + i18 + " errMsg=" + str + " isConsume=" + mo11122x83d23815 + ", isPreload=" + this.f309422v.f309617i + " tabType=" + this.f309422v.f309612d + " pullType=" + this.f309422v.f309613e + ", historySize=" + c3Var.f309452g + " continue_flag=" + resp.m75939xb282bd08(3) + ' ' + hc2.o0.k(resp.m75941xfb821914(1)));
        bu2.j jVar = bu2.j.f106067a;
        int i29 = this.f309422v.f309612d;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb8219145 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219145, "getObject(...)");
        java.util.HashMap hashMap = bu2.j.f106070d;
        synchronized (hashMap) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i29);
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new android.util.LongSparseArray();
                hashMap.put(valueOf, obj);
            }
            android.util.LongSparseArray longSparseArray = (android.util.LongSparseArray) obj;
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 : m75941xfb8219145) {
                longSparseArray.append(c19792x256d27253.m76784x5db1b11(), java.lang.Long.valueOf(c19792x256d27253.m76784x5db1b11()));
            }
        }
        this.f309422v.g(i17, i18, str, c3Var);
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.v61 resp = (r45.v61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f309422v.B.m75936x14adae67(4);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306537f;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        db2.n3 n3Var = this.f309422v;
        jSONObject.put("tabType", n3Var.f309612d);
        jSONObject.put("pullType", n3Var.f309613e);
        return jSONObject;
    }

    @Override // az2.j
    public boolean y() {
        return true;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f309421u;
    }
}
