package bg2;

/* loaded from: classes3.dex */
public final class y implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f102191a;

    public y(bg2.d0 d0Var) {
        this.f102191a = d0Var;
    }

    @Override // we2.a
    public boolean r() {
        bg2.k0 k0Var = (bg2.k0) this.f102191a.N6(bg2.k0.class);
        if (k0Var == null) {
            return false;
        }
        return k0Var.f101771g || k0Var.f101772h;
    }

    @Override // we2.a
    public boolean t() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f102191a.f498674d.f498681h;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.f66949xdec927b, g92.b.f351302e.T0());
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        java.lang.Object obj = null;
        if (linkedList == null) {
            bg2.k0 k0Var = (bg2.k0) this.f102191a.N6(bg2.k0.class);
            linkedList = k0Var != null ? k0Var.f101774m : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).m75939xb282bd08(0) == 10) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    @Override // we2.a
    public java.lang.String w() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f102191a.f498674d.f498681h;
        java.lang.String str = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.f66949xdec927b;
        return str == null ? "" : str;
    }
}
