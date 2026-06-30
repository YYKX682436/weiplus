package iq2;

/* loaded from: classes2.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f375309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f375310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f375311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(iq2.d0 d0Var, boolean z17, int i17, long j17) {
        super(0);
        this.f375308d = d0Var;
        this.f375309e = z17;
        this.f375310f = i17;
        this.f375311g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        int i17;
        iq2.d0 d0Var = this.f375308d;
        int i18 = d0Var.f375255f;
        fq2.a aVar = d0Var.f375256g;
        if (this.f375309e) {
            m75934xbce7f2f = ((gq2.j) aVar).f356097g.f();
        } else {
            r45.dk2 dk2Var = d0Var.f375269t;
            m75934xbce7f2f = dk2Var != null ? dk2Var.m75934xbce7f2f(6) : null;
        }
        java.lang.String str = (java.lang.String) ((jz5.n) d0Var.f375272w).mo141623x754a37bb();
        java.util.List V0 = kz5.n0.V0(((gq2.j) aVar).f356097g.a());
        r45.u80 u80Var = d0Var.f375252c.f382633f;
        java.util.ArrayList arrayList = d0Var.f375265p;
        int size = arrayList.size() - 1;
        int i19 = d0Var.f375255f;
        if (size >= 0) {
            while (true) {
                int i27 = size - 1;
                java.lang.Object obj = arrayList.get(size);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                so2.j5 j5Var = (so2.j5) obj;
                if (j5Var instanceof wp2.a) {
                    wp2.a aVar2 = (wp2.a) j5Var;
                    if (aVar2.i() == i19) {
                        u80Var = new r45.u80();
                        u80Var.set(0, java.lang.Integer.valueOf(aVar2.i()));
                        u80Var.set(1, aVar2.a());
                        u80Var.m75941xfb821914(2).addAll(j5Var instanceof wp2.b ? d0Var.e() : aVar2.g());
                    }
                }
                if (i27 < 0) {
                    break;
                }
                size = i27;
            }
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList2.iterator();
        int i28 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((r45.u80) it.next()).m75939xb282bd08(0) == i19) {
                i17 = i28;
                break;
            }
            i28++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        if (num != null) {
            arrayList2.set(num.intValue(), u80Var);
        } else {
            arrayList2.add(u80Var);
        }
        java.lang.String str2 = "getAndUpdateContainerContext containerId:" + i19 + ", lastBuf:" + u80Var.m75934xbce7f2f(1) + ", contexts:" + arrayList2.size();
        java.lang.String str3 = d0Var.f375254e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f375250a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        int d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf).getD();
        r45.dd2 dd2Var = new r45.dd2();
        int i29 = d0Var.f375253d;
        dd2Var.set(0, java.lang.Integer.valueOf(i29));
        if (d0Var.f375264o != null && i29 != d0Var.f() && d0Var.f() != 0) {
            java.util.LinkedList m75941xfb821914 = dd2Var.m75941xfb821914(6);
            r45.dd2 dd2Var2 = new r45.dd2();
            dd2Var2.set(0, java.lang.Integer.valueOf(d0Var.f()));
            m75941xfb821914.add(dd2Var2);
        }
        int i37 = this.f375310f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        aq2.a aVar3 = new aq2.a(i37, i18, m75934xbce7f2f, str, V0, d17, this.f375311g, null, dd2Var, 0, 0.0f, false, null, null, null, false, null, 130560, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "#loadDataWithCgi req=" + aVar3);
        return new aq2.c(aVar3, null, d0Var.f375250a, 2, null);
    }
}
