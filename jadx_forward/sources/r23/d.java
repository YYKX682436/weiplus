package r23;

/* loaded from: classes4.dex */
public abstract class d {
    public static final java.lang.String a(java.util.List list) {
        int i17;
        java.util.HashSet hashSet = new java.util.HashSet();
        int i18 = 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                if (abstractC15633xee433078.mo63659xfb85f7b0() == 2) {
                    i18++;
                }
                if (abstractC15633xee433078.mo63659xfb85f7b0() == 1) {
                    i19++;
                }
                hashSet.add(java.lang.Integer.valueOf(abstractC15633xee433078.mo63659xfb85f7b0()));
                if (hashSet.size() >= 2) {
                    java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573712fi3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                    return r17;
                }
            }
            i17 = i18;
            i18 = i19;
        } else {
            i17 = 0;
        }
        if (i18 > 9) {
            java.lang.String r18 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573710fi1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
            return r18;
        }
        if (i17 < 2) {
            return "";
        }
        java.lang.String r19 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573711fi2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
        return r19;
    }
}
