package pk2;

/* loaded from: classes3.dex */
public final class r1 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f437741i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f437742j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(pk2.o9 helper, int i17) {
        super(helper, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f437741i = n() ? "anchorlive.more.morefunction.connectmic" : "startlive.more.morefunction.connectmic";
        this.f437742j = true;
    }

    @Override // qk2.f
    public boolean h() {
        return this.f437742j;
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f437741i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (((mm2.c1) r0.c(mm2.c1.class)).f410311a5 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011d, code lost:
    
        if (pm0.v.z((int) ((r5 == null || (r2 = r5.b()) == null) ? 0 : r2.f69326x798040b1), 4) != false) goto L36;
     */
    @Override // qk2.d, qk2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o() {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.r1.o():boolean");
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 bottomSheet, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        android.view.View view = bottomSheet.f213492f;
        boolean O7 = ((mm2.c1) this.f445960a.c(mm2.c1.class)).O7();
        boolean z17 = !O7 && pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 64);
        zl2.r4 r4Var = zl2.r4.f555483a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "canShowLinkMic:$, linkMicEnable:" + z17 + ", isSecondDevice:" + (r4Var.w1() && !r4Var.x1()));
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hx7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorLinkMicOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc g17 = o9Var.g(view, com.p314xaae8f345.mm.R.id.ntj, z17);
        if (((mm2.e1) o9Var.c(mm2.e1.class)).g7()) {
            g17.m81392x52cfa5c6(true);
            g17.setEnabled(false);
            if (!pm0.v.z((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q, 64)) {
                ((mm2.c1) o9Var.c(mm2.c1.class)).p8(64 | ((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q));
            }
            ((mm2.c1) o9Var.c(mm2.c1.class)).p8(((int) ((mm2.c1) o9Var.c(mm2.c1.class)).f410399q) & (-16385));
        } else {
            p3325xe03a0797.p3326xc267989b.y0 j17 = j();
            if (j17 != null) {
                g17.g(j17, new pk2.o1(O7, o9Var), new pk2.q1(this, view, g17, O7, o9Var, null));
            }
        }
        if (z17) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.H, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.G, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        }
        java.lang.String obj = ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567086i31)).getText().toString();
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.hx7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        v(obj, findViewById2, g17);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f567085i30);
    }
}
