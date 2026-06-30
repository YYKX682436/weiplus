package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class um implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f104717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104720g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wm f104721h;

    public um(kotlin.jvm.internal.c0 c0Var, java.lang.String str, in5.s0 s0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.convert.wm wmVar) {
        this.f104717d = c0Var;
        this.f104718e = str;
        this.f104719f = s0Var;
        this.f104720g = h0Var;
        this.f104721h = wmVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.convert.wm.o(this.f104717d, this.f104718e, this.f104719f, this.f104720g, this.f104721h);
        }
    }
}
