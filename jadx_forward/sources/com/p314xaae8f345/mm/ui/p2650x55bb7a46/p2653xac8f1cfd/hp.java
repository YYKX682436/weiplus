package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.r2.class)
/* loaded from: classes9.dex */
public final class hp extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.r2 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f280730e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f280731f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280732g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280733h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f280734i;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        fd5.d m07 = m0();
        if (m07 != null) {
            m07.c(false);
        }
        this.f280730e.clear();
        this.f280731f = false;
        this.f280732g = false;
        this.f280733h = false;
        this.f280734i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j0(android.view.View r4, int r5) {
        /*
            r3 = this;
            r4 = 0
            r0 = 1
            if (r5 == 0) goto L13
            if (r5 == r0) goto L7
            goto L53
        L7:
            fd5.d r5 = r3.m0()
            if (r5 == 0) goto L10
            r5.c(r4)
        L10:
            r3.f280731f = r0
            goto L53
        L13:
            r3.f280731f = r4
            boolean r5 = r3.f280733h
            if (r5 != 0) goto L53
            java.util.HashMap r5 = r3.f280730e
            boolean r1 = r5.isEmpty()
            r1 = r1 ^ r0
            if (r1 == 0) goto L53
            yb5.d r1 = r3.f280113d
            if (r1 == 0) goto L39
            int r2 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19741x32830a33.f272969i
            com.tencent.mm.ui.chatting.fb r1 = r1.f542251m
            com.tencent.mm.ui.chatting.ChattingUIFragment r1 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) r1
            com.tencent.mm.pluginsdk.ui.tools.v3 r1 = r1.f279802t
            if (r1 != 0) goto L31
            goto L39
        L31:
            int r1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.a(r1)
            if (r1 != 0) goto L39
            r1 = r0
            goto L3a
        L39:
            r1 = r4
        L3a:
            if (r1 == 0) goto L53
            r3.f280733h = r0
            r3.f280732g = r4
            int r4 = r5.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "MicroMsg.WeClawMdScroll"
            java.lang.String r0 = "enter ACTIVE on IDLE: activeSize=%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0, r4)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp.j0(android.view.View, int):void");
    }

    public final fd5.d m0() {
        yb5.d dVar = this.f280113d;
        java.lang.Object p17 = dVar != null ? dVar.p() : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17 : null;
        if (c1163xf1deaba4 == null) {
            return null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = layoutManager instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8) layoutManager : null;
        if (c21844xd4ff61b8 != null) {
            return (fd5.d) c21844xd4ff61b8.W(fd5.d.class);
        }
        return null;
    }

    public void n0(long j17) {
        java.util.HashMap hashMap = this.f280730e;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17));
        if (num == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeClawMdScroll", "onStreamingEnd: svrId=%d not in map", java.lang.Long.valueOf(j17));
            return;
        }
        int intValue = num.intValue() - 1;
        if (intValue <= 0) {
            hashMap.remove(java.lang.Long.valueOf(j17));
        } else {
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "onStreamingEnd: svrId=%d, remainCount=%d, totalKeys=%d, uncapped=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(hashMap.size()), java.lang.Boolean.valueOf(this.f280733h));
    }

    public void o0(long j17) {
        java.util.HashMap hashMap = this.f280730e;
        if (hashMap.isEmpty()) {
            this.f280733h = false;
            this.f280732g = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "onStreamingStart: reset active flag");
        }
        java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Long.valueOf(j17));
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "onStreamingStart: svrId=%d, count=%d, totalKeys=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(hashMap.size()));
    }
}
