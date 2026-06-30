package hc2;

/* loaded from: classes2.dex */
public abstract class j0 {
    public static final void a(java.util.List list, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        list.size();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c14994x9b99c079.m59220x3fdd41df());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
            sb6.append(i17);
            sb6.append(" print item id:");
            sb6.append(c14994x9b99c079.m59251x5db1b11());
            sb6.append(" rowid:");
            sb6.append(c14994x9b99c079.m59260x51f8f5b0());
            sb6.append(" time: ");
            sb6.append(valueOf);
            sb6.append(" sourceFlag:");
            sb6.append(c14994x9b99c079.f66947x76e18a8c);
            sb6.append(" username:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = c14994x9b99c079.m59240x7c94657b();
            sb6.append(m59240x7c94657b != null ? m59240x7c94657b.m76836x6c03c64c() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLogEx", sb6.toString());
            i17++;
        }
    }
}
