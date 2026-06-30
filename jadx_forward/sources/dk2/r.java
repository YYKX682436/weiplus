package dk2;

/* loaded from: classes8.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.util.ArrayList list, java.lang.String tag, boolean z17) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder(tag.concat(":"));
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            dk2.yg ygVar = (dk2.yg) obj;
            sb7.append("[第" + i17 + "首:");
            if (z17) {
                sb6 = ygVar.f315926a + ", " + ygVar.f315927b + ", " + ygVar.f315934i + ']';
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(ygVar);
                sb8.append(']');
                sb6 = sb8.toString();
            }
            sb7.append(sb6);
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", sb7.toString());
    }
}
