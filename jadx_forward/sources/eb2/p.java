package eb2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f332371a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f332372b = jz5.h.b(eb2.o.f332370d);

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f332373c = jz5.h.b(eb2.a.f332241d);

    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(eb2.p r8, com.p314xaae8f345.mm.p944x882e457a.f r9, java.util.LinkedList r10, java.util.List r11, int r12, yz5.l r13) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eb2.p.a(eb2.p, com.tencent.mm.modelbase.f, java.util.LinkedList, java.util.List, int, yz5.l):void");
    }

    public final void b(java.lang.String req, yz5.l call, int i17, java.lang.String wxUsername, r45.gz0 gz0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f332371a;
        if (concurrentHashMap.containsKey(req)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ContactFetcher", "fetchContact[req] is loading. just return");
        } else {
            concurrentHashMap.put(req, this);
            d(kz5.b0.c(req), new eb2.b(this, req, call), i17, wxUsername, gz0Var);
        }
    }

    public final void c(r45.lz0 req, yz5.l call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        java.lang.String m75945x2fec8307 = req.m75945x2fec8307(0);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f332371a;
        if (concurrentHashMap.containsKey(m75945x2fec8307)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ContactFetcher", "fetchContact2[req] is loading. just return");
            return;
        }
        concurrentHashMap.put(m75945x2fec8307 == null ? "" : m75945x2fec8307, this);
        java.util.List c17 = kz5.b0.c(req);
        eb2.c cVar = new eb2.c(this, m75945x2fec8307, call);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        db2.f4 f4Var = new db2.f4();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k51 k51Var = new r45.k51();
        k51Var.set(1, db2.t4.f309704a.a(3953));
        k51Var.set(3, 1);
        k51Var.set(4, g92.b.f351302e.U());
        k51Var.m75941xfb821914(5).addAll(c17);
        lVar.f152197a = k51Var;
        r45.l51 l51Var = new r45.l51();
        l51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = l51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcontactlist";
        lVar.f152200d = 3953;
        f4Var.p(lVar.a());
        f4Var.l().H(new eb2.i(c17, linkedList, cVar, this));
    }

    public final void d(java.util.List reqList, yz5.l call, int i17, java.lang.String wxUsername, r45.gz0 gz0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqList, "reqList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i17 != 0) {
            if (i17 == 4) {
                db2.f4 f4Var = new db2.f4();
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                r45.k51 k51Var = new r45.k51();
                k51Var.set(1, db2.t4.f309704a.a(3953));
                k51Var.m75941xfb821914(2).addAll(reqList);
                k51Var.set(3, 4);
                k51Var.set(4, g92.b.f351302e.U());
                k51Var.set(12, "");
                k51Var.set(13, null);
                lVar.f152197a = k51Var;
                r45.l51 l51Var = new r45.l51();
                l51Var.set(0, new r45.ie());
                r45.ie ieVar = (r45.ie) l51Var.m75936x14adae67(0);
                if (ieVar != null) {
                    ieVar.f458493e = new r45.du5();
                }
                lVar.f152198b = l51Var;
                lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcontactlist";
                lVar.f152200d = 3953;
                f4Var.p(lVar.a());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] username=" + reqList);
                f4Var.l().H(new eb2.h(this, linkedList, reqList, call));
                return;
            }
            if (i17 != 8) {
                return;
            }
        }
        db2.f4 f4Var2 = new db2.f4();
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k51 k51Var2 = new r45.k51();
        k51Var2.set(1, db2.t4.f309704a.a(3953));
        k51Var2.m75941xfb821914(2).addAll(reqList);
        k51Var2.set(3, java.lang.Integer.valueOf(i17));
        k51Var2.set(4, g92.b.f351302e.U());
        k51Var2.set(12, wxUsername);
        k51Var2.set(13, gz0Var);
        lVar2.f152197a = k51Var2;
        r45.l51 l51Var2 = new r45.l51();
        l51Var2.set(0, new r45.ie());
        r45.ie ieVar2 = (r45.ie) l51Var2.m75936x14adae67(0);
        if (ieVar2 != null) {
            ieVar2.f458493e = new r45.du5();
        }
        lVar2.f152198b = l51Var2;
        lVar2.f152199c = "/cgi-bin/micromsg-bin/findergetcontactlist";
        lVar2.f152200d = 3953;
        f4Var2.p(lVar2.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] username=" + reqList);
        f4Var2.l().H(new eb2.g(this, linkedList, reqList, i17, call));
    }

    public final void e(yz5.l call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        java.lang.String k17 = c01.z1.k();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f332371a;
        if (concurrentHashMap.containsKey(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.ContactFetcher", "fetchAliasContact[req] is loading. just return");
            return;
        }
        concurrentHashMap.put(k17 == null ? "" : k17, this);
        eb2.m mVar = new eb2.m(this, k17, call);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        db2.f4 f4Var = new db2.f4();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k51 k51Var = new r45.k51();
        k51Var.set(1, db2.t4.f309704a.a(3953));
        k51Var.set(3, 5);
        k51Var.set(4, g92.b.f351302e.U());
        lVar.f152197a = k51Var;
        r45.l51 l51Var = new r45.l51();
        l51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l51Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = l51Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcontactlist";
        lVar.f152200d = 3953;
        f4Var.p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiGetFinderContact", "[CgiGetFinderContact] ");
        f4Var.l().H(new eb2.n(linkedList, mVar, this));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ma0 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ma0) ((jz5.n) this.f332373c).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0 g() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.na0) ((jz5.n) this.f332372b).mo141623x754a37bb();
    }
}
