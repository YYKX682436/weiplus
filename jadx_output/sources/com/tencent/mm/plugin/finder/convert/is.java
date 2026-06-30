package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class is implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f103691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f103692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103693f;

    public is(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, in5.s0 s0Var) {
        this.f103691d = jbVar;
        this.f103692e = f03Var;
        this.f103693f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.f03 f03Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f103691d;
        in5.s0 s0Var = this.f103693f;
        if (jbVar != null && (f03Var = this.f103692e) != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "7", jbVar, f03Var, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).yk(context2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderPrivateMsgNotifyConvert$onBindViewHolder$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
