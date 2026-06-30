package df2;

/* loaded from: classes3.dex */
public final class wt extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public long f313243p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f313244q;

    /* renamed from: r, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f313245r;

    /* renamed from: s, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f313246s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f313247t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313244q = new p012xc85e97e9.p093xedfae76a.j0();
    }

    public static final void m7(df2.wt wtVar, r45.h32 h32Var, int i17) {
        java.lang.String str = ((mm2.c1) wtVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        pq5.g l17 = ((b92.d1) zbVar).Ri(str, m75945x2fec8307, i17, null, 104).l();
        java.lang.Object O6 = wtVar.O6();
        im5.b bVar = O6 instanceof im5.b ? (im5.b) O6 : null;
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.h(new df2.rt(i17, h32Var, str, wtVar));
    }

    @Override // df2.l9
    public void b5() {
        n7("autoDismiss", false);
    }

    @Override // df2.l9
    /* renamed from: getTag */
    public java.lang.String mo124177xb5887064() {
        return "LiveReserveNoticeGuideController";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "dismissBubble: source="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = ", onViewUnMount="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveReserveNoticeGuideController"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            androidx.lifecycle.j0 r0 = r4.f313244q
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L3a
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L2f
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L2f
            r3 = r1
        L2f:
            if (r3 != 0) goto L32
            goto L3a
        L32:
            java.lang.Object r6 = r0.mo3195x754a37bb()
            r0.mo523x53d8522f(r6)
            goto L3d
        L3a:
            r0.mo523x53d8522f(r2)
        L3d:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f313245r
            if (r5 == 0) goto L47
            p3325xe03a0797.p3326xc267989b.p2.a(r5, r2, r1, r2)
        L47:
            kotlinx.coroutines.r2 r5 = r4.f313246s
            if (r5 == 0) goto L4e
            p3325xe03a0797.p3326xc267989b.p2.a(r5, r2, r1, r2)
        L4e:
            r4.f313245r = r2
            r4.f313246s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wt.n7(java.lang.String, boolean):void");
    }

    public final void o7(int i17, java.lang.String noticeId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeId, "noticeId");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408777l2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("notice_id", noticeId);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        this.f313247t = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f313244q.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.st(this));
    }

    @Override // df2.de, if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        n7("onViewUnmount", true);
        super.mo8999xb1ef75c(pluginLayout);
    }

    public final void p7(boolean z17) {
        if (!z17) {
            android.widget.TextView c76 = c7();
            if (c76 != null) {
                c76.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mn6);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b76 = b7();
            if (b76 == null) {
                return;
            }
            b76.setVisibility(8);
            return;
        }
        android.widget.TextView c77 = c7();
        if (c77 != null) {
            c77.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mn7);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b77 = b7();
        if (b77 != null) {
            b77.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b78 = b7();
        if (b78 != null) {
            b78.setImageResource(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        }
    }
}
