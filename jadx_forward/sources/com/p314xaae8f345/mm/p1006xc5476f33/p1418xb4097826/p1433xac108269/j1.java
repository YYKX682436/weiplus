package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f183807a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f183808b;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_at_email_regex_android, "", true);
        if (Zi == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Zi, "")) {
            Zi = "^@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "endStr: ".concat(Zi));
        }
        f183807a = new r26.t(Zi);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : t70Var.d()) {
            try {
                arrayList.add(new r26.t(str));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderAtUtil", "ENDCHARS parse crash, crashStr=" + str + ", error=" + th6);
            }
        }
        f183808b = arrayList;
    }
}
