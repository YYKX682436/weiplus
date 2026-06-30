package ey2;

/* loaded from: classes8.dex */
public final class c2 extends pf5.o0 implements xy2.n {

    /* renamed from: e, reason: collision with root package name */
    public bw5.nj0 f338865e;

    public java.util.List N6() {
        java.util.List f07 = r26.n0.f0(O6("client_sync_finder_reddot_config", "sync_ctrl_info_type_list"), new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            java.lang.Integer h17 = r26.h0.h((java.lang.String) it.next());
            if (h17 != null) {
                arrayList.add(h17);
            }
        }
        return arrayList;
    }

    public final java.lang.String O6(java.lang.String str, java.lang.String str2) {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.util.LinkedList linkedList2;
        java.lang.Object obj2;
        bw5.nj0 nj0Var = this.f338865e;
        java.lang.String str3 = null;
        if (nj0Var != null && (linkedList = nj0Var.f112237d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                bw5.mj0 mj0Var = (bw5.mj0) obj;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, mj0Var.f111797f[1] ? mj0Var.f111795d : "")) {
                    break;
                }
            }
            bw5.mj0 mj0Var2 = (bw5.mj0) obj;
            if (mj0Var2 != null && (linkedList2 = mj0Var2.f111796e) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    bw5.lj0 lj0Var = (bw5.lj0) obj2;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, lj0Var.f111362f[1] ? lj0Var.f111360d : "")) {
                        break;
                    }
                }
                bw5.lj0 lj0Var2 = (bw5.lj0) obj2;
                if (lj0Var2 != null) {
                    str3 = lj0Var2.f111362f[2] ? lj0Var2.f111361e : "";
                }
            }
        }
        return str3 == null ? "" : str3;
    }

    public void P6(r45.xb1 resp) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "simple_common_config")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var == null || (m75934xbce7f2f = yy0Var.m75934xbce7f2f(1)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSimpleCommonConfigVM", "[initSimpleCommonConfig]");
        bw5.nj0 nj0Var = new bw5.nj0();
        nj0Var.mo11468x92b714fd(m75934xbce7f2f.g());
        this.f338865e = nj0Var;
    }
}
