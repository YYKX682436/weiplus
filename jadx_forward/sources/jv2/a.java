package jv2;

/* loaded from: classes10.dex */
public final class a extends jv2.e {
    public iv2.a M;
    public java.util.LinkedList N;

    public a() {
        r45.et0 et0Var = new r45.et0();
        et0Var.set(1, new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87());
        et0Var.set(2, new r45.bc4());
        et0Var.set(3, new r45.cc4());
        this.f67473x27838069 = et0Var;
        this.N = new java.util.LinkedList();
    }

    public final long A0() {
        return this.f67473x27838069.m75942xfb822ef2(4);
    }

    public final java.lang.String D0() {
        java.lang.String m76102x6c03c64c = u0().m76102x6c03c64c();
        return m76102x6c03c64c == null ? "" : m76102x6c03c64c;
    }

    /* renamed from: getClientId */
    public final java.lang.String m141443xb1ff73bc() {
        java.lang.String m76057x8def5759 = u0().m76057x8def5759();
        return m76057x8def5759 == null ? "" : m76057x8def5759;
    }

    public final java.lang.String j() {
        java.lang.String m76060x76847043 = u0().m76060x76847043();
        return m76060x76847043 == null ? "" : m76060x76847043;
    }

    public final long t0() {
        return u0().m76058xa6514d24();
    }

    /* renamed from: toString */
    public java.lang.String m141444x9616526c() {
        java.lang.String str;
        java.lang.String str2 = "field_commentInfo{commentId:" + u0().m76058xa6514d24() + ", reply_username:" + u0().m76096x37861b81() + ",feedId:" + this.f67478xf9a02e3e + ",displayid:" + java.lang.Long.valueOf(u0().m76069xe2f6ea7()) + " try_count " + this.f67485x90b085b9 + " conetent:%s}";
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String m76060x76847043 = u0().m76060x76847043();
        if (m76060x76847043 != null) {
            str = m76060x76847043.substring(0, java.lang.Math.min(m76060x76847043.length(), 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
        } else {
            str = "";
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format(str2, java.util.Arrays.copyOf(objArr, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 u0() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) this.f67473x27838069.m75936x14adae67(1);
        return c19781xd1c47b87 == null ? new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87() : c19781xd1c47b87;
    }

    public final int v0() {
        return u0().m76071x9ca513a0();
    }

    public final java.util.LinkedList w0() {
        return u0().m76079x6dd38ae1();
    }

    public final java.lang.String y0() {
        java.lang.String m76084x8010e5e4 = u0().m76084x8010e5e4();
        return m76084x8010e5e4 == null ? "" : m76084x8010e5e4;
    }

    public final java.lang.String z0() {
        java.lang.String m76093x4c4251c2 = u0().m76093x4c4251c2();
        return m76093x4c4251c2 == null ? "" : m76093x4c4251c2;
    }
}
