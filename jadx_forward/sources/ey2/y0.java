package ey2;

/* loaded from: classes2.dex */
public final class y0 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f339112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f339113b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f339114c;

    public y0(int i17, ey2.b1 b1Var, r45.oq2 oq2Var) {
        this.f339112a = i17;
        this.f339113b = b1Var;
        this.f339114c = oq2Var;
    }

    @Override // db2.z2
    /* renamed from: onCgiBack */
    public void mo11127x7a59302d(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        ey2.b1 b1Var = this.f339113b;
        if (i17 != 0 || i18 != 0) {
            if (ey2.b1.f338858f.contains(java.lang.Integer.valueOf(i18))) {
                r45.oq2 Q6 = b1Var.Q6();
                Q6.set(0, java.lang.Integer.valueOf(c01.id.e()));
                int m75939xb282bd08 = this.f339114c.m75939xb282bd08(1) * 2;
                if (m75939xb282bd08 < 300) {
                    m75939xb282bd08 = 300;
                }
                if (m75939xb282bd08 > 3600) {
                    m75939xb282bd08 = 3600;
                }
                Q6.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(Q6.mo14344x5f01b1f6()));
                return;
            }
            return;
        }
        if (resp.m75941xfb821914(1).isEmpty()) {
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LOCALBACKUP_PREFETCH_DISASTER_INFO_STRING, "");
        cu2.t tVar = cu2.u.f303974a;
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : m75941xfb821914) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            if (hc2.o0.C(c19792x256d2725)) {
                arrayList.add(obj);
            }
        }
        int i19 = this.f339112a;
        java.util.List j17 = tVar.j(arrayList, hc2.d0.d(i19), null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it = j17.iterator();
        while (it.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it6.next()).getFeedObject();
            int e17 = c01.id.e();
            feedObject.m59427x8150691c(e17 + (((r45.fx2) resp.m75936x14adae67(17)) != null ? r3.m75939xb282bd08(34) : 259200));
        }
        b1Var.R6(linkedList, hc2.d0.b(i19), 1);
    }
}
