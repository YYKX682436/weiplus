package dk2;

/* loaded from: classes2.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public final dk2.bc f314860a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f314861b;

    /* renamed from: c, reason: collision with root package name */
    public long f314862c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f314863d;

    public dc(dk2.bc poll, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        c19792x256d2725 = (i17 & 2) != 0 ? null : c19792x256d2725;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poll, "poll");
        this.f314860a = poll;
        this.f314861b = c19792x256d2725;
        this.f314863d = new java.util.LinkedHashMap();
    }

    public final java.util.List a(java.lang.Integer num) {
        dk2.bc bcVar;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        r45.jn0 jn0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f314863d).entrySet().iterator();
        int i18 = 1;
        int i19 = 1;
        while (true) {
            boolean hasNext = it.hasNext();
            bcVar = this.f314860a;
            c19792x256d2725 = this.f314861b;
            if (!hasNext) {
                break;
            }
            dk2.cc ccVar = (dk2.cc) ((java.util.Map.Entry) it.next()).getValue();
            r45.jn0 jn0Var2 = new r45.jn0();
            if (c19792x256d2725 != null) {
                jn0Var2.set(0, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                jn0Var2.set(i18, c19792x256d2725.m76836x6c03c64c());
                jn0Var2.set(2, c19792x256d2725.m76829x97edf6c0());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                jn0Var2.set(5, java.lang.Integer.valueOf(m76802x2dd01666 != null ? m76802x2dd01666.m76964x7f025288() : 0));
            }
            r45.st2 st2Var = new r45.st2();
            st2Var.set(0, ccVar.f314828a.f315112a);
            arrayList2.add(st2Var);
            r45.rt2 rt2Var = new r45.rt2();
            if (c19792x256d2725 != null) {
                str2 = c19792x256d2725 + ".id";
            } else {
                str2 = null;
            }
            rt2Var.set(0, str2);
            rt2Var.set(2, bcVar.f314788b);
            rt2Var.set(3, bcVar.f314787a);
            rt2Var.set(4, java.lang.Integer.valueOf(i19));
            rt2Var.set(5, new java.util.LinkedList(arrayList2));
            rt2Var.set(7, java.lang.String.valueOf(ccVar.f314829b));
            rt2Var.set(9, java.lang.String.valueOf(this.f314862c));
            rt2Var.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
            jn0Var2.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 47), new jz5.l("strValue", rt2Var.mo12245xcc313de3().toString())))));
            arrayList.add(jn0Var2);
            if (ccVar.f314831d.isEmpty()) {
                jn0Var = null;
            } else {
                r45.st2 st2Var2 = (r45.st2) kz5.n0.i0(arrayList2);
                int ordinal = ccVar.f314828a.f315114c.ordinal();
                if (ordinal != 0) {
                    i17 = 1;
                    if (ordinal == 1) {
                        java.util.List list = ccVar.f314831d;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
                        java.util.Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            arrayList3.add(((dk2.ic) it6.next()).f315155a);
                        }
                        st2Var2.set(3, new java.util.LinkedList(arrayList3));
                        i17 = 1;
                    }
                } else {
                    i17 = 1;
                    st2Var2.set(1, ((dk2.ic) kz5.n0.X(ccVar.f314831d)).f315155a);
                }
                r45.jn0 jn0Var3 = new r45.jn0();
                if (c19792x256d2725 != null) {
                    jn0Var3.set(0, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
                    jn0Var3.set(i17, c19792x256d2725.m76836x6c03c64c());
                    jn0Var3.set(2, c19792x256d2725.m76829x97edf6c0());
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
                    jn0Var3.set(5, java.lang.Integer.valueOf(m76802x2dd016662 != null ? m76802x2dd016662.m76964x7f025288() : 0));
                }
                r45.rt2 rt2Var2 = new r45.rt2();
                if (c19792x256d2725 != null) {
                    str3 = c19792x256d2725 + ".id";
                } else {
                    str3 = null;
                }
                rt2Var2.set(0, str3);
                rt2Var2.set(2, bcVar.f314788b);
                rt2Var2.set(3, bcVar.f314787a);
                rt2Var2.set(4, java.lang.Integer.valueOf(i19));
                rt2Var2.set(5, new java.util.LinkedList(arrayList2));
                rt2Var2.set(7, java.lang.String.valueOf(ccVar.f314829b));
                rt2Var2.set(8, java.lang.String.valueOf(ccVar.f314830c));
                rt2Var2.set(9, java.lang.String.valueOf(this.f314862c));
                rt2Var2.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                jn0Var3.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 48), new jz5.l("strValue", rt2Var2.mo12245xcc313de3().toString())))));
                jn0Var = jn0Var3;
            }
            if (jn0Var != null) {
                arrayList.add(jn0Var);
            }
            i19++;
            i18 = 1;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i27 = i19 - 1;
        r45.jn0 jn0Var4 = new r45.jn0();
        if (c19792x256d2725 != null) {
            jn0Var4.set(0, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            jn0Var4.set(1, c19792x256d2725.m76836x6c03c64c());
            jn0Var4.set(2, c19792x256d2725.m76829x97edf6c0());
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c19792x256d2725.m76802x2dd01666();
            jn0Var4.set(5, java.lang.Integer.valueOf(m76802x2dd016663 != null ? m76802x2dd016663.m76964x7f025288() : 0));
        }
        r45.rt2 rt2Var3 = new r45.rt2();
        if (c19792x256d2725 != null) {
            str = c19792x256d2725 + ".id";
        } else {
            str = null;
        }
        rt2Var3.set(0, str);
        rt2Var3.set(2, bcVar.f314788b);
        rt2Var3.set(3, bcVar.f314787a);
        rt2Var3.set(4, java.lang.Integer.valueOf(i27));
        rt2Var3.set(5, new java.util.LinkedList(arrayList2));
        rt2Var3.set(9, java.lang.String.valueOf(this.f314862c));
        rt2Var3.set(10, java.lang.String.valueOf(currentTimeMillis));
        rt2Var3.set(1, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        jn0Var4.set(3, java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("feedActionType", 118), new jz5.l("strValue", rt2Var3.mo12245xcc313de3().toString())))));
        arrayList.add(jn0Var4);
        return arrayList;
    }

    public final void b(dk2.hc question, java.lang.Iterable response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f314863d;
        java.lang.String str = question.f315113b;
        dk2.cc ccVar = (dk2.cc) linkedHashMap.get(str);
        if (ccVar != null) {
            ccVar.f314831d = kz5.n0.S0(response);
            return;
        }
        throw new java.lang.IllegalStateException("Question activity not found. " + question.f315112a + ", " + str);
    }

    public final void c(dk2.hc question) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f314863d;
        java.lang.String str = question.f315113b;
        dk2.cc ccVar = (dk2.cc) linkedHashMap.get(str);
        if (ccVar != null) {
            ccVar.f314830c = java.lang.System.currentTimeMillis();
            return;
        }
        throw new java.lang.IllegalStateException("Question activity not found. " + question.f315112a + ", " + str);
    }

    public final void d(dk2.hc question) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(question, "question");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = this.f314863d;
        if (map.isEmpty()) {
            this.f314862c = currentTimeMillis;
        }
        map.put(question.f315113b, new dk2.cc(question, currentTimeMillis));
    }
}
