package bg2;

/* loaded from: classes2.dex */
public final class s5 extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20501e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20502f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20503g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f20504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20501e = "LiveLongPressTipsController";
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
        kotlin.jvm.internal.o.g(view, "view");
        Y6();
    }

    @Override // tc2.c
    public void T6(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(view, "view");
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        r45.qt2 c76 = gVar != null ? ((sb2.l) gVar).c7() : null;
        com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
        ml2.t1 t1Var = ml2.t1.X2;
        jz5.l[] lVarArr = new jz5.l[1];
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
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
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.teb) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveLongPressTipsController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveLongPressTipsController", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlinx.coroutines.r2 r2Var = this.f20502f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20504h = null;
    }
}
