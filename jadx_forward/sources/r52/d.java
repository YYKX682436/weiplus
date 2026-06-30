package r52;

/* loaded from: classes15.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.f45 a() {
        byte[] a17 = c52.c.a("hell_pge_sttics_d_1");
        if (a17 == null) {
            return null;
        }
        if (a17.length == 0) {
            return null;
        }
        r45.f45 f45Var = new r45.f45();
        try {
            f45Var.mo11468x92b714fd(a17);
            return f45Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStatisticsDao", e17, "_read, exception: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public final r45.f45 b() {
        byte[] a17 = c52.c.a("hell_pge_sttics_d_3");
        if (a17 == null) {
            return null;
        }
        if (a17.length == 0) {
            return null;
        }
        r45.f45 f45Var = new r45.f45();
        try {
            f45Var.mo11468x92b714fd(a17);
            return f45Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStatisticsDao", e17, "_readWith78Event, exception: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public final void c(r45.f45 f45Var) {
        try {
            c52.c.d("hell_pge_sttics_d_1", f45Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStatisticsDao", e17, "_write, exception: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public final void d(r45.f45 f45Var) {
        try {
            c52.c.d("hell_pge_sttics_d_3", f45Var.mo14344x5f01b1f6());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.PageStatisticsDao", e17, "_writeWith78Event, exception: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }

    public final synchronized r45.d45 e() {
        r45.f45 a17 = a();
        if (a17 == null) {
            return null;
        }
        if (a17.f455541d.isEmpty()) {
            return null;
        }
        return ((r45.e45) a17.f455541d.getLast()).f454546e;
    }

    public final synchronized r45.d45 f() {
        r45.f45 b17 = b();
        if (b17 == null) {
            return null;
        }
        if (b17.f455541d.isEmpty()) {
            return null;
        }
        return ((r45.e45) b17.f455541d.getLast()).f454546e;
    }

    public final synchronized r45.d45 g(java.lang.String str, int i17) {
        if (str == null) {
            return null;
        }
        r45.f45 a17 = a();
        if (a17 == null) {
            return null;
        }
        java.lang.String str2 = str + i17;
        java.util.LinkedList<r45.e45> map = a17.f455541d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "map");
        for (r45.e45 e45Var : map) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, e45Var.f454545d)) {
                return e45Var.f454546e;
            }
        }
        return null;
    }

    public final synchronized r45.d45 h(java.lang.String str, int i17) {
        if (str == null) {
            return null;
        }
        r45.f45 b17 = b();
        if (b17 == null) {
            return null;
        }
        java.lang.String str2 = str + i17;
        java.util.LinkedList<r45.e45> map = b17.f455541d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "map");
        for (r45.e45 e45Var : map) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, e45Var.f454545d)) {
                return e45Var.f454546e;
            }
        }
        return null;
    }

    public final synchronized void i() {
        if (b52.b.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.PageStatisticsDao", "resetWith78Event");
            c52.c.d("hell_pge_sttics_d_3", new byte[0]);
        }
    }

    public final synchronized void j(r45.d45 statics) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statics, "statics");
        r45.f45 a17 = a();
        if (a17 == null) {
            a17 = new r45.f45();
        }
        java.lang.String str = statics.f453631e + statics.f453632f;
        java.util.LinkedList map = a17.f455541d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "map");
        java.util.Iterator it = map.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.e45 e45Var = (r45.e45) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, e45Var.f454545d)) {
                e45Var.f454546e = statics;
                z17 = true;
                break;
            }
        }
        if (!z17) {
            r45.e45 e45Var2 = new r45.e45();
            e45Var2.f454545d = str;
            e45Var2.f454546e = statics;
            a17.f455541d.add(e45Var2);
        }
        c(a17);
    }

    public final synchronized void k(r45.d45 statics) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statics, "statics");
        r45.f45 b17 = b();
        if (b17 == null) {
            b17 = new r45.f45();
        }
        java.lang.String str = statics.f453631e + statics.f453632f;
        java.util.LinkedList map = b17.f455541d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "map");
        java.util.Iterator it = map.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.e45 e45Var = (r45.e45) it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, e45Var.f454545d)) {
                e45Var.f454546e = statics;
                z17 = true;
                break;
            }
        }
        if (!z17) {
            r45.e45 e45Var2 = new r45.e45();
            e45Var2.f454545d = str;
            e45Var2.f454546e = statics;
            b17.f455541d.add(e45Var2);
        }
        d(b17);
    }
}
