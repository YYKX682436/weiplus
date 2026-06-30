package yq2;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2 {

    /* renamed from: o, reason: collision with root package name */
    public final dr2.a f546035o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, float f17, sp2.k kVar, dr2.a convertOutsideOperator, yz5.p jumProfileCallback) {
        super(true, i17, f17, kVar, jumProfileCallback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertOutsideOperator, "convertOutsideOperator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumProfileCallback, "jumProfileCallback");
        this.f546035o = convertOutsideOperator;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570873c65;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2
    public boolean p(wp2.b item, in5.s0 holder, java.util.List list) {
        java.lang.Object a07;
        r45.dn1 dn1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean p17 = super.p(item, holder, list);
        if (list != null && (a07 = kz5.n0.a0(list, 0)) != null && (a07 instanceof dk2.zg) && (dn1Var = ((dk2.zg) a07).f315972b) != null) {
            item.f529916o.set(14, dn1Var);
            java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.f566138ew1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g) tag : null;
            p17 = true;
            if (gVar != null) {
                x(gVar, item, holder, true);
            }
        }
        return p17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2
    public void s(wp2.b item, in5.s0 holder, boolean z17) {
        java.util.List m82898xfb7e5820;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.s(item, holder, z17);
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.f566138ew1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar = tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g) tag : null;
        if (gVar != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = gVar.f203612j.mo7946xf939df19();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) {
                return;
            }
            java.util.Iterator it = m82898xfb7e5820.iterator();
            while (it.hasNext()) {
                ((vp2.k0) it.next()).f520467f = z17;
            }
            c22848x6ddd90cf.m8146xced61ae5();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2, in5.r
    /* renamed from: t */
    public void h(in5.s0 holder, wp2.b item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g(holder, this.f546035o);
        if (gVar.f203604b == null) {
            gVar.f203604b = item;
            r45.nw1 m59258xd0557130 = item.getFeedObject().m59258xd0557130();
            gVar.f203605c = m59258xd0557130 != null ? m59258xd0557130.m75942xfb822ef2(0) : 0L;
            gVar.f203606d = item.getFeedObject().getFeedObject().m76784x5db1b11();
            java.lang.String m76836x6c03c64c = item.getFeedObject().getFeedObject().m76836x6c03c64c();
            if (m76836x6c03c64c == null) {
                m76836x6c03c64c = "";
            }
            gVar.f203607e = m76836x6c03c64c;
        }
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f566138ew1, gVar);
        super.h(holder, item, i17, i18, z17, list);
        if (list == null || list.isEmpty()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.k68);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
            int i19 = this.f203578f;
            if (layoutParams != null) {
                layoutParams.width = i19;
            }
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.k68);
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.height = (int) (this.f203579g * i19);
            }
            x(gVar, item, holder, false);
        }
    }

    public final void x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g shoppingWidget, wp2.b item, in5.s0 holder, boolean z17) {
        jz5.f0 f0Var;
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shoppingWidget, "shoppingWidget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.dn1 dn1Var = (r45.dn1) item.f529916o.m75936x14adae67(14);
        if (dn1Var != null) {
            java.util.LinkedList<r45.y23> m75941xfb821914 = dn1Var.m75941xfb821914(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getProduct(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
            for (r45.y23 y23Var : m75941xfb821914) {
                long m75942xfb822ef2 = y23Var.m75942xfb822ef2(0);
                r45.nw1 m76794xd0557130 = item.getFeedObject().getFeedObject().m76794xd0557130();
                if (m76794xd0557130 != null) {
                    z18 = true;
                    if (m76794xd0557130.m75939xb282bd08(2) == 1) {
                        arrayList.add(new vp2.k0(m75942xfb822ef2, y23Var, z18));
                    }
                }
                z18 = false;
                arrayList.add(new vp2.k0(m75942xfb822ef2, y23Var, z18));
            }
            shoppingWidget.a(arrayList, z17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            shoppingWidget.a(new java.util.ArrayList(), z17);
        }
    }
}
