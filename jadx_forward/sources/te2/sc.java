package te2;

/* loaded from: classes.dex */
public final class sc {

    /* renamed from: b, reason: collision with root package name */
    public static int f499946b;

    /* renamed from: a, reason: collision with root package name */
    public static final te2.sc f499945a = new te2.sc();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f499947c = new java.util.ArrayList();

    public final int a(int i17) {
        java.util.Iterator it = ((java.util.ArrayList) f499947c).iterator();
        int i18 = 0;
        while (it.hasNext()) {
            if (((r45.s52) it.next()).m75939xb282bd08(0) == i17) {
                return i18;
            }
            i18++;
        }
        return -1;
    }

    public final r45.s52 b(int i17) {
        java.lang.Object obj;
        java.util.List list = f499947c;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.s52) obj).m75939xb282bd08(0) == i17) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.s52 s52Var = (r45.s52) obj;
        return s52Var == null ? (r45.s52) kz5.n0.Z(list) : s52Var;
    }

    public final void c(int i17, boolean z17, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#updateStyles version=");
        sb6.append(i17);
        sb6.append(" disable=");
        sb6.append(z17);
        sb6.append(" size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeQRCodeHelper", sb6.toString());
        java.util.List list2 = f499947c;
        if (list != null && (!list.isEmpty())) {
            f499946b = i17;
            ((java.util.ArrayList) list2).clear();
            ((java.util.ArrayList) list2).addAll(list);
        } else if (z17) {
            f499946b = i17;
            ((java.util.ArrayList) list2).clear();
        }
    }
}
