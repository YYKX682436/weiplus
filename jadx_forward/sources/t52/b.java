package t52;

/* loaded from: classes15.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.s53 a() {
        byte[] a17 = c52.c.a("mmkv_fuzzy_pgs_io");
        if (a17 != null) {
            if (!(a17.length == 0)) {
                r45.s53 s53Var = new r45.s53();
                try {
                    s53Var.mo11468x92b714fd(a17);
                    return s53Var;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchDao", e17, "FuzzyMatchDao, getFuzzyMatchInfo: %s", e17.getMessage());
                }
            }
        }
        return null;
    }

    public final r45.a16 b(java.lang.String str) {
        r45.s53 a17;
        r45.a16 a16Var;
        if (str == null || (a17 = a()) == null) {
            return null;
        }
        java.util.LinkedList linkedList = a17.f467050d;
        int size = linkedList.size();
        do {
            size--;
            if (-1 >= size) {
                return null;
            }
            a16Var = (r45.a16) linkedList.get(size);
        } while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, a16Var.f451178d));
        return a16Var;
    }

    public final android.util.Pair c(java.lang.String sessionId) {
        r45.a16 a16Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        r45.s53 a17 = a();
        if (a17 == null) {
            a17 = new r45.s53();
        }
        int size = a17.f467050d.size();
        do {
            size--;
            java.util.LinkedList linkedList = a17.f467050d;
            if (-1 >= size) {
                r45.a16 a16Var2 = new r45.a16();
                linkedList.addLast(a16Var2);
                d(a17);
                android.util.Pair create = android.util.Pair.create(a16Var2, java.lang.Integer.valueOf(linkedList.size() - 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
                return create;
            }
            java.lang.Object obj = linkedList.get(size);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            a16Var = (r45.a16) obj;
        } while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sessionId, a16Var.f451178d));
        android.util.Pair create2 = android.util.Pair.create(a16Var, java.lang.Integer.valueOf(size));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create2, "create(...)");
        return create2;
    }

    public final void d(r45.s53 s53Var) {
        if (s53Var == null) {
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = s53Var.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 == null) {
                return;
            }
            c52.c.d("mmkv_fuzzy_pgs_io", mo14344x5f01b1f6);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FuzzyMatchDao", e17, "FuzzyMatchDao, setFuzzyMatchInfo: %s", e17.getMessage());
        }
    }

    public final void e(r45.a16 a16Var) {
        if (a16Var == null) {
            return;
        }
        r45.s53 a17 = a();
        if (a17 == null) {
            a17 = new r45.s53();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyMatchDao", "updateSessionMatchInfo, addNew: " + a16Var.f451178d);
            a17.f467050d.addLast(a16Var);
        } else {
            java.util.LinkedList linkedList = a17.f467050d;
            boolean z17 = true;
            int size = linkedList.size() - 1;
            while (true) {
                if (-1 >= size) {
                    z17 = false;
                    break;
                }
                r45.a16 a16Var2 = (r45.a16) linkedList.get(size);
                if (a16Var2 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a16Var2.f451178d, a16Var.f451178d)) {
                    linkedList.set(size, a16Var);
                    break;
                }
                size--;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FuzzyMatchDao", "updateSessionMatchInfo, add: " + a16Var.f451178d);
                linkedList.addLast(a16Var);
            }
        }
        d(a17);
    }

    public final void f(r45.a16 a16Var, int i17) {
        if (a16Var == null) {
            return;
        }
        r45.s53 a17 = a();
        if (a17 == null) {
            a17 = new r45.s53();
            a17.f467050d.addLast(a16Var);
        } else {
            a17.f467050d.set(i17, a16Var);
        }
        d(a17);
    }
}
