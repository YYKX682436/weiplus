package kr4;

/* loaded from: classes11.dex */
public final class m extends l75.n0 implements l75.q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f393048e = {l75.n0.m145250x3fdc6f77(kr4.g.f393038l1, "W1wConversation")};

    /* renamed from: f, reason: collision with root package name */
    public static final kr4.l f393049f = new kr4.l();

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f393050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l75.k0 db6) {
        super(db6, kr4.g.f393038l1, "W1wConversation", dm.wb.E);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = kr4.g.f393038l1;
        this.f393050d = db6;
    }

    public final java.util.List D0(java.lang.String selfUserName, int i17, int i18, int i19) {
        p75.l0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (i19 == 1) {
            p75.n0 n0Var = dm.wb.f322435w;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            p75.m c17 = dm.wb.f322437y.j(selfUserName).c(dm.wb.D.q(1));
            linkedList3.add(dm.wb.B.u());
            linkedList3.add(dm.wb.A.u());
            p75.i0 g17 = dm.wb.f322435w.g(linkedList2);
            g17.f434190d = c17;
            g17.f434192f = linkedList3;
            g17.f434193g = linkedList4;
            g17.c(i18, i17);
            a17 = g17.a();
        } else if (i19 != 2) {
            p75.n0 n0Var2 = dm.wb.f322435w;
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            p75.m0 j17 = dm.wb.f322437y.j(selfUserName);
            p75.d dVar = dm.wb.f322436x;
            dVar.getClass();
            p75.m c18 = j17.c(new p75.w0(dVar.z(), "w1wsayhisessionholder@w1wmsg"));
            linkedList6.add(dm.wb.B.u());
            linkedList6.add(dm.wb.A.u());
            p75.i0 g18 = dm.wb.f322435w.g(linkedList5);
            g18.f434190d = c18;
            g18.f434192f = linkedList6;
            g18.f434193g = linkedList7;
            g18.c(i18, i17);
            a17 = g18.a();
        } else {
            p75.n0 n0Var3 = dm.wb.f322435w;
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            java.util.LinkedList linkedList9 = new java.util.LinkedList();
            java.util.LinkedList linkedList10 = new java.util.LinkedList();
            p75.m c19 = dm.wb.f322437y.j(selfUserName).c(dm.wb.D.i(1));
            linkedList9.add(dm.wb.B.u());
            linkedList9.add(dm.wb.A.u());
            p75.i0 g19 = dm.wb.f322435w.g(linkedList8);
            g19.f434190d = c19;
            g19.f434192f = linkedList9;
            g19.f434193g = linkedList10;
            g19.c(i18, i17);
            a17 = g19.a();
        }
        java.util.Iterator it = ((java.util.ArrayList) a17.k(this.f393050d, kr4.g.class)).iterator();
        while (it.hasNext()) {
            kr4.g gVar = (kr4.g) it.next();
            gVar.f393041y0 = f393049f;
            gVar.t0();
            linkedList.add(gVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.ConversationStorage", "[query] biz=" + selfUserName + " offset=" + i17 + " pageCount=" + i18 + "list size=" + linkedList.size());
        return linkedList;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj = w0Var != null ? w0Var.f398509d : null;
        if (!(obj instanceof kr4.g)) {
            obj = null;
        }
        if (obj != null) {
            kr4.g gVar = (kr4.g) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69048xbed8694c, "w1wnotificationholder@w1wmsg")) {
                return;
            }
            if ((w0Var != null ? w0Var.f398509d : null) instanceof kr4.g) {
                fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
                java.lang.String field_selfUserName = gVar.f69047x5568d387;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                g0Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] updating reddot for username=".concat(field_selfUserName));
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var.f347361o;
                concurrentHashMap.put(field_selfUserName, g0Var.Ui(field_selfUserName));
                java.lang.String str2 = (java.lang.String) concurrentHashMap.get(field_selfUserName);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONArray.put(field_selfUserName);
                jSONObject2.put("usernames", jSONArray);
                jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, jSONObject2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] reddot JSON prepared for username=" + field_selfUserName + ", reddotId=" + str2);
                if (!((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] LiteAppFeatureService not initialized, cannot publish reddot event");
                    return;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.l("w1w.w1wPersonalMsgReddotChange", jSONObject);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1w.W1wPersonalMsgService", "[setReddotCountWithUsername] reddot event published for username=".concat(field_selfUserName));
            }
        }
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo55864x413cb2b4(l75.f0 f0Var, boolean z17) {
        kr4.g gVar = (kr4.g) f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[replace] ");
        sb6.append(gVar != null ? gVar.m144235x9616526c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.ConversationStorage", sb6.toString());
        boolean z18 = false;
        if (gVar != null) {
            android.content.ContentValues mo9763xeb27878e = gVar.mo9763xeb27878e();
            java.lang.String field_sessionId = gVar.f69048xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            l75.k0 k0Var = this.f393050d;
            android.database.Cursor B = k0Var.B("select *, rowid from W1wConversation where sessionId = '" + field_sessionId + "' ", null);
            try {
                boolean z19 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (z19) {
                    if (k0Var.p(mo145255x88e404c3(), mo9763xeb27878e, "sessionId = ?", new java.lang.String[]{"" + gVar.f69048xbed8694c}) > 0) {
                        z18 = true;
                    }
                } else {
                    z18 = super.mo51731x24249762(gVar, false);
                }
                if (z18 && z17) {
                    mo142179xf35bbb4(gVar.f69048xbed8694c, 1, gVar);
                }
            } finally {
            }
        }
        return z18;
    }

    public final kr4.g y0(java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        android.database.Cursor B = this.f393050d.B("select *, rowid from W1wConversation where sessionId = '" + sessionId + "' ", null);
        kr4.g gVar = new kr4.g(f393049f);
        gVar.f69048xbed8694c = sessionId;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    gVar.mo9015xbf5d97fd(B);
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return gVar;
    }

    public final int z0(int i17, java.lang.String selfUserName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUserName, "selfUserName");
        p75.i0 h17 = dm.wb.f322435w.h(dm.wb.f322438z.y());
        p75.y yVar = (p75.y) dm.wb.f322437y.j(selfUserName).c(dm.wb.C.i(java.lang.Integer.valueOf(i17)));
        yVar.f(dm.wb.D.i(0));
        p75.d dVar = dm.wb.f322436x;
        dVar.getClass();
        yVar.f(new p75.w0(dVar.z(), "w1wsayhisessionholder@w1wmsg"));
        h17.f434190d = yVar;
        h17.f434189c = "W1wPersonalMsg.ConversationStorage";
        int m17 = h17.a().m(this.f393050d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("W1wPersonalMsg.ConversationStorage", "[getAllUnreadCount] type=" + i17 + " selfUserName:" + selfUserName + " count=" + m17);
        return m17;
    }
}
