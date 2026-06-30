package df2;

/* loaded from: classes3.dex */
public final class k00 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f312069d;

    public k00(df2.m00 m00Var) {
        this.f312069d = m00Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        r45.j92 j92Var = (r45.j92) obj;
        df2.m00 m00Var = this.f312069d;
        if (j92Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m00Var.f312273m, "get vipInfo = null");
            return;
        }
        if (j92Var.m75939xb282bd08(2) != 0) {
            java.util.LinkedList m75941xfb821914 = j92Var.m75941xfb821914(0);
            if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
                java.lang.String str = m00Var.f312273m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on new vip info ");
                java.util.LinkedList m75941xfb8219142 = j92Var.m75941xfb821914(0);
                if (m75941xfb8219142 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                    java.util.Iterator it = m75941xfb8219142.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((r45.b35) it.next()).m75945x2fec8307(0));
                    }
                } else {
                    arrayList = null;
                }
                sb6.append(arrayList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                java.util.LinkedList m75941xfb8219143 = j92Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219143, "getPag_animation_info(...)");
                m00Var.f312274n = m75941xfb8219143;
                android.view.View m124231x4ff8c0f0 = m00Var.m124231x4ff8c0f0(com.p314xaae8f345.mm.R.id.f565285by4);
                if (m124231x4ff8c0f0 != null) {
                    m124231x4ff8c0f0.setOnClickListener(new df2.l00(m00Var));
                }
                df2.m00 m00Var2 = this.f312069d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(m00Var2, null, null, new df2.j00(m00Var2, null), 3, null);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m00Var.f312273m, "get hide flag or empty animationList, hide bubble");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a d76 = m00Var.d7();
        if (d76 != null) {
            d76.c();
        }
    }
}
