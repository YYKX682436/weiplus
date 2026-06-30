package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class qe implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o25.y1 f87043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f87044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f87045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h3 f87046g;

    public qe(o25.y1 y1Var, android.content.Context context, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.plugin.appbrand.page.h3 h3Var) {
        this.f87043d = y1Var;
        this.f87044e = context;
        this.f87045f = k0Var;
        this.f87046g = h3Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        android.content.Context context = this.f87044e;
        kotlin.jvm.internal.o.d(g4Var);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f87045f;
        int i17 = com.tencent.mm.plugin.appbrand.page.ue.f87151b;
        ((com.tencent.mm.pluginsdk.forward.m) this.f87043d).Bi(context, g4Var, k0Var, com.tencent.mm.plugin.appbrand.page.ke.f86840a, 3, new com.tencent.mm.plugin.appbrand.page.pe(this.f87046g, k0Var));
    }
}
