package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes9.dex */
public abstract class b {
    public static r35.m3 a(android.content.Context context, java.lang.String str, int i17, int i18, int i19, int i27) {
        r35.m3 c17;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.app.p622xc5476f33.s sVar = (com.p314xaae8f345.mm.app.p622xc5476f33.s) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.n.a();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = sVar.f135215h;
        copyOnWriteArrayList.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = sVar.f135216i;
        copyOnWriteArrayList2.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = sVar.f135217m;
        copyOnWriteArrayList3.size();
        com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e c5082xed6d00e = sVar.f135213f;
        r35.m3 m3Var = null;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.URISpanHandler", "matchHrefInfoFromUrl error, context is null!");
            c5082xed6d00e.f135123a = null;
        } else {
            sVar.f135214g = context;
            c5082xed6d00e.f135123a = context;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                sVar.f135214g = null;
                c5082xed6d00e.f135123a = null;
            } else {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        c17 = ((com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler) it.next()).c(str);
                        if (c17 != null) {
                            sVar.f135214g = null;
                            c5082xed6d00e.f135123a = null;
                            break;
                        }
                    } else {
                        java.util.Iterator it6 = copyOnWriteArrayList2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                c17 = ((com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler) it6.next()).c(str);
                                if (c17 != null) {
                                    sVar.f135214g = null;
                                    c5082xed6d00e.f135123a = null;
                                    break;
                                }
                            } else {
                                java.util.Iterator it7 = copyOnWriteArrayList3.iterator();
                                while (it7.hasNext()) {
                                    c17 = ((com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler) it7.next()).c(str);
                                    if (c17 != null) {
                                        sVar.f135214g = null;
                                        c5082xed6d00e.f135123a = null;
                                    }
                                }
                                sVar.f135214g = null;
                                c5082xed6d00e.f135123a = null;
                            }
                        }
                    }
                }
                m3Var = c17;
            }
        }
        if (m3Var != null) {
            m3Var.f450725a = i17;
            m3Var.f450726b = i18;
            m3Var.f450735k = i19;
            m3Var.f450736l = i27;
        }
        return m3Var;
    }

    public static java.util.ArrayList b(android.content.Context context, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.regex.Matcher matcher = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b0.f272709k.matcher(str);
        while (matcher.find()) {
            r35.m3 a17 = a(context, matcher.group(), matcher.start(), matcher.end(), 0, 0);
            if (a17 != null) {
                arrayList.add(a17);
            }
        }
        return arrayList;
    }
}
