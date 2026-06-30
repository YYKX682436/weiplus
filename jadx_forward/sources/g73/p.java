package g73;

/* loaded from: classes15.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 f350855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g73.o0 f350856e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260, g73.o0 o0Var) {
        super(0);
        this.f350855d = abstractC16085x8c838260;
        this.f350856e = o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r12 = this;
            g73.o r0 = g73.o0.f350849i
            r1 = 1
            r0.mo50303x856b99f0(r1)
            java.util.concurrent.ConcurrentHashMap r0 = g73.o0.f350847g
            com.tencent.mm.plugin.handoff.model.HandOff r2 = r12.f350855d
            java.lang.String r3 = r2.getKey()
            r0.put(r3, r2)
            boolean r0 = r2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc
            r3 = 2
            if (r0 == 0) goto L4d
            r0 = r2
            com.tencent.mm.plugin.handoff.model.HandOffFile r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc) r0
            int r0 = r0.getSource()
            if (r0 != r3) goto L4d
            java.lang.String r0 = r2.getId()
            java.lang.String r4 = "-1"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r4)
            if (r0 == 0) goto L4d
            java.lang.Class<z30.w> r0 = z30.w.class
            i95.m r0 = i95.n0.c(r0)
            z30.w r0 = (z30.w) r0
            y30.u r0 = (y30.u) r0
            r0.getClass()
            java.lang.Class<o72.f5> r0 = o72.f5.class
            i95.m r0 = i95.n0.c(r0)
            o72.f5 r0 = (o72.f5) r0
            com.tencent.mm.plugin.fav.o r0 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.o) r0
            o72.k4 r0 = r0.oj()
            l75.s0 r0 = (l75.s0) r0
            g73.o0 r4 = r12.f350856e
            r0.add(r4)
        L4d:
            g73.o0 r0 = g73.o0.f350844d
            boolean r4 = g73.o0.wi(r0)
            if (r4 != 0) goto L5b
            boolean r0 = g73.o0.Ai(r0, r2)
            if (r0 == 0) goto Lcd
        L5b:
            int r0 = r2.getHandOffType()
            com.tencent.wechat.aff.ext_device.a r4 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.a.ExtDeviceHandoff_Undefined
            long r9 = c01.id.c()
            if (r0 == r1) goto L6e
            if (r0 == r3) goto L6b
            r6 = r4
            goto L71
        L6b:
            com.tencent.wechat.aff.ext_device.a r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.a.ExtDeviceHandoff_Float_Window
            goto L70
        L6e:
            com.tencent.wechat.aff.ext_device.a r0 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.a.ExtDeviceHandoff_View
        L70:
            r6 = r0
        L71:
            if (r6 != r4) goto L74
            goto L87
        L74:
            int r0 = r2.mo65028xe67d4b7a()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.tencent.wechat.aff.ext_device.j r5 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3141x44f11a34.j.f298231b
            java.lang.String r8 = r2.getId()
            g73.j r11 = g73.j.f350811a
            r5.b(r6, r7, r8, r9, r11)
        L87:
            g73.m2 r0 = g73.o0.f350853p
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "add "
            r1.<init>(r3)
            java.lang.String r3 = r2.getId()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "HandOff.StatusManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.util.Map r1 = r0.f350833q
            java.lang.String r3 = r2.getKey()
            boolean r3 = r1.containsKey(r3)
            if (r3 != 0) goto Lb8
            java.lang.String r3 = r2.getKey()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.put(r3, r4)
        Lb8:
            java.util.Map r1 = r0.f350832p
            java.lang.String r3 = r2.getKey()
            r1.remove(r3)
            java.util.Map r1 = r0.f350830n
            java.lang.String r3 = r2.getKey()
            r1.put(r3, r2)
            r0.a()
        Lcd:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g73.p.mo152xb9724478():java.lang.Object");
    }
}
