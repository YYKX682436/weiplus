package bg2;

/* loaded from: classes2.dex */
public final class j1 extends tc2.c implements tc2.h, uc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101721e;

    /* renamed from: f, reason: collision with root package name */
    public final char f101722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101721e = "LiveConvertLikeGuideController";
        this.f101722f = (char) 8197;
    }

    @Override // tc2.c
    public void P6() {
        java.lang.Object obj;
        bg2.g1 g1Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        r45.ug6 ug6Var = null;
        r45.kr0 m59293x6b032749 = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59293x6b032749();
        if (m59293x6b032749 != null && (m75941xfb821914 = m59293x6b032749.m75941xfb821914(12)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((r45.kz3) obj2).m75939xb282bd08(0) == 24) {
                        break;
                    }
                }
            }
            r45.kz3 kz3Var = (r45.kz3) obj2;
            if (kz3Var != null) {
                ug6Var = (r45.ug6) kz3Var.m75936x14adae67(15);
            }
        }
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_FEED_LIKE_BTN_GUIDE_BOOLEAN_SYNC, false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onBind] hasShown=");
        sb6.append(o17);
        sb6.append(", config = ");
        if (ug6Var == null || (obj = pm0.b0.g(ug6Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101721e, sb6.toString());
        int m75939xb282bd08 = ug6Var != null ? ug6Var.m75939xb282bd08(0) : -1;
        ae2.in inVar = ae2.in.f85221a;
        if ((((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.I7).mo141623x754a37bb()).r()).booleanValue() ? 1 : m75939xb282bd08) <= 0 || o17 || (g1Var = (bg2.g1) N6(bg2.g1.class)) == null) {
            return;
        }
        g1Var.Z6(bg2.e1.f101583g);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0076  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            r11 = this;
            ae2.in r0 = ae2.in.f85221a
            r0.C()
            tc2.g r0 = r11.f498674d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r0.f498681h
            r2 = 0
            if (r1 == 0) goto L17
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.getFeedObject()
            if (r1 == 0) goto L17
            r45.kr0 r1 = r1.m59293x6b032749()
            goto L18
        L17:
            r1 = r2
        L18:
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L51
            r5 = 12
            java.util.LinkedList r1 = r1.m75941xfb821914(r5)
            if (r1 == 0) goto L51
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L43
            java.lang.Object r5 = r1.next()
            r6 = r5
            r45.kz3 r6 = (r45.kz3) r6
            int r6 = r6.m75939xb282bd08(r4)
            r7 = 24
            if (r6 != r7) goto L3f
            r6 = r3
            goto L40
        L3f:
            r6 = r4
        L40:
            if (r6 == 0) goto L28
            goto L44
        L43:
            r5 = r2
        L44:
            r45.kz3 r5 = (r45.kz3) r5
            if (r5 == 0) goto L51
            r1 = 15
            com.tencent.mm.protobuf.f r1 = r5.m75936x14adae67(r1)
            r45.ug6 r1 = (r45.ug6) r1
            goto L52
        L51:
            r1 = r2
        L52:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[onFocusFeedCenter] config = "
            r5.<init>(r6)
            if (r1 == 0) goto L61
            org.json.JSONObject r6 = pm0.b0.g(r1)
            if (r6 != 0) goto L63
        L61:
            java.lang.String r6 = "null"
        L63:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r11.f101721e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            if (r1 == 0) goto L76
            int r1 = r1.m75939xb282bd08(r4)
            goto L77
        L76:
            r1 = -1
        L77:
            ae2.in r5 = ae2.in.f85221a
            jz5.g r5 = ae2.in.I7
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.mo141623x754a37bb()
            nb2.a r5 = (nb2.a) r5
            java.lang.Object r5 = r5.r()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L90
            r1 = r3
        L90:
            java.lang.Class<bg2.g1> r5 = bg2.g1.class
            tc2.c r5 = r11.N6(r5)
            bg2.g1 r5 = (bg2.g1) r5
            if (r5 == 0) goto La3
            bg2.e1 r6 = bg2.e1.f101583g
            boolean r5 = r5.Y6(r6)
            if (r5 != r3) goto La3
            goto La4
        La3:
            r3 = r4
        La4:
            if (r3 == 0) goto Lc1
            long r3 = (long) r1
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            in5.s0 r0 = r0.f498682i
            if (r0 == 0) goto Lc1
            kotlinx.coroutines.y0 r5 = r0.f374653d
            if (r5 == 0) goto Lc1
            kotlinx.coroutines.p0 r0 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r6 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r7 = 0
            bg2.i1 r8 = new bg2.i1
            r8.<init>(r3, r11, r2)
            r9 = 2
            r10 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r5, r6, r7, r8, r9, r10)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.j1.Q6():void");
    }
}
