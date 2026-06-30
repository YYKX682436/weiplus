package ix3;

/* loaded from: classes.dex */
public final class c4 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f376912d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f376913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f376913e = new java.util.LinkedList();
    }

    public final void T6(r45.dp5 repairerItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(repairerItem, "repairerItem");
        java.util.LinkedList<r45.dp5> m75941xfb821914 = repairerItem.m75941xfb821914(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSubItemList(...)");
        for (r45.dp5 dp5Var : m75941xfb821914) {
            int m75939xb282bd08 = dp5Var.m75939xb282bd08(2);
            java.util.LinkedList linkedList = this.f376913e;
            if (m75939xb282bd08 == 1) {
                linkedList.add(dp5Var);
                T6(dp5Var);
            } else {
                linkedList.add(dp5Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new ix3.y3(this, null), 1, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.z3(m158354x19263085(), ix3.z3.f377155d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new ix3.b4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new hx3.a(new r45.dp5()));
    }
}
