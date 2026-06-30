package qe2;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final qe2.l f443593a = new qe2.l();

    public static final boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!qe2.a.e(item)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "show: not co-author live, skip");
            return false;
        }
        try {
            qe2.l lVar = f443593a;
            java.util.List a17 = lVar.a(item);
            if (a17.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "show: cellItems empty, skip");
                return false;
            }
            lVar.e(context, a17);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.CoAuthorSheet", th6, "show error", new java.lang.Object[0]);
            return false;
        }
    }

    public static final boolean d(android.content.Context context, r45.a84 a84Var, java.lang.String anchorUsername, java.lang.String anchorNickname, java.lang.String anchorHeadUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorNickname, "anchorNickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorHeadUrl, "anchorHeadUrl");
        java.util.LinkedList m75941xfb821914 = a84Var != null ? a84Var.m75941xfb821914(1) : null;
        if (m75941xfb821914 == null || m75941xfb821914.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showFromLiveCoAuthor: contact empty, skip");
            return false;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(m75941xfb821914.size() + 1);
            arrayList.add(new qe2.c(anchorUsername, anchorNickname, anchorHeadUrl, true, false, null, false, 112, null));
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next();
                if (c19782x23db1cfa != null) {
                    java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
                    java.lang.String str = m76197x6c03c64c == null ? "" : m76197x6c03c64c;
                    java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
                    java.lang.String str2 = m76184x8010e5e4 == null ? "" : m76184x8010e5e4;
                    java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
                    java.lang.String str3 = m76175x6d346f39 == null ? "" : m76175x6d346f39;
                    int m76170x756826b3 = c19782x23db1cfa.m76170x756826b3();
                    l75.e0 e0Var = ya2.b2.O2;
                    arrayList.add(new qe2.c(str, str2, str3, false, m76170x756826b3 == ya2.b2.Q2, c19782x23db1cfa.m76160xd133dfec(), false, 64, null));
                }
            }
            f443593a.e(context, arrayList);
            return true;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.CoAuthorSheet", th6, "showFromLiveCoAuthor error", new java.lang.Object[0]);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final java.util.List a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        r45.dm2 m76806xdef68064;
        r45.d50 d50Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = c14994x9b99c079.getFeedObject();
        ?? r17 = kz5.p0.f395529d;
        if (feedObject != null && (m76806xdef68064 = feedObject.m76806xdef68064()) != null && (d50Var = (r45.d50) m76806xdef68064.m75936x14adae67(63)) != null) {
            java.util.LinkedList m75941xfb821914 = d50Var.m75941xfb821914(1);
            if (m75941xfb821914 == null) {
                return r17;
            }
            r17 = new java.util.ArrayList(m75941xfb821914.size() + 1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2 = c14994x9b99c079.getFeedObject();
            if (feedObject2 != null && (m76760x76845fea = feedObject2.m76760x76845fea()) != null) {
                java.lang.String m76197x6c03c64c = m76760x76845fea.m76197x6c03c64c();
                java.lang.String str = m76197x6c03c64c == null ? "" : m76197x6c03c64c;
                java.lang.String m76184x8010e5e4 = m76760x76845fea.m76184x8010e5e4();
                java.lang.String str2 = m76184x8010e5e4 == null ? "" : m76184x8010e5e4;
                java.lang.String m76175x6d346f39 = m76760x76845fea.m76175x6d346f39();
                java.lang.String str3 = m76175x6d346f39 == null ? "" : m76175x6d346f39;
                int m76170x756826b3 = m76760x76845fea.m76170x756826b3();
                l75.e0 e0Var = ya2.b2.O2;
                r17.add(new qe2.c(str, str2, str3, true, m76170x756826b3 == ya2.b2.Q2, m76760x76845fea.m76160xd133dfec(), false, 64, null));
            }
            java.util.Iterator it = m75941xfb821914.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next();
                if (c19782x23db1cfa != null) {
                    java.lang.String m76197x6c03c64c2 = c19782x23db1cfa.m76197x6c03c64c();
                    java.lang.String str4 = m76197x6c03c64c2 == null ? "" : m76197x6c03c64c2;
                    java.lang.String m76184x8010e5e42 = c19782x23db1cfa.m76184x8010e5e4();
                    java.lang.String str5 = m76184x8010e5e42 == null ? "" : m76184x8010e5e42;
                    java.lang.String m76175x6d346f392 = c19782x23db1cfa.m76175x6d346f39();
                    java.lang.String str6 = m76175x6d346f392 == null ? "" : m76175x6d346f392;
                    int m76170x756826b32 = c19782x23db1cfa.m76170x756826b3();
                    l75.e0 e0Var2 = ya2.b2.O2;
                    r17.add(new qe2.c(str4, str5, str6, false, m76170x756826b32 == ya2.b2.Q2, c19782x23db1cfa.m76160xd133dfec(), false, 64, null));
                }
            }
        }
        return r17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(r45.g92 r20) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe2.l.b(r45.g92):java.util.List");
    }

    public final void e(android.content.Context context, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(new w.h(context, list), null, false, 0, 7, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoAuthorSheet", "showSheet: count=" + list.size());
    }
}
