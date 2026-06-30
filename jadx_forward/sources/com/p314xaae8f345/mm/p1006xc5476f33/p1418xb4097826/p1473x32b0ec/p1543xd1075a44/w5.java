package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class w5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 f201676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f201677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f201678c;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var, boolean z17, boolean z18) {
        this.f201676a = d6Var;
        this.f201677b = z17;
        this.f201678c = z18;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        r45.xq1 xq1Var;
        r45.t63 t63Var;
        java.util.LinkedList m75941xfb821914;
        r45.y63 y63Var;
        r45.y63 y63Var2;
        r45.z73 z73Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6 d6Var = this.f201676a;
        d6Var.f199605n = false;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb8219142 = ((r45.hv1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getGame_user_info_list(...)");
            r45.n73 n73Var = (r45.n73) kz5.n0.Z(m75941xfb8219142);
            java.lang.Object obj2 = null;
            r45.yq1 yq1Var = (n73Var == null || (z73Var = (r45.z73) n73Var.m75936x14adae67(5)) == null) ? null : (r45.yq1) z73Var.m75936x14adae67(14);
            d6Var.f199601j = yq1Var;
            d6Var.f199603l = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.m75936x14adae67(0)) == null) ? null : y63Var2.m75945x2fec8307(2);
            r45.yq1 yq1Var2 = d6Var.f199601j;
            d6Var.f199604m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.m75936x14adae67(0)) == null) ? false : y63Var.m75933x41a8a7f2(1);
            java.lang.String str = (java.lang.String) ((mm2.c1) d6Var.f199594c.P0(mm2.c1.class)).f410366k6.mo3195x754a37bb();
            if (!(str == null || str.length() == 0)) {
                r45.yq1 yq1Var3 = d6Var.f199601j;
                r45.xq1 xq1Var2 = yq1Var3 != null ? (r45.xq1) yq1Var3.m75936x14adae67(2) : null;
                if (xq1Var2 != null) {
                    r45.yq1 yq1Var4 = d6Var.f199601j;
                    if (yq1Var4 != null && (xq1Var = (r45.xq1) yq1Var4.m75936x14adae67(2)) != null && (t63Var = (r45.t63) xq1Var.m75936x14adae67(0)) != null && (m75941xfb821914 = t63Var.m75941xfb821914(0)) != null) {
                        java.util.Iterator it = m75941xfb821914.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.u24) next).m75945x2fec8307(0), str)) {
                                obj2 = next;
                                break;
                            }
                        }
                        r45.u24 u24Var = (r45.u24) obj2;
                        if (u24Var != null) {
                            i17 = u24Var.m75939xb282bd08(1);
                            xq1Var2.set(1, java.lang.Integer.valueOf(i17));
                        }
                    }
                    i17 = 0;
                    xq1Var2.set(1, java.lang.Integer.valueOf(i17));
                }
            }
            boolean z17 = this.f201678c;
            boolean z18 = this.f201677b;
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.a(d6Var);
            } else if (z17) {
                d6Var.j();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d6.b(d6Var);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetUserGameConfig hasContinue: ");
            sb6.append(d6Var.f199604m);
            sb6.append(", hasLastBuffer: ");
            sb6.append(d6Var.f199603l != null);
            sb6.append(", isLoadMore: ");
            sb6.append(z18);
            sb6.append(", isResume: ");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d6Var.f199595d, sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
