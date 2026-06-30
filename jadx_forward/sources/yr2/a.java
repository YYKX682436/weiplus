package yr2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final yr2.a f546192a = new yr2.a();

    public final r45.sq2 a(r45.sq2 sq2Var) {
        if (sq2Var != null) {
            return sq2Var;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h((java.lang.String) m17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[buildPreloadInfo] buffer isEmpty? ");
        sb6.append(h17.length == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PreloadTransform", sb6.toString());
        if (h17.length == 0) {
            return new r45.sq2();
        }
        r45.sq2 sq2Var2 = new r45.sq2();
        sq2Var2.mo11468x92b714fd(h17);
        return sq2Var2;
    }

    public final void b(r45.sq2 sq2Var, java.util.List list, int i17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[transform] info=");
        if (sq2Var != null) {
            str = "[preloadId=" + sq2Var.m75942xfb822ef2(0) + " hotFeed=" + sq2Var.m75941xfb821914(2).size() + ']';
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(" list=");
        sb6.append(list.size());
        sb6.append(" source=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PreloadTransform", sb6.toString());
        yr2.k ek6 = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
        r45.sq2 a17 = a(sq2Var);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            if (m76802x2dd01666 != null && m76802x2dd01666.m76964x7f025288() == 4) {
                hashMap.put(java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()), c19792x256d2725);
            }
        }
        ek6.y(a17, hashMap);
    }
}
