package vh2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final vh2.c f518574a = new vh2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f518575b = new java.util.ArrayList();

    public final void a(java.util.List list) {
        r45.g84 g84Var;
        r45.g84 g84Var2;
        r45.g84 g84Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#updateElements size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffectManager", sb6.toString());
        java.util.List list2 = f518575b;
        ((java.util.ArrayList) list2).clear();
        if (list == null) {
            return;
        }
        ((java.util.ArrayList) list2).addAll(list);
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.h84 h84Var = (r45.h84) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#updateElements index=");
            sb7.append(i17);
            sb7.append(" id=");
            sb7.append(h84Var.m75945x2fec8307(0));
            sb7.append(" name=");
            sb7.append(h84Var.m75945x2fec8307(1));
            sb7.append(" media.type=");
            java.util.LinkedList m75941xfb821914 = h84Var.m75941xfb821914(4);
            sb7.append((m75941xfb821914 == null || (g84Var3 = (r45.g84) kz5.n0.Z(m75941xfb821914)) == null) ? null : java.lang.Integer.valueOf(g84Var3.m75939xb282bd08(0)));
            sb7.append(" media.url=");
            java.util.LinkedList m75941xfb8219142 = h84Var.m75941xfb821914(4);
            sb7.append((m75941xfb8219142 == null || (g84Var2 = (r45.g84) kz5.n0.Z(m75941xfb8219142)) == null) ? null : g84Var2.m75945x2fec8307(1));
            sb7.append(" media.md5=");
            java.util.LinkedList m75941xfb8219143 = h84Var.m75941xfb821914(4);
            sb7.append((m75941xfb8219143 == null || (g84Var = (r45.g84) kz5.n0.Z(m75941xfb8219143)) == null) ? null : g84Var.m75945x2fec8307(2));
            sb7.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenEffectManager", sb7.toString());
            i17 = i18;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vh2.b(null), 3, null);
    }
}
