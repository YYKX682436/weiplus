package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class a6 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f279898d;

    public a6(yb5.d dVar) {
        this.f279898d = dVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.lang.CharSequence z07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yb5.d dVar = this.f279898d;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) dVar.f542241c.a(sb5.s0.class))).f280796e.N0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isScrolling return");
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.c cVar = dVar.f542241c;
        if (((sb5.s) cVar.a(sb5.s.class)).u()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isFinderScene return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((sb5.x) cVar.a(sb5.x.class)).t()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isGameLifeScene return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).G0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isBizFansChat return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) cVar.a(sb5.f.class))).H0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: isBizPhotoFansChat return:%s", dVar.x());
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb jbVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class));
        java.lang.String m75458x24dd4e59 = jbVar.f280796e.m75458x24dd4e59();
        int m75466x6f2c472c = jbVar.f280796e.m75466x6f2c472c();
        if (m75466x6f2c472c < 0) {
            m75466x6f2c472c = 0;
        } else if (m75466x6f2c472c > m75458x24dd4e59.length()) {
            m75466x6f2c472c = m75458x24dd4e59.length();
        }
        if ((erVar != null && c01.z1.r().equals(erVar.f285439b)) || erVar.f285439b.equals("notifymessage") || erVar.f285439b.equals("appbrand_notify_message") || com.p314xaae8f345.mm.p2621x8fb0427b.z3.r4(erVar.f285439b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick: tag.userName return %s", erVar.f285439b);
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f280796e.m75452x85f430db()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "ChatFooter VoiceInputPanel Show NOW!!!");
            yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        sb5.f fVar = (sb5.f) cVar.a(sb5.f.class);
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.x())) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
            if (!aVar.f280287s) {
                if ((c01.e2.J(dVar.x()) && !dVar.x().contains("@")) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(dVar.x())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "onLongClick special - talker:%s", dVar.x());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10976, 0, 1, 1);
                    java.lang.CharSequence Bi = (!aVar.f280286r || aVar.f280287s) ? ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Bi(erVar.f285439b) : ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(erVar.f285439b);
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(m75458x24dd4e59);
                    stringBuffer.insert(m75466x6f2c472c, Bi);
                    jbVar.f280796e.k1(stringBuffer.toString(), m75466x6f2c472c + Bi.length(), true);
                    jbVar.f280796e.m75502x764d6925(1);
                }
                yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10976, 0, 1, 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 b3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.b3) c01.d9.b().l();
        java.lang.String str = erVar.f285442e;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z08 = b3Var.z0(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) fVar;
        if (aVar2.f280287s) {
            z07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) cVar.a(sb5.n.class))).s0(erVar.f285439b);
        } else {
            z07 = z08 == null ? null : z08.z0(erVar.f285439b);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(z07)) {
                z07 = ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).Bi(erVar.f285439b);
            }
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(m75458x24dd4e59);
        stringBuffer2.insert(m75466x6f2c472c, "@" + ((java.lang.Object) z07) + (char) 8197);
        jbVar.f280796e.k1(stringBuffer2.toString(), m75466x6f2c472c + z07.length() + 2, true);
        jbVar.f280796e.r(str, erVar.f285439b, z07.toString());
        jbVar.f280796e.m75502x764d6925(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingListAvatarListener", "update at someone record from log click");
        ((qd0.c) ((rd0.s0) i95.n0.c(rd0.s0.class))).wi(str, erVar.f285439b);
        if (!aVar2.f280287s && z08 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6686x3e34ee47 c6686x3e34ee47 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6686x3e34ee47();
            int i17 = z08.L0(c01.z1.r()) ? 1 : z08.G0(c01.z1.r()) ? 2 : 3;
            c6686x3e34ee47.f140228d = c6686x3e34ee47.b("ChatName", dVar.x(), true);
            c6686x3e34ee47.f140230f = z08.f69098xbcb1bed0;
            c6686x3e34ee47.f140229e = i17;
            c6686x3e34ee47.k();
            c6686x3e34ee47.o();
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/ChattingListEventListener$AvatarLongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
