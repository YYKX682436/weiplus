package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes11.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.chatrecordstts.p1 f65519a = new com.tencent.mm.feature.chatrecordstts.p1();

    public static final java.lang.String c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        d90.k kVar = (d90.k) i95.n0.c(d90.k.class);
        if (kVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MarkdownStripUtil", "stripMarkdown: IMarkdownService unavailable");
            return "";
        }
        if (((e90.f) i95.n0.c(e90.f.class)) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MarkdownStripUtil", "stripMarkdown: IMarkdownViewService unavailable");
            return "";
        }
        cf5.b bVar = new cf5.b();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        d90.i wi6 = ((d90.q) kVar).wi(new com.tencent.mm.feature.chatrecordstts.o1(bVar, countDownLatch));
        try {
            ((d90.p) wi6).a(str, true);
            if (countDownLatch.await(600L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                return f65519a.b(bVar.g());
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.MarkdownStripUtil", "stripMarkdown: native parser timed out after 600ms");
            return "";
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MarkdownStripUtil", "stripMarkdown: error, msg=" + e17.getMessage());
            return "";
        } finally {
            ((d90.p) wi6).b();
        }
    }

    public final void a(java.lang.StringBuilder sb6, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            sb6.append(((v11.a) it.next()).f432318a);
        }
    }

    public final java.lang.String b(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            v11.r rVar = (v11.r) it.next();
            int i17 = 0;
            if (sb6.length() > 0) {
                sb6.append('\n');
            }
            if (rVar instanceof v11.l) {
                a(sb6, ((v11.l) rVar).f432435b);
            } else if (rVar instanceof v11.p) {
                a(sb6, ((v11.p) rVar).f432453a);
            } else if (rVar instanceof v11.n) {
                for (v11.i iVar : ((v11.n) rVar).f432444a) {
                    int i18 = i17 + 1;
                    if (i17 > 0) {
                        sb6.append('\n');
                    }
                    sb6.append(iVar.f432399a);
                    sb6.append(' ');
                    a(sb6, iVar.f432402d);
                    i17 = i18;
                }
            } else if (rVar instanceof v11.q) {
                v11.q qVar = (v11.q) rVar;
                java.util.Iterator it6 = qVar.f432454a.iterator();
                while (it6.hasNext()) {
                    a(sb6, ((v11.k0) it6.next()).f432432e);
                    sb6.append(' ');
                }
                for (java.util.List list2 : qVar.f432455b) {
                    sb6.append('\n');
                    java.util.Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        a(sb6, ((v11.k0) it7.next()).f432432e);
                        sb6.append(' ');
                    }
                }
            } else if (rVar instanceof v11.k) {
                sb6.append(((v11.k) rVar).f432426b);
            } else if (rVar instanceof v11.o) {
                sb6.append(((v11.o) rVar).f432451a);
            } else if (rVar instanceof v11.j) {
                sb6.append(b(((v11.j) rVar).f432414a));
            } else {
                boolean z17 = rVar instanceof v11.m;
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return r26.n0.u0(sb7).toString();
    }
}
