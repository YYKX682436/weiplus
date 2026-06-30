package te5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f500265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f500266e;

    public r0(yb5.d dVar, rd5.d dVar2) {
        this.f500265d = dVar;
        this.f500266e = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        fd5.c cVar;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f500265d;
        sb5.a0 a0Var = (sb5.a0) dVar.f542241c.a(sb5.a0.class);
        if (a0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) a0Var).p0(view);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        boolean z17 = false;
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar2 = dVar.f542241c;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4 v4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.v4) ((sb5.b0) cVar2.a(sb5.b0.class));
        v4Var.getClass();
        rd5.d msgData = this.f500266e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "foldMsg groupId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w4.f281683a < 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemMediaGroupComponent", "mediaGroup op ignored by global cooldown");
            z17 = true;
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w4.f281683a = currentTimeMillis;
        }
        if (!z17) {
            ic5.f fVar = v4Var.f281646e;
            if (fVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
                throw null;
            }
            java.lang.String a17 = fVar.a(msgData.f475787d.f526833b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "foldMsg groupId: ".concat(a17));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4 p4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) ((java.util.LinkedHashMap) v4Var.f281647f).get(a17);
            if (p4Var != null && (list = p4Var.f281206b) != null) {
                list.clear();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4 o4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) ((sb5.a0) v4Var.f280113d.f542241c.a(sb5.a0.class));
            o4Var.getClass();
            if (!r26.n0.N(a17)) {
                o4Var.f281155g.add(a17);
            }
            java.lang.Object p17 = v4Var.f280113d.p();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17 : null;
            if (c1163xf1deaba4 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.c(c1163xf1deaba4, a17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r4(v4Var, o4Var, a17));
            }
            java.lang.Object p18 = v4Var.f280113d.p();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = p18 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p18 : null;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42 != null ? c1163xf1deaba42.getLayoutManager() : null;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = layoutManager instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8) layoutManager : null;
            if (c21844xd4ff61b8 != null && (cVar = (fd5.c) c21844xd4ff61b8.W(fd5.c.class)) != null) {
                cVar.c();
            }
            ic5.f fVar2 = v4Var.f281646e;
            if (fVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
                throw null;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = msgData.f475787d.f526833b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (!fVar2.f371972a) {
                java.lang.String a18 = fVar2.a(msg);
                if (!r26.n0.N(a18)) {
                    fVar2.f371973b.remove(a18);
                }
            }
            sb5.z zVar = (sb5.z) v4Var.f280113d.f542241c.a(sb5.z.class);
            if (zVar != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).h(new java.lang.Object());
            }
        }
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ai(msgData.f475787d.f526833b);
        sb5.a0 a0Var2 = (sb5.a0) cVar2.a(sb5.a0.class);
        if (a0Var2 != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) a0Var2).m0(msgData.f475787d.f526833b);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
