package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f206482a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j f206483b = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f206484c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f206485d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f206486e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f206487f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public long f206488g;

    public final long a(int i17) {
        java.util.Collection values = (i17 == 1 ? this.f206485d : this.f206487f).values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d((java.lang.Integer) it.next());
            j17 += r2.intValue();
        }
        return j17;
    }

    public final void b(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = i17 == 1 ? this.f206485d : this.f206487f;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, 1);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        if (num != null) {
        }
    }

    public final void c(long j17, long j18, java.lang.String finderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j jVar = this.f206483b;
        jVar.f206611a = 0L;
        jVar.f206612b = "";
        jVar.f206613c = 0L;
        jVar.f206614d = 0L;
        this.f206482a = false;
        this.f206488g = 0L;
        ((java.util.HashSet) this.f206484c).clear();
        ((java.util.HashSet) this.f206486e).clear();
        this.f206485d.clear();
        this.f206487f.clear();
        jVar.f206611a = j17;
        jVar.f206614d = j18;
        long c17 = c01.id.c();
        jVar.f206613c = c17;
        java.lang.String valueOf = java.lang.String.valueOf(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<set-?>");
        jVar.f206612b = valueOf;
        jVar.f206615e = finderUsername;
        this.f206482a = true;
    }

    public final void d(r45.qt2 qt2Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6471x9d391971 c6471x9d391971 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6471x9d391971();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j jVar = this.f206483b;
        c6471x9d391971.f138137d = jVar.f206611a;
        c6471x9d391971.f138138e = jVar.f206614d;
        c6471x9d391971.f138140g = c6471x9d391971.b("chatlistSessionid", jVar.f206612b, true);
        c6471x9d391971.f138141h = this.f206485d.size();
        c6471x9d391971.f138142i = a(1);
        c6471x9d391971.f138143j = a(2);
        c6471x9d391971.f138144k = this.f206487f.size();
        c6471x9d391971.f138145l = this.f206488g;
        c6471x9d391971.f138147n = 0L;
        c6471x9d391971.f138146m = java.lang.System.currentTimeMillis() - jVar.f206613c;
        if (qt2Var != null) {
            c6471x9d391971.f138139f = qt2Var.m75939xb282bd08(7);
        }
        if (jVar.f206615e.length() > 0) {
            c6471x9d391971.f138148o = c6471x9d391971.b("finderusername", jVar.f206615e, true);
        }
        c6471x9d391971.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p pVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p.f206755a;
        java.lang.String n17 = c6471x9d391971.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderChatReporter", "report20688 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
        this.f206482a = false;
    }

    public final void e(java.util.Set curRecordSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curRecordSet, "curRecordSet");
        java.util.Set set = this.f206484c;
        if (this.f206482a) {
            java.util.Set g17 = kz5.q1.g(curRecordSet, set);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordFinderChatList", "latestExposeRecords" + g17 + "，size:" + g17.size());
            if (!g17.isEmpty()) {
                java.util.Iterator it = g17.iterator();
                while (it.hasNext()) {
                    b((java.lang.String) it.next(), 1);
                }
            }
            set.clear();
            java.util.Iterator it6 = curRecordSet.iterator();
            while (it6.hasNext()) {
                set.add((java.lang.String) it6.next());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pvCount:");
            sb6.append(a(1));
            sb6.append(": uvCount:");
            sb6.append(this.f206485d.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecordFinderChatList", sb6.toString());
        }
    }
}
