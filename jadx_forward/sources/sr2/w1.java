package sr2;

/* loaded from: classes10.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gd1 f493307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sr2.y2 y2Var, r45.gd1 gd1Var) {
        super(2);
        this.f493306d = y2Var;
        this.f493307e = gd1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        r45.dd1 dd1Var = (r45.dd1) obj;
        r45.dd1 dd1Var2 = (r45.dd1) obj2;
        if (dd1Var == null || (str = dd1Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        java.lang.String m75945x2fec8307 = dd1Var2 != null ? dd1Var2.m75945x2fec8307(3) : null;
        java.lang.String str2 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
        sr2.y2 y2Var = this.f493306d;
        y2Var.f493346t = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (dd1Var2 != null) {
            java.util.LinkedList m75941xfb821914 = dd1Var2.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getLbs_response_list(...)");
            arrayList.addAll(m75941xfb821914);
        }
        if (dd1Var != null) {
            java.util.LinkedList m75941xfb8219142 = dd1Var.m75941xfb821914(4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getLbs_response_list(...)");
            arrayList.addAll(m75941xfb8219142);
        }
        r45.gd1 curLocation = this.f493307e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curLocation, "curLocation");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        loop0: while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                r45.hd1 hd1Var = (r45.hd1) it.next();
                if (((r45.ad1) hd1Var.m75936x14adae67(6)) != null) {
                    r45.ad1 ad1Var = (r45.ad1) hd1Var.m75936x14adae67(6);
                    if (ad1Var != null && ad1Var.m75939xb282bd08(1) == 1) {
                        z17 = true;
                    }
                } else {
                    java.lang.String m75945x2fec83072 = hd1Var.m75945x2fec8307(0);
                    if (!(m75945x2fec83072 == null || m75945x2fec83072.length() == 0)) {
                        r45.c64 c64Var = new r45.c64();
                        c64Var.f452843d = hd1Var.m75945x2fec8307(0);
                        c64Var.f452844e = hd1Var.m75945x2fec8307(1);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        r45.du5 du5Var = new r45.du5();
                        du5Var.c(hd1Var.m75945x2fec8307(3));
                        linkedList.add(du5Var);
                        c64Var.f452849m = linkedList;
                        if (z17) {
                            c64Var.A = y2Var.f493346t;
                            c64Var.f452861y = y2Var.f493344r != null ? r10.m75938x746dc8a6(0) : 0.0d;
                            c64Var.f452862z = y2Var.f493344r != null ? r10.m75938x746dc8a6(1) : 0.0d;
                        } else {
                            c64Var.A = str;
                            c64Var.f452861y = curLocation.m75938x746dc8a6(0);
                            c64Var.f452862z = curLocation.m75938x746dc8a6(1);
                        }
                        arrayList2.add(c64Var);
                    }
                }
            }
            break loop0;
        }
        if (arrayList2.isEmpty() || y2Var.U6() || y2Var.R6()) {
            ya2.p1 p1Var = y2Var.f493333d;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var).e();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGetLbsList] success，list=");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                r45.c64 c64Var2 = (r45.c64) it6.next();
                arrayList3.add(c64Var2.f452843d + '-' + c64Var2.f452844e);
            }
            sb6.append(arrayList3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", sb6.toString());
            ya2.p1 p1Var2 = y2Var.f493333d;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).e();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                y2Var.f493335f.add(new so2.d2((r45.c64) it7.next()));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = y2Var.f493334e;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lbsRecyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = y2Var.f493334e;
            if (c22849x81a93d252 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lbsRecyclerView");
                throw null;
            }
            c22849x81a93d252.setVisibility(0);
        }
        if (y2Var.U6()) {
            ya2.p1 p1Var3 = y2Var.f493333d;
            if (p1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var3).a().mo57388x93bf3962(y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1a));
        } else if (y2Var.R6() && y2Var.X6()) {
            ya2.p1 p1Var4 = y2Var.f493333d;
            if (p1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var4).a().mo57391x35760afd(y2Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m1_));
        }
        return jz5.f0.f384359a;
    }
}
