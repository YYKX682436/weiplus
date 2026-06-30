package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class f4 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m53.i f280541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 f280542b;

    public f4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h4 h4Var, m53.i iVar) {
        this.f280542b = h4Var;
        this.f280541a = iVar;
    }

    public java.lang.String a() {
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.util.LinkedList linkedList2;
        u53.b0 b0Var = (u53.b0) i95.n0.c(u53.b0.class);
        java.lang.String x17 = this.f280542b.f280113d.x();
        int i17 = this.f280541a.f405296d;
        ((d63.e) b0Var).getClass();
        v53.c cVar = ((f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(x17)).f67823x26b3182a;
        java.lang.Object obj2 = null;
        if (cVar == null || (cVar.f514864e & (1 << (i17 - 1))) == 0) {
            return null;
        }
        m53.m h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.h();
        if (h17 != null && (linkedList = h17.f405421d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((m53.i) obj).f405296d == i17) {
                    break;
                }
            }
            m53.i iVar = (m53.i) obj;
            if (iVar != null && (linkedList2 = iVar.f405305p) != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((m53.z) next).f405746d, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d())) {
                        obj2 = next;
                        break;
                    }
                }
                m53.z zVar = (m53.z) obj2;
                if (zVar != null) {
                    return zVar.f405747e;
                }
            }
        }
        return i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a(), com.p314xaae8f345.mm.R.C30867xcad56011.fqh);
    }
}
