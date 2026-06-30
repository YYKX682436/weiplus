package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public abstract class j extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6 {

    /* renamed from: t, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f285745t;

    /* renamed from: u, reason: collision with root package name */
    public long f285746u;

    /* renamed from: x, reason: collision with root package name */
    public yb5.d f285749x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f285750y;

    /* renamed from: z, reason: collision with root package name */
    public long f285751z;

    /* renamed from: s, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f285744s = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: v, reason: collision with root package name */
    public final int f285747v = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);

    /* renamed from: w, reason: collision with root package name */
    public final int f285748w = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) * (-1);
    public final yn.l A = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g(this);

    public static final void g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j jVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21904x129eb5b3 c21904x129eb5b3) {
        android.widget.ImageView finderTailTag = c21904x129eb5b3.getFinderTailTag();
        if (finderTailTag != null) {
            finderTailTag.setVisibility(8);
        }
        android.widget.TextView finderNickname = c21904x129eb5b3.getFinderNickname();
        android.view.ViewGroup.LayoutParams layoutParams = finderNickname != null ? finderNickname.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginEnd(jVar.f285747v);
        }
        android.view.View iconGroupContainer = c21904x129eb5b3.getIconGroupContainer();
        android.view.ViewGroup.LayoutParams layoutParams2 = iconGroupContainer != null ? iconGroupContainer.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 == null) {
            return;
        }
        marginLayoutParams2.setMarginStart(jVar.f285748w);
    }

    public final java.util.Map d0(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.g92 g92Var) {
        java.util.Map k17 = kz5.c1.k(new jz5.l("card_id", java.lang.Long.valueOf(f9Var.I0())), new jz5.l("card_type", "4"), new jz5.l("live_status", g92Var.m75939xb282bd08(13) != 1 ? "0" : "1"), new jz5.l("liveid", g92Var.m75945x2fec8307(0)), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, dVar.D() ? "2" : "1"), new jz5.l("chatroomid", dVar.x()), new jz5.l("share_username", g95.e0.d(f9Var)), new jz5.l("chatroomuv", dVar.D() ? java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(dVar.x())) : null));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : k17.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final void e0(android.view.View view, yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, r45.g92 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        java.util.Map d07 = d0(ui6, msg, finderObject);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, "chatting_item_appmsg_new_finder_live_feed_container_view");
        aVar.gk(view, d07);
        aVar.Tj(view, 40, 12, false);
    }

    public final void f0(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        zy2.c cVar = (zy2.c) ot0.q.v(msg.U1()).y(zy2.c.class);
        if (cVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("chatting_item_appmsg_new_finder_live_feed_container_view", "view_clk", d0(ui6, msg, cVar.f558892b), 12, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0275  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r22, yb5.d r23, rd5.d r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
