package wh5;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static long f527586b;

    /* renamed from: a, reason: collision with root package name */
    public static final wh5.f f527585a = new wh5.f();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f527587c = new java.util.HashMap();

    public final boolean a() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C19988x3c08b871()) == 1)) {
            return false;
        }
        ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
        return qp.b.f447211e;
    }

    public final boolean b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap = f527587c;
        java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(java.lang.Long.valueOf(msg.m124847x74d37ac6()));
        if (bool != null) {
            return bool.booleanValue();
        }
        int Zi = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(msg);
        boolean z17 = false;
        if (Zi > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveHelper", "msg(" + msg.m124847x74d37ac6() + "): isExpiredLiveInternal: false, remainDays: " + Zi);
        } else {
            ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).getClass();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(msg);
            java.lang.String str2 = "";
            if (S1 == null || S1.f404166a <= 0) {
                str = "";
            } else {
                java.lang.String str3 = S1.f404170e;
                if (S1.j()) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f404182q));
                    if (C1.f404166a == S1.f404182q) {
                        str2 = C1.f404170e;
                    }
                }
                str = str2;
                str2 = str3;
            }
            bm5.b0 a17 = bm5.b0.f104064e.a(msg, str2, str);
            boolean z18 = com.p314xaae8f345.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f104096h, false, 2, null)) && com.p314xaae8f345.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f104101p, false, 2, null));
            boolean z19 = com.p314xaae8f345.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f104095g, false, 2, null)) && com.p314xaae8f345.mm.vfs.w6.j(bm5.b0.a(a17, bm5.f0.f104102q, false, 2, null));
            if (!z18 && !z19) {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveHelper", "msg(" + msg.m124847x74d37ac6() + "): isExpiredLiveInternal: " + z17 + ", hasMiddleRes: " + z18 + " hasHdRes: " + z19);
        }
        hashMap.put(java.lang.Long.valueOf(msg.m124847x74d37ac6()), java.lang.Boolean.valueOf(z17));
        return z17;
    }
}
