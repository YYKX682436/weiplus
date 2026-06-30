package sg2;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final sg2.a0 f489415a = new sg2.a0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f489416b = jz5.h.b(sg2.y.f489493d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f489417c = new java.util.ArrayList();

    public final r45.ir1 a(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = f489417c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = false;
            if (((r45.ir1) obj).m75939xb282bd08(0) == i17) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        return (r45.ir1) obj;
    }

    public final void b(java.util.List list, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#update newGestures.size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGesturesResManager", sb6.toString());
        java.util.List list2 = f489417c;
        ((java.util.ArrayList) list2).clear();
        if (list == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ir1 ir1Var = (r45.ir1) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#update index=");
            sb7.append(i17);
            sb7.append(" gid=");
            sb7.append(ir1Var.m75939xb282bd08(0));
            sb7.append(" name=");
            sb7.append(ir1Var.m75945x2fec8307(1));
            sb7.append(" gestureIconUrl=");
            sb7.append(ir1Var.m75945x2fec8307(2));
            sb7.append(" anchorUrl=");
            sb7.append(ir1Var.m75945x2fec8307(3));
            sb7.append(" tipsName=");
            sb7.append(ir1Var.m75945x2fec8307(4));
            sb7.append(" tipsIconUrl=");
            sb7.append(ir1Var.m75945x2fec8307(5));
            sb7.append(" resourceUrl=");
            sb7.append(ir1Var.m75945x2fec8307(6));
            sb7.append(" delete_flag=");
            sb7.append(ir1Var.m75939xb282bd08(10));
            sb7.append(" support_sdk_min_version=");
            sb7.append(ir1Var.m75942xfb822ef2(11));
            sb7.append(" support_sdk_max_version=");
            sb7.append(ir1Var.m75942xfb822ef2(12));
            sb7.append(" rc=");
            r45.jr1 jr1Var = (r45.jr1) ir1Var.m75936x14adae67(7);
            sb7.append(jr1Var != null ? java.lang.Integer.valueOf(jr1Var.m75939xb282bd08(0)) : null);
            sb7.append(',');
            r45.jr1 jr1Var2 = (r45.jr1) ir1Var.m75936x14adae67(7);
            sb7.append(jr1Var2 != null ? java.lang.Float.valueOf(jr1Var2.m75938x746dc8a6(1)) : null);
            sb7.append(',');
            r45.jr1 jr1Var3 = (r45.jr1) ir1Var.m75936x14adae67(7);
            sb7.append(jr1Var3 != null ? java.lang.Float.valueOf(jr1Var3.m75938x746dc8a6(2)) : null);
            sb7.append(" nrc=");
            r45.g32 g32Var = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var != null ? java.lang.Integer.valueOf(g32Var.m75939xb282bd08(0)) : null);
            sb7.append(',');
            r45.g32 g32Var2 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var2 != null ? g32Var2.m75945x2fec8307(1) : null);
            sb7.append(',');
            r45.g32 g32Var3 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var3 != null ? java.lang.Float.valueOf(g32Var3.m75938x746dc8a6(2)) : null);
            sb7.append(',');
            r45.g32 g32Var4 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var4 != null ? java.lang.Float.valueOf(g32Var4.m75938x746dc8a6(3)) : null);
            sb7.append(',');
            r45.g32 g32Var5 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var5 != null ? java.lang.Float.valueOf(g32Var5.m75938x746dc8a6(4)) : null);
            sb7.append(',');
            r45.g32 g32Var6 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var6 != null ? java.lang.Float.valueOf(g32Var6.m75938x746dc8a6(5)) : null);
            sb7.append(',');
            r45.g32 g32Var7 = (r45.g32) ir1Var.m75936x14adae67(8);
            sb7.append(g32Var7 != null ? g32Var7.m75945x2fec8307(6) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGesturesResManager", sb7.toString());
            if (ir1Var.m75939xb282bd08(10) != 1) {
                ((java.util.ArrayList) list2).add(ir1Var);
            }
            i17 = i18;
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new sg2.z(z17, null), 3, null);
    }
}
