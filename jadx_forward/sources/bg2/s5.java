package bg2;

/* loaded from: classes2.dex */
public final class s5 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102034e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f102035f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f102036g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f102037h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102034e = "LiveLongPressTipsController";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P6() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s5.P6():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // tc2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Q6() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s5.Q6():void");
    }

    @Override // tc2.c
    public void S6(android.view.View view, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        Y6();
    }

    @Override // tc2.c
    public void T6(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
        ml2.t1 t1Var = ml2.t1.X2;
        jz5.l[] lVarArr = new jz5.l[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null || (str = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)).toString()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("liveid", str);
        v3Var.d(c76, t1Var, kz5.c1.i(lVarArr));
    }

    @Override // tc2.c
    public void U6() {
        Y6();
    }

    public final void Y6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.teb) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveLongPressTipsController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveLongPressTipsController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f102035f;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f102037h = null;
    }
}
