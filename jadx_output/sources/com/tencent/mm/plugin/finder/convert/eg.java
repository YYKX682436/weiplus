package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class eg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f103259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPopupBubbleView f103260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qg f103261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103262g;

    public eg(boolean z17, com.tencent.mm.plugin.finder.view.FinderPopupBubbleView finderPopupBubbleView, com.tencent.mm.plugin.finder.convert.qg qgVar, in5.s0 s0Var) {
        this.f103259d = z17;
        this.f103260e = finderPopupBubbleView;
        this.f103261f = qgVar;
        this.f103262g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        boolean z18;
        boolean z19 = this.f103259d;
        in5.s0 s0Var = this.f103262g;
        com.tencent.mm.plugin.finder.convert.qg qgVar = this.f103261f;
        if (!z19) {
            qgVar.r(s0Var, true, true);
            return;
        }
        android.content.Context context = this.f103260e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = (com.tencent.mm.plugin.finder.viewmodel.component.nu) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.nu.class);
        nuVar.S6("popup_show", qgVar.f104380e.f108762p, false);
        so2.q4 q4Var = so2.q4.f410551a;
        r45.ep2 ep2Var = (r45.ep2) ((jz5.n) nuVar.f135359m).getValue();
        kotlin.jvm.internal.o.g(ep2Var, "<this>");
        if (ep2Var.getInteger(0) > 0 || ep2Var.getInteger(1) > 0) {
            jz5.g gVar = nuVar.f135360n;
            r45.pb4 pb4Var = (r45.pb4) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.g(pb4Var, "<this>");
            boolean a17 = q4Var.a(pb4Var);
            long c17 = c01.id.c();
            if (pb4Var.getInteger(1) <= 0) {
                pb4Var.set(1, 1);
                pb4Var.set(0, java.lang.Long.valueOf(c17));
            } else {
                pb4Var.set(1, java.lang.Integer.valueOf(pb4Var.getInteger(1) + 1));
            }
            pb4Var.set(2, java.lang.Long.valueOf(c01.id.c()));
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("Finder.FinderPopupLogic", "finderPopupExpose overDay=" + a17 + ",expose_cnt=" + pb4Var.getInteger(1) + ",first_expose_time=" + pb4Var.getLong(0) + ",last_expose_time=" + pb4Var.getLong(2));
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POPUP_EXPOSE_INFO_STRING, com.tencent.mm.sdk.platformtools.t8.l(((r45.pb4) ((jz5.n) gVar).getValue()).toByteArray()));
        }
        qgVar.r(s0Var, false, true);
    }
}
