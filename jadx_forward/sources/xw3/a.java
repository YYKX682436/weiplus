package xw3;

/* loaded from: classes.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(r45.dp5 repairerItem, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(repairerItem, "repairerItem");
        str = "";
        if (repairerItem.m75939xb282bd08(2) == 3) {
            int i17 = 0;
            java.lang.String m75945x2fec8307 = repairerItem.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                java.lang.String str2 = (java.lang.String) r26.n0.f0(m75945x2fec8307, new java.lang.String[]{"_"}, false, 0, 6, null).get(r3.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83072 = repairerItem.m75945x2fec8307(0);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            java.lang.String m75945x2fec83073 = repairerItem.m75945x2fec8307(8);
                            str = o1Var.c(m75945x2fec83072, m75945x2fec83073 != null ? m75945x2fec83073 : "").toString();
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(repairerItem.m75945x2fec8307(8), 0);
                            bm5.o1 o1Var2 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83074 = repairerItem.m75945x2fec8307(0);
                            if (m75945x2fec83074 == null) {
                                m75945x2fec83074 = "";
                            }
                            java.lang.Object c17 = o1Var2.c(m75945x2fec83074, java.lang.Integer.valueOf(P));
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(c17);
                            java.util.LinkedList m75941xfb821914 = repairerItem.m75941xfb821914(6);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getValueAlias(...)");
                            java.lang.Integer num = c17 instanceof java.lang.Integer ? (java.lang.Integer) c17 : null;
                            java.lang.String str3 = (java.lang.String) kz5.n0.a0(m75941xfb821914, num != null ? num.intValue() : 0);
                            if (str3 != null) {
                                java.lang.String str4 = "(" + str3 + ')';
                                if (str4 != null) {
                                    str = str4;
                                }
                            }
                            sb6.append(str);
                            str = sb6.toString();
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(repairerItem.m75945x2fec8307(8), 0L);
                            bm5.o1 o1Var3 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83075 = repairerItem.m75945x2fec8307(0);
                            str = o1Var3.c(m75945x2fec83075 != null ? m75945x2fec83075 : "", java.lang.Long.valueOf(V)).toString();
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            float L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(repairerItem.m75945x2fec8307(8), 0.0f);
                            bm5.o1 o1Var4 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83076 = repairerItem.m75945x2fec8307(0);
                            str = o1Var4.c(m75945x2fec83076 != null ? m75945x2fec83076 : "", java.lang.Float.valueOf(L)).toString();
                            break;
                        }
                        break;
                }
            }
            if (z17) {
                java.util.LinkedList m75941xfb8219142 = repairerItem.m75941xfb821914(3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getValues(...)");
                for (java.lang.Object obj : m75941xfb8219142) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, (java.lang.String) obj)) {
                        java.lang.Object obj2 = repairerItem.m75941xfb821914(6).get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                        return (java.lang.String) obj2;
                    }
                    i17 = i18;
                }
            }
        }
        return str;
    }
}
