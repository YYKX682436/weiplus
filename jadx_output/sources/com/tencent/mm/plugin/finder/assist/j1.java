package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final r26.t f102274a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f102275b;

    static {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_finder_at_email_regex_android, "", true);
        if (Zi == null || kotlin.jvm.internal.o.b(Zi, "")) {
            Zi = "^@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        } else {
            com.tencent.mars.xlog.Log.i("FinderConfig", "endStr: ".concat(Zi));
        }
        f102274a = new r26.t(Zi);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : t70Var.d()) {
            try {
                arrayList.add(new r26.t(str));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("Finder.FinderAtUtil", "ENDCHARS parse crash, crashStr=" + str + ", error=" + th6);
            }
        }
        f102275b = arrayList;
    }
}
