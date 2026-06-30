package uc4;

/* loaded from: classes4.dex */
public abstract class f1 extends tc4.z1 {

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.ArrayList f507936p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context) {
        super(context);
        uc4.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f507936p1 = arrayList;
        uc4.o oVar = new uc4.o(context);
        uc4.g.l(oVar, m166213xf04b2e4c(), false, true, false, 10, null);
        arrayList.add(oVar);
        arrayList.add(new uc4.z(context));
        uc4.j0 j0Var = new uc4.j0(context);
        uc4.g.l(j0Var, m166215x8f2580b2(), false, false, false, 14, null);
        arrayList.add(j0Var);
        arrayList.add(new uc4.v(context));
        arrayList.add(new uc4.c0(context));
        uc4.l1 l1Var = new uc4.l1(context);
        uc4.g.l(l1Var, m166235x7f4e271e(), false, false, false, 14, null);
        arrayList.add(l1Var);
        arrayList.add(new uc4.i0(context));
        arrayList.add(new uc4.i(context));
        arrayList.add(new uc4.h0(context));
        arrayList.add(new uc4.c1(context));
        if (!pc4.d.f434943a.b(false)) {
            uc4.x xVar = new uc4.x(context);
            xVar.k(m166218xc2a45010().m71001xe7297625(), false, true, false);
            arrayList.add(xVar);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 m166218xc2a45010 = m166218xc2a45010();
        java.util.Iterator it = J(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            } else {
                gVar = (uc4.g) it.next();
                if (gVar instanceof uc4.z) {
                    break;
                }
            }
        }
        m166218xc2a45010.m71036xf26a9b29((uc4.z) gVar);
    }

    public static final /* synthetic */ java.util.ArrayList J(uc4.f1 f1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        java.util.ArrayList arrayList = f1Var.f507936p1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab A[LOOP:0: B:11:0x00a5->B:13:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01de A[EDGE_INSN: B:81:0x01de->B:74:0x01de BREAK  A[LOOP:6: B:68:0x01cd->B:80:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object K(uc4.f1 r20, in5.s0 r21, zc4.b r22, int r23, boolean r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uc4.f1.K(uc4.f1, in5.s0, zc4.b, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getClickInstance */
    public final <T> T m167830xe0bc7287() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickInstance", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        java.util.Iterator<T> it = J(this).iterator();
        if (it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickInstance", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return null;
    }

    /* renamed from: getClickInstanceList */
    public final java.util.ArrayList<uc4.g> m167831x70c5fbc5() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        java.util.ArrayList<uc4.g> arrayList = this.f507936p1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickInstanceList", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return arrayList;
    }

    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        java.lang.Object K = K(this, s0Var, bVar, i17, z17, interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveTimelineItemClick");
        return K;
    }
}
