package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class lm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wm f103934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f103936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103937g;

    public lm(com.tencent.mm.plugin.finder.convert.wm wmVar, in5.s0 s0Var, r45.c32 c32Var, java.lang.String str) {
        this.f103934d = wmVar;
        this.f103935e = s0Var;
        this.f103936f = c32Var;
        this.f103937g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f103937g;
        com.tencent.mm.plugin.finder.convert.wm wmVar = this.f103934d;
        wmVar.getClass();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        r45.c32 c32Var = this.f103936f;
        h0Var.f310123d = c32Var;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        boolean z17 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.getCustom(1)) == null) ? false : fw4Var.getBoolean(2);
        c0Var.f310112d = z17;
        in5.s0 s0Var = this.f103935e;
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(s0Var.f293121e, 1, true);
            k0Var.X1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.convert.tm(s0Var);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.convert.um(c0Var, str, s0Var, h0Var, wmVar);
            k0Var.v();
        } else {
            com.tencent.mm.plugin.finder.convert.wm.o(c0Var, str, s0Var, h0Var, wmVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
