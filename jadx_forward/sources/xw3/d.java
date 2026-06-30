package xw3;

/* loaded from: classes.dex */
public final class d extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dp5 f539267d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f539268e;

    public d(r45.dp5 initItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initItem, "initItem");
        this.f539267d = initItem;
        this.f539268e = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
        ym3.d dVar = new ym3.d(request);
        dVar.f544682c.addAll(this.f539268e);
        v65.i.b(scope, null, new xw3.c(b17, dVar, null), 1, null);
        return p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.lang.String obj;
        java.util.LinkedList linkedList = this.f539268e;
        linkedList.clear();
        r45.dp5 repairerItem = this.f539267d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(repairerItem, "repairerItem");
        q55.e eVar = (q55.e) ix3.y0.f377145e.get(repairerItem.m75945x2fec8307(0));
        java.lang.String str2 = "X实验为主";
        if (eVar != null && bm5.o1.f104252a.m(eVar) != 0) {
            str2 = "维修厂为主";
        }
        linkedList.add(new ex3.e(1, 2, repairerItem, str2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(repairerItem, "repairerItem");
        str = "";
        if (repairerItem.m75939xb282bd08(2) == 3 && (m75945x2fec8307 = repairerItem.m75945x2fec8307(0)) != null) {
            java.lang.String str3 = (java.lang.String) r26.n0.f0(m75945x2fec8307, new java.lang.String[]{"_"}, false, 0, 6, null).get(r3.size() - 1);
            switch (str3.hashCode()) {
                case -1808118735:
                    if (str3.equals("String")) {
                        bm5.o1 o1Var = bm5.o1.f104252a;
                        java.lang.String m75945x2fec83072 = repairerItem.m75945x2fec8307(0);
                        if (m75945x2fec83072 == null) {
                            m75945x2fec83072 = "";
                        }
                        java.lang.String m75945x2fec83073 = repairerItem.m75945x2fec8307(8);
                        obj = o1Var.c(m75945x2fec83072, m75945x2fec83073 != null ? m75945x2fec83073 : "").toString();
                        str = obj;
                        break;
                    }
                    break;
                case 73679:
                    if (str3.equals("Int")) {
                        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(repairerItem.m75945x2fec8307(8), 0);
                        bm5.o1 o1Var2 = bm5.o1.f104252a;
                        java.lang.String m75945x2fec83074 = repairerItem.m75945x2fec8307(0);
                        obj = o1Var2.c(m75945x2fec83074 != null ? m75945x2fec83074 : "", java.lang.Integer.valueOf(P)).toString();
                        str = obj;
                        break;
                    }
                    break;
                case 2374300:
                    if (str3.equals("Long")) {
                        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(repairerItem.m75945x2fec8307(8), 0L);
                        bm5.o1 o1Var3 = bm5.o1.f104252a;
                        java.lang.String m75945x2fec83075 = repairerItem.m75945x2fec8307(0);
                        obj = o1Var3.c(m75945x2fec83075 != null ? m75945x2fec83075 : "", java.lang.Long.valueOf(V)).toString();
                        str = obj;
                        break;
                    }
                    break;
                case 67973692:
                    if (str3.equals("Float")) {
                        float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(repairerItem.m75945x2fec8307(8), 0.0f);
                        bm5.o1 o1Var4 = bm5.o1.f104252a;
                        java.lang.String m75945x2fec83076 = repairerItem.m75945x2fec8307(0);
                        obj = o1Var4.c(m75945x2fec83076 != null ? m75945x2fec83076 : "", java.lang.Float.valueOf(L)).toString();
                        str = obj;
                        break;
                    }
                    break;
            }
        }
        linkedList.add(new ex3.e(0, 3, repairerItem, str));
    }
}
