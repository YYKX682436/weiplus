package n92;

/* loaded from: classes8.dex */
public final class a extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f417438t;

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f417439u;

    /* renamed from: v, reason: collision with root package name */
    public final org.json.JSONObject f417440v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m92.a args) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.String str = "Cgi.CreateFinderAccount@" + hashCode();
        this.f417438t = str;
        this.f417439u = new org.json.JSONObject();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f417440v = jSONObject;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.q01 q01Var = new r45.q01();
        q01Var.set(4, db2.t4.f309704a.a(3922));
        q01Var.set(1, args.f406501b);
        q01Var.set(5, args.f406502c);
        q01Var.set(3, args.f406503d);
        q01Var.set(6, args.f406504e);
        q01Var.set(8, java.lang.Integer.valueOf(args.f406506g));
        q01Var.set(7, java.lang.Integer.valueOf(args.f406507h));
        q01Var.set(9, args.f406505f);
        q01Var.set(10, java.lang.Integer.valueOf(args.f406508i));
        q01Var.set(12, java.lang.Integer.valueOf(args.f406509j));
        q01Var.set(13, args.f406500a);
        q01Var.set(11, args.f406510k);
        lVar.f152197a = q01Var;
        r45.r01 r01Var = new r45.r01();
        r01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) r01Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = r01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreateuser";
        lVar.f152200d = 3922;
        p(lVar.a());
        jSONObject.put("nickname", args.f406501b);
        jSONObject.put("signature", q01Var.m75939xb282bd08(10));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[CgiCreateFinderAccount] created...");
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        org.json.JSONObject jSONObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        m92.b j37;
        r45.r01 resp = (r45.r01) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.String str2 = this.f417438t;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = g92.b.f351302e.h6().f406519i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            if (next instanceof l92.a) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next2 = it6.next();
            if (((l92.a) next2).b() == this.f152179f.f152246d) {
                arrayList2.add(next2);
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it7.hasNext();
            jSONObject = this.f417439u;
            if (!hasNext) {
                break;
            } else {
                ((l92.a) it7.next()).a(i17, i18, str, resp, jSONObject);
            }
        }
        if (i17 == 0 && i18 == 0 && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) resp.m75936x14adae67(1)) != null) {
            ya2.h.f542017a.j(c19782x23db1cfa);
            g92.b bVar = g92.b.f351302e;
            m92.c a17 = m92.d.a(c19782x23db1cfa);
            m92.j jVar = m92.j.f406524f;
            bVar.C(a17, jVar);
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            if (m76197x6c03c64c == null) {
                m76197x6c03c64c = "";
            }
            if ((m76197x6c03c64c.length() > 0) && !bVar.j4() && (j37 = g92.a.j3(bVar, m76197x6c03c64c, false, 2, null)) != null && !j37.v0()) {
                bVar.A1(m76197x6c03c64c);
                m92.f fVar2 = new m92.f();
                fVar2.set(0, m76197x6c03c64c);
                bVar.S1(fVar2, jVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[successful] set default and master, username:".concat(m76197x6c03c64c));
            }
            i95.m c17 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String source = str2 + ", successful";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            bVar.u2(source).l();
            bVar.M0(15).l();
        }
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            ((l92.a) it8.next()).c(i17, i18, str, resp, jSONObject);
        }
    }

    @Override // az2.j, com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f417438t, "[run]...");
        return super.l();
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f417440v;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f417439u;
    }
}
