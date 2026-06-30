package ry4;

/* loaded from: classes.dex */
public final class y0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483222c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ry4.d1 d1Var) {
        super(3, 0);
        this.f483222c = d1Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: isLongPressDragEnabled */
    public boolean mo8127x3b3ada10() {
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onMove */
    public boolean mo8132xc39cb650(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 from, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 to6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        int m8183xf806b362 = from.m8183xf806b362();
        int m8183xf806b3622 = to6.m8183xf806b362();
        if (m8183xf806b362 < 0 || m8183xf806b3622 < 0) {
            return false;
        }
        ry4.d1 d1Var = this.f483222c;
        ((java.util.ArrayList) d1Var.f483143f).add(m8183xf806b3622, (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) ((java.util.ArrayList) d1Var.f483143f).remove(m8183xf806b362));
        ry4.g gVar = d1Var.f483142e;
        if (gVar != null) {
            java.util.Set set = gVar.f483163n;
            boolean remove = set.remove(java.lang.Integer.valueOf(m8183xf806b362));
            int i17 = m8183xf806b362 < m8183xf806b3622 ? -1 : 1;
            e06.k kVar = m8183xf806b362 < m8183xf806b3622 ? new e06.k(m8183xf806b362 + 1, m8183xf806b3622) : e06.p.m(m8183xf806b3622, m8183xf806b362);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : set) {
                int intValue = ((java.lang.Number) obj).intValue();
                if (intValue <= kVar.f327743e && kVar.f327742d <= intValue) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue2 = ((java.lang.Number) it.next()).intValue();
                set.remove(java.lang.Integer.valueOf(intValue2));
                set.add(java.lang.Integer.valueOf(intValue2 + i17));
            }
            if (remove) {
                set.add(java.lang.Integer.valueOf(m8183xf806b3622));
            }
        }
        ry4.g gVar2 = d1Var.f483142e;
        if (gVar2 != null) {
            gVar2.m8150x87567217(m8183xf806b362, m8183xf806b3622);
        }
        return true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.a1
    /* renamed from: onSwiped */
    public void mo8135x59f07f29(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
    }
}
